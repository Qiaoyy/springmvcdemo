package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "user", schema = "test", catalog = "")
public class UserEntity {
    private int userId;
    private String userName;
    private String userPassword;
    private Collection<CustomerEntity> customersByUserId;
    private Collection<HouseEntity> housesByUserId;
    private RoleEntity roleByRoleId;
    private EmployeeEntity employeeByEmployeeId;
    private StoreEntity storeByStoreId;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 10)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password", nullable = true, length = 10)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<CustomerEntity> getCustomersByUserId() {
        return customersByUserId;
    }

    public void setCustomersByUserId(Collection<CustomerEntity> customersByUserId) {
        this.customersByUserId = customersByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<HouseEntity> getHousesByUserId() {
        return housesByUserId;
    }

    public void setHousesByUserId(Collection<HouseEntity> housesByUserId) {
        this.housesByUserId = housesByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    public RoleEntity getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(RoleEntity roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    public EmployeeEntity getEmployeeByEmployeeId() {
        return employeeByEmployeeId;
    }

    public void setEmployeeByEmployeeId(EmployeeEntity employeeByEmployeeId) {
        this.employeeByEmployeeId = employeeByEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    public StoreEntity getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(StoreEntity storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }
}
