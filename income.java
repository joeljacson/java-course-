import java.util.Scanner;

public class income {
    public static void main (String[]args)
    {
        Scanner scan =new Scanner (System.in);
        int income=scan.nextInt();

        if (income>7000){
            System.out.print("scholarship is available");
        }
        else{
            System.out.print("scholarship is not available");
        }
    }
    
}
