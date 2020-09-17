package Part2;

public class SalaryTable {

    public static void main(String[] args) {
        System.out.println("YEAR\tOLD SALARY\tRAISE\tNEW SALARY");
        System.out.println("----\t----------\t-----\t----------");
        double salary = 40000, raise, salary2 = 40000;
        System.out.println(" 1\t  40000  \t 0\t  40000");
        for(int i = 1; i <= 10; i++){
            int x = i + 1;
            raise = salary * 0.03;
            salary2 = salary2 + 1200;
            System.out.format(" %d\t  %d  \t%d\t  %d\n", x, (int)salary2, (int)raise, (int)salary2);
        }
    }
    
}
