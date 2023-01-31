package com.tictactoc.thegame.model;

public class tictactoe {
    private int no;
    private int p1;
    private int p2;
    private int p3;
    private String input;
    private String winner;
    private String position;
    private boolean status;

    public tictactoe(int no, int p1, int p2, int p3, String input, String winner, String position, boolean status) {
        this.no = no;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.input = input;
        this.winner = winner;
        this.position = position;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "tictactoe{" +
                "no=" + no +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", input='" + input + '\'' +
                ", winner='" + winner + '\'' +
                ", position='" + position + '\'' +
                ", status=" + status +
                '}';
    }
}
