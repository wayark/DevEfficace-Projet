public class Main {
    public static void main(String[] args) {
        Arbre arbre = new Arbre();
        int valeur[] = {21,8,3,9,2,5,11,1,4,6,10,15,13,19,12,14,17,20,16,18};

        arbre.creationABR(valeur);
        arbre.afficherAbr();
        System.out.println(arbre.maxAbr());
        System.out.println(arbre.minAbr());



    }
    public static int[] trier(int tab[]){
        Arbre arbre = new Arbre();
        arbre.creationABR(tab);

        return tab;
    }

}
