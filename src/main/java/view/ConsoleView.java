package view;

import model.User;

import java.util.Scanner;

public class ConsoleView {
    public User getUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            return new User(username, password);
        }
    }

    public void displayResult(boolean isValid) {
        if (isValid) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
