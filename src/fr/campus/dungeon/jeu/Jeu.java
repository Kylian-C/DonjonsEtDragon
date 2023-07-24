package fr.campus.dungeon.jeu;

import fr.campus.dungeon.exceptions.PersonnageHorsPlateauException;

import java.util.Random;

public class Jeu {

    public void jouerJeu() {

        int positionJoueur = 1;
        int caseMax = 64;
        Random random = new Random();

        while (positionJoueur < caseMax) {
            try {
                int de = random.nextInt(6) + 1;
                System.out.println("Vous avez lancé un dé, le joueur avance de " + de + " case(s).");

                positionJoueur += de;
                System.out.println("La position du joueur est : " + positionJoueur);

                if (positionJoueur > caseMax) {
                    throw new PersonnageHorsPlateauException("Erreur : La position du joueur est hors du plateau !");
                }

            } catch (PersonnageHorsPlateauException e) {
                System.out.println("");
                System.out.println("PersonnageHorsPlateauException: " + e.getMessage());
                break;
            }
        }

        if (positionJoueur == caseMax) {
            System.out.println("");
            System.out.println("Félicitations ! Vous avez atteint la case 64.");
        }
    }
}
