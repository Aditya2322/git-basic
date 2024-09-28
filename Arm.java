import java.util.Scanner;
public class Arm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number ");
        int num = input.nextInt();
        int n1 = num;
        int sum = 0;
        int n2 = 0;
        while(num!=0) {
            num/=10;
            n2++;
        }
        num=n1;
   do{
    int digit = num%10;
    sum+=Math.pow(digit,n2);
    num/=10;
   }
   while (num!=0);
   if (sum==n1){
    System.out.println(n1 + " is an Armstrong number");

   }
   else{
    System.err.println(n1 + " is not an Armstrong number");
   }

    }
}
