package com.company.Observer;

public class CricketData {

    int runs, wickets;
    float overs;

    CurrentScoreDisplay currentScoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    public CricketData(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    private int getLatestRuns(){
        //dummy
        return 100;
    }

    private float getLatestOvers(){
        //dummy
        return 6.0f;
    }

    private int getLatestWickets(){
        //dummy
        return 6;
    }

    public void dataChanged(){
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay.update(runs,wickets,overs);
        averageScoreDisplay.update(runs,wickets,overs);
    }


}
