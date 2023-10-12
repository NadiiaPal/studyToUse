package main;

import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) {
        if(args[0].equals("MARKS")){
            ArrayList<String> marks = new ArrayList<String>();
            ControllerAndView.printMark(marks, args);
            System.out.println(marks.toString());
        } else if (args[0].equals("PLANETS")){
            ArrayList<String> planets = new ArrayList<String>();
            ControllerAndView.printPlanet(planets, args);
            System.out.println(planets.toString());
        }else if(args[0].equals("WEEK_DAYS")){
            ArrayList<String> days = new ArrayList<String>();
            ControllerAndView.printWeekDay(days, args);
            System.out.println(days.toString());
        }else {
            System.out.println("Try again");
        }
    }
}
