package quizs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UserController {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            UserDao userDao = new UserDao(connection);
            Scanner scanner = new Scanner(System.in);

            // Dynamic input for user creation
            System.out.print("Enter username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Enter email: ");
            String emailInput = scanner.nextLine();

            UserDTO newUser = new UserDTO();
            newUser.setUsername(usernameInput);
            newUser.setEmail(emailInput);

            boolean success = userDao.insertUser(newUser);

            if (success) {
                System.out.println("User inserted successfully.");
            } else {
                System.out.println("User insertion failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
