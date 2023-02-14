import java.util.Scanner;
public class Calculator{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println( "Please Enter Two Numbers");
        float num1 = reader.nextFloat();
        float num2 = reader.nextFloat();
        System.out.println("Do you want to add or subtract?");
        char sign = reader.next().charAt(0);
        float numTotal = 0;
        if(sign == '+'){
            numTotal = num1 + num2;
        }
        else if(sign == '-'){
            numTotal = num1 - num2;
        }
        else if(sign == '*'){
            numTotal = num1 * num2;
        }
        else if(sign == '/'){
            numTotal = num1 / num2;
        }
        System.out.println(numTotal);
    }
}