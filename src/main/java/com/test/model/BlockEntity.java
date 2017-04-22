package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "block", schema = "test", catalog = "")
public class BlockEntity {
    private int blockId;
    private String blockName;
    private String blockRemark;
    private AreaEntity areaByAreaId;
    private Collection<HouseEntity> housesByBlockId;

    @Id
    @Column(name = "block_id", nullable = false)
    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    @Basic
    @Column(name = "block_name", nullable = true, length = 20)
    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    @Basic
    @Column(name = "block_remark", nullable = true, length = 100)
    public String getBlockRemark() {
        return blockRemark;
    }

    public void setBlockRemark(String blockRemark) {
        this.blockRemark = blockRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlockEntity that = (BlockEntity) o;

        if (blockId != that.blockId) return false;
        if (blockName != null ? !blockName.equals(that.blockName) : that.blockName != null) return false;
        if (blockRemark != null ? !blockRemark.equals(that.blockRemark) : that.blockRemark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blockId;
        result = 31 * result + (blockName != null ? blockName.hashCode() : 0);
        result = 31 * result + (blockRemark != null ? blockRemark.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "area_id", referencedColumnName = "area_id")
    public AreaEntity getAreaByAreaId() {
        return areaByAreaId;
    }

    public void setAreaByAreaId(AreaEntity areaByAreaId) {
        this.areaByAreaId = areaByAreaId;
    }

    @OneToMany(mappedBy = "blockByBlockId")
    public Collection<HouseEntity> getHousesByBlockId() {
        return housesByBlockId;
    }

    public void setHousesByBlockId(Collection<HouseEntity> housesByBlockId) {
        this.housesByBlockId = housesByBlockId;
    }
}
