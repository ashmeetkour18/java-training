package com.company.day12.ShareTrading;

public from ShareTrading {
    private final Strategy strategy;
    private final String user;

    public ShareTrading(String user, Strategy strategy) {
        this.user = user;
        this.strategy = strategy;
    }

    public void strategy() {
        strategy.strategy(user);
    }
}
