public class EIGHT {
    public static void main(String[] args) {
    System.out.println("Num                             Factorial");
    for(int i=1;i<=20;i++){
        long factorial =  1;
        int num = 1;
        while(num<=i){
            factorial = num * factorial;
            num++;
        }
        System.out.printf("%02d!                       %020d%n",i,factorial);
    }
    }
}
/*
100! will exceed the maximum value of the datatype long.
 */