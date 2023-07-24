package fr.campus.dungeon.equipements;

public class EquipementPositif {
    String name ;

    public void setName(String name) {
        this.name = name;
    }

    int equipementPositifPoint;

    public void setEquipementPositifPoint(int equipementPositifPoint) {
        this.equipementPositifPoint = equipementPositifPoint;
    }

    @Override
    public String toString() {
        return "EquipementPositif{" +
                "name='" + name + '\'' +
                ", equipementPositifPoint=" + equipementPositifPoint +
                '}';
    }
}
