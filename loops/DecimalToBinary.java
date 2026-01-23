import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int number = sc.nextInt();
        int pw=1;
        int res=0;

        while (number > 0) {
            int digit = number%2;
            res+=(digit*pw);
            pw=pw*10;
            number = number/2;


        }
        System.out.println("Binary number : "+ res);
        }
    }
