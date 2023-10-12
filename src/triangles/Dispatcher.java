package triangles;


import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) {
        Triangle t1 = new Triangle('*', 5, 1, 2);
        Rectangle r1 = new Rectangle('*', 1, 10, 2);

        Triangle topTree = new Triangle('*', 3, 1, 2);
        Triangle middleTree = new Triangle('*', 5, 3, 2);
        Triangle bottomTree = new Triangle('*', 9, 3, 2);
        Rectangle groundTree = new Rectangle('.', 2, 3, 2);

        Triangle topRocket = new Triangle('*', 2, 2, 2);
        Triangle middleRocket = new Triangle('*', 3, 2, 2);
        Triangle bottomRocket = new Triangle('*', 4, 2, 2);

        Rectangle r1Rocket = new Rectangle('.', 1, 3, 2);
        Rectangle r2Rocket = new Rectangle('.', 2, 3, 2);

        ControllerAndView.printUpLeft(t1, t1.height);
        System.out.println();

        ControllerAndView.printDownLeft(t1, t1.height);
        System.out.println();

        ControllerAndView.printUpRight(t1, t1.height);
        System.out.println();

        ControllerAndView.printDownRight(t1, t1.height);
        System.out.println();

        ControllerAndView.printRect(r1);
        System.out.println();

        ControllerAndView.printTrapeze(t1);
        System.out.println();

        ControllerAndView.printComplexLeft(t1, r1);
        System.out.println();

        ControllerAndView.printComplexUpLeft(t1, r1);
        System.out.println();

        ControllerAndView.printComplexRight(t1, r1);
        System.out.println();

        ControllerAndView.printComplexUpRight(t1, r1);
        System.out.println();

        ControllerAndView.printTree(topTree, middleTree, bottomTree, groundTree);
        System.out.println();

        ControllerAndView.printRocket(topRocket, middleRocket, bottomRocket, r1Rocket, r2Rocket);
        System.out.println();

    }
}
