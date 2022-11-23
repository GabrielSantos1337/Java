import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, hours;
        double value, result;

        num = sc.nextInt();
        hours = sc.nextInt();
        value = sc.nextDouble();

        result = value * hours;

        System.out.println("O número desse funcionario é: " + num);
        System.out.println("O salario desse funcionario é de: R$" + result);

        sc.close();
    }
}
