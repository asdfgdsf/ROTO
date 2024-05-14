package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.LeaseGoodsMapper;
import com.ruoyi.domain.LeaseGoods;
import com.ruoyi.service.ILeaseGoodsService;

/**
 * 租赁产品Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
@Service
public class LeaseGoodsServiceImpl implements ILeaseGoodsService
{
    @Autowired
    private LeaseGoodsMapper leaseGoodsMapper;

    /**
     * 查询租赁产品
     *
     * @param leaseId 租赁产品主键
     * @return 租赁产品
     */
    @Override
    public LeaseGoods selectLeaseGoodsByLeaseId(String leaseId)
    {
        return leaseGoodsMapper.selectLeaseGoodsByLeaseId(leaseId);
    }

    /**
     * 查询租赁产品列表
     *
     * @param leaseGoods 租赁产品
     * @return 租赁产品
     */
    @Override
    public List<LeaseGoods> selectLeaseGoodsList(LeaseGoods leaseGoods)
    {
        return leaseGoodsMapper.selectLeaseGoodsList(leaseGoods);
    }

    /**
     * 新增租赁产品
     *
     * @param leaseGoods 租赁产品
     * @return 结果
     */
    @Override
    public int insertLeaseGoods(LeaseGoods leaseGoods)
    {
        return leaseGoodsMapper.insertLeaseGoods(leaseGoods);
    }

    /**
     * 修改租赁产品
     *
     * @param leaseGoods 租赁产品
     * @return 结果
     */
    @Override
    public int updateLeaseGoods(LeaseGoods leaseGoods)
    {
        return leaseGoodsMapper.updateLeaseGoods(leaseGoods);
    }

    /**
     * 批量删除租赁产品
     *
     * @param leaseIds 需要删除的租赁产品主键
     * @return 结果
     */
    @Override
    public int deleteLeaseGoodsByLeaseIds(String[] leaseIds)
    {
        return leaseGoodsMapper.deleteLeaseGoodsByLeaseIds(leaseIds);
    }

    /**
     * 删除租赁产品信息
     *
     * @param leaseId 租赁产品主键
     * @return 结果
     */
    @Override
    public int deleteLeaseGoodsByLeaseId(String leaseId)
    {
        return leaseGoodsMapper.deleteLeaseGoodsByLeaseId(leaseId);
    }
}
