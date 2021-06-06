import java.util.Scanner;
public class THREE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;
        System.out.println("Please enter the five numbers separated by spaces");
        for(int i=0;i<5;i++){
            int num = input.nextInt();
            if(num>0){
                pos++;
            }else if(num==0){
                zero++;
            }else
                neg++;
        }
        System.out.printf("The number of positive,negative and zero inputs are %d,%d and %d respectively",pos,neg,zero);


    }
}
