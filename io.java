//import java.util.Scanner;

public class io {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("The sum is = " + (a+b));*/

        String button = args[0];
        if (button.equals("1"))
            System.out.println("Hello");
        else if (button.equals("2"))
            System.out.println("Namaste");
        else if (button.equals("3"))
            System.out.println("Bonjour");
        else 
            System.out.println("Wrong button!");
    }
}  
