import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;

    private int numClient; // Changement de nom : numClient au lieu de numero
    private String numCarteDebit; // Changement de nom : numCarteDebit au lieu de numeroCarteDebit
    private int numContrat;

    private ArrayList<Vehicule> listVehicules;
    private ArrayList<Facture> listFactures;
    private ArrayList<Recharge> listRecharges; // Changement de nom : listRecharges au lieu de listRecharge

    public Client(String nom, String prenom, String adresse, String mail, String numCarteDebit, int numContrat, ArrayList<Vehicule> listVehicules) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;

        this.numClient = generateNumClient();
        this.numCarteDebit = numCarteDebit;
        this.numContrat = numContrat;
        this.listVehicules = listVehicules;
        this.listFactures = new ArrayList<Facture>();
        this.listRecharges = new ArrayList<Recharge>();
    }

    // Méthode pour générer un numéro de client unique (à améliorer en fonction de vos besoins)
    private int generateNumClient() {
        return (int) (Math.random() * 100000);
    }

    // Méthodes intéressantes

    // Méthodes de base

    public String toString() {
        return "Client [numClient=" + numClient + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", mail=" + mail + "]";
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMail() {
        return mail;
    }

    public String getNumCarteDebit() {
        return numCarteDebit;
    }

    public int getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(int numContrat) {
        this.numContrat = numContrat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNumCarteDebit(String numCarteDebit) {
        this.numCarteDebit = numCarteDebit;
    }

    public int getNumClient() { // Ajout de la méthode getNumClient
        return numClient;
    }

    public ArrayList<Vehicule> getListVehicules() {
        return listVehicules;
    }

    public ArrayList<Facture> getListFactures() {
        return listFactures;
    }

    public ArrayList<Recharge> getListRecharges() {
        return listRecharges;
    }
}
