import java.time.LocalDateTime;

public class Reservation {
    private int numReservation;
    private Vehicule vehicule;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private EtatReservation etatReservation;
    private int nombreProlongations;

    public Reservation(int numReservation, Vehicule vehicule, LocalDateTime dateDebut, LocalDateTime dateFin) {
        this.numReservation = numReservation;
        this.vehicule = vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.etatReservation = EtatReservation.EN_COURS;
        this.nombreProlongations = 0;
    }

    @Override
    public String toString() {
        return "Reservation [numReservation=" + numReservation + ", vehicule=" + vehicule + ", dateDebut=" + dateDebut
                + ", dateFin=" + dateFin + ", etatReservation=" + etatReservation + ", nombreProlongations=" + nombreProlongations + "]";
    }

    public int getNumReservation() {
        return numReservation;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public EtatReservation getEtatReservation() {
        return etatReservation;
    }

    public int getNombreProlongations() {
        return nombreProlongations;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public void setEtatReservation(EtatReservation etatReservation) {
        this.etatReservation = etatReservation;
    }

    public void setNombreProlongations(int nombreProlongations) {
        this.nombreProlongations = nombreProlongations;
    }

    public enum EtatReservation {
        EN_COURS,
        MAINTENUE,
        PROLONGEE,
        ANNULEE
    }
}
