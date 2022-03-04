package edu.jokes.chuckjokes.controller;

import edu.jokes.chuckjokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class JokesController {

    JokeService jokeService;


    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getTodoInfo( Model model) {
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
