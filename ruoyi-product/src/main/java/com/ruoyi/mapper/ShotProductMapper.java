package com.ruoyi.mapper;

import java.util.List;
import com.ruoyi.domain.ShotProduct;
import org.apache.ibatis.annotations.Mapper;

/**
 * 预约跟拍产品Mapper接口
 * 
 * @author jjzhaodi
 * @date 2023-12-01
 */
@Mapper
public interface ShotProductMapper 
{
    /**
     * 查询预约跟拍产品
     * 
     * @param id 预约跟拍产品主键
     * @return 预约跟拍产品
     */
    public ShotProduct selectShotProductById(String id);

    /**
     * 查询预约跟拍产品列表
     * 
     * @param shotProduct 预约跟拍产品
     * @return 预约跟拍产品集合
     */
    public List<ShotProduct> selectShotProductList(ShotProduct shotProduct);

    /**
     * 新增预约跟拍产品
     * 
     * @param shotProduct 预约跟拍产品
     * @return 结果
     */
    public int insertShotProduct(ShotProduct shotProduct);

    /**
     * 修改预约跟拍产品
     * 
     * @param shotProduct 预约跟拍产品
     * @return 结果
     */
    public int updateShotProduct(ShotProduct shotProduct);

    /**
     * 删除预约跟拍产品
     * 
     * @param id 预约跟拍产品主键
     * @return 结果
     */
    public int deleteShotProductById(String id);

    /**
     * 批量删除预约跟拍产品
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShotProductByIds(String[] ids);
}
