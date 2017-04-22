package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "store", schema = "test", catalog = "")
public class StoreEntity {
    private int storeId;
    private String storeName;
    private String storeAddress;
    private Collection<UserEntity> usersByStoreId;

    @Id
    @Column(name = "store_id", nullable = false)
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "store_name", nullable = true, length = 20)
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Basic
    @Column(name = "store_address", nullable = true, length = 100)
    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoreEntity that = (StoreEntity) o;

        if (storeId != that.storeId) return false;
        if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null) return false;
        if (storeAddress != null ? !storeAddress.equals(that.storeAddress) : that.storeAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = storeId;
        result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
        result = 31 * result + (storeAddress != null ? storeAddress.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "storeByStoreId")
    public Collection<UserEntity> getUsersByStoreId() {
        return usersByStoreId;
    }

    public void setUsersByStoreId(Collection<UserEntity> usersByStoreId) {
        this.usersByStoreId = usersByStoreId;
    }
}
