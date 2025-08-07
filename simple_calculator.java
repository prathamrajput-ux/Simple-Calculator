/*Take two numbers and one operator (+, -, *, /) from the user and perform the operation.*/
package revision_practice_2;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter your 1st number : ");
        int a = p.nextInt();
        System.out.println("Enter your 2nd number : ");
        int b = p.nextInt();
        System.out.println("choice operator (+,-,*,/) : ");
        char operator = p.next().charAt(0);
        switch (operator) {
            case '+' : 
            System.out.println("sum of two number : "+(a+b));
            break;
            case '-' :
            System.out.println("Substraction  of two number : "+(a-b));
            break;
            case '*':
            System.out.println("Multliplication of two number : "+(a*b));
            break;
            case '/':
            System.out.println("Divisible of two number : "+(a/b));
        }
    }
}

