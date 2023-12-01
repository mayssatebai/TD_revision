public class Ecole {
    private String nom;
 private Etudiant etudiant;

 final int CAPACTITE=500;
 int i;

 Etudiant[] tabEtudiant=new Etudiant[500];

 public Ecole(String nom , Etudiant etudiant){
this.nom=nom;
this.etudiant=etudiant;
 }

 public void AjouterEtudiant(Etudiant etudiant){
     if(i< tabEtudiant.length){
         tabEtudiant[i]=etudiant;
         i++;
         System.out.println("etudiant ajouter avec succes");
     }
     else{
         System.out.println("ecole pleine");
     }
 }

    public  int RechercherEtudiant (Etudiant e){
        int indice=-1;
        for(int j=0; j<i; j++) {
            if (Etudiant.equals(e, tabEtudiant[j]))
                return j;
        }
        return indice;
    }



}
