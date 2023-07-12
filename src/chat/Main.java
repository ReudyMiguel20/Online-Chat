package chat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            String[] inputArray = input.split(" ");

            String username = inputArray[0];

            if (inputArray.length < 2) {
                continue;
            }

            if (inputArray[1].equalsIgnoreCase("sent")) {
                String message = String.join(" ", Arrays.copyOfRange(inputArray, 2, inputArray.length));
                System.out.printf("%s: %s%n", username, message);
            }
        }
    }
}
