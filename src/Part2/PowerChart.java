package Part2;
import java.util.Scanner;

public class PowerChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, ans;
        System.out.print("Enter your number > ");
        x = s.nextInt();
        for(int i = 0; i <= x; i++){
            ans = (int)(Math.pow(2, i));
            System.out.println("2^" + i + " = " + ans);
        }
    }
    
}
