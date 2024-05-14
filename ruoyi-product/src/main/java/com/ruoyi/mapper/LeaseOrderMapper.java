package com.ruoyi.mapper;

import java.util.List;
import com.ruoyi.domain.LeaseOrder;

/**
 * 租赁订单Mapper接口
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
public interface LeaseOrderMapper
{
    /**
     * 查询租赁订单
     *
     * @param leaseOrderId 租赁订单主键
     * @return 租赁订单
     */
    public LeaseOrder selectLeaseOrderByLeaseOrderId(String leaseOrderId);

    /**
     * 查询租赁订单列表
     *
     * @param leaseOrder 租赁订单
     * @return 租赁订单集合
     */
    public List<LeaseOrder> selectLeaseOrderList(LeaseOrder leaseOrder);

    /**
     * 新增租赁订单
     *
     * @param leaseOrder 租赁订单
     * @return 结果
     */
    public int insertLeaseOrder(LeaseOrder leaseOrder);

    /**
     * 修改租赁订单
     *
     * @param leaseOrder 租赁订单
     * @return 结果
     */
    public int updateLeaseOrder(LeaseOrder leaseOrder);

    /**
     * 删除租赁订单
     *
     * @param leaseOrderId 租赁订单主键
     * @return 结果
     */
    public int deleteLeaseOrderByLeaseOrderId(String leaseOrderId);

    /**
     * 批量删除租赁订单
     *
     * @param leaseOrderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLeaseOrderByLeaseOrderIds(String[] leaseOrderIds);
}
