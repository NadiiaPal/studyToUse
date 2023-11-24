package backHanded;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Dispatcher {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Stream s = c.parallelStream(); // changing static collection to stream

        //from java 8, interfaces have default methods
        I1 child = new Child();
        I1.m3();
        //example of lambda
        //Анонімний клас - позбавляє від імені класу

        //Лямбда вираз - позбавляє від назви і класу і методу, оскільки так чи інакше функціональний інтерфейс має
        // тільки один метод, який треба визначити
        Lambda l1 = () -> {
            System.out.println("Inside lambda");
        };

        //в джаві є багато визначених стандартних функціональних інтерфейсів
    }
}
interface I1{
    void m();
    default void m2(){System.out.println("m2");};
    static void m3(){System.out.println("m3");};// static methods don't inherit
}
interface I2 extends I1{}
interface I3{
    default void m2(){System.out.println("m2 I3");}//we cannot implement it and I1, cause m2 are both
}
class Parent{
    void m2(){System.out.println("m2 Parent");};
    //if we implement default method from interface and inherit it from super class
    //method of super class is closer
}
class Child extends Parent implements I1, I3{
    @Override
    public void m() {
        System.out.println("m1 Child");
    }
    public void m2(){System.out.println("m2 Child");}//but we can override it, using 'public'

}
////
//Функціональний інтерфес має можливість мати довільну к-сть дефолтниї та статичних методів, але тільки 1 абстрактний
@FunctionalInterface //metadata annotation
interface I6{
    void i1();
    //void i2();
    default void i3(){};
    default void i4(){};
    static  void i5(){};
    static void i6(){};
}

@FunctionalInterface
interface Lambda{
    void display();
}