package dev.kaldiroglu.dp.creational.ch02.factoryMethod.report;

public abstract class Report {
    private String name;

    public Report(String name){
        this.name = name;
    }

    public abstract void open();
    public abstract void print();
    public abstract void save();
    public abstract void revert();
    public abstract void close();
}
