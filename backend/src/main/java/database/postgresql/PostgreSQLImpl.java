package database.postgresql;

import database.HibernateMethods;

public class PostgreSQLImpl extends HibernateMethods {
    private static final String DEFAULT_PERSISTENCE = "postgres";

    public PostgreSQLImpl(){
        setPersistence(DEFAULT_PERSISTENCE);
    }

    protected void setPersistence(String persistence){
        this.persistence = persistence;
    }
}
