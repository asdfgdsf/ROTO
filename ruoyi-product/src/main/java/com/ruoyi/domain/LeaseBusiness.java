package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 租赁商家对象 lease_business
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
public class LeaseBusiness extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 创建人 */
    private String createdBy;

    /** 创建时间 */
    private Date createdTime;

    /** 更新人 */
    private String updatedBy;

    /** 更新时间 */
    private Date updatedTime;

    /** 逻辑删除标识(0-未删除,1-已删除) */
    private Integer isdeleted;

    /** 适用产品id */
    @Excel(name = "适用产品id")
    private String applicableProduct;

    /** 已开设的该商品的商家id */
    @Excel(name = "已开设的该商品的商家id")
    private String businessId;

    /** 租赁产品名称 */
    @Excel(name = "租赁产品名称")
    private String leaseName;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String shopName;

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime()
    {
        return updatedTime;
    }
    public void setIsdeleted(Integer isdeleted)
    {
        this.isdeleted = isdeleted;
    }

    public Integer getIsdeleted()
    {
        return isdeleted;
    }
    public void setApplicableProduct(String applicableProduct)
    {
        this.applicableProduct = applicableProduct;
    }

    public String getApplicableProduct()
    {
        return applicableProduct;
    }
    public void setBusinessId(String businessId)
    {
        this.businessId = businessId;
    }

    public String getBusinessId()
    {
        return businessId;
    }
    public void setLeaseName(String leaseName)
    {
        this.leaseName = leaseName;
    }

    public String getLeaseName()
    {
        return leaseName;
    }
    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public String getShopName()
    {
        return shopName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("createdBy", getCreatedBy())
                .append("createdTime", getCreatedTime())
                .append("updatedBy", getUpdatedBy())
                .append("updatedTime", getUpdatedTime())
                .append("isdeleted", getIsdeleted())
                .append("applicableProduct", getApplicableProduct())
                .append("businessId", getBusinessId())
                .append("leaseName", getLeaseName())
                .append("shopName", getShopName())
                .toString();
    }
}
