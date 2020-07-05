package com.company.Observer;

public class CurrentScoreDisplay {

    int runs,wickets;
    float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        display();
    }

    private void display() {

        System.out.println("Runs - "+runs+" Wickets - "+wickets+" Overs - "+overs);

    }
}
