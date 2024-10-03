import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int randomNum = (int)(Math.random()*10) + 1;
        int numGuess = 0;

        boolean doneGuess = false;
        boolean  correctGuess = false;
        boolean notInRange = true;

        String trash = "";

        do{
            do {
                do {
                    System.out.print("Guess the number[1-10]: ");

                    if (console.hasNextInt()) {
                        numGuess = console.nextInt();
                        console.nextLine();
                        doneGuess = true;
                    } else {
                        trash = console.nextLine();
                        System.out.println(trash + " is an invalid number. Try again!");
                    }


                } while (!doneGuess);

                if (numGuess > 10 || numGuess < 1) {
                    System.out.println(numGuess + " is not between 1 and 10. Try again!");
                    notInRange = true;
                } else{
                    notInRange = false;
                }
            }while (notInRange);

                if(numGuess == randomNum)
                {
                    System.out.println("CORRECT! the number is " + randomNum +"!!");
                    correctGuess = true;
                } else if (numGuess > randomNum)
                {
                    System.out.println("Your guess was too high. Try again!");
                    doneGuess = false;
                } else
                {
                    System.out.println("Your guess was too low. Try again!");
                    doneGuess = false;
                }
        }while(!correctGuess);

    }
}
