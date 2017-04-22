package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "housekey", schema = "test", catalog = "")
public class HousekeyEntity {
    private int keyId;
    private Integer houseId;
    private Collection<HouseEntity> housesByKeyId;
    private KeyStateEntity keyStateByKeyStateId;

    @Id
    @Column(name = "key_id", nullable = false)
    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    @Basic
    @Column(name = "house_id", nullable = true)
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HousekeyEntity that = (HousekeyEntity) o;

        if (keyId != that.keyId) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keyId;
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "housekeyByKeyId")
    public Collection<HouseEntity> getHousesByKeyId() {
        return housesByKeyId;
    }

    public void setHousesByKeyId(Collection<HouseEntity> housesByKeyId) {
        this.housesByKeyId = housesByKeyId;
    }

    @ManyToOne
    @JoinColumn(name = "key_state_id", referencedColumnName = "key_state_id")
    public KeyStateEntity getKeyStateByKeyStateId() {
        return keyStateByKeyStateId;
    }

    public void setKeyStateByKeyStateId(KeyStateEntity keyStateByKeyStateId) {
        this.keyStateByKeyStateId = keyStateByKeyStateId;
    }
}
