package dev.kaldiroglu.dp.creational.ch04.computer.gof.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void create(){
        builder.buildPart();
        Product product = builder.getResult();
    }
}
