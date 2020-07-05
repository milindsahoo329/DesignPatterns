package com.company.Strategy;

public class StrategyExecutor {

    public void execute(){
        JumpBehavior jumpBehavior = new ShortJump();
        KickBehavior kickBehavior1 = new LightningKick();
        KickBehavior kickBehavior2 = new TornadoKick();

        Fighter jackieChan = new JackieChan(kickBehavior1,jumpBehavior);
        jackieChan.punch();
        jackieChan.jump();
        jackieChan.kick();

        jackieChan.setKickBehavior(kickBehavior2);
        jackieChan.kick();
    }

}
