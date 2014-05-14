package Database.PostgreSQL;

import Database.DBInterface;
import Database.Entities.*;
import Database.HibernateManager;
import Database.Entities.Utils.JPAToObject;
import Database.Entities.Utils.ObjectToJPA;
import Database.HibernateMethods;
import Objects.*;

import java.util.List;

public class PostgreSQLImpl extends HibernateMethods {
    private static final String DEFAULT_PERSISTENCE = "postgres";

    public PostgreSQLImpl(){
        setPersistence(DEFAULT_PERSISTENCE);
    }

    protected void setPersistence(String persistence){
        this.persistence = persistence;
    }
}
