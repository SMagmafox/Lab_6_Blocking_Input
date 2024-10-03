import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double maxGallon = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;

        boolean doneMax = false;
        boolean doneMiles = false;
        boolean donePrice = false;

        double hundredMilesCost = 0;
        double fullTankDistance = 0;

        String trash = "";

        do //max gallon check
        {
            System.out.print("Enter the amount of gas your tank can hold: ");
            if (console.hasNextDouble())
            {
                maxGallon = console.nextDouble();
                console.nextLine();
                doneMax = true;
            }else{
                trash = console.nextLine();
                System.out.println(trash + " is not valid, try again!");
            }
        }while (!doneMax);

        do //MPG check
        {
            System.out.print("Enter your fuel efficency in miles per gallon: ");
            if (console.hasNextDouble())
            {
                milesPerGallon = console.nextDouble();
                console.nextLine();
                doneMiles = true;
            }else{
                trash = console.nextLine();
                System.out.println(trash + " is not valid, try again!");
            }
        }while (!doneMiles);

        do//price check
        {
            System.out.print("Enter the cost of gas per gallon: ");
            if (console.hasNextDouble())
            {
                pricePerGallon = console.nextDouble();
                console.nextLine();
                donePrice = true;
            }else{
                trash = console.nextLine();
                System.out.println(trash + " is not valid, try again!");
            }
        }while (!donePrice);

        hundredMilesCost = pricePerGallon * 100;
        System.out.println("It costs $" + hundredMilesCost + " to drive 100 miles.");
        fullTankDistance = maxGallon * milesPerGallon;
        System.out.println("You can go " + fullTankDistance + " miles on a full tank.");
    }
}
