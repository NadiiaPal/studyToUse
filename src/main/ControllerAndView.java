package main;

import java.util.ArrayList;

public class ControllerAndView {
    static void printMark(ArrayList<String> marksToPrint, String[] args){
        int i;
        for (i = 1; i < args.length; i++){
            switch (args[i]){
                case "0":
                case "1":
                case "2":
                    marksToPrint.add(Data.typeOfMarks[0]);
                    break;
                case "3":{
                    marksToPrint.add(Data.typeOfMarks[1]);
                    break;
                }
                case "4":{
                    marksToPrint.add(Data.typeOfMarks[2]);
                    break;
                }
                case "5":{
                    marksToPrint.add(Data.typeOfMarks[3]);
                    break;
                }
                default:{
                    marksToPrint.add("Such mark doesn't exist! Try again");
                    break;
                }
            }
        }
    }

    static void printWeekDay(ArrayList<String> days, String[] args){
        int i;
        for(i = 1; i < args.length; i++){
            switch (args[i]){
                case "1":{
                    days.add(Data.nameOfDays[0]);
                    break;
                }
                case "2":{
                    days.add(Data.nameOfDays[1]);
                    break;
                }
                case "3":{
                    days.add(Data.nameOfDays[2]);
                    break;
                }
                case "4":{
                    days.add(Data.nameOfDays[3]);
                    break;
                }
                case "5":{
                    days.add(Data.nameOfDays[4]);
                    break;
                }
                case "6":{
                    days.add(Data.nameOfDays[5]);
                    break;
                }
                case "7":{
                    days.add(Data.nameOfDays[6]);
                    break;
                }
                default:{
                    days.add("Such day doesn't exist! Try again");
                    break;
                }
            }
        }
    }

    static void printPlanet(ArrayList<String> planets, String[] args){
        int i;
        for(i = 1; i < args.length; i++){
            switch(args[i]) {
                case "1":{
                    planets.add(Data.nameOfPlanet[0]);
                    break;
                }
                case "2":{
                    planets.add(Data.nameOfPlanet[1]);
                    break;
                }
                case "3":{
                    planets.add(Data.nameOfPlanet[2]);
                    break;
                }
                case "4":{
                    planets.add(Data.nameOfPlanet[3]);
                    break;
                }
                case "5":{
                    planets.add(Data.nameOfPlanet[4]);
                    break;
                }
                case "6":{
                    planets.add(Data.nameOfPlanet[5]);
                    break;
                }
                case "7":{
                    planets.add(Data.nameOfPlanet[6]);
                    break;
                }
                case "8":{
                    planets.add(Data.nameOfPlanet[7]);
                    break;
                }
                default:{
                    planets.add("Such planet doesn't exist! Try again");
                    break;
                }
            }
        }
    }
}
