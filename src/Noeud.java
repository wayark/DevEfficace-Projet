public class Noeud {
    private int valeur;
    private Noeud fg;
    private Noeud fd;

    public Noeud(int valeur) {
        this.valeur = valeur;
        this.fg = null;
        this.fd = null;

    }

    public void ajout(int val){
            if(this.valeur > val){
                if(this.fg == null){
                    this.fg = new Noeud(val);
                }
                else {
                    this.fg.ajout(val);
                }
            }
            else {
                if(this.fd == null){
                    this.fd = new Noeud(val);
                }
                else {
                    this.fd.ajout(val);
                }
            }
    }

    public void parcourir(){
        if(this != null){
            if(this.fg != null){
                this.fg.parcourir();
            }
            System.out.println(this.valeur);
            if(this.fd != null){
                this.fd.parcourir();
            }
        }

    }

    public boolean recherche(int val){
        boolean retour = false;

        if(this.valeur == val){
            retour = true;
        }
        else if(this.valeur > val && this.fg !=null){
                retour = this.fg.recherche(val);

        }
        else if(this.fd != null){
                retour = this.fd.recherche(val);
        }

        return retour;
    }

    public int max(){
        if(this.fd == null){
            return this.valeur;
        }
        else {
            return this.fd.max();
        }
    }

    public int min(){
        if(this.fg == null){
            return this.valeur;
        }
        else {
            return this.fg.min();
        }
    }

    public int[] convertirTab() {
        if(estFeuille()){
            return new int[]{this.valeur};
        }
        else {
            int tabD[];
            int tabG[];
            int result[];
            if(this.fd != null){
                tabD = this.fd.convertirTab();
            }
            if (this.fg != null){
                tabG = this.fg.convertirTab();
            }
            result = ArrayUtils
        }
    }

    public boolean estFeuille(){
        return this.fd == null && this.fg == null;
    }
}
