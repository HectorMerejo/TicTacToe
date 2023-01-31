package com.tictactoc.thegame.controller;
import com.tictactoc.thegame.business.TicTacToeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class TicTacToeController {

    //helps function map to URL
    @GetMapping("/tictactoe.java")
    //function that serves the game that returns a dictionary
    //@RequestParam allows service to take in an input (position)
    public Map<String,Object> getStatus(@RequestParam String position){
        //Calls TicTacToeService which then gets mapped to URL
        var map = TicTacToeService.getWinner(position);
        map.put("author", "Merejo, Hector");
        map.put("date", new Date());
        return map;
    }

}

