package fr.campus.dungeon.equipements;

public class EquipementOffensif {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    int equipementOffensifPoint;

    public void setEquipementOffensifPoint(int equipementOffensifPoint) {
        this.equipementOffensifPoint = equipementOffensifPoint;
    }

    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "name='" + name + '\'' +
                ", equipementOffensifPoint=" + equipementOffensifPoint +
                '}';
    }
}