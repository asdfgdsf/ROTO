package com.ruoyi.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.domain.ProductBusiness;
import com.ruoyi.service.IProductBusinessService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 跟拍产品商家Controller
 *
 * @author jjzhaodi
 * @date 2024-03-07
 */
@RestController
@RequestMapping("/system/business")
public class ProductBusinessController extends BaseController
{
    @Autowired
    private IProductBusinessService productBusinessService;

    /**
     * 查询跟拍产品商家列表
     */
    @PreAuthorize("@ss.hasPermi('system:business:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProductBusiness productBusiness)
    {
        startPage();
        List<ProductBusiness> list = productBusinessService.selectProductBusinessList(productBusiness);
        return getDataTable(list);
    }

    /**
     * 导出跟拍产品商家列表
     */
    @PreAuthorize("@ss.hasPermi('system:business:export')")
    @Log(title = "跟拍产品商家", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProductBusiness productBusiness)
    {
        List<ProductBusiness> list = productBusinessService.selectProductBusinessList(productBusiness);
        ExcelUtil<ProductBusiness> util = new ExcelUtil<ProductBusiness>(ProductBusiness.class);
        util.exportExcel(response, list, "跟拍产品商家数据");
    }

    /**
     * 获取跟拍产品商家详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:business:query')")
    @GetMapping(value = "/{applicableProduct}")
    public AjaxResult getInfo(@PathVariable("applicableProduct") String applicableProduct)
    {
        return success(productBusinessService.selectProductBusinessByApplicableProduct(applicableProduct));
    }

    /**
     * 新增跟拍产品商家
     */
    @PreAuthorize("@ss.hasPermi('system:business:add')")
    @Log(title = "跟拍产品商家", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProductBusiness productBusiness)
    {
        return toAjax(productBusinessService.insertProductBusiness(productBusiness));
    }

    /**
     * 修改跟拍产品商家
     */
    @PreAuthorize("@ss.hasPermi('system:business:edit')")
    @Log(title = "跟拍产品商家", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProductBusiness productBusiness)
    {
        return toAjax(productBusinessService.updateProductBusiness(productBusiness));
    }

    /**
     * 删除跟拍产品商家
     */
    @PreAuthorize("@ss.hasPermi('system:business:remove')")
    @Log(title = "跟拍产品商家", businessType = BusinessType.DELETE)
    @PostMapping("/delete")
    public AjaxResult remove(@RequestBody ProductBusiness[] productBusinesses)
    {
        return toAjax(productBusinessService.deleteProductBusinessByApplicableProducts(productBusinesses));
    }
}
