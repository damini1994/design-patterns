package com.example.design_patterns.Behavioural.Observer.StockObserable.Observer;

import com.example.design_patterns.Behavioural.Observer.StockObserable.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String username, String msg) {
        System.out.println("msg sent to: "+username+" having msg: "+msg);
    }
}
