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
import com.ruoyi.domain.ShotProduct;
import com.ruoyi.service.IShotProductService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预约跟拍产品Controller
 * 
 * @author jjzhaodi
 * @date 2023-12-01
 */
@RestController
@RequestMapping("/ruoyi-product/product")
public class ShotProductController extends BaseController
{
    @Autowired
    private IShotProductService shotProductService;

    /**
     * 查询预约跟拍产品列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-product:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShotProduct shotProduct)
    {
        startPage();
        List<ShotProduct> list = shotProductService.selectShotProductList(shotProduct);
        return getDataTable(list);
    }

    /**
     * 导出预约跟拍产品列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-product:product:export')")
    @Log(title = "预约跟拍产品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShotProduct shotProduct)
    {
        List<ShotProduct> list = shotProductService.selectShotProductList(shotProduct);
        ExcelUtil<ShotProduct> util = new ExcelUtil<ShotProduct>(ShotProduct.class);
        util.exportExcel(response, list, "预约跟拍产品数据");
    }

    /**
     * 获取预约跟拍产品详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-product:product:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(shotProductService.selectShotProductById(id));
    }

    /**
     * 新增预约跟拍产品
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-product:product:add')")
    @Log(title = "预约跟拍产品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShotProduct shotProduct)
    {
        return toAjax(shotProductService.insertShotProduct(shotProduct));
    }

    /**
     * 修改预约跟拍产品
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-product:product:edit')")
    @Log(title = "预约跟拍产品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShotProduct shotProduct)
    {
        return toAjax(shotProductService.updateShotProduct(shotProduct));
    }

    /**
     * 删除预约跟拍产品
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-product:product:remove')")
    @Log(title = "预约跟拍产品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(shotProductService.deleteShotProductByIds(ids));
    }
}
