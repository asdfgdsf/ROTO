package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.ShotGoods;

/**
 * 预约跟拍商品Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
public interface IShotGoodsService
{
    /**
     * 查询预约跟拍商品
     *
     * @param shotId 预约跟拍商品主键
     * @return 预约跟拍商品
     */
    public ShotGoods selectShotGoodsByShotId(String shotId);

    /**
     * 查询预约跟拍商品列表
     *
     * @param shotGoods 预约跟拍商品
     * @return 预约跟拍商品集合
     */
    public List<ShotGoods> selectShotGoodsList(ShotGoods shotGoods);

    /**
     * 新增预约跟拍商品
     *
     * @param shotGoods 预约跟拍商品
     * @return 结果
     */
    public int insertShotGoods(ShotGoods shotGoods);

    /**
     * 修改预约跟拍商品
     *
     * @param shotGoods 预约跟拍商品
     * @return 结果
     */
    public int updateShotGoods(ShotGoods shotGoods);

    /**
     * 批量删除预约跟拍商品
     *
     * @param shotIds 需要删除的预约跟拍商品主键集合
     * @return 结果
     */
    public int deleteShotGoodsByShotIds(String[] shotIds);

    /**
     * 删除预约跟拍商品信息
     *
     * @param shotId 预约跟拍商品主键
     * @return 结果
     */
    public int deleteShotGoodsByShotId(String shotId);
}
