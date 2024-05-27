import java.time.LocalDateTime;
import java.time.Duration;

public class Recharge {
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int dureePrevue; // en minutes
    private int dureeReelle; // en minutes
    private double prix;

    private Borne borneUtilisee;
    private Paiement paiement;
    private Client client;

    public Recharge(LocalDateTime dateDebut, int dureePrevue, double prix) {
        this.dateDebut = dateDebut;
        this.dureePrevue = dureePrevue;
        this.prix = prix;
    }

    // méthode pour calculer le supplément de la recharge
    private double calculerSupplement() {
        if (dureeReelle > dureePrevue) {
            return (dureeReelle - dureePrevue) * 0.05; // 0.05 euros par minute supplémentaire à changer
        } else {
            return 0;
        }
    }


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
        if (dateFin != null) {
            return calculerSupplement();
        } else {
            return 0;
        }
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
        this.dureeReelle = (int) Duration.between(dateDebut, dateFin).toMinutes();
        this.prix += calculerSupplement();
    }

    public void setDureePrevue(int dureePrevue) {
        if (dateFin != null) {
            this.dureePrevue = dureePrevue;
            this.prix += calculerSupplement();
        } else {
            this.dureePrevue = dureePrevue;
        }
    }

    @Override
    public String toString() {
        return "Recharge [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", dureePrevue=" + dureePrevue
                + ", dureeReelle=" + dureeReelle + ", prix=" + prix + ", supplement=" + getSupplement() + "]";
    }
}
