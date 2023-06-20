import java.util.Scanner;
import java.lang.Math;

public class MainD{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Var declarations
        double userMeters = 0;
        double conMiles = 0;
        double conFeet = 0;
        double conInches = 0;
        boolean conBool;

        //variable checker for user inputted meters
        do{
            conBool = false; //sets conBool to false for initial test
            try{
                System.out.println("Input how many meters: ");
                userMeters = in.nextDouble(); //input for meters
                //conversion output
                System.out.println("You've entered': " + userMeters);
                conBool = false; //do while breaker
            }
            catch (Exception e){ //exeption handler
                conBool = true;
                System.out.println("Wrong input detected, try again. \nInput your length: ");
                in.next(); //re input
            }
        }
        while (conBool);

        //calculation
        conMiles = userMeters / 1609;
        conFeet = userMeters * 3.28084;
        conInches = userMeters * 39.3701;

        //Outputs
        System.out.println(userMeters + " meters, is " + conMiles + " miles");
        System.out.println(userMeters + " meters, is " + conFeet + " feet");
        System.out.println(userMeters + " meters, is " + conInches + " inche(s)");
    }
}