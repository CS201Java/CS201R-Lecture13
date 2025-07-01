import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        System.out.println("RECURSION\n");
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("EXAMPLE 1: Tail Recursion");
        example1(5);
        System.out.println();

        System.out.println("\nEXAMPLE 2: Head Recursion");
        example2(5);
        System.out.println();

        System.out.println("\nEXAMPLE 3: Head Recursion - Triangle");
        example3(9);

        int n;

        System.out.println("\nEXAMPLE 4: Tail Recursion - Factorial");
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("\nEXAMPLE 4: Factorial of " + n + " is " + example4(n));

        System.out.println("\nEXAMPLE 5: Fibonacci Sequence");
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("\nEXAMPLE 5: Sequence value at " + n + " is " + example5(n));

        String s;
        s = input.nextLine();  //used to clear newline from nextInt
        System.out.println("\nEXAMPLE 6: String Clean");
        System.out.print("Enter a String ");
        s = input.nextLine();
        System.out.println("\nEXAMPLE 6: The String: " + s + " cleaned is " + example6(s));

        System.out.println("\nEXAMPLE 7: Count ABCs");
        System.out.print("Enter a String ");
        s = input.nextLine();
        System.out.println("\nEXAMPLE 7: The String: " + s + " has " + example7(s) + " abcs");
            
        System.out.println("\nEXAMPLE 8: Bunny Ears");
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("\nEXAMPLE 8: " + n + " bunnies have " + example8(n) + " ears");

        System.out.println("\nEXAMPLE 9: Mutant Bunny Ears");
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("\nEXAMPLE 9: " + n + " mutant bunnies have " + example9(n) + " ears");

        */
        System.out.println("\nEXAMPLE 10: Demo - Binary Trees");
        BinaryTree tree = new BinaryTree();
        tree.buildTree();
        tree.printPreOrderWrapper();
<<<<<<< HEAD
        tree.printInOrderWrapper();
=======
>>>>>>> 29a203de1e11a9da05ba48c859750c561325c80a
        tree.printPostOrderWrapper();
        input.close();

    }

    
    //using tail recursion
    public static void example1(int n){
        if (n >= 1){
            System.out.print(n + " ");
            example1(n - 1);
        }
    }

    //using head recursion
    public static void example2(int n){
        if (n >= 1){
            example2(n - 1);
            System.out.print(n + " ");
        }
    }

    //using head recursion
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

    //fibonacci
    public static int example5(int n){
        if (n <= 1)
            return n;

        return example5(n-1) +  example5(n - 2);
    }
    
    
    //string clean
    public static String example6(String str){
        if (str.length() < 2)
           return str;
        if (str.charAt(0) == str.charAt(1))
            return example6(str.substring(1));
        else
            return str.substring(0,1) + example6(str.substring(1));
    }

    //count abcs
    public static int example7(String str){
       //writing this as a group

       return 0;
    }

    //bunny ears
    // Given the number of bunnies in a group, 
    // output the number of bunny ears using recursion

    public static int example8(int n){
       //writing this as a group

       return 0;
    }

    //mutant bunny ears
    //The bunnies standing in a line are numbered 1, 2, ...
    //The even bunnies (2, 4, ..) have the normal 2 ears.
    //The odd bunnies (1, 3, ..) have 3 ears
    //output thenumber of 'ears' in the line

    public static int example9(int n){
       //writing this as a group

       return 0;
    }
 
}
