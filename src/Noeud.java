public class Noeud {
    private int valeur;
    private Noeud fg;
    private Noeud fd;

    public Noeud(int valeur) {
        this.valeur = valeur;
        this.fg = null;
        this.fd = null;

    }

    public void ajoutAbr(int val){
            if(this.valeur > val){
                if(this.fg == null){
                    this.fg = new Noeud(val);
                }
                else {
                    this.fg.ajoutAbr(val);
                }
            }
            else {
                if(this.fd == null){
                    this.fd = new Noeud(val);
                }
                else {
                    this.fd.ajoutAbr(val);
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
}
