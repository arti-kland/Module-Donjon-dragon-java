package myGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    private Scanner scan = new Scanner(System.in);
    private ArrayList<Personnage> heros = new ArrayList<>();
    private int menuStart = 0 ;
    private int i = 0;
    private int choose;


    public  void start(){
        do {
            menu();
            if (menuStart == 1) {
                createPerso();
                if (choose == 1) {
                    createWarrior();
                } else if (choose == 2) {
                    createMage();
                } else {
                    System.out.println("Vous avez choisi d'être un Humain et cela ne ce peu pas ! Recommencer !");
                }
                showList();
                /////// MODIFIER////////
            }else if (menuStart == 2){
                modify();
                /////// SUPPRIMER////////
            }else if (menuStart == 3) {
                delete();
            }else if (menuStart == 5){
                showList();
            }else if (menuStart == 6){
                heros.removeAll(heros);
            }else{
                System.out.println("Ce menu n'existe pas !!! Réessayez !");
            }
        }while ( menuStart != 4);
    }

    public  void createPerso(){
        System.out.println("Choisissez un myGame.Personnage 1.myGame.Guerrier 2.myGame.Magicien : ");
        choose = scan.nextInt();
    }

    public  void createWarrior(){
        String perso = "myGame.Guerrier";
        System.out.println("Vous avez choisi d'être un " + " " + perso);
        Personnage hunts = new Guerrier();
        scan.nextLine();
        System.out.println("Choisissez un nom ");
        String name = scan.nextLine();
        hunts.setName(name);
        System.out.println("Choisissez une image ");
        String img = scan.nextLine();
        hunts.setImage(img);
        int vieGuerrier = 0;
        while (vieGuerrier < 30 || vieGuerrier > 40) {
            System.out.println("Choisissez un niveau de vie de votre guerrier entre 30 et 40 ");
            vieGuerrier = scan.nextInt();
            hunts.setNiveauDeVie(vieGuerrier);
        }
        if (vieGuerrier <= 35) {
            int attaque = 6;
            hunts.setForceAttaque(attaque);
            System.out.println("Votre guerrier aura :"  + attaque + " d'attaque, et votre arme aura " + attaque + " de dégat !");
        } else if (vieGuerrier > 35) {
            int attaque = 4;
            hunts.setForceAttaque(attaque);
            System.out.println("Votre guerrier aura :" + " " + attaque + " d'attaque, et votre arme aura " + attaque + " de dégat !");
        }
        heros.add(hunts);
        i++;
    }

    public  void createMage(){
        String perso = "myGame.Magicien";
        System.out.println("Vous avez choisi d'être un " + " " + perso);
        Personnage elfe = new Magicien();
        scan.nextLine();
        System.out.println("Choisissez un nom ");
        String name = scan.nextLine();
        elfe.setName(name);
        System.out.println("Choisissez une image ");
        String img = scan.nextLine();
        elfe.setImage(img);
        int vieMage = 0;
        while (vieMage < 20 || vieMage > 30) {
            System.out.println("Choisissez un niveau de vie de votre magicien entre 20 et 30 ");
            vieMage = scan.nextInt();
            elfe.setNiveauDeVie(vieMage);
        }
        if (vieMage <= 25) {
            int attaque = 8;
            elfe.setForceAttaque(attaque);
            System.out.println("Votre mage aura :" + " " + attaque + " d'attaque, et votre sort aura " + attaque + " de dégat !");
        } else if (vieMage > 25) {
            int attaque = 6;
            elfe.setForceAttaque(attaque);
            System.out.println("Votre mage aura :" + " " + attaque + " d'attaque, et votre sort aura " + attaque + " de dégat !");
        }
        heros.add(elfe);
        i++;
    }

    public  void menu(){
        System.out.println("Choisissez :\n 1 - Créer un myGame.Personnage\n 2 - Modifier un myGame.Personnage\n 3 - Supprimer un personnage\n 4 - Quitter\n 5 - Afficher héros\n 6 - Explose tout !");
        menuStart = scan.nextInt();
    }

    public  void showList(){
        for (int l = 0; l < heros.size(); l++) {
            System.out.println("A l'emplacement : " + l + " du tableau des héros nous avons : " + heros.get(l).toString());
        }
    }

    public  void modify(){
        System.out.println("Choisissez le hero à modifier : ");
        for (int l = 0; l < heros.size(); l++) {
            System.out.println("Tapez : " +  l + " pour modifier ce hero -> " + heros.get(l).toString());
        }if (heros.isEmpty()) {
            System.out.println("Votre tableau est vide !");
        }
        int modifyChoice = scan.nextInt();
        System.out.println("Vous avez choisis ce héro à modifier : \n" + heros.get(modifyChoice));
        System.out.println("Saisissez le nouveau nom pour ce héro :");
        scan.nextLine();
        String nom = scan.nextLine();
        heros.get(modifyChoice).setName(nom);
        System.out.println(heros.get(modifyChoice));
        System.out.println("Saisissez la nouvelle image pour ce héro :");
        String img = scan.nextLine();
        heros.get(modifyChoice).setImage(img);
        System.out.println(heros.get(modifyChoice));
    }

    public  void delete(){
        System.out.println("Choisissez le hero à supprimer : ");
        for (int l = 0; l < heros.size(); l++) {
            System.out.println("Tapez : " + l + " pour supprimer ce hero -> " + heros.get(l).toString());
        }
        int deleteChoice = scan.nextInt();
        heros.remove(deleteChoice);
        showList();
    }
}
