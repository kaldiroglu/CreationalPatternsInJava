package dev.kaldiroglu.dp.creational.ch03.gof.graphic;

public class RotateTool extends Tool{

    public RotateTool(Graphic prototype) {
        super(prototype);
    }

    @Override
    public void manipluate() {
        Graphic graphic = prototype.clone();
        graphic.draw(new Position());
    }
}
