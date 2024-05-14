package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.LeaseProductMapper;
import com.ruoyi.domain.LeaseProduct;
import com.ruoyi.service.ILeaseProductService;

/**
 * 租赁产品Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
@Service
public class LeaseProductServiceImpl implements ILeaseProductService
{
    @Autowired
    private LeaseProductMapper leaseProductMapper;

    /**
     * 查询租赁产品
     *
     * @param leaseId 租赁产品主键
     * @return 租赁产品
     */
    @Override
    public LeaseProduct selectLeaseProductByLeaseId(String leaseId)
    {
        return leaseProductMapper.selectLeaseProductByLeaseId(leaseId);
    }

    /**
     * 查询租赁产品列表
     *
     * @param leaseProduct 租赁产品
     * @return 租赁产品
     */
    @Override
    public List<LeaseProduct> selectLeaseProductList(LeaseProduct leaseProduct)
    {
        return leaseProductMapper.selectLeaseProductList(leaseProduct);
    }

    /**
     * 新增租赁产品
     *
     * @param leaseProduct 租赁产品
     * @return 结果
     */
    @Override
    public int insertLeaseProduct(LeaseProduct leaseProduct)
    {
        return leaseProductMapper.insertLeaseProduct(leaseProduct);
    }

    /**
     * 修改租赁产品
     *
     * @param leaseProduct 租赁产品
     * @return 结果
     */
    @Override
    public int updateLeaseProduct(LeaseProduct leaseProduct)
    {
        return leaseProductMapper.updateLeaseProduct(leaseProduct);
    }

    /**
     * 批量删除租赁产品
     *
     * @param leaseIds 需要删除的租赁产品主键
     * @return 结果
     */
    @Override
    public int deleteLeaseProductByLeaseIds(String[] leaseIds)
    {
        return leaseProductMapper.deleteLeaseProductByLeaseIds(leaseIds);
    }

    /**
     * 删除租赁产品信息
     *
     * @param leaseId 租赁产品主键
     * @return 结果
     */
    @Override
    public int deleteLeaseProductByLeaseId(String leaseId)
    {
        return leaseProductMapper.deleteLeaseProductByLeaseId(leaseId);
    }
}
