import java.util.Scanner;
public class Calculator{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println( "Please Enter Two Numbers");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int numTotal = num1 + num2;
        System.out.println(numTotal);
    }
}