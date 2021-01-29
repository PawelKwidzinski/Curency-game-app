package pl.kwidzinski.curency.game;

import org.springframework.stereotype.Component;
import pl.kwidzinski.curency.model.Currency;

@Component
public class GamesUtils {
    private String message;
    private Currency randomCurrency;
    private boolean winner;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public Currency getRandomCurrency() {
        return randomCurrency;
    }

    public void setRandomCurrency(final Currency randomCurrency) {
        this.randomCurrency = randomCurrency;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(final boolean winner) {
        this.winner = winner;
    }
}
