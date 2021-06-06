import java.util.Scanner;
public class SIX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the five digit number");
        String num = input.nextLine();
        while (num.length()!=5){
            System.out.println("Wrong input ! Please enter a five digit number");
            num = input.nextLine();
        }
        int digit1 = Integer.parseInt(num.substring(0,1));
        int digit2 = Integer.parseInt(num.substring(1,2));
        int digit3 = Integer.parseInt(num.substring(2,3));
        int digit4 = Integer.parseInt(num.substring(3,4));
        int digit5 = Integer.parseInt(num.substring(4,5));

        if(digit1==digit5 && digit2==digit4)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome");

    }
}
