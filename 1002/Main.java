import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14159;
        double raio = scanner.nextDouble();
        double area = 0;
        area = PI * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f%n",area);
        scanner.close();
    }
}