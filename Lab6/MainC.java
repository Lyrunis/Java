
import java.util.Scanner;
import java.lang.Math;

public class MainC{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Var declarations
        double rectW = 0;
        double rectL = 0;
        double rectArea = 0;
        double rectPer = 0;
        double rectDiag = 0;
        boolean rectBool;

        //variable checker for rectangle length
        do{
            rectBool = false; //sets rectBool to false for initial test
            try{
                System.out.println("Input length of rectangle: ");
                rectL = in.nextDouble(); //input for length
                //conversion output
                System.out.println("Your rectangle length is: " + rectL);
                rectBool = false; //do while breaker
            }
            catch (Exception e){ //exeption handler
                rectBool = true;
                System.out.println("Wrong input detected, try again. \nInput your length: ");
                in.next(); //re input
            }
        }
        while (rectBool);

        //variable checker for Width
        do{
            rectBool = false; //sets rectBool to false for initial test
            try{
                System.out.println("Input width of rectange: ");
                rectW = in.nextDouble(); //input for width
                //conversion output
                System.out.println("Your rectangle width is: " + rectW);
                rectBool = false; //do while breaker
            }
            catch (Exception e){ //exeption handler
                rectBool = true;
                System.out.println("Wrong input detected, try again. \nInput your width: ");
                in.next(); //re input
            }
        }
        while (rectBool);

        //Calculations
        rectArea = rectL * rectW;
        rectPer = (2 * rectL) + (2 * rectW);
        rectDiag = Math.sqrt((Math.pow(rectW, 2)) + (Math.pow(rectL, 2)));

        //output
        System.out.println("The area of your rectangle is " + rectArea);
        System.out.println("The perimeter of your rectangle is " + rectPer);
        System.out.println("The diagonal of your rectangle is " + rectDiag);

    }
}