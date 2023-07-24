package fr.campus.dungeon.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    Connection connect ;

    public Connection getConnect() {
        return connect;
    }

    public Database() {
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "root", "");
            // use con here
            System.out.println("Connexion fonctionne");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
