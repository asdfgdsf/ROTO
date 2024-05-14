package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.LeaseStyleMapper;
import com.ruoyi.domain.LeaseStyle;
import com.ruoyi.service.ILeaseStyleService;

/**
 * 租赁产品款式Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
@Service
public class LeaseStyleServiceImpl implements ILeaseStyleService
{
    @Autowired
    private LeaseStyleMapper leaseStyleMapper;

    /**
     * 查询租赁产品款式
     *
     * @param styleId 租赁产品款式主键
     * @return 租赁产品款式
     */
    @Override
    public LeaseStyle selectLeaseStyleByStyleId(String styleId)
    {
        return leaseStyleMapper.selectLeaseStyleByStyleId(styleId);
    }

    /**
     * 查询租赁产品款式列表
     *
     * @param leaseStyle 租赁产品款式
     * @return 租赁产品款式
     */
    @Override
    public List<LeaseStyle> selectLeaseStyleList(LeaseStyle leaseStyle)
    {
        return leaseStyleMapper.selectLeaseStyleList(leaseStyle);
    }

    /**
     * 新增租赁产品款式
     *
     * @param leaseStyle 租赁产品款式
     * @return 结果
     */
    @Override
    public int insertLeaseStyle(LeaseStyle leaseStyle)
    {
        return leaseStyleMapper.insertLeaseStyle(leaseStyle);
    }

    /**
     * 修改租赁产品款式
     *
     * @param leaseStyle 租赁产品款式
     * @return 结果
     */
    @Override
    public int updateLeaseStyle(LeaseStyle leaseStyle)
    {
        return leaseStyleMapper.updateLeaseStyle(leaseStyle);
    }

    /**
     * 批量删除租赁产品款式
     *
     * @param styleIds 需要删除的租赁产品款式主键
     * @return 结果
     */
    @Override
    public int deleteLeaseStyleByStyleIds(String[] styleIds)
    {
        return leaseStyleMapper.deleteLeaseStyleByStyleIds(styleIds);
    }

    /**
     * 删除租赁产品款式信息
     *
     * @param styleId 租赁产品款式主键
     * @return 结果
     */
    @Override
    public int deleteLeaseStyleByStyleId(String styleId)
    {
        return leaseStyleMapper.deleteLeaseStyleByStyleId(styleId);
    }
}
