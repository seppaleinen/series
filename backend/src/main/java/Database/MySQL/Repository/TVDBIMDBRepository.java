package Database.MySQL.Repository;

import Database.MySQL.Entities.MySQLTVDBIMDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TVDBIMDBRepository extends JpaRepository<MySQLTVDBIMDB, String> {

}