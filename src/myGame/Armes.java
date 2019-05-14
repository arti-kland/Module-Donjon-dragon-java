package myGame;

public class Armes {

    private String nomBouclier;
    private int bouclier;
    private String nomArmes;
    private int arme;

    public Armes(String nomArmes, int arme, String nomBouclier, int bouclier) {
        this.nomArmes = nomArmes;
        this.arme = arme;
        this.nomBouclier = nomBouclier;
        this.bouclier = bouclier;
    }
    ////////Getter//////////
    public String getNomBouclier() {
        return nomBouclier;
    }

    public int getBouclier() {
        return bouclier;
    }

    public String getNomArmes() {
        return nomArmes;
    }

    public int getArmes() {
        return arme;
    }
    ////////Setter//////////
    public void setNomBouclier(String newNomBouclier) {
        this.nomBouclier = newNomBouclier;
    }

    public void setBouclier(int newBouclier) {
        this.bouclier = newBouclier;
    }

    public void setNomArmes(String newNomArmes) {
        this.nomArmes = newNomArmes;
    }

    public void setArmes(int newArmes) {
        this.arme = newArmes;
    }

}

