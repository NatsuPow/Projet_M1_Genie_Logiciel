import java.sql.*;

public class DBManager {

    private static final String DB_URL = "jdbc:postgresql://plg-broker.ad.univ-lorraine.fr:5432/Projet_DIABATE_HAMOUTA";
    private static final String DB_USER = "m1user1_19";
    private static final String DB_PASSWORD = "m1user1_19";

    //CREATION D'UN COMPTE CLIENT
    public static void insererClient(Client client) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String requeteInsertion = "INSERT INTO Client (NumCarteDebit, Nom, Prenom, Adresse, Mail, MotDePasse) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(requeteInsertion);
            preparedStatement.setString(1, client.getNumCarteDebit());
            preparedStatement.setString(2, client.getNom());
            preparedStatement.setString(3, client.getPrenom());
            preparedStatement.setString(4, client.getAdresse());
            preparedStatement.setString(5, client.getMail());
            preparedStatement.setString(6, client.getMdp());
            preparedStatement.executeUpdate();

            System.out.println("Le client a été inséré dans la base de données avec succès.");

        } catch (SQLException e) {
            System.err.println("Échec de l'insertion du client dans la base de données.");
            e.printStackTrace();

        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Échec de la fermeture de la connexion à la base de données ou du PreparedStatement.");
                e.printStackTrace();
            }
        }
    }


    //VERIFICATION AUTHENTIFICATION CLIENT
    public static int[] authentifierClient(Client clientExistant) {
        int[] resultats = new int[2];
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String requeteSelect = "SELECT Client.ID, Voiture.NumeroImmatriculation FROM Client INNER JOIN Voiture ON Client.ID = Voiture.ID_Client WHERE Client.Nom = ? AND Client.Mdp = ?";
            preparedStatement = connection.prepareStatement(requeteSelect);
            preparedStatement.setString(1, clientExistant.getNom());
            preparedStatement.setString(2, clientExistant.getMdp());

            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            System.err.println("Échec de l'authentification du client dans la base de données.");
            e.printStackTrace();

        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Échec de la fermeture de la connexion à la base de données.");
                e.printStackTrace();
            }
        }

        return resultats;
    }





}
