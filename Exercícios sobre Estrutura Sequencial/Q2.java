import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi, area, raio, raio2;

        raio = sc.nextDouble();
        raio2 = raio * raio;
        pi = 3.14159;
        area = pi * raio2;

        System.out.println("O Valor do raio é igual a: " + area);

        sc.close();
    }
}
