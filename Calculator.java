import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char operator = scanner.next().charAt(0);
        int fistNumber = scanner.nextInt();
        int second_number = scanner.nextInt();

        switch (operator){
            case '+':
                System.out.println(fistNumber + second_number);
                break;
            case '*':
                System.out.println(fistNumber * second_number);
                break;
            case '/':
                System.out.println(fistNumber / second_number);
                break;
            case '-':
                System.out.println(fistNumber - second_number);
            default:
                System.out.println("enter a valid argument");
       
        }
    }
}
