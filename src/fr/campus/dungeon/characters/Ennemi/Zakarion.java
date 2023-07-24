package fr.campus.dungeon.characters.Ennemi;

import fr.campus.dungeon.characters.Personnage;
import fr.campus.dungeon.equipements.DetailDEF.Table;
import fr.campus.dungeon.equipements.DetailOF.Feu;

public class Zakarion extends Personnage {
    public Zakarion(String nom) {
        super(nom);
        setVie(8);
        setAttaque(12);
        setEquipementDef(new Table());
        setEquipementOf(new Feu());
    }

    @Override
    public String toString() {
        return "Zakarion{"
                +super.toString()+"}";
    }
}
