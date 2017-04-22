package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "fitment", schema = "test", catalog = "")
public class FitmentEntity {
    private int fitmentId;
    private String fitmentState;
    private Collection<HouseEntity> housesByFitmentId;

    @Id
    @Column(name = "fitment_id", nullable = false)
    public int getFitmentId() {
        return fitmentId;
    }

    public void setFitmentId(int fitmentId) {
        this.fitmentId = fitmentId;
    }

    @Basic
    @Column(name = "fitment_state", nullable = true, length = 10)
    public String getFitmentState() {
        return fitmentState;
    }

    public void setFitmentState(String fitmentState) {
        this.fitmentState = fitmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FitmentEntity that = (FitmentEntity) o;

        if (fitmentId != that.fitmentId) return false;
        if (fitmentState != null ? !fitmentState.equals(that.fitmentState) : that.fitmentState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fitmentId;
        result = 31 * result + (fitmentState != null ? fitmentState.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "fitmentByFitmentId")
    public Collection<HouseEntity> getHousesByFitmentId() {
        return housesByFitmentId;
    }

    public void setHousesByFitmentId(Collection<HouseEntity> housesByFitmentId) {
        this.housesByFitmentId = housesByFitmentId;
    }
}
