package com.company.Observer;

public class AverageScoreDisplay {

    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int) (this.runRate*50);
        display();
    }

    private void display() {
        System.out.println("Run rate - "+runRate+" Predicted score - "+predictedScore);
    }
}
