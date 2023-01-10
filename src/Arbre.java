public class Arbre {
    private Noeud racine;

    public Arbre() {
    }


    public void creationABR(int val[]){
        for (int valeur:val) {
            if(racine!= null){
                racine.ajoutAbr(valeur);
            }
            else{
                racine = new Noeud(valeur);
            }

        }
    }




    public void afficher(){
        racine.parcourir();
    }


    public boolean recherche(int val){
        return racine.recherche(val);
    }
}
