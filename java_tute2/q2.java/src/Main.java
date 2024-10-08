import java.util.Scanner;
public class Main{
    public static int countDigits(int number){
        number=Math.abs(number);
        if(number==0){
            return 1;
        }
        int digits=0;
        while(number>0){
            number/=10;
            digits++;
        }
        return digits;
    }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            while(true) {
                System.out.print("Enter an integer");
                int input=scanner.nextInt();
                if(input<0){
                    System.out.println("Exiting");
                    break;
                }
                int digitCount=countDigits(input);
                System.out.println("The number"+input+"has"+digitCount+"digit(s).");
            }
            scanner.close();

        }


}
