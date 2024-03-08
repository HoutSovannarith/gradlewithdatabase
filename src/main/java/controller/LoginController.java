package controller;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    public boolean authenticateUser(Connection connection, User user) {
        String sql = "SELECT * FROM tbl_users WHERE username = ? AND password = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // If the result set has any rows, the user is valid
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Handle the exception appropriately in your application
        }
    }
}
