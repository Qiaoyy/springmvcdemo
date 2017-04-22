package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "rank", schema = "test", catalog = "")
public class RankEntity {
    private int rankId;
    private String rankName;
    private Collection<HouseEntity> housesByRankId;

    @Id
    @Column(name = "rank_id", nullable = false)
    public int getRankId() {
        return rankId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    @Basic
    @Column(name = "rank_name", nullable = true, length = 10)
    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RankEntity that = (RankEntity) o;

        if (rankId != that.rankId) return false;
        if (rankName != null ? !rankName.equals(that.rankName) : that.rankName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rankId;
        result = 31 * result + (rankName != null ? rankName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "rankByRankId")
    public Collection<HouseEntity> getHousesByRankId() {
        return housesByRankId;
    }

    public void setHousesByRankId(Collection<HouseEntity> housesByRankId) {
        this.housesByRankId = housesByRankId;
    }
}
