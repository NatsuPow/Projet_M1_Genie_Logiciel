import java.util.ArrayList;

public class Borne {
    private int numBorne;
    private EtatBorne etatBorne;
    private Reservation reservation;
    private ArrayList<Recharge> listRecharges;

    public Borne(int numBorne) {
        this.numBorne = numBorne;
        this.etatBorne = EtatBorne.DISPONIBLE;
        this.listRecharges = new ArrayList<Recharge>();
    }

    public int getNumBorne() {
        return numBorne;
    }

    public EtatBorne getEtatBorne() {
        return etatBorne;
    }

    public void setEtatBorne(EtatBorne etatBorne) {
        this.etatBorne = etatBorne;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public ArrayList<Recharge> getListRecharges() {
        return listRecharges;
    }

    public void ajouterRecharge(Recharge recharge) {
        listRecharges.add(recharge);
    }
}

enum EtatBorne {
    DISPONIBLE,
    INDISPONIBLE,
    OCCUPEE,
    RESERVEE
}
