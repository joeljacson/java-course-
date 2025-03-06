import java.util.Scanner;
public class Rcb {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter RCB result (win/lose): ");

        String RCB= scan.nextLine();


        
        if (RCB.equals("win")) 
        { 
            System.out.print("RCB won the trophy");
        } else
         {
            System.out.print("RCB didn't win the trophy");
        }
    }
}
