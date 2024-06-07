import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;

    private String mdp;

    private int numClient;
    private String numCarteDebit;
    private int numContrat;

    private ArrayList<Vehicule> listVehicules;
    private ArrayList<Facture> listFactures;
    private ArrayList<Reservation> listReservations;
    private ArrayList<Recharge> listRecharges;

    public Client(String nom, String prenom, String adresse, String mail, String numCarteDebit, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.mdp = mdp;
        this.numCarteDebit = numCarteDebit;
        this.listVehicules = new ArrayList<Vehicule>();
        this.listFactures = new ArrayList<Facture>();
        this.listReservations = new ArrayList<Reservation>();
        this.listRecharges = new ArrayList<Recharge>();
    }

    public static String formatImmatriculation(String immatriculation) {
        // code de formatage de la plaque d'immatriculation
        String formattedImmatriculation = immatriculation.toUpperCase().replace("-", " ");
        return formattedImmatriculation;
    }

    public static boolean isValidEmail(String email) {
        // code de validation de l'adresse email
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }

    public static String formatDate(String date) {
        // code de formatage de la date
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDate.format(outputFormatter);

        return formattedDate;
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

    public int getNumClient() {
        return numClient;
    }

    public ArrayList<Vehicule> getListVehicules() {
        return listVehicules;
    }

    public ArrayList<Facture> getListFactures() {
        return listFactures;
    }

    public ArrayList<Reservation> getListReservations() {
        return listReservations;
    }

    public ArrayList<Recharge> getListRecharges() {
        return listRecharges;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean isCorrectPassword(String password) {
        return this.mdp.equals(password);
    }

    public static boolean validerNom(String nom) {
        return !nom.isEmpty() && !nom.isBlank();
    }
}
