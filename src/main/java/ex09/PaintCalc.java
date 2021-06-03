package ex09;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class PaintCalc {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        PaintCalc app = new PaintCalc();
        double length = app.inputLength();
        double width = app.inputWidth();
        double area = app.findArea(length,width);
        double paintNeeded = app.calcPaintNeeded(area);
        double gallon = app.amountGallons(paintNeeded);
        app.printOutput(gallon, area);
    }

    public double inputLength(){
        System.out.print("What is the length of the ceiling in feet? ");
        return input.nextDouble();
    }

    public double inputWidth(){
        System.out.print("What is the width of the ceiling in feet? ");
        return input.nextDouble();
    }

    public double findArea(double length, double width){
        return length * width;
    }

    public double calcPaintNeeded(double area){
        return area / 350;
    }

    public double amountGallons(double paintNeeded){
        return Math.ceil(paintNeeded);
    }

    public void printOutput(double gallon, double area){
        if(gallon == 1){
            System.out.printf("You will need to purchase %.0f gallon of paint to cover %.0f square feet.", gallon, area);
        }
        else
            System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallon, area);
    }
}
