package com.test.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "intention_order", schema = "test", catalog = "")
public class IntentionOrderEntity {
    private Date intentionOrderDate;
    private String intentionOrderMark;
    private int intentionOrderI;
    private HouseEntity houseByHouseId;
    private CustomerEntity customerByCustomerId;

    @Basic
    @Column(name = "intention_order_date", nullable = true)
    public Date getIntentionOrderDate() {
        return intentionOrderDate;
    }

    public void setIntentionOrderDate(Date intentionOrderDate) {
        this.intentionOrderDate = intentionOrderDate;
    }

    @Basic
    @Column(name = "intention_order_mark", nullable = true, length = 100)
    public String getIntentionOrderMark() {
        return intentionOrderMark;
    }

    public void setIntentionOrderMark(String intentionOrderMark) {
        this.intentionOrderMark = intentionOrderMark;
    }

    @Id
    @Column(name = "intention_order_i", nullable = false)
    public int getIntentionOrderI() {
        return intentionOrderI;
    }

    public void setIntentionOrderI(int intentionOrderI) {
        this.intentionOrderI = intentionOrderI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntentionOrderEntity that = (IntentionOrderEntity) o;

        if (intentionOrderI != that.intentionOrderI) return false;
        if (intentionOrderDate != null ? !intentionOrderDate.equals(that.intentionOrderDate) : that.intentionOrderDate != null)
            return false;
        if (intentionOrderMark != null ? !intentionOrderMark.equals(that.intentionOrderMark) : that.intentionOrderMark != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = intentionOrderDate != null ? intentionOrderDate.hashCode() : 0;
        result = 31 * result + (intentionOrderMark != null ? intentionOrderMark.hashCode() : 0);
        result = 31 * result + intentionOrderI;
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
