package com.tictactoc.thegame;

import com.tictactoc.thegame.business.TicTacToeService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_TicTacToe {

    @ParameterizedTest
    @CsvSource({
            "XXXNNNNNN, true",
            "NXXNNNNNN, false",
            "ONNXONNXO, true"

    })
    void testWithCsvSource(String position, boolean status){

        //returns a map of results
        var mapResults = TicTacToeService.getWinner(position);

        //checks if status from above and status from service on are equal
        assertEquals(status, mapResults.get("status"));
        System.out.println(position + " " + status);
    }

}
