import java.util.Scanner;

public class Q7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Qual o número?");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }
        
        sc.close();
    }
}
