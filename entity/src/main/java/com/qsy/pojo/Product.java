package com.qsy.pojo;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 产品的pojo
 * @user jiangxj
 * @date 12:53
 */
public class Product {
    private String id;

    private String name;

    private BigDecimal thresholdAmount;

    private BigDecimal stepAmount;

    private Short lockTerm;

    private BigDecimal rewardRate;

    private String status;

    private String memo;

    private Date createAt;

    private String createUser;

    private Date updateAt;

    private String updateUser;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", thresholdAmount=" + thresholdAmount +
                ", stepAmount=" + stepAmount +
                ", lockTerm=" + lockTerm +
                ", rewardRate=" + rewardRate +
                ", status='" + status + '\'' +
                ", memo='" + memo + '\'' +
                ", createAt=" + createAt +
                ", createUser='" + createUser + '\'' +
                ", updateAt=" + updateAt +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }

    public Product(String id, String name, BigDecimal thresholdAmount, BigDecimal stepAmount, Short lockTerm, BigDecimal rewardRate, String status, String memo, Date createAt, String createUser, Date updateAt, String updateUser) {
        this.id = id;
        this.name = name;
        this.thresholdAmount = thresholdAmount;
        this.stepAmount = stepAmount;
        this.lockTerm = lockTerm;
        this.rewardRate = rewardRate;
        this.status = status;
        this.memo = memo;
        this.createAt = createAt;
        this.createUser = createUser;
        this.updateAt = updateAt;
        this.updateUser = updateUser;
    }

    public Product() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public BigDecimal getStepAmount() {
        return stepAmount;
    }

    public void setStepAmount(BigDecimal stepAmount) {
        this.stepAmount = stepAmount;
    }

    public Short getLockTerm() {
        return lockTerm;
    }

    public void setLockTerm(Short lockTerm) {
        this.lockTerm = lockTerm;
    }

    public BigDecimal getRewardRate() {
        return rewardRate;
    }

    public void setRewardRate(BigDecimal rewardRate) {
        this.rewardRate = rewardRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}