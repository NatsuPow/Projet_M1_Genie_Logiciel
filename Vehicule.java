public class Vehicule {
    private String numImmatriculation;
    private boolean isEnCharge;

    public Vehicule(String numImmatriculation, boolean isEnCharge) {
        this.numImmatriculation = numImmatriculation;
        this.isEnCharge = isEnCharge;
    }

    //méthodes intéressantes

    //méthodes de bases
    public String getNumImmatriculation() {
        return numImmatriculation;
    }

    public boolean isEnCharge() {
        return isEnCharge;
    }

    public void setNumImmatriculation(String numImmatriculation) {
        this.numImmatriculation = numImmatriculation;
    }

    public void setEnCharge(boolean isEnCharge) {
        this.isEnCharge = isEnCharge;
    }


    public String toString() {
        return "Vehicule [numImmatriculation=" + numImmatriculation + ", isEnCharge=" + isEnCharge + "]";
    }
}
