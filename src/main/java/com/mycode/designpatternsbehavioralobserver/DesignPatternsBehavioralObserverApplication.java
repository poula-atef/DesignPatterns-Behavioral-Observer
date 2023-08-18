package com.mycode.designpatternsbehavioralobserver;

import com.mycode.designpatternsbehavioralobserver.enums.NotificationsTypes;
import com.mycode.designpatternsbehavioralobserver.listeners.EmailListener;
import com.mycode.designpatternsbehavioralobserver.listeners.Listener;
import com.mycode.designpatternsbehavioralobserver.publisher.NotificationService;

public class DesignPatternsBehavioralObserverApplication {

    public static void main(String[] args) {

        Listener listener1 = new EmailListener("listener1@gmail.com");
        Listener listener2 = new EmailListener("listener2@gmail.com");
        Listener listener3 = new EmailListener("listener3@gmail.com");

        NotificationService service = new NotificationService();
        service.subscribe(listener1, NotificationsTypes.Offers);
        service.subscribe(listener2, NotificationsTypes.Events);
        service.subscribe(listener3, NotificationsTypes.Offers);

        service.notifySubscribers("50% Offers Only For Today !!", NotificationsTypes.Offers);
    }

}
