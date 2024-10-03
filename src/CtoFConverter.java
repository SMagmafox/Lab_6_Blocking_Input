import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int tempC = 0;
        int tempF = 0;
        boolean doneTemp = false;
        String trash = "";

        do {
            System.out.print("Enter your tempature in Celcius: ");
            if(console.hasNextInt()){
                tempC = console.nextInt();
                console.nextLine();
                tempF = tempC * 9/5 + 32;
                System.out.println(tempC + " degrees Celcius is " + tempF + " degrees Fahrenheit");
                doneTemp = true;
            }else{
                trash = console.nextLine();
                System.out.println(trash + " is not a valid tempature. Try again!");
                doneTemp = false;
            }
        }while (!doneTemp);
    }
}