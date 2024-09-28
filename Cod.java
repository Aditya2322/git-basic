import java.util.Scanner;
public class Cod {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the positive number : ");
        int num = input.nextInt();
        long fact=1;
        int count=1;
        while(count<=num){
            fact*=count;
            count++;

        }
        System.out.println("The factorial of " + num + "is :"+ fact);
    }
}
//  Scanner var8 = new Scanner(System.in);