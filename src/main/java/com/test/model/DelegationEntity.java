package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "delegation", schema = "test", catalog = "")
public class DelegationEntity {
    private int delegationId;
    private String delegationType;
    private Collection<HouseEntity> housesByDelegationId;

    @Id
    @Column(name = "delegation_id", nullable = false)
    public int getDelegationId() {
        return delegationId;
    }

    public void setDelegationId(int delegationId) {
        this.delegationId = delegationId;
    }

    @Basic
    @Column(name = "delegation_type", nullable = true, length = 10)
    public String getDelegationType() {
        return delegationType;
    }

    public void setDelegationType(String delegationType) {
        this.delegationType = delegationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DelegationEntity that = (DelegationEntity) o;

        if (delegationId != that.delegationId) return false;
        if (delegationType != null ? !delegationType.equals(that.delegationType) : that.delegationType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = delegationId;
        result = 31 * result + (delegationType != null ? delegationType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "delegationByDelegationId")
    public Collection<HouseEntity> getHousesByDelegationId() {
        return housesByDelegationId;
    }

    public void setHousesByDelegationId(Collection<HouseEntity> housesByDelegationId) {
        this.housesByDelegationId = housesByDelegationId;
    }
}
