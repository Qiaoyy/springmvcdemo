package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "house", schema = "test", catalog = "")
public class HouseEntity {
    private int houseId;
    private String houseRemark;
    private Integer houseBuildyear;
    private Double houseArea;
    private Integer houseSeatId;
    private Integer houseFloorId;
    private Double houseTotalPrice;
    private String housePic;
    private Integer bedroomNum;
    private Integer livingroomNum;
    private Double monthRent;
    private Integer isApproval;
    private CustomerEntity customerByCustomerId;
    private FitmentEntity fitmentByFitmentId;
    private HouseStateEntity houseStateByHouseStateId;
    private DelegationEntity delegationByDelegationId;
    private PublishStyleEntity publishStyleByPublishStyleId;
    private HousekeyEntity housekeyByKeyId;
    private BlockEntity blockByBlockId;
    private RankEntity rankByRankId;
    private UserEntity userByUserId;
    private Collection<IntentionOrderEntity> intentionOrdersByHouseId;
    private Collection<OrdersEntity> orderssByHouseId;

    @Id
    @Column(name = "house_id", nullable = false)
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "house_remark", nullable = true, length = 100)
    public String getHouseRemark() {
        return houseRemark;
    }

    public void setHouseRemark(String houseRemark) {
        this.houseRemark = houseRemark;
    }

    @Basic
    @Column(name = "house_buildyear", nullable = true)
    public Integer getHouseBuildyear() {
        return houseBuildyear;
    }

    public void setHouseBuildyear(Integer houseBuildyear) {
        this.houseBuildyear = houseBuildyear;
    }

    @Basic
    @Column(name = "house_area", nullable = true, precision = 0)
    public Double getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Double houseArea) {
        this.houseArea = houseArea;
    }

    @Basic
    @Column(name = "house_seatID", nullable = true)
    public Integer getHouseSeatId() {
        return houseSeatId;
    }

    public void setHouseSeatId(Integer houseSeatId) {
        this.houseSeatId = houseSeatId;
    }

    @Basic
    @Column(name = "house_floorID", nullable = true)
    public Integer getHouseFloorId() {
        return houseFloorId;
    }

    public void setHouseFloorId(Integer houseFloorId) {
        this.houseFloorId = houseFloorId;
    }

    @Basic
    @Column(name = "house_total_price", nullable = true, precision = 0)
    public Double getHouseTotalPrice() {
        return houseTotalPrice;
    }

    public void setHouseTotalPrice(Double houseTotalPrice) {
        this.houseTotalPrice = houseTotalPrice;
    }

    @Basic
    @Column(name = "house_pic", nullable = true, length = 100)
    public String getHousePic() {
        return housePic;
    }

    public void setHousePic(String housePic) {
        this.housePic = housePic;
    }

    @Basic
    @Column(name = "bedroom_num", nullable = true)
    public Integer getBedroomNum() {
        return bedroomNum;
    }

    public void setBedroomNum(Integer bedroomNum) {
        this.bedroomNum = bedroomNum;
    }

    @Basic
    @Column(name = "livingroom_num", nullable = true)
    public Integer getLivingroomNum() {
        return livingroomNum;
    }

    public void setLivingroomNum(Integer livingroomNum) {
        this.livingroomNum = livingroomNum;
    }

    @Basic
    @Column(name = "month_rent", nullable = true, precision = 0)
    public Double getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(Double monthRent) {
        this.monthRent = monthRent;
    }

    @Basic
    @Column(name = "is_approval", nullable = true)
    public Integer getIsApproval() {
        return isApproval;
    }

    public void setIsApproval(Integer isApproval) {
        this.isApproval = isApproval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseEntity that = (HouseEntity) o;

        if (houseId != that.houseId) return false;
        if (houseRemark != null ? !houseRemark.equals(that.houseRemark) : that.houseRemark != null) return false;
        if (houseBuildyear != null ? !houseBuildyear.equals(that.houseBuildyear) : that.houseBuildyear != null)
            return false;
        if (houseArea != null ? !houseArea.equals(that.houseArea) : that.houseArea != null) return false;
        if (houseSeatId != null ? !houseSeatId.equals(that.houseSeatId) : that.houseSeatId != null) return false;
        if (houseFloorId != null ? !houseFloorId.equals(that.houseFloorId) : that.houseFloorId != null) return false;
        if (houseTotalPrice != null ? !houseTotalPrice.equals(that.houseTotalPrice) : that.houseTotalPrice != null)
            return false;
        if (housePic != null ? !housePic.equals(that.housePic) : that.housePic != null) return false;
        if (bedroomNum != null ? !bedroomNum.equals(that.bedroomNum) : that.bedroomNum != null) return false;
        if (livingroomNum != null ? !livingroomNum.equals(that.livingroomNum) : that.livingroomNum != null)
            return false;
        if (monthRent != null ? !monthRent.equals(that.monthRent) : that.monthRent != null) return false;
        if (isApproval != null ? !isApproval.equals(that.isApproval) : that.isApproval != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = houseId;
        result = 31 * result + (houseRemark != null ? houseRemark.hashCode() : 0);
        result = 31 * result + (houseBuildyear != null ? houseBuildyear.hashCode() : 0);
        result = 31 * result + (houseArea != null ? houseArea.hashCode() : 0);
        result = 31 * result + (houseSeatId != null ? houseSeatId.hashCode() : 0);
        result = 31 * result + (houseFloorId != null ? houseFloorId.hashCode() : 0);
        result = 31 * result + (houseTotalPrice != null ? houseTotalPrice.hashCode() : 0);
        result = 31 * result + (housePic != null ? housePic.hashCode() : 0);
        result = 31 * result + (bedroomNum != null ? bedroomNum.hashCode() : 0);
        result = 31 * result + (livingroomNum != null ? livingroomNum.hashCode() : 0);
        result = 31 * result + (monthRent != null ? monthRent.hashCode() : 0);
        result = 31 * result + (isApproval != null ? isApproval.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "fitment_id", referencedColumnName = "fitment_id")
    public FitmentEntity getFitmentByFitmentId() {
        return fitmentByFitmentId;
    }

    public void setFitmentByFitmentId(FitmentEntity fitmentByFitmentId) {
        this.fitmentByFitmentId = fitmentByFitmentId;
    }

    @ManyToOne
    @JoinColumn(name = "house_state_id", referencedColumnName = "house_state_id")
    public HouseStateEntity getHouseStateByHouseStateId() {
        return houseStateByHouseStateId;
    }

    public void setHouseStateByHouseStateId(HouseStateEntity houseStateByHouseStateId) {
        this.houseStateByHouseStateId = houseStateByHouseStateId;
    }

    @ManyToOne
    @JoinColumn(name = "delegation_id", referencedColumnName = "delegation_id")
    public DelegationEntity getDelegationByDelegationId() {
        return delegationByDelegationId;
    }

    public void setDelegationByDelegationId(DelegationEntity delegationByDelegationId) {
        this.delegationByDelegationId = delegationByDelegationId;
    }

    @ManyToOne
    @JoinColumn(name = "publish_style_id", referencedColumnName = "publish_style_id")
    public PublishStyleEntity getPublishStyleByPublishStyleId() {
        return publishStyleByPublishStyleId;
    }

    public void setPublishStyleByPublishStyleId(PublishStyleEntity publishStyleByPublishStyleId) {
        this.publishStyleByPublishStyleId = publishStyleByPublishStyleId;
    }

    @ManyToOne
    @JoinColumn(name = "key_id", referencedColumnName = "key_id")
    public HousekeyEntity getHousekeyByKeyId() {
        return housekeyByKeyId;
    }

    public void setHousekeyByKeyId(HousekeyEntity housekeyByKeyId) {
        this.housekeyByKeyId = housekeyByKeyId;
    }

    @ManyToOne
    @JoinColumn(name = "block_id", referencedColumnName = "block_id")
    public BlockEntity getBlockByBlockId() {
        return blockByBlockId;
    }

    public void setBlockByBlockId(BlockEntity blockByBlockId) {
        this.blockByBlockId = blockByBlockId;
    }

    @ManyToOne
    @JoinColumn(name = "rank_id", referencedColumnName = "rank_id")
    public RankEntity getRankByRankId() {
        return rankByRankId;
    }

    public void setRankByRankId(RankEntity rankByRankId) {
        this.rankByRankId = rankByRankId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @OneToMany(mappedBy = "houseByHouseId")
    public Collection<IntentionOrderEntity> getIntentionOrdersByHouseId() {
        return intentionOrdersByHouseId;
    }

    public void setIntentionOrdersByHouseId(Collection<IntentionOrderEntity> intentionOrdersByHouseId) {
        this.intentionOrdersByHouseId = intentionOrdersByHouseId;
    }

    @OneToMany(mappedBy = "houseByHouseId")
    public Collection<OrdersEntity> getOrderssByHouseId() {
        return orderssByHouseId;
    }

    public void setOrderssByHouseId(Collection<OrdersEntity> orderssByHouseId) {
        this.orderssByHouseId = orderssByHouseId;
    }
}
