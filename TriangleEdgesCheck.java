package ss14_excercise_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleEdgesCheck {
    public static int input(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter triangle sides :");
            int a = sc.nextInt();
            System.out.println("Enter triangle sides ");
            int b = sc.nextInt();
            System.out.println("Enter triangle sides ");
            int c = sc.nextInt();
            if (a < 0 || b < 0 || c < 0){
                throw  new InputMismatchException();
            }
            if(a + b < c || a + c < b || b + c < a){
                throw new IllegalTriangleException();
            }
        } catch (InputMismatchException e) {
            System.out.println("You must enter a positive number !");
        }
        catch ( IllegalTriangleException e){
            System.out.println("The sum of any two sides must be greater than the other !");
        }
        return 22;
    }

    public static void main(String[] args) {
        System.out.println(input());
    }
}
