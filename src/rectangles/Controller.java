package rectangles;

public class Controller {
    static String checkIntersection(Rectangle r1, Rectangle r2){
        if(r1.bx < r2.ax | r1.ax > r2.bx | r1.by < r2.ay | r1.ay > r2.by){
            return "There is no intersection";
        } else if (r1.bx == r2.ax & r1.ay == r2.by | r1.ax == r2.bx & r1.ay == r2.by | r1.bx == r2.ax
                & r1.by == r2.ay | r1.ax == r2.bx & r1.by == r2.ay) {
            return "The intersection is a dot";
        } else if (r1.bx == r2.ax & r1.by > r2.ay & r1.ay < r2.by | r2.bx == r1.ax & r2.by > r1.ay & r2.ay < r1.by) {
            return "The intersection is a vertical line";
        } else if (r1.ay == r2.by & r1.bx > r2.ax & r1.ax < r2.bx | r2.ay == r1.by & r2.bx > r1.ax & r2.ax < r1.bx) {
            return "The intersection is a horizontal line";
        } else {
            return "The intersection is a rectangle";
        }
    }
}
