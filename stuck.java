import java.util.Scanner;

public class stuck {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first no:");
        int num1= scanner.nextInt();
        System.out.println("enter the second no.");
        int num2=scanner.nextInt();
        scanner.close();
        System.out.println(num1+num2);
        
    }
}
