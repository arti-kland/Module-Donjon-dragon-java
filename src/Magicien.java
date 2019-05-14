
public class  Magicien extends Personnage {

    private Sorts philtre;

    Sorts sort = new Sorts("la boule puante", 5, "la boule de feu", 6);

    @Override
    public String toString() {
       String temp = super.toString() + ", - Dégat sort : " + sort.getSort() + ", - Nom du sort : " + sort.getNomSort() + ", - Philtre : " + sort.getPhiltre() + ", - Nom du philtre : " + sort.getNomPhiltre();
        return temp;

    }

}
