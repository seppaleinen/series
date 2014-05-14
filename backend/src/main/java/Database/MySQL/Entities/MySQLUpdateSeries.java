package Database.MySQL.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TVDBSERIESLIST")
public class MySQLUpdateSeries implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "SERIES_ID")
    private String seriesId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="UPDATE_ID")
    private MySQLTVDBUpdate mySQLTVDBUpdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public MySQLTVDBUpdate getMySQLTVDBUpdate() {
        return mySQLTVDBUpdate;
    }

    public void setMySQLTVDBUpdate(MySQLTVDBUpdate mySQLTVDBUpdate) {
        this.mySQLTVDBUpdate = mySQLTVDBUpdate;
    }
}
