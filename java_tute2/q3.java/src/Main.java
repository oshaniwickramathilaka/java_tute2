import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the nUMbER of rows");
        int rows=scanner.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("");


            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();


        }
        scanner.close();

    }
}