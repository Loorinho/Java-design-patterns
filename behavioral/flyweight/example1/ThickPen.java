package behavioral.flyweight.example1;

public class ThickPen implements Pen{

    final BrushSize brushSize = BrushSize.THICK; // Intrinsic state which is sharable

    private String color = null; // Extrinsic state - supplied by client

   @Override
    public void setColor(String _color) {
        this.color = _color;
    }
    @Override
    public void draw(String content) {
        System.out.println("Drawing Thick content - "+ content +" in color " + color);
    }
}
