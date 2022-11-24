import java.util.Scanner;

public class Q13 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double value1 = sc.nextDouble();
        double value2 = sc.nextDouble();

        if (value1 == 0.0 && value2 == 00) {
            System.out.println("Origem");
        }
        else if (value1 == 0.0){
            System.out.println("Eixo Y");
        }
        else if (value2 == 0.0){
            System.out.println("Eixo X");
        }
        else if (value1 > 0.0 && value2 > 0.0){
            System.out.println("Q1");
        }
        else if (value1 < 0.0 && value2 > 0.0){
            System.out.println("Q2");
        }
        else if (value1 < 0.0 && value2 < 0.0){
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
