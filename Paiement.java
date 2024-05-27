import java.time.LocalDateTime;

public class Paiement {
    private int numIdentifiant;
    private int numContrat;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private TypePaiement typePaiement;

    public enum TypePaiement {
        RECHARGE,
        CONTRAT
    }

    public Paiement(int numIdentifiant, int numContrat, LocalDateTime dateDebut, LocalDateTime dateFin, TypePaiement typePaiement) {
        this.numIdentifiant = numIdentifiant;
        this.numContrat = numContrat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typePaiement = typePaiement;
    }

    public int getNumIdentifiant() {
        return numIdentifiant;
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

    public TypePaiement getTypePaiement() {
        return typePaiement;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public void setTypePaiement(TypePaiement typePaiement) {
        this.typePaiement = typePaiement;
    }

    // Méthode pour afficher les informations du paiement
    @Override
    public String toString() {
        if (typePaiement == TypePaiement.RECHARGE) {
            return "Paiement [numPaiement=" + numIdentifiant + "de type :"+ typePaiement +", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", typePaiement=" + typePaiement + "]";
        } else {
            return "Paiement [numContrat=" + numContrat + "de type :"+ typePaiement + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", typePaiement=" + typePaiement + "]";
        }
    }
}
