
import java.util.Scanner;

public class MainB{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Var declarations
        double tankGallon = 0;
        double gasPrice = 0;
        double fuelEff = 0;
        double gasCostTotal = 0;
        double milesTotal = 0;
        boolean gasBool;

        //variable checker for gas in tank
        do{
            gasBool = false; //sets gasBool to false for initial test
            try{
                System.out.println("Input amount of gas in the tank");
                tankGallon = in.nextDouble(); //input for gas in tank
                //conversion output
                System.out.println("You have " + tankGallon + " gallons in the tank");
                gasBool = false; //do while breaker
            }
            catch (Exception e){ //exeption handler
                gasBool = true;
                System.out.println("Wrong input detected, try again. \nInput your tank amount: ");
                in.next(); //re input
            }
        }
        while (gasBool);

        //variable checker for fuel efficiency
        do{
            gasBool = false; //sets gasBool to false for initial test
            try{
                System.out.println("Input your vehicle fuel efficiency X miles per gallon: ");
                fuelEff = in.nextDouble(); //input for fuel efficiency in tank
                //conversion output
                System.out.println("You go " + fuelEff + " miles per gallon");
                gasBool = false; //do while breaker
            }
            catch (Exception e){ //exeption handler
                gasBool = true;
                System.out.println("Wrong input detected, try again. \nInput your fuel efficiency: ");
                in.next(); //re input
            }
        }
        while (gasBool);

        //variable checker for price of gas
        do{
            gasBool = false; //sets gasBool to false for initial test
            try{
                System.out.println("Input the current price of gas per gallon: ");
                gasPrice = in.nextDouble(); //input for gas price
                //conversion output
                System.out.println("Gas costs " + gasPrice+ " dollars");
                gasBool = false; //do while breaker
            }
            catch (Exception e){ //exeption handler
                gasBool = true;
                System.out.println("Wrong input detected, try again. \nInput gas price: ");
                in.next(); //re input
            }
        }
        while (gasBool);

        //calculations
        gasCostTotal = (100 / fuelEff) * gasPrice;
        milesTotal = (tankGallon * fuelEff);

        //output
        System.out.println("Total amount to travel 100 miles is $" + gasCostTotal + "\nMaximum distance covered on current tank is " + milesTotal + " miles");
        }
    }