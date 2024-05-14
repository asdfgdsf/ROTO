package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商家信息对象 business_info
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
public class BusinessInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商家id */
    @Excel(name = "商家id")
    private String businessId;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String shopName;

    /** 用户名 */
    @Excel(name = "用户名")
    private String businessName;

    /** 法人身份证 */
    @Excel(name = "法人身份证")
    private String legalNum;

    /** 营业执照编号 */
    @Excel(name = "营业执照编号")
    private String license;

    /** 店铺联系方式 */
    @Excel(name = "店铺联系方式")
    private String businessPhone;

    /** 店铺地址 */
    @Excel(name = "店铺地址")
    private String businessAddress;

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

    /** 店铺图id */
    private String relationId;

    /** 审批状态(0-未审批,1-已审批) */
    private Integer approveStatus;

    /** 审批时间 */
    private Date approveTime;

    public void setBusinessId(String businessId)
    {
        this.businessId = businessId;
    }

    public String getBusinessId()
    {
        return businessId;
    }
    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public String getShopName()
    {
        return shopName;
    }
    public void setBusinessName(String businessName)
    {
        this.businessName = businessName;
    }

    public String getBusinessName()
    {
        return businessName;
    }
    public void setLegalNum(String legalNum)
    {
        this.legalNum = legalNum;
    }

    public String getLegalNum()
    {
        return legalNum;
    }
    public void setLicense(String license)
    {
        this.license = license;
    }

    public String getLicense()
    {
        return license;
    }
    public void setBusinessPhone(String businessPhone)
    {
        this.businessPhone = businessPhone;
    }

    public String getBusinessPhone()
    {
        return businessPhone;
    }
    public void setBusinessAddress(String businessAddress)
    {
        this.businessAddress = businessAddress;
    }

    public String getBusinessAddress()
    {
        return businessAddress;
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
    public void setRelationId(String relationId)
    {
        this.relationId = relationId;
    }

    public String getRelationId()
    {
        return relationId;
    }
    public void setApproveStatus(Integer approveStatus)
    {
        this.approveStatus = approveStatus;
    }

    public Integer getApproveStatus()
    {
        return approveStatus;
    }
    public void setApproveTime(Date approveTime)
    {
        this.approveTime = approveTime;
    }

    public Date getApproveTime()
    {
        return approveTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("businessId", getBusinessId())
                .append("shopName", getShopName())
                .append("businessName", getBusinessName())
                .append("legalNum", getLegalNum())
                .append("license", getLicense())
                .append("businessPhone", getBusinessPhone())
                .append("businessAddress", getBusinessAddress())
                .append("createdBy", getCreatedBy())
                .append("createdTime", getCreatedTime())
                .append("updatedBy", getUpdatedBy())
                .append("updatedTime", getUpdatedTime())
                .append("isdeleted", getIsdeleted())
                .append("relationId", getRelationId())
                .append("approveStatus", getApproveStatus())
                .append("approveTime", getApproveTime())
                .toString();
    }
}
