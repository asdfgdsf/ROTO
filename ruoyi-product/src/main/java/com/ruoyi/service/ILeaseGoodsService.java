package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.LeaseGoods;

/**
 * 租赁产品Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
public interface ILeaseGoodsService
{
    /**
     * 查询租赁产品
     *
     * @param leaseId 租赁产品主键
     * @return 租赁产品
     */
    public LeaseGoods selectLeaseGoodsByLeaseId(String leaseId);

    /**
     * 查询租赁产品列表
     *
     * @param leaseGoods 租赁产品
     * @return 租赁产品集合
     */
    public List<LeaseGoods> selectLeaseGoodsList(LeaseGoods leaseGoods);

    /**
     * 新增租赁产品
     *
     * @param leaseGoods 租赁产品
     * @return 结果
     */
    public int insertLeaseGoods(LeaseGoods leaseGoods);

    /**
     * 修改租赁产品
     *
     * @param leaseGoods 租赁产品
     * @return 结果
     */
    public int updateLeaseGoods(LeaseGoods leaseGoods);

    /**
     * 批量删除租赁产品
     *
     * @param leaseIds 需要删除的租赁产品主键集合
     * @return 结果
     */
    public int deleteLeaseGoodsByLeaseIds(String[] leaseIds);

    /**
     * 删除租赁产品信息
     *
     * @param leaseId 租赁产品主键
     * @return 结果
     */
    public int deleteLeaseGoodsByLeaseId(String leaseId);
}
