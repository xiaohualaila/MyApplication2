package com.example.a38012.myapplication.model;


import com.example.a38012.myapplication.event.IBus;

public class ProgressModel implements IBus.IEvent{

    public long progress;

    public long total;

    public String fileName;

    public int index;

    public int num;
    public String type;
    public ProgressModel(long progress, long total,int index, int num,String fileName,String type) {
        this.progress = progress;
        this.total = total;
        this.fileName = fileName;
        this.index = index;
        this.type = type;
        this.num = num;
    }


    @Override
    public int getTag() {
        return 10;
    }
}
