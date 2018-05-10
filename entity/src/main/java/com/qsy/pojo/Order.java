package com.qsy.pojo;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 订单的pojo
 * @user jiangxj
 * @date 12:59
 */
public class Order {
    private String orderId;

    private String chanId;

    private String productId;

    private String chanUserId;

    private String orderType;

    private String orderStatus;

    private String outerOrderId;

    private BigDecimal amount;

    private String memo;

    private Date createAt;

    private Date updateAt;

    public Order(String orderId, String chanId, String productId, String chanUserId, String orderType, String orderStatus, String outerOrderId, BigDecimal amount, String memo, Date createAt, Date updateAt) {
        this.orderId = orderId;
        this.chanId = chanId;
        this.productId = productId;
        this.chanUserId = chanUserId;
        this.orderType = orderType;
        this.orderStatus = orderStatus;
        this.outerOrderId = outerOrderId;
        this.amount = amount;
        this.memo = memo;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Order() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getChanId() {
        return chanId;
    }

    public void setChanId(String chanId) {
        this.chanId = chanId == null ? null : chanId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getChanUserId() {
        return chanUserId;
    }

    public void setChanUserId(String chanUserId) {
        this.chanUserId = chanUserId == null ? null : chanUserId.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOuterOrderId() {
        return outerOrderId;
    }

    public void setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId == null ? null : outerOrderId.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", chanId='" + chanId + '\'' +
                ", productId='" + productId + '\'' +
                ", chanUserId='" + chanUserId + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", outerOrderId='" + outerOrderId + '\'' +
                ", amount=" + amount +
                ", memo='" + memo + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}