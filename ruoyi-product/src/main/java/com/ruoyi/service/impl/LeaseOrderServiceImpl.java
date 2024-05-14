package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.LeaseOrderMapper;
import com.ruoyi.domain.LeaseOrder;
import com.ruoyi.service.ILeaseOrderService;

/**
 * 租赁订单Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
@Service
public class LeaseOrderServiceImpl implements ILeaseOrderService
{
    @Autowired
    private LeaseOrderMapper leaseOrderMapper;

    /**
     * 查询租赁订单
     *
     * @param leaseOrderId 租赁订单主键
     * @return 租赁订单
     */
    @Override
    public LeaseOrder selectLeaseOrderByLeaseOrderId(String leaseOrderId)
    {
        return leaseOrderMapper.selectLeaseOrderByLeaseOrderId(leaseOrderId);
    }

    /**
     * 查询租赁订单列表
     *
     * @param leaseOrder 租赁订单
     * @return 租赁订单
     */
    @Override
    public List<LeaseOrder> selectLeaseOrderList(LeaseOrder leaseOrder)
    {
        return leaseOrderMapper.selectLeaseOrderList(leaseOrder);
    }

    /**
     * 新增租赁订单
     *
     * @param leaseOrder 租赁订单
     * @return 结果
     */
    @Override
    public int insertLeaseOrder(LeaseOrder leaseOrder)
    {
        return leaseOrderMapper.insertLeaseOrder(leaseOrder);
    }

    /**
     * 修改租赁订单
     *
     * @param leaseOrder 租赁订单
     * @return 结果
     */
    @Override
    public int updateLeaseOrder(LeaseOrder leaseOrder)
    {
        return leaseOrderMapper.updateLeaseOrder(leaseOrder);
    }

    /**
     * 批量删除租赁订单
     *
     * @param leaseOrderIds 需要删除的租赁订单主键
     * @return 结果
     */
    @Override
    public int deleteLeaseOrderByLeaseOrderIds(String[] leaseOrderIds)
    {
        return leaseOrderMapper.deleteLeaseOrderByLeaseOrderIds(leaseOrderIds);
    }

    /**
     * 删除租赁订单信息
     *
     * @param leaseOrderId 租赁订单主键
     * @return 结果
     */
    @Override
    public int deleteLeaseOrderByLeaseOrderId(String leaseOrderId)
    {
        return leaseOrderMapper.deleteLeaseOrderByLeaseOrderId(leaseOrderId);
    }
}
