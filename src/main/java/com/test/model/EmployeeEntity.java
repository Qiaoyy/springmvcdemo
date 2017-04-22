package com.test.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "employee", schema = "test", catalog = "")
public class EmployeeEntity {
    private int employeeId;
    private String employeeName;
    private Date employeeBirth;
    private String employeePhone;
    private String employeeSex;
    private String employeeCardId;
    private String employeeEmail;
    private String employeeAddress;
    private String employeeEthics;
    private Double employeeBasicSalary;
    private Collection<UserEntity> usersByEmployeeId;

    @Id
    @Column(name = "employee_id", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "employee_name", nullable = true, length = 10)
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "employee_birth", nullable = true)
    public Date getEmployeeBirth() {
        return employeeBirth;
    }

    public void setEmployeeBirth(Date employeeBirth) {
        this.employeeBirth = employeeBirth;
    }

    @Basic
    @Column(name = "employee_phone", nullable = true, length = 11)
    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    @Basic
    @Column(name = "employee_sex", nullable = true, length = 2)
    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    @Basic
    @Column(name = "employee_cardID", nullable = true, length = 18)
    public String getEmployeeCardId() {
        return employeeCardId;
    }

    public void setEmployeeCardId(String employeeCardId) {
        this.employeeCardId = employeeCardId;
    }

    @Basic
    @Column(name = "employee_email", nullable = true, length = 40)
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Basic
    @Column(name = "employee_address", nullable = true, length = 100)
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Basic
    @Column(name = "employee_ethics", nullable = true, length = 10)
    public String getEmployeeEthics() {
        return employeeEthics;
    }

    public void setEmployeeEthics(String employeeEthics) {
        this.employeeEthics = employeeEthics;
    }

    @Basic
    @Column(name = "employee_basic_salary", nullable = true, precision = 0)
    public Double getEmployeeBasicSalary() {
        return employeeBasicSalary;
    }

    public void setEmployeeBasicSalary(Double employeeBasicSalary) {
        this.employeeBasicSalary = employeeBasicSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (employeeId != that.employeeId) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (employeeBirth != null ? !employeeBirth.equals(that.employeeBirth) : that.employeeBirth != null)
            return false;
        if (employeePhone != null ? !employeePhone.equals(that.employeePhone) : that.employeePhone != null)
            return false;
        if (employeeSex != null ? !employeeSex.equals(that.employeeSex) : that.employeeSex != null) return false;
        if (employeeCardId != null ? !employeeCardId.equals(that.employeeCardId) : that.employeeCardId != null)
            return false;
        if (employeeEmail != null ? !employeeEmail.equals(that.employeeEmail) : that.employeeEmail != null)
            return false;
        if (employeeAddress != null ? !employeeAddress.equals(that.employeeAddress) : that.employeeAddress != null)
            return false;
        if (employeeEthics != null ? !employeeEthics.equals(that.employeeEthics) : that.employeeEthics != null)
            return false;
        if (employeeBasicSalary != null ? !employeeBasicSalary.equals(that.employeeBasicSalary) : that.employeeBasicSalary != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (employeeBirth != null ? employeeBirth.hashCode() : 0);
        result = 31 * result + (employeePhone != null ? employeePhone.hashCode() : 0);
        result = 31 * result + (employeeSex != null ? employeeSex.hashCode() : 0);
        result = 31 * result + (employeeCardId != null ? employeeCardId.hashCode() : 0);
        result = 31 * result + (employeeEmail != null ? employeeEmail.hashCode() : 0);
        result = 31 * result + (employeeAddress != null ? employeeAddress.hashCode() : 0);
        result = 31 * result + (employeeEthics != null ? employeeEthics.hashCode() : 0);
        result = 31 * result + (employeeBasicSalary != null ? employeeBasicSalary.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "employeeByEmployeeId")
    public Collection<UserEntity> getUsersByEmployeeId() {
        return usersByEmployeeId;
    }

    public void setUsersByEmployeeId(Collection<UserEntity> usersByEmployeeId) {
        this.usersByEmployeeId = usersByEmployeeId;
    }
}
