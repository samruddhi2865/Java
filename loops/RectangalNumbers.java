import java.util.Scanner;
public class RectangalNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of the rows ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){

                   System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k-1);
            }
            System.out.print("\n");
        }
    }
}
