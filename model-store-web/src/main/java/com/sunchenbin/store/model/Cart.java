package com.sunchenbin.store.model;

import com.sunchenbin.store.annotation.Column;
import com.sunchenbin.store.annotation.Table;
import com.sunchenbin.store.constants.MySqlTypeConstant;

import java.util.Date;

@Table(name = "pdf_cart")
public class Cart {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isNull=false,isKey = true,isAutoIncrement=true)
    private Integer userId;

    @Column(name = "user_name",type = MySqlTypeConstant.VARCHAR)
    private String userName;

    @Column(name = "cg_id",type = MySqlTypeConstant.VARCHAR)
    private Integer cgId;

    @Column(name = "collect_count",type = MySqlTypeConstant.INT)
    private Integer collectCount;

    @Column(name = "group_name",type = MySqlTypeConstant.VARCHAR)
    private String groupName;

    @Column(name = "display_order",type = MySqlTypeConstant.INT)
    private Integer displayOrder;

    @Column(name = "ad_collect_id",type = MySqlTypeConstant.INT)
    private Integer adcollectId;

    @Column(name = "cr_time",type = MySqlTypeConstant.DATETIME)
    private Date crtime;

    @Column(name = "push_id",type = MySqlTypeConstant.INT)
    private Integer pushId;

    @Column(name = "name",type = MySqlTypeConstant.BIGINT)
    private Long adid;

    @Column(name = "push_title",type = MySqlTypeConstant.VARCHAR)
    private String pushTitle;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getCgId() {
        return cgId;
    }

    public void setCgId(Integer cgId) {
        this.cgId = cgId;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getAdcollectId() {
        return adcollectId;
    }

    public void setAdcollectId(Integer adcollectId) {
        this.adcollectId = adcollectId;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public Long getAdId() {
        return adid;
    }

    public void setAdId(Long adId) {
        this.adid = adId;
    }

    public String getPushTitle() {
        return pushTitle;
    }

    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle == null ? null : pushTitle.trim();
    }
}