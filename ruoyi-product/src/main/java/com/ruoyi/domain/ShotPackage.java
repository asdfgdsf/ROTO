package com.ruoyi.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 跟拍套餐对象 shot_package
 * 
 * @author jjzhaodi
 * @date 2023-12-14
 */
public class ShotPackage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 套餐id */
    private String packageId;

    /** 套餐名称 */
    @Excel(name = "套餐名称")
    private String packageName;

    /** 套餐价格 */
    @Excel(name = "套餐价格")
    private BigDecimal packagePrice;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    /** 逻辑删除标识(0-未删除,1-已删除) */
    @Excel(name = "逻辑删除标识(0-未删除,1-已删除)")
    private Integer isdeleted;

    /** 适用产品id */
    @Excel(name = "适用产品id")
    private String applicableProduct;

    public void setPackageId(String packageId) 
    {
        this.packageId = packageId;
    }

    public String getPackageId() 
    {
        return packageId;
    }
    public void setPackageName(String packageName) 
    {
        this.packageName = packageName;
    }

    public String getPackageName() 
    {
        return packageName;
    }
    public void setPackagePrice(BigDecimal packagePrice) 
    {
        this.packagePrice = packagePrice;
    }

    public BigDecimal getPackagePrice() 
    {
        return packagePrice;
    }
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("packageId", getPackageId())
            .append("packageName", getPackageName())
            .append("packagePrice", getPackagePrice())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .append("isdeleted", getIsdeleted())
            .append("applicableProduct", getApplicableProduct())
            .toString();
    }
}
