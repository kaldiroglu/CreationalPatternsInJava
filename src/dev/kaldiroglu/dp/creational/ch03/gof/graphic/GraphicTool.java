package dev.kaldiroglu.dp.creational.ch03.gof.graphic;

public class GraphicTool extends Tool{

    public GraphicTool(Graphic graphic) {
        super(graphic);
    }

    @Override
    public void manipluate() {
        Graphic graphic = prototype.clone();
        graphic.draw(new Position());
    }
}
