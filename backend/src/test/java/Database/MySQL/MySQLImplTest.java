package Database.MySQL;

import Database.DBInterface;
import Database.MongoDB.ObjectCreater;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.TVDBIMDB;
import org.junit.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;


public class MySQLImplTest {
    private DBInterface dbInterface;

    @Test
    public void testConnection() throws ClassNotFoundException, SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/MYDB";
        String dbClass = "com.mysql.jdbc.Driver";
        String query = "select distinct(table_name) from INFORMATION_SCHEMA.TABLES";
        String username = "root";
        String password = "minstlol";
        Class.forName(dbClass);
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            System.out.println("TABLENAME: " + resultSet.getString(1));
        }
        connection.close();
    }

    @Test
    public void testHibernateHSQLDB(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();
        MySQLTVDBIMDB mySQLTVDBIMDB = ObjectToJPA.convertTVDBIMDB_To_MySQLTVDBIMDB(tvdbimdb);
        entityManager.persist(mySQLTVDBIMDB);
        entityManager.close();
    }

    @Test
    public void testHibernateDefault(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();
        MySQLTVDBIMDB mySQLTVDBIMDB = ObjectToJPA.convertTVDBIMDB_To_MySQLTVDBIMDB(tvdbimdb);
        entityManager.persist(mySQLTVDBIMDB);
        entityManager.close();
    }

}
