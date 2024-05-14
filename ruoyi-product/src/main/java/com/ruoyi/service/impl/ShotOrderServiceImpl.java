package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.ShotOrderMapper;
import com.ruoyi.domain.ShotOrder;
import com.ruoyi.service.IShotOrderService;

/**
 * 跟拍订单Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
@Service
public class ShotOrderServiceImpl implements IShotOrderService
{
    @Autowired
    private ShotOrderMapper shotOrderMapper;

    /**
     * 查询跟拍订单
     *
     * @param shotOrderId 跟拍订单主键
     * @return 跟拍订单
     */
    @Override
    public ShotOrder selectShotOrderByShotOrderId(String shotOrderId)
    {
        return shotOrderMapper.selectShotOrderByShotOrderId(shotOrderId);
    }

    /**
     * 查询跟拍订单列表
     *
     * @param shotOrder 跟拍订单
     * @return 跟拍订单
     */
    @Override
    public List<ShotOrder> selectShotOrderList(ShotOrder shotOrder)
    {
        return shotOrderMapper.selectShotOrderList(shotOrder);
    }

    /**
     * 新增跟拍订单
     *
     * @param shotOrder 跟拍订单
     * @return 结果
     */
    @Override
    public int insertShotOrder(ShotOrder shotOrder)
    {
        return shotOrderMapper.insertShotOrder(shotOrder);
    }

    /**
     * 修改跟拍订单
     *
     * @param shotOrder 跟拍订单
     * @return 结果
     */
    @Override
    public int updateShotOrder(ShotOrder shotOrder)
    {
        return shotOrderMapper.updateShotOrder(shotOrder);
    }

    /**
     * 批量删除跟拍订单
     *
     * @param shotOrderIds 需要删除的跟拍订单主键
     * @return 结果
     */
    @Override
    public int deleteShotOrderByShotOrderIds(String[] shotOrderIds)
    {
        return shotOrderMapper.deleteShotOrderByShotOrderIds(shotOrderIds);
    }

    /**
     * 删除跟拍订单信息
     *
     * @param shotOrderId 跟拍订单主键
     * @return 结果
     */
    @Override
    public int deleteShotOrderByShotOrderId(String shotOrderId)
    {
        return shotOrderMapper.deleteShotOrderByShotOrderId(shotOrderId);
    }
}
