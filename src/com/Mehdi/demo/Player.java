package com.Mehdi.demo;


public class Player {

    private int score;

    public void addFivePoints() {
        score += 500;
        setScore(score + 500);
    }


    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int score) {
       if (score >= 500) {
           System.out.println("Score is way too high");
           return;
       }

       this.score = score;
    }
}
