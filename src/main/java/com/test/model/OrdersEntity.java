package com.test.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "orders", schema = "test", catalog = "")
public class OrdersEntity {
    private int orderId;
    private Date orderDate;
    private String orderMark;
    private HouseEntity houseByHouseId;
    private CustomerEntity customerByCustomerId;

    @Id
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_date", nullable = true)
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "order_mark", nullable = true, length = 100)
    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (orderId != that.orderId) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (orderMark != null ? !orderMark.equals(that.orderMark) : that.orderMark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (orderMark != null ? orderMark.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "house_id", referencedColumnName = "house_id")
    public HouseEntity getHouseByHouseId() {
        return houseByHouseId;
    }

    public void setHouseByHouseId(HouseEntity houseByHouseId) {
        this.houseByHouseId = houseByHouseId;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }
}
