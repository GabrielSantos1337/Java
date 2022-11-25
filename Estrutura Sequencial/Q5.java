import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pc1, pc2; 
        double pn1, pv1, pn2, pv2, pvt, total1, total2;

        pc1 = sc.nextInt();
        pc2 = sc.nextInt();
        pn1 = sc.nextDouble();
        pn2 = sc.nextDouble();
        pv1 = sc.nextDouble();
        pv2 = sc.nextDouble();

        total1 = pn1 * pv1;
        total2 = pn2 * pv2;
        pvt = total1 + total2;

        System.out.println("Os números apresentados são: " + pc1 + " e " + pc2);
        System.out.println("Valor a pagar: R$ " + pvt);

        sc.close();
    }
}
