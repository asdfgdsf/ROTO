package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.ShotProductMapper;
import com.ruoyi.domain.ShotProduct;
import com.ruoyi.service.IShotProductService;

/**
 * 预约跟拍产品Service业务层处理
 * 
 * @author jjzhaodi
 * @date 2023-12-01
 */
@Service
public class ShotProductServiceImpl implements IShotProductService 
{
    @Autowired
    private ShotProductMapper shotProductMapper;

    /**
     * 查询预约跟拍产品
     * 
     * @param id 预约跟拍产品主键
     * @return 预约跟拍产品
     */
    @Override
    public ShotProduct selectShotProductById(String id)
    {
        return shotProductMapper.selectShotProductById(id);
    }

    /**
     * 查询预约跟拍产品列表
     * 
     * @param shotProduct 预约跟拍产品
     * @return 预约跟拍产品
     */
    @Override
    public List<ShotProduct> selectShotProductList(ShotProduct shotProduct)
    {
        return shotProductMapper.selectShotProductList(shotProduct);
    }

    /**
     * 新增预约跟拍产品
     * 
     * @param shotProduct 预约跟拍产品
     * @return 结果
     */
    @Override
    public int insertShotProduct(ShotProduct shotProduct)
    {
        return shotProductMapper.insertShotProduct(shotProduct);
    }

    /**
     * 修改预约跟拍产品
     * 
     * @param shotProduct 预约跟拍产品
     * @return 结果
     */
    @Override
    public int updateShotProduct(ShotProduct shotProduct)
    {
        return shotProductMapper.updateShotProduct(shotProduct);
    }

    /**
     * 批量删除预约跟拍产品
     * 
     * @param ids 需要删除的预约跟拍产品主键
     * @return 结果
     */
    @Override
    public int deleteShotProductByIds(String[] ids)
    {
        return shotProductMapper.deleteShotProductByIds(ids);
    }

    /**
     * 删除预约跟拍产品信息
     * 
     * @param id 预约跟拍产品主键
     * @return 结果
     */
    @Override
    public int deleteShotProductById(String id)
    {
        return shotProductMapper.deleteShotProductById(id);
    }
}
