import java.util.Scanner;
public class ONE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the two numbers separated by space to compare");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print(num1>num2? num1+" is larger":num1==num2?"The numbers are equal":num2+" is larger");
    }
}
