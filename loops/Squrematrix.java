import java.util.Scanner;
public class Squrematrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the numbers of the rows ");
       int r = sc.nextInt();
       System.out.println("Enter the numbers of the columns ");
       int c = sc.nextInt();
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print("* ");
           }
           System.out.print("\n");
       }
    }
}
