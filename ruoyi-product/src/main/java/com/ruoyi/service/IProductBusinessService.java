package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.ProductBusiness;

/**
 * 跟拍产品商家Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-07
 */
public interface IProductBusinessService
{
    /**
     * 查询跟拍产品商家
     *
     * @param applicableProduct 跟拍产品商家主键
     * @return 跟拍产品商家
     */
    public ProductBusiness selectProductBusinessByApplicableProduct(String applicableProduct);

    /**
     * 查询跟拍产品商家列表
     *
     * @param productBusiness 跟拍产品商家
     * @return 跟拍产品商家集合
     */
    public List<ProductBusiness> selectProductBusinessList(ProductBusiness productBusiness);

    /**
     * 新增跟拍产品商家
     *
     * @param productBusiness 跟拍产品商家
     * @return 结果
     */
    public int insertProductBusiness(ProductBusiness productBusiness);

    /**
     * 修改跟拍产品商家
     *
     * @param productBusiness 跟拍产品商家
     * @return 结果
     */
    public int updateProductBusiness(ProductBusiness productBusiness);

    /**
     * 批量删除跟拍产品商家
     *
     * @param applicableProducts 需要删除的跟拍产品商家主键集合
     * @return 结果
     */
    public int deleteProductBusinessByApplicableProducts(ProductBusiness[] productBusinesses);

    /**
     * 删除跟拍产品商家信息
     *
     * @param applicableProduct 跟拍产品商家主键
     * @return 结果
     */
    public int deleteProductBusinessByApplicableProduct(ProductBusiness productBusiness);
}
