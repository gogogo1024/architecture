package com.example.demo.pattern.observer;

public interface Observer {
    public void update(String desc);

    public void subscribe();

    public void unSubscribe();
}
