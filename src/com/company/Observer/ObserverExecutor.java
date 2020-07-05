package com.company.Observer;

public class ObserverExecutor {

    public void execute(){

        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        CricketData cricketData = new CricketData(currentScoreDisplay,averageScoreDisplay);
        cricketData.dataChanged();

    }

}
