package com.company.day12.ShareTrading;

public class Main {
    public static void main(String[] args) {
        ShareTrading shareTrading = new ShareTrading("user", new _Strategy());
        shareTrading.strategy();
    }
}
