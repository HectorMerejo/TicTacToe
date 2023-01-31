package com.tictactoc.thegame.business;

import com.tictactoc.thegame.model.tictactoe;
import com.tictactoc.thegame.utility.EnvironmentVariableUtility;
import com.tictactoc.thegame.utility.XMLProcessorUtility;
import com.tictactoc.thegame.xmllogic.TicTacToeRule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicTacToeService {
    //Figures out the winner
    public static Map<String,Object> getWinner(String position){

        String fileName = "/tic-tac-toe.xml";
        String environmentVariable = EnvironmentVariableUtility.getEnv("CST_3613_SPRING_2022_DATA") + fileName;
        String elementName = "rule";
        List<tictactoe> tttRules = XMLProcessorUtility.processXML(TicTacToeRule::getTicTacToe, environmentVariable, elementName);
        Map<String,Object> map = new HashMap<>();

        char[] move = new char[position.length()];
        for (int i = 0; i < position.length(); i++){
            move[i] = position.charAt(i);}

        for (int i = 0; i < tttRules.size(); i++) {

            if (Character.toString(move[tttRules.get(i).getP1()]).equals("X")
                    && Character.toString(move[tttRules.get(i).getP2()]).equals("X")
                    && Character.toString(move[tttRules.get(i).getP3()]).equals("X"))
            {
                map.put("no", tttRules.get(i).getNo());
                map.put("p1", tttRules.get(i).getP1());
                map.put("p2", tttRules.get(i).getP2());
                map.put("p3", tttRules.get(i).getP3());
                map.put("position", tttRules.get(i).getPosition());
                map.put("status", true);
                map.put("winner", "X");
                map.put("input", position);
                break;
            }
            else if(Character.toString(move[tttRules.get(i).getP1()]).equals("O")
                    && Character.toString(move[tttRules.get(i).getP2()]).equals("O")
                    && Character.toString(move[tttRules.get(i).getP3()]).equals("O"))
            {
                map.put("no", tttRules.get(i).getNo());
                map.put("p1", tttRules.get(i).getP1());
                map.put("p2", tttRules.get(i).getP2());
                map.put("p3", tttRules.get(i).getP3());
                map.put("position", tttRules.get(i).getPosition());
                map.put("status", true);
                map.put("winner", "O");
                map.put("input", position);
                break;
            }
            else {
                map.put("status", false);
            }
        }
        return map;
    }
}
