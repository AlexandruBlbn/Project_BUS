import java.sql.*;
import java.time.LocalTime;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
            String user = "root";
            String password = "1234";
            String url = "jdbc:mysql://localhost:3306/demo";
            String query;
            LocalTime ora_reala = LocalTime.now();
            Scanner scan = new Scanner(System.in);
            String ruta;
            String statie = null;
            /*
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    int ora = resultSet.getInt("Ora_Hour");
                    int minut = resultSet.getInt("Minutul_Minute");
                    System.out.println("Ora: " + ora + ", Minutul: " + minut);
                }
            }
            catch (SQLException e) {System.out.println("Eroare conectare la data de baze!");}



        System.out.println("Introdu ora sub formatul: (hh:mm): ");
        String ora = scan.nextLine();
        LocalTime ora_convertita = LocalTime.parse(ora);
        System.out.println("Ora din ora introdusa: " + ora_convertita.getHour());
        System.out.println("Minutele din ora introdusa: " + ora_convertita.getMinute());





        boolean alegere = false;
        do{
            System.out.println("\nAlege o ruta:");
            System.out.println("1. Linia 710 - Garaje => Roman");
            System.out.println("2. Linia 710 - Roman => Garaje");
            System.out.println("3. Linia 17 - Noua => Livada Postei");
            System.out.println("4. Linia 17 - Livada Postei => Noua");
            System.out.print("Optiune: ");
            int optiune = scan.nextInt();
            switch (optiune){
                case 1:
                    ruta = "Linia 710 - Garaje => Roman";
                    alegere = true;
                    break;
                case 2:
                    ruta = "Linia 710 - Roman => Garaje";
                    alegere = true;
                    break;
                case 3:
                    ruta = "Linia 17 - Noua => Livada Postei";
                    alegere = true;
                    break;
                case 4:
                    ruta = "Linia 17 - Livada Postei => Noua";
                    alegere = true;
                    break;
                default:
                    System.out.println("Optiune invalida!\n");
                    alegere = false;
            }
        }while(!alegere);

    }

    void selectieStatie() {
        Scanner scan = new Scanner(System.in);
        boolean alegere = false;
        do {
            System.out.println("Alege o statie: ");

            int optiune = scan.nextInt();
            switch (optiune) {
                case 1:

                    alegere = true;
                    break;
                case 2:
                    //cod
                    alegere = true;
                    break;
                case 3:
                    //cod
                    alegere = true;
                    break;
                case 4:
                    //cod
                    alegere = true;
                    break;
                default:
                    System.out.println("Optiune invalida!\n");
                    alegere = false;
            }
        } while (alegere = false);
        */

        System.out.println("Minute pentru a ajunge in statie in minute: ");
        LocalTime variabila = LocalTime.of(00,scan.nextInt());


        /* Parte transformare ora
        //System.out.println("Programul optim de a ajunge in statie: ");
        LocalTime ora_reala_modificata;
        ora_reala_modificata = ora_reala.plusHours(variabila.getHour()).plusMinutes(variabila.getMinute());
        if(ora_reala_modificata.getMinute() < 10){
            String minute_sub = "0" + ora_reala_modificata.getMinute();
            System.out.println(ora_reala_modificata.getHour() + ":" + minute_sub);
        }
        else{
            System.out.println(ora_reala_modificata);
        }
        */


        //citire nume tabele si afisare intr-o bucla for ( de adaugat/imbunatatit)
        System.out.println("Introdu o statie: ");
        boolean statie_alegere = false;
        do{
            System.out.println("1.Precizia");
            System.out.println("2, Roman");
            int optiune = scan.nextInt();
            switch (optiune){
                case 1:
                    statie = "linia710_precizia";
                    statie_alegere = true;
                    break;
                case 2:
                    statie = "linia710_roman";
                    statie_alegere = true;
                    break;
                default:
                    System.out.println("Optiune invalida!");
                    break;
            }
        }while(!statie_alegere);

        query = "SELECT * FROM " + statie + " WHERE " + " Ora_Hour = " + ora_reala.getHour() + " AND " + ora_reala.getMinute();
    }
}