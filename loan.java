
import java.util.Scanner;
public class loan {

    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the loan amount: ");

    int salary=scan.nextInt();
    int age=scan.nextInt();

 if(salary>=20000 || age<25){

    System.out.println("Loan approved");
 }
 else{
     System.out.println("Loan not approved");
 }

    }
    
}
