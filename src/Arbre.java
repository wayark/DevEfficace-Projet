public class Arbre {
    private Noeud racine;

    public Arbre() {
    }


    public void creationABR(int val[]){
        for (int valeur:val) {
            if(racine!= null){
                racine.ajout(valeur);
            }
            else{
                racine = new Noeud(valeur);
            }

        }
    }

    public int[] convertirTabAbr(){
        return racine.convertirTab();
    }




    public void afficherAbr(){
        racine.parcourir();
    }
    public boolean rechercheAbr(int val){
        if (racine != null){
            return racine.recherche(val);
        }
        else {
            return false;
        }

    }
    public int maxAbr(){
        return racine.max();
    }

    public int minAbr(){
        return racine.min();
    }


}
