
public class Guerrier extends Personnage {

    private String bouclier;

    Armes arme = new Armes("le penetrator", 6, "Durex", 5);

    @Override
    public String toString() {
        String temp = super.toString();
              temp +=  ", - Dégat arme : " + arme.getArmes() + ", - Nom de l'arme : " + arme.getNomArmes() + ", - Nom du bouclier : " + arme.getNomBouclier() + "avec une defense de : " + arme.getBouclier();
        return temp;
    }

}
