package rectangles;

import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) {
        int i;
        String result;
        ArrayList<Rectangle> listOfRectangle = new ArrayList<Rectangle>();
        Rectangle r1 = new Rectangle(2, 5, 5, 8);
        Rectangle r2 = new Rectangle(5, 3, 9, 10);
        Rectangle r3 = new Rectangle(1, 1, 4, 4);
        Rectangle r4 = new Rectangle(2, 3, 3, 7);
        listOfRectangle.add(r1); listOfRectangle.add(r2); listOfRectangle.add(r3); listOfRectangle.add(r4);
        for (i = 0; i < listOfRectangle.size(); i += 2){
            result = Controller.checkIntersection(listOfRectangle.get(i), listOfRectangle.get(i + 1));
            View.showResultIntersection(result);
        }
    }
}