package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "house_state", schema = "test", catalog = "")
public class HouseStateEntity {
    private int houseStateId;
    private String houseStateName;
    private Collection<HouseEntity> housesByHouseStateId;

    @Id
    @Column(name = "house_state_id", nullable = false)
    public int getHouseStateId() {
        return houseStateId;
    }

    public void setHouseStateId(int houseStateId) {
        this.houseStateId = houseStateId;
    }

    @Basic
    @Column(name = "house_state_name", nullable = true, length = 20)
    public String getHouseStateName() {
        return houseStateName;
    }

    public void setHouseStateName(String houseStateName) {
        this.houseStateName = houseStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseStateEntity that = (HouseStateEntity) o;

        if (houseStateId != that.houseStateId) return false;
        if (houseStateName != null ? !houseStateName.equals(that.houseStateName) : that.houseStateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = houseStateId;
        result = 31 * result + (houseStateName != null ? houseStateName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "houseStateByHouseStateId")
    public Collection<HouseEntity> getHousesByHouseStateId() {
        return housesByHouseStateId;
    }

    public void setHousesByHouseStateId(Collection<HouseEntity> housesByHouseStateId) {
        this.housesByHouseStateId = housesByHouseStateId;
    }
}
