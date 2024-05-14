package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.BusinessInfo;

/**
 * 商家信息Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
public interface IBusinessInfoService
{
    /**
     * 查询商家信息
     *
     * @param businessId 商家信息主键
     * @return 商家信息
     */
    public BusinessInfo selectBusinessInfoByBusinessId(String businessId);

    /**
     * 查询商家信息列表
     *
     * @param businessInfo 商家信息
     * @return 商家信息集合
     */
    public List<BusinessInfo> selectBusinessInfoList(BusinessInfo businessInfo);

    /**
     * 新增商家信息
     *
     * @param businessInfo 商家信息
     * @return 结果
     */
    public int insertBusinessInfo(BusinessInfo businessInfo);

    /**
     * 修改商家信息
     *
     * @param businessInfo 商家信息
     * @return 结果
     */
    public int updateBusinessInfo(BusinessInfo businessInfo);

    /**
     * 批量删除商家信息
     *
     * @param businessIds 需要删除的商家信息主键集合
     * @return 结果
     */
    public int deleteBusinessInfoByBusinessIds(String[] businessIds);

    /**
     * 删除商家信息信息
     *
     * @param businessId 商家信息主键
     * @return 结果
     */
    public int deleteBusinessInfoByBusinessId(String businessId);
}
