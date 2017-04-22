package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "key_state", schema = "test", catalog = "")
public class KeyStateEntity {
    private int keyStateId;
    private String keyStateName;
    private Collection<HousekeyEntity> housekeysByKeyStateId;

    @Id
    @Column(name = "key_state_id", nullable = false)
    public int getKeyStateId() {
        return keyStateId;
    }

    public void setKeyStateId(int keyStateId) {
        this.keyStateId = keyStateId;
    }

    @Basic
    @Column(name = "key_state_name", nullable = true, length = 20)
    public String getKeyStateName() {
        return keyStateName;
    }

    public void setKeyStateName(String keyStateName) {
        this.keyStateName = keyStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyStateEntity that = (KeyStateEntity) o;

        if (keyStateId != that.keyStateId) return false;
        if (keyStateName != null ? !keyStateName.equals(that.keyStateName) : that.keyStateName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keyStateId;
        result = 31 * result + (keyStateName != null ? keyStateName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "keyStateByKeyStateId")
    public Collection<HousekeyEntity> getHousekeysByKeyStateId() {
        return housekeysByKeyStateId;
    }

    public void setHousekeysByKeyStateId(Collection<HousekeyEntity> housekeysByKeyStateId) {
        this.housekeysByKeyStateId = housekeysByKeyStateId;
    }
}
