package com.example.a38012.myapplication.model;


import com.example.a38012.myapplication.event.IBus;

public class EventMessageModel implements IBus.IEvent{

    public String message;

    public EventMessageModel(String message) {
        this.message = message;
    }


    @Override
    public int getTag() {
        return 10;
    }
}
