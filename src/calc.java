import java.util.Scanner;

public class calc {
    public static void main (String[]args) {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println ("Number 1 is");
        num1 =input.nextInt();
        input.nextLine();
        int num2;
        System.out.println ("Number 2 is");
        num2 =input.nextInt();
        input.nextLine();
        String equation;
        System.out.println ("Equation is");
        equation= input.nextLine();
        System.out.println (equation);
        System.out.println(num1 + equation + num2);

    }
}
//*import java.util*/
//System.out.println(num1 + num2);