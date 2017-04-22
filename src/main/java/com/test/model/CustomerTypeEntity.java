package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "customer_type", schema = "test", catalog = "")
public class CustomerTypeEntity {
    private int customerTypeId;
    private String customerTypeName;
    private Collection<CustomerEntity> customersByCustomerTypeId;

    @Id
    @Column(name = "customer_type_id", nullable = false)
    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    @Basic
    @Column(name = "customer_type_name", nullable = true, length = 20)
    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerTypeEntity that = (CustomerTypeEntity) o;

        if (customerTypeId != that.customerTypeId) return false;
        if (customerTypeName != null ? !customerTypeName.equals(that.customerTypeName) : that.customerTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerTypeId;
        result = 31 * result + (customerTypeName != null ? customerTypeName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "customerTypeByCustomerTypeId")
    public Collection<CustomerEntity> getCustomersByCustomerTypeId() {
        return customersByCustomerTypeId;
    }

    public void setCustomersByCustomerTypeId(Collection<CustomerEntity> customersByCustomerTypeId) {
        this.customersByCustomerTypeId = customersByCustomerTypeId;
    }
}
