import java.util.List;

public class Gerant {
    private List<Client> clients;
    private double prixChargeReservee;
    private double prixDepassement;
    private double prixNonPresentation;

    // Constructeur
    public Gerant(List<Client> clients) {
        this.clients = clients;
    }

    // Méthodes pour consulter les profils des clients enregistrés
    public List<Client> getClients() {
        return List.copyOf(clients); // Renvoie une copie en lecture seule de la liste des clients
    }

    public void afficherInfosClient(int numClient) {
        for (Client client : clients) {
            if (client.getNumClient() == numClient) {
                System.out.println("Nom : " + client.getNom());
                System.out.println("Prénom : " + client.getPrenom());
                System.out.println("Adresse : " + client.getAdresse());
                System.out.println("E-mail : " + client.getMail());
                return;
            }
        }
        System.out.println("Aucun client trouvé avec le numéro " + numClient);
    }


    public void setPrixChargeReservee(double prixChargeReservee) {
        this.prixChargeReservee = prixChargeReservee;
    }

    public void setPrixDepassement(double prixDepassement) {
        this.prixDepassement = prixDepassement;
    }

    public void setPrixNonPresentation(double prixNonPresentation) {
        this.prixNonPresentation = prixNonPresentation;
    }

    public double getPrixChargeReservee() {
        return prixChargeReservee;
    }

    public double getPrixDepassement() {
        return prixDepassement;
    }

    public double getPrixNonPresentation() {
        return prixNonPresentation;
    }
}
