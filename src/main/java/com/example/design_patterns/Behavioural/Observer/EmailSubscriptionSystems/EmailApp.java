package com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems;

import com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observable.MailingList;
import com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observer.Observer;
import com.example.design_patterns.Behavioural.Observer.EmailSubscriptionSystems.Observer.Subscriber;

public class EmailApp {
    public static void main(String[] args) {
        MailingList mailingList = new MailingList();

        Observer alice = new Subscriber("Alice");
        Observer bob = new Subscriber("Bob");

        mailingList.registerObserver(alice);
        mailingList.registerObserver(bob);

        mailingList.newEmail("Welcome to our newsletter!");
    }
}
