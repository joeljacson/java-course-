import java.util.Scanner;
public class score {
    

public static void main (String []args)
{
    Scanner scan =new Scanner(System.in);

System.out.println("what is the score of the game?");

int score= scan.nextInt();

if(score<50){
    System.out.print("you need to improved");
}
else if(score>=50 && score<=70){
    System.out.print("you are doing good");
}
else{
    System.out.print("Excellent");
}

}
}
