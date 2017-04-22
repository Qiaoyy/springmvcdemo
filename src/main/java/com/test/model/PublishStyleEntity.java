package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "publish_style", schema = "test", catalog = "")
public class PublishStyleEntity {
    private int publishStyleId;
    private String publishStyleName;
    private Collection<HouseEntity> housesByPublishStyleId;

    @Id
    @Column(name = "publish_style_id", nullable = false)
    public int getPublishStyleId() {
        return publishStyleId;
    }

    public void setPublishStyleId(int publishStyleId) {
        this.publishStyleId = publishStyleId;
    }

    @Basic
    @Column(name = "publish_style_name", nullable = true, length = 20)
    public String getPublishStyleName() {
        return publishStyleName;
    }

    public void setPublishStyleName(String publishStyleName) {
        this.publishStyleName = publishStyleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublishStyleEntity that = (PublishStyleEntity) o;

        if (publishStyleId != that.publishStyleId) return false;
        if (publishStyleName != null ? !publishStyleName.equals(that.publishStyleName) : that.publishStyleName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = publishStyleId;
        result = 31 * result + (publishStyleName != null ? publishStyleName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "publishStyleByPublishStyleId")
    public Collection<HouseEntity> getHousesByPublishStyleId() {
        return housesByPublishStyleId;
    }

    public void setHousesByPublishStyleId(Collection<HouseEntity> housesByPublishStyleId) {
        this.housesByPublishStyleId = housesByPublishStyleId;
    }
}
