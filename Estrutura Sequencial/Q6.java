import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c, t1, t2, c1, q1, q2, pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        t1 = a * c / 2;
        c1 = pi * (c * c);
        t2 = (a + b) * c / 2;
        q1 = b * b;
        q2 = a * b;

        System.out.printf("TRIANGULO: %.3f%n", t1);
        System.out.printf("CIRCULO: %.3f%n", c1);
        System.out.printf("TRAPEZIO: %.3f%n",  t2);
        System.out.printf("QUADRADO: %.3f%n", q1);
        System.out.printf("RETANGULO: %.3f%n", q2);

        sc.close();
    }
}
