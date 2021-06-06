import java.util.Scanner;
public class FIVE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the side of the square");
        int side = input.nextInt();
        for(int i=0;i<side;i++){
            if(i==0 || i==side-1) {
                for (int j = 0; j < side-1; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            else{
                System.out.print("*");
                for (int j=0; j < side-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }


        }
    }
}
