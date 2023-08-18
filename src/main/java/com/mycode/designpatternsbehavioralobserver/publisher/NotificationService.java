package com.mycode.designpatternsbehavioralobserver.publisher;

import com.mycode.designpatternsbehavioralobserver.enums.NotificationsTypes;
import com.mycode.designpatternsbehavioralobserver.listeners.Listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NotificationService {
    private HashMap<NotificationsTypes, List<Listener>> listeners;

    public NotificationService() {
        listeners = new HashMap<>();
    }

    public void subscribe(Listener listener, NotificationsTypes type) {
        listeners
                .computeIfAbsent(type, typeSubscribers -> new ArrayList<>())
                .add(listener);
    }

    public void unsubscribe(Listener listener, NotificationsTypes type) {
        listeners
                .computeIfAbsent(type, typeSubscribers -> new ArrayList<>())
                .remove(listener);
    }

    public void notifySubscribers(String message, NotificationsTypes type) {
        listeners
                .computeIfAbsent(type, typeSubscribers -> new ArrayList<>())
                .forEach(listener -> {
                    listener.notifyChange(message);
                });
    }
}
