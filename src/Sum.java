import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Input first number
        System.out.println("A: ");
        float a = input.nextFloat();

        //Input second number
        System.out.println("B: ");
        float b = input.nextFloat();

        //Sum value
        double sum = a + b;
        System.out.println("The sum is " + sum);
    }
}
