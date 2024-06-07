public class Facture {
    private int numFacture;
    private double fraisRecharge;
    private double fraisReservation;
    private double fraisPenalite;
    private double montantTotal;
    private Client client;

    public Facture(Client client, double fraisRecharge, double fraisReservation, double fraisPenalite) {
        if (fraisRecharge < 0) {
            throw new IllegalArgumentException("Les frais de recharge ne peuvent pas être négatifs");
        }
        if (fraisReservation < 0) {
            throw new IllegalArgumentException("Les frais de réservation ne peuvent pas être négatifs");
        }
        if (fraisPenalite < 0) {
            throw new IllegalArgumentException("Les frais de pénalité ne peuvent pas être négatifs");
        }
        this.client = client;
        this.fraisRecharge = fraisRecharge;
        this.fraisReservation = fraisReservation;
        this.fraisPenalite = fraisPenalite;
        this.montantTotal = calculerMontantTotal();
    }


    //methodes interressantes

    private double calculerMontantTotal() {
        return fraisRecharge + fraisReservation + fraisPenalite;
    }

    // méthodes basiques

    public int getNumFacture() {
        return numFacture;
    }

    public double getFraisRecharge() {
        return fraisRecharge;
    }

    public double getFraisReservation() {
        return fraisReservation;
    }

    public double getFraisPenalite() {
        return fraisPenalite;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setFraisRecharge(double fraisRecharge) {
        if (fraisRecharge < 0) {
            throw new IllegalArgumentException("Les frais de recharge ne peuvent pas être négatifs");
        }
        this.fraisRecharge = fraisRecharge;
        this.montantTotal = calculerMontantTotal();
    }

    public void setFraisReservation(double fraisReservation) {
        if (fraisReservation < 0) {
            throw new IllegalArgumentException("Les frais de réservation ne peuvent pas être négatifs.");
        }
        this.fraisReservation = fraisReservation;
        this.montantTotal = calculerMontantTotal();
    }

    public void setFraisPenalite(double fraisPenalite) {
        if (fraisPenalite < 0) {
            throw new IllegalArgumentException("Les frais de pénalité ne peuvent pas être négatifs.");
        }
        this.fraisPenalite = fraisPenalite;
        this.montantTotal = calculerMontantTotal();
    }

    @Override
    public String toString() {
        return "Facture [numFacture=" + numFacture + ", fraisRecharge=" + fraisRecharge
                + ", fraisReservation=" + fraisReservation + ", fraisPenalite=" + fraisPenalite
                + ", montantTotal=" + montantTotal + "]";
    }
}
