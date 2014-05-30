package database.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TVDBSERIESLIST")
public class UpdateSeriesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "SERIES_ID")
    private String seriesId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="UPDATE_ID")
    private TVDBUpdateEntity TVDBUpdateEntity;

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

    public TVDBUpdateEntity getTVDBUpdateEntity() {
        return TVDBUpdateEntity;
    }

    public void setTVDBUpdateEntity(TVDBUpdateEntity TVDBUpdateEntity) {
        this.TVDBUpdateEntity = TVDBUpdateEntity;
    }
}
