package D042_06_09.facade;

/**
 * Created by Miver on 2017-09-06.
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawAll() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
