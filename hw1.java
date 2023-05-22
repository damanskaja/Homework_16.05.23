import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        try {
            int myInt = scanner.nextInt();
            scanner.close();

            double myDouble = myInt;
           
            String myOct = Integer.toString(myInt, 8);
            String myHex = Integer.toString(myInt, 16);
            String myBin = Integer.toString(myInt, 2);
            

            System.out.println("integer:\t" + myInt);
            System.out.println("double:\t\t" + myDouble);
            System.out.println("octal:\t\t" + myOct);
            System.out.println("hex:\t\t" + myHex);
            System.out.println("bin:\t\t" + myBin);
        } catch (Exception e) {
            System.out.println("Enterd value is not a number!");

        }
    }
}