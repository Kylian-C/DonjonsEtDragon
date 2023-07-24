package fr.campus.dungeon.characters.Ennemi;

import fr.campus.dungeon.characters.Personnage;
import fr.campus.dungeon.equipements.DetailDEF.MotDoux;
import fr.campus.dungeon.equipements.DetailOF.Couteau;

public class Mathieucolax extends Personnage {
    public Mathieucolax(String nom) {
        super(nom);
        setVie(10);
        setAttaque(15);
        setEquipementDef(new MotDoux());
        setEquipementOf(new Couteau());
    }

    @Override
    public String toString() {
        return "Zakarion{"
                +super.toString()+"}";
    }
}
