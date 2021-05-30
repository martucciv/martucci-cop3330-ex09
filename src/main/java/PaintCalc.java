import java.util.Scanner;

public class PaintCalc {
    public static void main(String[] args){

        System.out.print("What is the length of the ceiling in feet? ");
        Scanner input1 = new Scanner(System.in);
        double length = input1.nextDouble();

        System.out.print("What is the width of the ceiling in feet? ");
        Scanner input2 = new Scanner(System.in);
        double width = input2.nextDouble();

        double area = length * width;
        double paintNeeded = area / 350;
        double gallon = Math.ceil(paintNeeded);

        if(gallon == 1){
            System.out.printf("You will need to purchase %.0f gallon of paint to cover %.0f square feet.", gallon, area);
        }
        else
            System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallon, area);
    }
}
