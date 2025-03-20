package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class connect {
    private Connection connection;
    private Statement statement;

    public connect() {
        try {
            // Establish connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "password");
            setStatement(connection.createStatement());
            System.out.println("Database connected successfully.");
        } catch (SQLException e) {
            System.err.println("Database connection failed.");
            e.printStackTrace();
        }
    }

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}
}