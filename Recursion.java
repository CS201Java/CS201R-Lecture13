import java.util.ArrayList;
import java.util.Collections;

public class Recursion{

    static int ROW = 5, COL = 5;
    static char BACKGROUND = ' ';
    static char DEADEND = 'D';
    static char PATH = 'P';
    
    public static int gcd1(Integer a, Integer b){
        int x = 0;
        while (b > 0){
            x += 1;
            if (a > b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.println( "GCD1 LOOP COUNT = " + x + ". GCD = " + a);
        return a;
    }

    
    public static void gcd2(Integer a, Integer b, Integer count){
        count ++;
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0){
            System.out.println( "GCD1 LOOP COUNT = " + count + ". GCD = " + a);
        }
        else{
            int r = a % b;
            gcd2(b,r,count);
        }
    }

    //What is printed if n = 7
    public static void ex13(Integer n){
        if (n == 1)
           System.out.println(n + " ");
        else {  
            System.out.print(n + " ");
            ex13(n / 2);
        }             
    }

    //What is printed if n = 12
    public static void ex14(Integer n){
        if (n == 1)
           System.out.print(n + " ");
        else {  
            ex14(n / 3);
            System.out.print(n + " ");
        }             
    }

    //What is printed if n = 12
    public static int ex14b(Integer n){
        if (n == 1)
           return 1;
        else {  
            return 3* ex14b(n / 3);
        }             
    }
    //What is printed if the string is abcdefabc

    public static void ex15(String str){
        if (str.length() < 3)
            System.out.println(str);

        else if (str.substring(0,3).equals("abc")){
            System.out.println("a");
            ex15(str.substring(1));
        }
        else { 
            System.out.println("b");
            ex15(str.substring(3));
        }
    }
    
    //What is printed if s = {"a", "b", "c"};

    public static void ex16(ArrayList<String> s, Integer left, Integer right){
        if (left == right)
            System.out.println(s);

        for (int i = left; i <= right; i++){
            Collections.swap(s, left, i);
            ex16(s, left + 1, right);
            Collections.swap(s, left, i);
   }
    }

    public static void printMaze(ArrayList<ArrayList<Character>> grid) {
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                System.out.print( grid.get(r).get(c) + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static boolean findMazePath(ArrayList<ArrayList<Character>> grid, Integer r, Integer c) {
        if (r < 0 || c < 0 || r >= ROW || c >= COL)
            return false;      // Cell is out of bounds.

        else if (grid.get(r).get(c) != BACKGROUND)
            return false;      // Cell is on barrier or dead end.

        else if (r == ROW - 1 && c == COL - 1) {
            grid.get(r).set(c, PATH);           // Cell is on path
            return true;                        // and is maze exit.
        }
        else {
            grid.get(r).set(c, PATH);
            if (findMazePath(grid, r - 1, c)
                || findMazePath(grid, r + 1, c)
                || findMazePath(grid, r, c - 1)
                || findMazePath(grid, r, c + 1)) {
                return true;
            }
            else {
                grid.get(r).set(c, DEADEND);  // Dead end.
                return false;
            }
        }
    }
}