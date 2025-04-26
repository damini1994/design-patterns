package com.example.design_patterns.Behavioural.Observer.StockObserable.Observable;

import com.example.design_patterns.Behavioural.Observer.StockObserable.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int stockCount);
    public int getStockCount();
}
