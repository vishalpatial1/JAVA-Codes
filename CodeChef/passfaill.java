import java.util.Scanner;

public class passfaill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();

           if (x < 0){

            System.out.println("x is greater than zero");
           } else {

            System.out.println("x is not greater");
           }
    } 
}
