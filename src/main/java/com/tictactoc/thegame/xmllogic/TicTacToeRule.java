package com.tictactoc.thegame.xmllogic;

import com.tictactoc.thegame.model.tictactoe;
import org.w3c.dom.Element;

public class TicTacToeRule {

    //imports the tictactoe model class
    public static tictactoe getTicTacToe(Element element){

        //gets tictactoe attributes
        int no = Integer.parseInt(element.getAttribute("no"));
        int p1 = Integer.parseInt(element.getAttribute("p1"));
        int p2 = Integer.parseInt(element.getAttribute("p2"));
        int p3 = Integer.parseInt(element.getAttribute("p3"));

        //get text
        String position = element.getTextContent();

        String input = "";
        String winner = "";
        boolean status = false;

        var rule = new tictactoe(no, p1, p2, p3, input, winner, position, status);

        return rule;

    }

    public static void main(String[] args) {

    }
}
