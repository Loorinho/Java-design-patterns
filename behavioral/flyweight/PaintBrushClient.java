package behavioral.flyweight;

public class PaintBrushClient {

    public static void main(String[] args) {
        System.out.println("Hashmap length = " + PenFactory.getPensMapLength());

        Pen yellowThickPen = PenFactory.getThickPen("Yellow");
        yellowThickPen.draw("Cat");

        Pen blueThickPen = PenFactory.getThickPen("Blue");
        yellowThickPen.draw("Dog");

        System.out.println("Hashmap length = " + PenFactory.getPensMapLength());


        Pen yellowThickPen2 = PenFactory.getThickPen("Yellow");
        yellowThickPen2.draw("Giraffe");

        Pen yellowThickPen3 = PenFactory.getThickPen("Yellow");
        yellowThickPen3.draw("Lion");
//        Pen yellowThickPen = PenFactory.getThickPen("Yellow");

        System.out.println("Hashmap length = " + PenFactory.getPensMapLength());
    }
}
