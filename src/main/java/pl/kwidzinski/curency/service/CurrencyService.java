package pl.kwidzinski.curency.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.kwidzinski.curency.dto.UserInput;
import pl.kwidzinski.curency.game.GamesUtils;
import pl.kwidzinski.curency.model.Currency;
import pl.kwidzinski.curency.model.CurrencyData;
import pl.kwidzinski.curency.repository.CurrencyRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;
import java.util.Random;

@Service
public class CurrencyService {

    private final CurrencyRepository repository;
    private final GamesUtils gamesUtils;
    private int numOfAttempts;

    public CurrencyService(final CurrencyRepository repository, final GamesUtils gamesUtils) {
        this.repository = repository;
        this.gamesUtils = gamesUtils;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initCurrencyGame() {
        Optional<CurrencyData> currencyData = fetchCurrencyDataFromRemoteApi();
        currencyData.ifPresent(repository::initCurrencyData);
        setStartParameters();
    }

    public void setStartParameters() {
        gamesUtils.setWinner(false);
        gamesUtils.setRandomCurrency(getRanCurrencyFromRepository());
        gamesUtils.setMessage("Let's begin currency game!");
        System.out.println(gamesUtils.getRandomCurrency().getCurrencyString());
        System.out.println(gamesUtils.getRandomCurrency().getRate());
    }

    public void checkAnswer(UserInput input) {
        try {
            BigDecimal rateToGuess = BigDecimal.valueOf(gamesUtils.getRandomCurrency().getRate()).setScale(2, RoundingMode.HALF_UP);
            BigDecimal inputRate = BigDecimal.valueOf(Double.parseDouble(input.getInput().replace(",", "."))).setScale(2, RoundingMode.HALF_UP);

            if (inputRate.equals(rateToGuess)) {
                gamesUtils.setMessage("Congratulations! You won! You guessed it the " + numOfAttempts + " time");
                gamesUtils.setWinner(true);
                numOfAttempts = 0;
            } else if (inputRate.compareTo(rateToGuess) > 0) {
                numOfAttempts++;
                gamesUtils.setMessage("Too much! Try again!");
            } else {
                numOfAttempts++;
                gamesUtils.setMessage("Too little! Try again!");
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            gamesUtils.setMessage("Wrong input! Try type number:).");
        }
    }

    private Optional<CurrencyData> fetchCurrencyDataFromRemoteApi() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.exchangeratesapi.io/latest?base=PLN";
        return Optional.ofNullable(restTemplate.getForObject(url, CurrencyData.class));
    }

    private Currency getRanCurrencyFromRepository() {
        int size = repository.getCurrencyList().size();
        int randomIndex = new Random().nextInt(size);
        return repository.getCurrencyList().get(randomIndex);
    }

    public GamesUtils getGamesUtils() {
        return gamesUtils;
    }
}
