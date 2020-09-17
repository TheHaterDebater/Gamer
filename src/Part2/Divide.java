package Part2;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num3, rem;
        System.out.print("Enter the first number > ");
        num1 = s.nextInt();
        System.out.print("Enter the second number > ");
        num2 = s.nextInt();
        if(num1 > num2){
            num3 = num1 / num2;
            rem = num1 % num2;
            System.out.format("%dr%d", num3, rem);
        }
        else if(num2 > num1){
            num3 = num2 / num1;
            rem = num2 % num1;
            System.out.format("%dr%d", num3, rem);
        }
        else if(num1 == num2){
            System.out.println("Error, the numbers are the same");
        }
        
    }
    
}
