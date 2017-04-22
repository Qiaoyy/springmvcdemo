package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "area", schema = "test", catalog = "")
public class AreaEntity {
    private int areaId;
    private String areaName;
    private Collection<BlockEntity> blocksByAreaId;

    @Id
    @Column(name = "area_id", nullable = false)
    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "area_name", nullable = true, length = 50)
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AreaEntity that = (AreaEntity) o;

        if (areaId != that.areaId) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = areaId;
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "areaByAreaId")
    public Collection<BlockEntity> getBlocksByAreaId() {
        return blocksByAreaId;
    }

    public void setBlocksByAreaId(Collection<BlockEntity> blocksByAreaId) {
        this.blocksByAreaId = blocksByAreaId;
    }
}
