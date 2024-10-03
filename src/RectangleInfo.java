import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double length = 0;
        double width = 0;

        boolean doneLength = false;
        boolean doneWidth = false;

        double perimeter = 0;
        double area = 0;
        double diagonal = 0;

        String trash = "";

        do {
            System.out.print("Enter the length of your rectangle: ");
            if (console.hasNextDouble()) {
                length = console.nextDouble();
                console.nextLine();
                doneLength = true;
            }else{
                trash = console.nextLine();
                System.out.println(trash + " is invalid, try again!");
            }
        }while (!doneLength);

        do {
            System.out.print("Enter the width of your rectangle: ");
            if (console.hasNextDouble()) {
                width = console.nextDouble();
                console.nextLine();
                doneWidth = true;
            } else {
                trash = console.nextLine();
                System.out.println(trash + " is invalid, try again!");
            }
        }while(!doneWidth);

        perimeter = length + width;
        area = length * width;
        diagonal = Math.sqrt((length * length) + (width * width));
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Diagonal: " + diagonal);
    }
}
