package com.example.design_patterns.Behavioural.Observer.StockObserable;

import com.example.design_patterns.Behavioural.Observer.StockObserable.Observable.IPhoneObservableImpl;
import com.example.design_patterns.Behavioural.Observer.StockObserable.Observable.StockObservable;
import com.example.design_patterns.Behavioural.Observer.StockObserable.Observer.EmailAlertObserverImpl;
import com.example.design_patterns.Behavioural.Observer.StockObserable.Observer.MobileAlertObserverImpl;
import com.example.design_patterns.Behavioural.Observer.StockObserable.Observer.NotificationAlertObserver;

public class Stock {
    public static void main(String[] args) {
        StockObservable observable = new IPhoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver = new EmailAlertObserverImpl("xyz@gmail.com", observable);
        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl("abc@gmail.com", observable);
        NotificationAlertObserver notificationAlertObserver2 = new MobileAlertObserverImpl("pqrs", observable);

        observable.add(notificationAlertObserver);
        observable.add(notificationAlertObserver1);
        observable.add(notificationAlertObserver2);

        observable.setStockCount(1);

    }
}
