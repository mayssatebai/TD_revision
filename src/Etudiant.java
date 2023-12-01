import java.util.Objects;

public abstract class Etudiant {
    private int identifiant;
    private String nom;
    private String prenom;
    private float moyenne;

   

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public Etudiant(int id , String nom, String prenom, float moyenne){
        this.identifiant=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
    }
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass() ) return false;
        Etudiant etudiant=(Etudiant)o;
        return getIdentifiant()== etudiant.getIdentifiant() && Objects.equals(getNom(),etudiant.getNom());
    }
public String toString(){
        return "identifiant :" +identifiant+ "nom :" +nom+ "prenom: " +prenom+ "moyenne :" +moyenne ;
}

    public abstract void AjouterUneAbsence();
}
