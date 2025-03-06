import java.util.Scanner;

class even{

    public static void main (String []args)
    {
        Scanner scan =new Scanner(System.in);
        int even= scan.nextInt();

        if (even%2==0)
        {
            System.out.print("the number is even");
        }
        else{
            System.out.print("the number is not even");
        }
    }
}