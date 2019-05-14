package myGame;

public class Sorts {

    private String nomPhiltre;
    private int philtre;
    private String nomSort;
    private int sort;

    public Sorts (String nomPhiltre, int philtre, String nomSort, int sort){
        this.nomPhiltre = nomPhiltre;
        this.philtre = philtre;
        this.nomSort = nomSort;
        this.sort = sort;
    }
    ////////Getter//////////
    public String getNomPhiltre() {
        return nomPhiltre;
    }

    public int getPhiltre() {
        return philtre;
    }

    public String getNomSort() {
        return nomSort;
    }

    public int getSort() {
        return sort;
    }
    ////////Setter//////////
    public void setNomPhiltre(String newNomPhiltre){
        this.nomPhiltre = newNomPhiltre;
    }

    public void setPhiltre(int newPhiltre) {
        this.philtre = newPhiltre;
    }

    public void setNomSort(String newNomSort) {
        this.nomSort = newNomSort;
    }

    public void setSort(int newSort) {
        this.sort = newSort;
    }

}
