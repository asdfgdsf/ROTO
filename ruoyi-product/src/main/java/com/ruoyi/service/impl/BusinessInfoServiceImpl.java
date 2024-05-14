package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.BusinessInfoMapper;
import com.ruoyi.domain.BusinessInfo;
import com.ruoyi.service.IBusinessInfoService;

/**
 * 商家信息Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
@Service
public class BusinessInfoServiceImpl implements IBusinessInfoService
{
    @Autowired
    private BusinessInfoMapper businessInfoMapper;

    /**
     * 查询商家信息
     *
     * @param businessId 商家信息主键
     * @return 商家信息
     */
    @Override
    public BusinessInfo selectBusinessInfoByBusinessId(String businessId)
    {
        return businessInfoMapper.selectBusinessInfoByBusinessId(businessId);
    }

    /**
     * 查询商家信息列表
     *
     * @param businessInfo 商家信息
     * @return 商家信息
     */
    @Override
    public List<BusinessInfo> selectBusinessInfoList(BusinessInfo businessInfo)
    {
        return businessInfoMapper.selectBusinessInfoList(businessInfo);
    }

    /**
     * 新增商家信息
     *
     * @param businessInfo 商家信息
     * @return 结果
     */
    @Override
    public int insertBusinessInfo(BusinessInfo businessInfo)
    {
        return businessInfoMapper.insertBusinessInfo(businessInfo);
    }

    /**
     * 修改商家信息
     *
     * @param businessInfo 商家信息
     * @return 结果
     */
    @Override
    public int updateBusinessInfo(BusinessInfo businessInfo)
    {
        return businessInfoMapper.updateBusinessInfo(businessInfo);
    }

    /**
     * 批量删除商家信息
     *
     * @param businessIds 需要删除的商家信息主键
     * @return 结果
     */
    @Override
    public int deleteBusinessInfoByBusinessIds(String[] businessIds)
    {
        return businessInfoMapper.deleteBusinessInfoByBusinessIds(businessIds);
    }

    /**
     * 删除商家信息信息
     *
     * @param businessId 商家信息主键
     * @return 结果
     */
    @Override
    public int deleteBusinessInfoByBusinessId(String businessId)
    {
        return businessInfoMapper.deleteBusinessInfoByBusinessId(businessId);
    }
}
