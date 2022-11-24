import java.util.Scanner;

public class Q11 {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double hotDog = 4.00;
        Double bacon = 5.00;
        Double torrada = 2.00;
        Double salada = 4.50;
        Double refri = 1.50;
        int codigo = sc.nextInt();
        Double qtde = sc.nextDouble();


        if (codigo == 1){
            Double soma = qtde * hotDog;
            System.out.println("Total: R$ " + soma);
        }
        else if (codigo == 2) {
            Double soma = qtde * salada;
            System.out.println("Total: R$ " + soma);
        }
        else if (codigo == 3) {
            Double soma = qtde * bacon;
            System.out.println("Total: R$ " + soma);
        }
        else if (codigo == 4) {
            Double soma = qtde * torrada;
            System.out.println("Total: R$ " + soma);
        }
        else if (codigo == 5) {
            Double soma = qtde * refri;
            System.out.println("Total: R$ " + soma);
        }
        else {
            System.out.println("Esse codigo não existe");
        }

        sc.close();
    }
}
