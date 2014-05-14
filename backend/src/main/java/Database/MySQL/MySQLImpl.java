package Database.MySQL;

import Database.HibernateMethods;

public class MySQLImpl extends HibernateMethods {
    private static final String DEFAULT_PERSISTENCE = "mysql";

    public MySQLImpl(){
        setPersistence(DEFAULT_PERSISTENCE);
    }

    protected void setPersistence(String persistence) {
        this.persistence = persistence;
    }
}
