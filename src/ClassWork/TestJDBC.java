package ClassWork;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBC {

	public static final String URL = "jdbc:mysql://127.0.0.1:3306/mytestbb";
	private static final String PARAMS = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8";
	public static final String USER = "root";
	public static final String PASWORD = "root";
       
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection(URL + PARAMS, USER, PASSWORD)) {
	}
}