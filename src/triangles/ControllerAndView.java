package triangles;

import java.sql.SQLOutput;

public class ControllerAndView {
    static int i, row, col;

    //level 0
    static void printRowSpace(int width) {
        for (i = 0; i < width; i++) {
            System.out.print(" ");
        }
    }

    static void printRowChars(int width, char pattern) {
        for (i = 0; i < width; i++) {
            System.out.print(pattern);
        }
    }
    //level 1
    static void printUpLeft(Triangle t, int height){
        for(row = 1; row <= height; row++){
            printRowSpace(t.shift);
            printRowChars(row, t.pattern);
            System.out.println();
        }
    }
    static void printDownLeft(Triangle t, int height){
        for(row = 0; row < height; row++){
            printRowSpace(t.shift);
            printRowChars(height - row, t.pattern);
            System.out.println();
        }
    }
    static void printUpRight(Triangle t, int height){
        for(row = 1; row <= height; row++){
            printRowSpace(t.shift + height - row);
            printRowChars(row, t.pattern);
            System.out.println();
        }
    }
    static void printDownRight(Triangle t, int height){
        for(row = 0; row < height; row++){
            printRowSpace( t.shift + row);
            printRowChars(height - row, t.pattern);
            System.out.println();
        }
    }
    static void printRect(Rectangle r){
        for(row = 0; row < r.height; row++){
            printRowSpace(r.shift);
            printRowChars(r.width, r.pattern);
            System.out.println();
        }
    }

    static void printTrapeze(Triangle t){
        for (row = 0; row < t.height; row++){
            printRowSpace(t.shift + t.height - row - 1);
            printRowChars(row + t.width + row, t.pattern);
            System.out.println();
        }
    }
    //level 2
    static void printComplexLeft(Triangle t, Rectangle r){
        r.width = t.height;
        printUpLeft(t, t.height - 1);
        printRect(r);
        printDownLeft(t, t.height - 1);
    }
    static void printComplexUpLeft(Triangle t, Rectangle r){
        r.width = t.height;
        printUpLeft(t, t.height - 1);
        printRect(r);
        t.shift++;
        printDownRight(t, t.height - 1);
        t.shift--;
    }
    static void printComplexRight(Triangle t, Rectangle r){
        r.width = t.height;
        t.shift++;
        printUpRight(t, t.height - 1);
        printRect(r);
        printDownRight(t, t.height - 1);
        t.shift--;
    }
    static void printComplexUpRight(Triangle t, Rectangle r){
        r.width = t.height;
        t.shift++;
        printUpRight(t, t.height - 1);
        printRect(r);
        t.shift--;
        printDownLeft(t, t.height - 1);
    }

    static void printTree(Triangle top, Triangle middle, Triangle bottom, Rectangle ground){
        top.shift += bottom.height + bottom.width / 2 - top.height;
        middle.shift += bottom.height + bottom.width / 2  - middle.height - middle.width / 2;
        printTrapeze(top);
        printTrapeze(middle);
        printTrapeze(bottom);
        ground.width = bottom.width;
        ground.shift += bottom.height - 1;
        printRect(ground);
    }
    static void printRocket(Triangle top, Triangle middle, Triangle bottom, Rectangle r1, Rectangle r2){
        top.shift += bottom.height - 1;
        r1.shift += bottom.height - 1;
        r2.shift += bottom.height - 1;
        middle.shift += bottom.height - middle.height;
        middle.width = (top.height * 2) - 2 + top.width;
        r1.width = middle.width;
        r2.width = middle.width;
        bottom.width = middle.width;
        printTrapeze(top);
        printRect(r1);
        printTrapeze(middle);
        printRect(r2);
        printTrapeze(bottom);
    }

}