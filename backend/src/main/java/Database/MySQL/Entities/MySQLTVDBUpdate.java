package Database.MySQL.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TVDBUPDATE")
@NamedQueries(
        @NamedQuery(name = "findUpdateBy", query = "select tvdbupdate from MySQLTVDBUpdate tvdbupdate")
)
public class MySQLTVDBUpdate implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_BY_SERIESID = "findUpdateBy";

    @Id
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
