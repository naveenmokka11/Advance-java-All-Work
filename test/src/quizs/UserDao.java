package quizs;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class UserDao {
	    private Connection connection;

	    public UserDao(Connection connection) {
	        this.connection = connection;
	    }

	    public boolean insertUser(UserDTO user) throws SQLException {
	        String query = "INSERT INTO users (username, email) VALUES (?, ?)";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, user.getUsername());
	            preparedStatement.setString(2, user.getEmail());

	            int rowsInserted = preparedStatement.executeUpdate();
	            return rowsInserted > 0;
	        }
	    }
	}


