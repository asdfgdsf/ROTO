package com.ruoyi.mapper;

import java.util.List;
import com.ruoyi.domain.ShotOrder;

/**
 * 跟拍订单Mapper接口
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
public interface ShotOrderMapper
{
    /**
     * 查询跟拍订单
     *
     * @param shotOrderId 跟拍订单主键
     * @return 跟拍订单
     */
    public ShotOrder selectShotOrderByShotOrderId(String shotOrderId);

    /**
     * 查询跟拍订单列表
     *
     * @param shotOrder 跟拍订单
     * @return 跟拍订单集合
     */
    public List<ShotOrder> selectShotOrderList(ShotOrder shotOrder);

    /**
     * 新增跟拍订单
     *
     * @param shotOrder 跟拍订单
     * @return 结果
     */
    public int insertShotOrder(ShotOrder shotOrder);

    /**
     * 修改跟拍订单
     *
     * @param shotOrder 跟拍订单
     * @return 结果
     */
    public int updateShotOrder(ShotOrder shotOrder);

    /**
     * 删除跟拍订单
     *
     * @param shotOrderId 跟拍订单主键
     * @return 结果
     */
    public int deleteShotOrderByShotOrderId(String shotOrderId);

    /**
     * 批量删除跟拍订单
     *
     * @param shotOrderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShotOrderByShotOrderIds(String[] shotOrderIds);
}
