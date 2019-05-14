package myGame;

abstract class Personnage {

    private String name;
    private String image;
    private int niveauDeVie;
    private int forceAttaque;

    public String getName() { return name; }
    public String getImage() {
        return image;
    }
    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    public int getForceAttaque() {
        return forceAttaque;
    }


    public void setName(String newName) {
        this.name = newName;
    }

    public void setImage(String newImage) {
        this.image = newImage;
    }

    public void setNiveauDeVie(int newNiveauDeVie) {
        this.niveauDeVie = newNiveauDeVie;
    }

    public void setForceAttaque(int newForceAttaque) {
        this.forceAttaque = newForceAttaque;
    }

    public String toString() {
        return
                "Nom héro : " + this.name +
                " - Image pour ce héro : " + this.image +
                " - Niveau de vie : " + this.niveauDeVie +
                ", - Niveau force  : " + this.forceAttaque;
    }
}
