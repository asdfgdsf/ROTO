package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.LeaseBusiness;

/**
 * 租赁商家Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
public interface ILeaseBusinessService
{
    /**
     * 查询租赁商家
     *
     * @param applicableProduct 租赁商家主键
     * @return 租赁商家
     */
    public LeaseBusiness selectLeaseBusinessByApplicableProduct(String applicableProduct);

    /**
     * 查询租赁商家列表
     *
     * @param leaseBusiness 租赁商家
     * @return 租赁商家集合
     */
    public List<LeaseBusiness> selectLeaseBusinessList(LeaseBusiness leaseBusiness);

    /**
     * 新增租赁商家
     *
     * @param leaseBusiness 租赁商家
     * @return 结果
     */
    public int insertLeaseBusiness(LeaseBusiness leaseBusiness);

    /**
     * 修改租赁商家
     *
     * @param leaseBusiness 租赁商家
     * @return 结果
     */
    public int updateLeaseBusiness(LeaseBusiness leaseBusiness);



    /**
     * 删除租赁商家信息
     *
     * @param applicableProduct 租赁商家主键
     * @return 结果
     */
    public int deleteLeaseBusinessByApplicableProduct(LeaseBusiness leaseBusiness);
}
