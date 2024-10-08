import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("enter 5 numbers");
        for(int i=0;i<5;i++){
            numbers[i]=scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(numbers);
        int secondLargest=numbers[numbers.length-2];
        System.out.println("The second largest number is:"+secondLargest);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}