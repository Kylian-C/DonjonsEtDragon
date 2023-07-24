package fr.campus.dungeon.characters;


import fr.campus.dungeon.equipements.DetailDEF.Bouclier;
import fr.campus.dungeon.equipements.DetailDEF.Philtre;
import fr.campus.dungeon.equipements.DetailOF.Arme;
import fr.campus.dungeon.equipements.DetailOF.Sort;
import fr.campus.dungeon.equipements.EquipementDefensif;
import fr.campus.dungeon.equipements.EquipementOffensif;

public class Personnage {
    String nom;
    int vie;

    public void setVie(int vie) {
        this.vie = vie;
    }

    int attaque;

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    EquipementOffensif equipementOf;

    public void setEquipementOf(EquipementOffensif equipementOf) {
        this.equipementOf = equipementOf;
    }

    EquipementDefensif equipementDef;

    public void setEquipementDef(EquipementDefensif equipementDef) {
        this.equipementDef = equipementDef;
    }



    public Personnage(String nom){
        this.nom = nom;

//        if(type.equals("guerrier")){
//            //this.vie = 10;
//            this.attaque = 10;
//             this.equipementOf = "epee";
//             this.equipementDef = "bouclier";
//
//        }else if(type.equals("magicien")){
//            this.vie = 6;
//            this.attaque = 15;
//            this.equipementOf = "Sort";
//            this.equipementDef = "philtre";
//        }
//        else{
//            this.vie = 0;
//            this.attaque = 0;
////            arme = "rien";
////            def = "rien";
//        }
//        System.out.println("");
//        System.out.println("Vous avez rentrer comme type : " + type);
//        System.out.println("");
//        System.out.println("Vous avez rentrer comme nom : " + nom);

    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public EquipementOffensif getEquipementOf() {
        return equipementOf;
    }

    public EquipementDefensif getEquipementDef() {
        return equipementDef;
    }

    @Override // generate - toString
    public String toString() {
        return "Personnage{" +
//                "type='" + type + '\'' +
                ", nom='" + nom + '\'' +
                ", vie='" + vie + '\'' +
                ", attaque='" + attaque + '\'' +
                ", equipementOf=" + equipementOf +
                ", equipementDef=" + equipementDef +
                '}';
    }

}