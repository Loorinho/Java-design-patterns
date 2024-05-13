package behavioral.flyweight;

public class ThinPen implements Pen{
    final BrushSize brushSize = BrushSize.THIN; // Intrinsic state which is sharable

    private String color = null; // Extrinsic state - supplied by client

    @Override
    public void setColor(String _color) {
        this.color = _color;
    }
    @Override
    public void draw(String content) {
        System.out.println("Drawing Thin content - "+ content +" in color " + color);
    }
}
