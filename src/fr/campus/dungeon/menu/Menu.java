package fr.campus.dungeon.menu;

import fr.campus.dungeon.characters.Personnage;
import fr.campus.dungeon.characters.type.Guerriers;
import fr.campus.dungeon.characters.type.Magiciens;
import fr.campus.dungeon.db.Hero;
import fr.campus.dungeon.game.Game;

import java.util.Scanner;

public class Menu {
    public Menu() {
        show();
    }

    int choice;

    String menu;

    //Jeu joue = new Jeu();

    Personnage persoPrincipale = null;

    public Personnage getPersoPrincipale() {
        return persoPrincipale;
    }
    Hero hero = new Hero();

    public Menu show() {

        //Personnage ennemi = null; ( pour le jeu )

        while (true){

            Scanner s = new Scanner(System.in);
            System.out.println("");
            System.out.println("1. Cree votre personnage ");
            System.out.println("2. Afficher son personnage ");
            System.out.println("3. Modifier son personnage ");
            System.out.println("4. Lancer le jeu ! ");
            System.out.println("5. Quitter ");
            System.out.println("");
            System.out.print("Entrez votre choix : ");
            choice = s.nextInt();
            String type ="";
            String nom="";


            if (choice == 1 || choice == 3 ) {
                Scanner question = new Scanner(System.in);
                System.out.print("Ecrire son type (Guerrier ou Magicien) : ");
                type = question.nextLine();
                System.out.print("Ecrire son nom : ");
                nom = question.nextLine();
                menu = s.nextLine();
                if (type.equalsIgnoreCase("guerrier")){
                    persoPrincipale = new Guerriers(nom);
                    hero.createHeroes(persoPrincipale);
                }
                else if (type.equalsIgnoreCase("magicien")){
                    persoPrincipale = new Magiciens(nom);
                    hero.createHeroes(persoPrincipale);
                }
            }
            else if (choice == 2) {
                menu = s.nextLine();
                if(persoPrincipale == null){
                    System.out.println("");
                    System.out.println("ERREUR : Vous n'avez pas cree de personnage , recommencez !");
                    System.out.println("");
                    return this.show();
                }
                else if (hero != null){
                    System.out.println("");
                    System.out.println("Votre personnage : ");
                    System.out.println(persoPrincipale);
                }
                else{
                    System.out.println("");
                    System.out.println("Votre personnage : ");
                    System.out.println(persoPrincipale);
                }
            }
            else if (choice == 3){
//                menu = s.nextLine();
//                if(monGuerrier == null){
//                    System.out.println("");
//                    System.out.println("ERREUR :");
//                    System.out.println("");
//                    return this.show();
//                }
            }
            else if (choice == 4){
                if (persoPrincipale == null){
                    System.out.println("");
                    System.out.println("Erreur : Veuillez crée un personnage avant de lancer le jeu !");
                }
                else {
                   //joue.jouerJeu();
                    Game jeu = new Game(this);
                }
            }
            else if (choice == 5) {
                System.out.println("");
                System.out.println("A mimir .......");
                break;
            }
            else if (choice >= 6){
                System.out.println("");
                System.out.println("ERREUR : CHIFFRE INCORRECT , recommencez !");
            }
        }
        return null;
    }
}



