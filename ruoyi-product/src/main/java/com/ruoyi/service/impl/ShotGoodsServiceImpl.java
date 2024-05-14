package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.ShotGoodsMapper;
import com.ruoyi.domain.ShotGoods;
import com.ruoyi.service.IShotGoodsService;

/**
 * 预约跟拍商品Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
@Service
public class ShotGoodsServiceImpl implements IShotGoodsService
{
    @Autowired
    private ShotGoodsMapper shotGoodsMapper;

    /**
     * 查询预约跟拍商品
     *
     * @param shotId 预约跟拍商品主键
     * @return 预约跟拍商品
     */
    @Override
    public ShotGoods selectShotGoodsByShotId(String shotId)
    {
        return shotGoodsMapper.selectShotGoodsByShotId(shotId);
    }

    /**
     * 查询预约跟拍商品列表
     *
     * @param shotGoods 预约跟拍商品
     * @return 预约跟拍商品
     */
    @Override
    public List<ShotGoods> selectShotGoodsList(ShotGoods shotGoods)
    {
        return shotGoodsMapper.selectShotGoodsList(shotGoods);
    }

    /**
     * 新增预约跟拍商品
     *
     * @param shotGoods 预约跟拍商品
     * @return 结果
     */
    @Override
    public int insertShotGoods(ShotGoods shotGoods)
    {
        return shotGoodsMapper.insertShotGoods(shotGoods);
    }

    /**
     * 修改预约跟拍商品
     *
     * @param shotGoods 预约跟拍商品
     * @return 结果
     */
    @Override
    public int updateShotGoods(ShotGoods shotGoods)
    {
        return shotGoodsMapper.updateShotGoods(shotGoods);
    }

    /**
     * 批量删除预约跟拍商品
     *
     * @param shotIds 需要删除的预约跟拍商品主键
     * @return 结果
     */
    @Override
    public int deleteShotGoodsByShotIds(String[] shotIds)
    {
        return shotGoodsMapper.deleteShotGoodsByShotIds(shotIds);
    }

    /**
     * 删除预约跟拍商品信息
     *
     * @param shotId 预约跟拍商品主键
     * @return 结果
     */
    @Override
    public int deleteShotGoodsByShotId(String shotId)
    {
        return shotGoodsMapper.deleteShotGoodsByShotId(shotId);
    }
}
