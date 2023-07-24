package fr.campus.dungeon.equipements;

import fr.campus.dungeon.characters.Personnage;

public class EquipementDefensif{
    String name;

    public void setName(String name) {
        this.name = name;
    }
    int equipementDefensifPoint;

    public void setEquipementDefensifPoint(int equipementDefensifPoint) {
        this.equipementDefensifPoint = equipementDefensifPoint;
    }

    @Override
    public String toString() {
        return "EquipementDefensif{" +
                "name='" + name + '\'' +
                ", equipementDefensifPoint='" + equipementDefensifPoint + '\'' +
                '}';
    }
}
