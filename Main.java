import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the value that you've wanted : ");
        int a = value.nextInt();
        System.out.println();
        System.out.print("Please enter the second value that you've wanted : ");
        int b = value.nextInt();
        System.out.println();
        value.close();
         double hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
         System.out.println("Hypotenuse value is : " + hypotenuse);

    }
}