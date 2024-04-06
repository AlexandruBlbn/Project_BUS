import java.sql.*;
import java.time.LocalTime;

import java.util.Scanner;

public class ORAR {

    public static void main(String[] args) {
        String user = "root";
        String password = "1234";
        String url = "jdbc:mysql://localhost:3306/demo";
        String statie = "linia710_precizia";

        LocalTime ora_reala = LocalTime.now();
        Scanner scan = new Scanner(System.in);

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM " + statie + " WHERE Ora_Hour = " + ora_reala.getHour() + " AND Minutul_Minute >= " + ora_reala.getMinute() + " ORDER BY Ora_Hour, Minutul_Minute LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int ora = resultSet.getInt("Ora_Hour");
                int minut = resultSet.getInt("Minutul_Minute");
                System.out.println("Următoarea plecare: Ora: " + ora + ", Minutul: " + minut);
            } else {
                System.out.println("Nu există plecări disponibile pentru ora actuală.");
            }

        } catch (SQLException e) {
            System.out.println("Conectare esuata!");
        }
    }
}
