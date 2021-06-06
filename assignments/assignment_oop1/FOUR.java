import java.util.Scanner;
public class FOUR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the salary and number format (salary hours) of hours of each employee separated by spaces");
        float sal1 = input.nextFloat();
        float hr1 = input.nextFloat();
        float sal2 = input.nextFloat();
        float hr2 = input.nextFloat();
        float sal3 = input.nextFloat();
        float hr3 = input.nextFloat();
        float gross1 = 0;
        float gross2 = 0;
        float gross3 = 0;
        float appr = 1.5f;
        if(hr1<=40)
            gross1 = sal1 * hr1;
        else
            gross1 = (40*sal1)+(hr1-40)*(appr)*sal1;
        if(hr2<=40)
            gross2 = sal2 * hr2;
        else
            gross2 = (40*sal2)+(hr2-40)*sal2*appr;
        if(hr3<=40)
            gross3 = sal3 * hr3;
        else
            gross3 = (40*sal3)+(hr3-40)*sal3*appr;
        System.out.printf("The salary of employee 1,2 and 3 are %.2f,%.2f and %.2f respectively",gross1,gross2,gross3);

    }
}
