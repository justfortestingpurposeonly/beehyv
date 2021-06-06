import java.util.Scanner;
public class TWO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 5 digit number");
        String num = input.nextLine();
        String digit1=num.substring(0,1);
        String digit2=num.substring(1,2);
        String digit3=num.substring(2,3);
        String digit4=num.substring(3,4);
        String digit5 = num.substring(4,5);
        System.out.println(digit1+"   "+digit2+"   "+digit3+"   "+digit4+"   "+digit5);
    }
}
/* When the number is more than 5 digit the program simply uses the first 5 digits.
   When the number is smaller than 5 digits it throws an eroor StringIndexOutOfBoundsBeginEnd
 */