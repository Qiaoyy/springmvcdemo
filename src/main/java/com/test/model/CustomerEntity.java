package com.test.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "customer", schema = "test", catalog = "")
public class CustomerEntity {
    private int customerId;
    private String customerName;
    private String customerPhone;
    private String customerSex;
    private String customerCardId;
    private String customerEmail;
    private Date customerBirth;
    private CustomerTypeEntity customerTypeByCustomerTypeId;
    private UserEntity userByUserId;
    private Collection<HouseEntity> housesByCustomerId;
    private Collection<IntentionOrderEntity> intentionOrdersByCustomerId;
    private Collection<OrdersEntity> orderssByCustomerId;

    @Id
    @Column(name = "customer_id", nullable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name", nullable = true, length = 10)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_phone", nullable = true, length = 11)
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Basic
    @Column(name = "customer_sex", nullable = true, length = 2)
    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    @Basic
    @Column(name = "customer_cardID", nullable = true, length = 18)
    public String getCustomerCardId() {
        return customerCardId;
    }

    public void setCustomerCardId(String customerCardId) {
        this.customerCardId = customerCardId;
    }

    @Basic
    @Column(name = "customer_email", nullable = true, length = 20)
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Basic
    @Column(name = "customer_birth", nullable = true)
    public Date getCustomerBirth() {
        return customerBirth;
    }

    public void setCustomerBirth(Date customerBirth) {
        this.customerBirth = customerBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (customerId != that.customerId) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (customerPhone != null ? !customerPhone.equals(that.customerPhone) : that.customerPhone != null)
            return false;
        if (customerSex != null ? !customerSex.equals(that.customerSex) : that.customerSex != null) return false;
        if (customerCardId != null ? !customerCardId.equals(that.customerCardId) : that.customerCardId != null)
            return false;
        if (customerEmail != null ? !customerEmail.equals(that.customerEmail) : that.customerEmail != null)
            return false;
        if (customerBirth != null ? !customerBirth.equals(that.customerBirth) : that.customerBirth != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerPhone != null ? customerPhone.hashCode() : 0);
        result = 31 * result + (customerSex != null ? customerSex.hashCode() : 0);
        result = 31 * result + (customerCardId != null ? customerCardId.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + (customerBirth != null ? customerBirth.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customer_type_id")
    public CustomerTypeEntity getCustomerTypeByCustomerTypeId() {
        return customerTypeByCustomerTypeId;
    }

    public void setCustomerTypeByCustomerTypeId(CustomerTypeEntity customerTypeByCustomerTypeId) {
        this.customerTypeByCustomerTypeId = customerTypeByCustomerTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<HouseEntity> getHousesByCustomerId() {
        return housesByCustomerId;
    }

    public void setHousesByCustomerId(Collection<HouseEntity> housesByCustomerId) {
        this.housesByCustomerId = housesByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<IntentionOrderEntity> getIntentionOrdersByCustomerId() {
        return intentionOrdersByCustomerId;
    }

    public void setIntentionOrdersByCustomerId(Collection<IntentionOrderEntity> intentionOrdersByCustomerId) {
        this.intentionOrdersByCustomerId = intentionOrdersByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<OrdersEntity> getOrderssByCustomerId() {
        return orderssByCustomerId;
    }

    public void setOrderssByCustomerId(Collection<OrdersEntity> orderssByCustomerId) {
        this.orderssByCustomerId = orderssByCustomerId;
    }
}
