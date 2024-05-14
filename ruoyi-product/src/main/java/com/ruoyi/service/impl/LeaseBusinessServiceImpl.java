package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.LeaseBusinessMapper;
import com.ruoyi.domain.LeaseBusiness;
import com.ruoyi.service.ILeaseBusinessService;

/**
 * 租赁商家Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
@Service
public class LeaseBusinessServiceImpl implements ILeaseBusinessService
{
    @Autowired
    private LeaseBusinessMapper leaseBusinessMapper;

    /**
     * 查询租赁商家
     *
     * @param applicableProduct 租赁商家主键
     * @return 租赁商家
     */
    @Override
    public LeaseBusiness selectLeaseBusinessByApplicableProduct(String applicableProduct)
    {
        return leaseBusinessMapper.selectLeaseBusinessByApplicableProduct(applicableProduct);
    }

    /**
     * 查询租赁商家列表
     *
     * @param leaseBusiness 租赁商家
     * @return 租赁商家
     */
    @Override
    public List<LeaseBusiness> selectLeaseBusinessList(LeaseBusiness leaseBusiness)
    {
        return leaseBusinessMapper.selectLeaseBusinessList(leaseBusiness);
    }

    /**
     * 新增租赁商家
     *
     * @param leaseBusiness 租赁商家
     * @return 结果
     */
    @Override
    public int insertLeaseBusiness(LeaseBusiness leaseBusiness)
    {
        return leaseBusinessMapper.insertLeaseBusiness(leaseBusiness);
    }

    /**
     * 修改租赁商家
     *
     * @param leaseBusiness 租赁商家
     * @return 结果
     */
    @Override
    public int updateLeaseBusiness(LeaseBusiness leaseBusiness)
    {
        return leaseBusinessMapper.updateLeaseBusiness(leaseBusiness);
    }



    /**
     * 删除租赁商家信息
     *
     * @param applicableProduct 租赁商家主键
     * @return 结果
     */
    @Override
    public int deleteLeaseBusinessByApplicableProduct(LeaseBusiness leaseBusiness)
    {
        return leaseBusinessMapper.deleteLeaseBusinessByApplicableProduct(leaseBusiness);
    }
}
