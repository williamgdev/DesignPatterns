package com.williamgdev.example.designpatterns.observer;

/**
 * Created by willimail on 2/13/18.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
