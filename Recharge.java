import java.time.LocalDateTime;

public class Recharge {
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int dureePrevue; // en minutes
    private int dureeReelle; // en minutes
    private double prix;
    private double supplement;

    private Borne borneUtilisee;
    private Paiement paiement;

    public Recharge(LocalDateTime dateDebut, int dureePrevue, double prix) {
        this.dateDebut = dateDebut;
        this.dureePrevue = dureePrevue;
        this.prix = prix;
    }

    //methode interessantes

    // méthode pour calculer le supplément de la recharge
    private double calculerSupplement() {
        if (dureeReelle > dureePrevue) {
            return (dureeReelle - dureePrevue) * 0.05; // 0.05 euros par minute supplémentaire à changer
        } else {
            return 0;
        }
    }

    // methodes de base
    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public int getDureeReelle() {
        return dureeReelle;
    }

    public double getPrix() {
        return prix;
    }

    public double getSupplement() {
        return supplement;
    }

    // Setters (mutateurs)
    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
        this.dureeReelle = (int) java.time.Duration.between(dateDebut, dateFin).toMinutes();
        this.supplement = calculerSupplement();
        this.prix += this.supplement;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
        this.supplement = calculerSupplement();
        this.prix += this.supplement;
    }


    @Override
    public String toString() {
        return "Recharge [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", dureePrevue=" + dureePrevue
                + ", dureeReelle=" + dureeReelle + ", prix=" + prix + ", supplement=" + supplement + "]";
    }
}
