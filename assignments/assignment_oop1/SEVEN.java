public class SEVEN {
    public static void main(String[] args) {
        System.out.println("Please enter the limit");
        int a,b,c = 0;
        int lim = 500;
        int m = 2;
        int n = 1;
        System.out.println("SIDE1    SIDE2    HYPOTENUSE");
        while(c<=lim){
            for(n=1;n<m;n++) {
                a = m*m - n*n;
                b = 2*m*n;
                c = m*m + n*n;
                if(c<lim)
                    System.out.printf("%03d       %03d        %03d%n",a,b,c);
                else
                    break;
            }
            m++;
        }
    }
}
