
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        double momentum, m, v;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter object mass in kg > ");
        m = s.nextDouble();
        System.out.print("Enter object velocity > ");
        v = s.nextDouble();
        momentum = m * v;
        System.out.println(String.format("The object is moving at %.2f m/s", momentum));
        System.out.println("Program ended");
    }
    
}
