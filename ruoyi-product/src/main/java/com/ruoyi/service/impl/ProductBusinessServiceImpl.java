package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.ProductBusinessMapper;
import com.ruoyi.domain.ProductBusiness;
import com.ruoyi.service.IProductBusinessService;

/**
 * 跟拍产品商家Service业务层处理
 *
 * @author jjzhaodi
 * @date 2024-03-07
 */
@Service
public class ProductBusinessServiceImpl implements IProductBusinessService
{
    @Autowired
    private ProductBusinessMapper productBusinessMapper;

    /**
     * 查询跟拍产品商家
     *
     * @param applicableProduct 跟拍产品商家主键
     * @return 跟拍产品商家
     */
    @Override
    public ProductBusiness selectProductBusinessByApplicableProduct(String applicableProduct)
    {
        return productBusinessMapper.selectProductBusinessByApplicableProduct(applicableProduct);
    }

    /**
     * 查询跟拍产品商家列表
     *
     * @param productBusiness 跟拍产品商家
     * @return 跟拍产品商家
     */
    @Override
    public List<ProductBusiness> selectProductBusinessList(ProductBusiness productBusiness)
    {
        return productBusinessMapper.selectProductBusinessList(productBusiness);
    }

    /**
     * 新增跟拍产品商家
     *
     * @param productBusiness 跟拍产品商家
     * @return 结果
     */
    @Override
    public int insertProductBusiness(ProductBusiness productBusiness)
    {
        return productBusinessMapper.insertProductBusiness(productBusiness);
    }

    /**
     * 修改跟拍产品商家
     *
     * @param productBusiness 跟拍产品商家
     * @return 结果
     */
    @Override
    public int updateProductBusiness(ProductBusiness productBusiness)
    {
        return productBusinessMapper.updateProductBusiness(productBusiness);
    }

    /**
     * 批量删除跟拍产品商家
     *
     * @param applicableProducts 需要删除的跟拍产品商家主键
     * @return 结果
     */
    @Override
    public int deleteProductBusinessByApplicableProducts(ProductBusiness[] productBusinesses)
    {
        return productBusinessMapper.deleteProductBusinessByApplicableProducts(productBusinesses);
    }

    /**
     * 删除跟拍产品商家信息
     *
     * @param applicableProduct 跟拍产品商家主键
     * @return 结果
     */
    @Override
    public int deleteProductBusinessByApplicableProduct(ProductBusiness productBusiness)
    {
        return productBusinessMapper.deleteProductBusinessByApplicableProduct(productBusiness);
    }
}
