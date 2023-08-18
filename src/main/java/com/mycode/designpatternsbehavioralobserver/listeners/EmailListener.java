package com.mycode.designpatternsbehavioralobserver.listeners;

import lombok.Data;

@Data
public class EmailListener implements Listener {
    private String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void notifyChange(String message) {
        System.out.println("Message For :: " + email + ", Message :: " + message);
    }
}
