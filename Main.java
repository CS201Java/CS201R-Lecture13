import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        System.out.println("Example 1: Tail Recursion");
        example1(5);
        System.out.println();

        System.out.println("\nExample 2: Head Recursion");
        example2(5);
        System.out.println();

        System.out.println("\nExample 3: Head Recursion - Triangle");
        example3(9);

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("\nExample 4: Tail Recursion - Factorial");
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("\nExample 4: Factorial of " + n + " is " + example4(n));

        System.out.println("\nExample 5: Fibonacci Sequence");
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("\nExample 5: Sequence value at " + n + " is " + example5(n));
    }
    
    public static void example1(int n){
        if (n >= 1){
            System.out.print(n + " ");
            example1(n - 1);
        }
    }
    public static void example2(int n){
        if (n >= 1){
            example2(n - 1);
            System.out.print(n + " ");
        }
    }

    //using
    public static void example3(int n){
        if (n > 1)
            example3(n - 2);
        int i;
        for (i = 0; i < (9-n)/2; i++)
            System.out.print(" ");
        for (i = 0; i < n; i++)
            System.out.print("*");
        System.out.println();
    }

    //factorial
    public static int example4(int n){
        if (n == 0)
            return 1;
        else
            return n * example4(n - 1);
    }

    public static int example5(int n){
        if (n <= 1)
            return n;

        return example5(n-1) +  example5(n - 2);
    }
    
}
