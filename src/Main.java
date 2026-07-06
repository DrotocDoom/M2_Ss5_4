import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        System.out.print("Enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer!");
            scanner.next();
            System.out.print("Enter a number: ");
        }
        number = scanner.nextInt();

        for (int i = 0; i < number; i++ ){
            int index = rand.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        System.out.print("Random String: ");
        System.out.println(result);
        scanner.close();
    }
}