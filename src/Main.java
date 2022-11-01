import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        triangle.a = scanner.nextInt();
        triangle.b = scanner.nextInt();
        triangle.c = scanner.nextInt();

        triangle.area(triangle.a, triangle.b, triangle.c);





    }

}