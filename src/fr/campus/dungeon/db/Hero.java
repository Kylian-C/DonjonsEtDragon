package fr.campus.dungeon.db;

import fr.campus.dungeon.characters.Personnage;

import java.sql.*;

public class Hero {
    Database database;

    Connection connection;

    public void getHeroes (){
        this.database = new Database();
        this.connection = database.getConnect();

        ResultSet resultats= null;

        String requete = "SELECT * FROM Hero";

        try {
            //Connection base de données :
            Statement stmt = connection.createStatement();

            //Execution de la requete :
            resultats = stmt.executeQuery(requete);

            //Mise en forme - Meta Data recupere les données de la construction de ma table dans la base de données :
            ResultSetMetaData rsmd = resultats.getMetaData();
            //System.out.println(rsmd);

            // Compte le nombre de columns dans la table :
            int nbCols = rsmd.getColumnCount();

            //Affiche les données rentrez dans la table :
            while (resultats.next()) {
                for (int i = 1; i <= nbCols; i++)
                    System.out.print(resultats.getString(i) + " ");
                System.out.println();
            }
            resultats.close();

        // Sers a affciher si il y a une erreur :
        } catch (SQLException e) {
            System.out.println("mauvaise manip");
        }
    }
    public void createHeroes (Personnage hero){

        this.database = new Database();
        this.connection = database.getConnect();
        String requete = "INSERT INTO Hero ( Type, nom, vie, attaque, equipementOf, equipementDef ) VALUES(?,?,?,?,?,?)";
        int hp = hero.getVie();
        int attak = hero.getAttaque();
        String name = hero.getNom();
        String offensivWeapon = String.valueOf(hero.getEquipementOf());
        String defensivWeapon = String.valueOf(hero.getEquipementDef());
        String type = hero.getClass().getSimpleName();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(requete);
//            Statement stmt = connection.createStatement();
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, hp);
            preparedStatement.setInt(4, attak);
            preparedStatement.setString(5, offensivWeapon);
            preparedStatement.setString(6, defensivWeapon);

            int resultats = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            //traitement de l'exception
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
