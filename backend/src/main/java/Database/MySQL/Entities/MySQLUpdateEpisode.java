package Database.MySQL.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TVDBEPISODELIST")
public class MySQLUpdateEpisode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "EPISODE_ID")
    private String episodeId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="UPDATE_ID")
    private MySQLTVDBUpdate mySQLTVDBUpdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    public MySQLTVDBUpdate getMySQLTVDBUpdate() {
        return mySQLTVDBUpdate;
    }

    public void setMySQLTVDBUpdate(MySQLTVDBUpdate mySQLTVDBUpdate) {
        this.mySQLTVDBUpdate = mySQLTVDBUpdate;
    }
}
