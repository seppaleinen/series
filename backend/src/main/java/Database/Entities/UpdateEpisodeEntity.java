package Database.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TVDBEPISODELIST")
public class UpdateEpisodeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "EPISODE_ID")
    private String episodeId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="UPDATE_ID")
    private TVDBUpdateEntity TVDBUpdateEntity;

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

    public TVDBUpdateEntity getTVDBUpdateEntity() {
        return TVDBUpdateEntity;
    }

    public void setTVDBUpdateEntity(TVDBUpdateEntity TVDBUpdateEntity) {
        this.TVDBUpdateEntity = TVDBUpdateEntity;
    }
}
