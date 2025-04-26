package com.example.design_patterns.Behavioural.Observer.StockObserable.Observer;

import com.example.design_patterns.Behavioural.Observer.StockObserable.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("mail sent to: "+emailId+" having msg: "+msg);
    }
}
