package behavioral.flyweight.example1;

import java.util.HashMap;

public class PenFactory {
    private static final HashMap<String, Pen> pensMap = new HashMap<>();

    public static int getPensMapLength(){
        return pensMap.size();
    }


    /**
     * Method to get the thick pens
     * @param color
     * @return
     */
    public static Pen getThickPen(String color){
        String hashMapKey = color + "-THICK"; // This is the format we want to store our pens in in the HashMap

        Pen pen = pensMap.get(hashMapKey); // Trying to get the pen by key in the hashmap

        if(pen != null){
            return pen; // If we have a pen already with that key, then we return it
        }else{
            // Otherwise, we create a new pen, set its color and the store it as an entry in the hashmap
            pen = new ThickPen();
            pen.setColor(color);
            pensMap.put(hashMapKey,pen);
        }

        return pen; // return the pen instance
    }

    // We can add other methods to get other pens
}
