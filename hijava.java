import java.util.Scanner;

public class hijava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int nu1 = sc.nextInt();
        System.out.println("You entered: " + nu1);

        if (nu1 % 3 == 0 && nu1 % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nu1 % 3 == 0) {
            System.out.println("fizz");
        } else if (nu1 % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(nu1);
        }

        //Scanner sc= new Scanner(System.in)
        System.out.println("This is the hijava class.");
        sc.close();


    }
    
}
