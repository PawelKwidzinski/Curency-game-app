package pl.kwidzinski.curency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kwidzinski.curency.CurrencyService;
import pl.kwidzinski.curency.dto.UserInput;

@Controller
public class CurrencyController {
    private final CurrencyService service;

    @Autowired
    public CurrencyController(final CurrencyService service) {
        this.service = service;
    }

    @GetMapping("/game")
    public String currencyGame(Model model) {
        model.addAttribute("checkGame", service.getGamesUtils());
        model.addAttribute("userInput", new UserInput());
        return "currency";
    }

    @PostMapping("/result")
    public String getResult(UserInput input) {
        service.checkAnswer(input);
        return "redirect:/game";
    }

    @GetMapping("/new-game")
    public String newGame() {
        service.setStartParameters();
        return "redirect:/game";
    }

}
