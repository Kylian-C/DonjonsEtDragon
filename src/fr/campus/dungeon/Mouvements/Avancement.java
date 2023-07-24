package fr.campus.dungeon.Mouvements;

public class Avancement {
    String caseSuivante;

    public void setCaseSuivante(String caseSuivante) {
        this.caseSuivante = caseSuivante;
    }

    @Override
    public String toString() {
        return "Avancement{" +
                "caseSuivante='" + caseSuivante + '\'' +
                '}';
    }
}
