import java.util.Scanner;
 class job
 {
    public static void main (String[]args)
    {
        Scanner scan= new Scanner (System.in);
         int s1= scan.nextInt();
         int s2= scan.nextInt();
         int s3= scan.nextInt();
         int s4= scan.nextInt();
         int s5= scan.nextInt();
     
   int totalmarks = s1+s2+s3+s4+s5;
    int avg = totalmarks/5;
    if (avg<35)
    System.out.print("additional class is required");
    else{
        System.out.print("you are good to go");
    }
        
    

    }
 }