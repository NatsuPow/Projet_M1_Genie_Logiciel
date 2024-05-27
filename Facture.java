public class Facture {
    private int numFacture;
    private double fraisRecharge;
    private double fraisReservation;
    private double fraisPenalite;
    private double montantTotal;

    // Constructeur
    public Facture(int numFacture, double fraisRecharge, double fraisReservation, double fraisPenalite) {
        this.numFacture = numFacture;
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
        this.fraisRecharge = fraisRecharge;
        this.montantTotal = calculerMontantTotal();
    }

    public void setFraisReservation(double fraisReservation) {
        this.fraisReservation = fraisReservation;
        this.montantTotal = calculerMontantTotal();
    }

    public void setFraisPenalite(double fraisPenalite) {
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
