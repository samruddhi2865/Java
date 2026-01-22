import java.util.Scanner;
public class BinaryTodecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int pw =1;
      int res=0;
        System.out.println("Enter a binary number");
        int number = sc.nextInt();
        int on = number;
        while(number>0){
            int digit = number%10;
            res = res + digit *pw;
            pw=pw*2;
            number =number/10;
        }
        String s = String.valueOf(on);
        System.out.println("The decimal number of binary number "+s+" is "+res);
    }
}