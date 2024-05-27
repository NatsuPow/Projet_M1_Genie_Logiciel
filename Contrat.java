import java.time.LocalDateTime;

public class Contrat {
    private int numContrat;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private Client client;
    private Paiement paiement;

    public Contrat(int numContrat, LocalDateTime dateDebut, LocalDateTime dateFin, Client client) {
        this.numContrat = numContrat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;

    }

    // Méthode pour afficher les informations du contrat
    @Override
    public String toString() {
        return "Contrat [numContrat=" + numContrat + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
                + ", client=" + client + ", paiement=" + paiement + "]";
    }


    public int getNumContrat() {
        return numContrat;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public Client getClient() {
        return client;
    }

    public Paiement getPaiement() {
        return paiement;
    }


    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
}
