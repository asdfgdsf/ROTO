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
import com.ruoyi.domain.LeaseProduct;
import com.ruoyi.service.ILeaseProductService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 租赁产品Controller
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
@RestController
@RequestMapping("/system/leaseProduct")
public class LeaseProductController extends BaseController
{
    @Autowired
    private ILeaseProductService leaseProductService;

    /**
     * 查询租赁产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseProduct:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaseProduct leaseProduct)
    {
        startPage();
        List<LeaseProduct> list = leaseProductService.selectLeaseProductList(leaseProduct);
        return getDataTable(list);
    }

    /**
     * 导出租赁产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseProduct:export')")
    @Log(title = "租赁产品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaseProduct leaseProduct)
    {
        List<LeaseProduct> list = leaseProductService.selectLeaseProductList(leaseProduct);
        ExcelUtil<LeaseProduct> util = new ExcelUtil<LeaseProduct>(LeaseProduct.class);
        util.exportExcel(response, list, "租赁产品数据");
    }

    /**
     * 获取租赁产品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:leaseProduct:query')")
    @GetMapping(value = "/{leaseId}")
    public AjaxResult getInfo(@PathVariable("leaseId") String leaseId)
    {
        return success(leaseProductService.selectLeaseProductByLeaseId(leaseId));
    }

    /**
     * 新增租赁产品
     */
    @PreAuthorize("@ss.hasPermi('system:leaseProduct:add')")
    @Log(title = "租赁产品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaseProduct leaseProduct)
    {
        return toAjax(leaseProductService.insertLeaseProduct(leaseProduct));
    }

    /**
     * 修改租赁产品
     */
    @PreAuthorize("@ss.hasPermi('system:leaseProduct:edit')")
    @Log(title = "租赁产品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaseProduct leaseProduct)
    {
        return toAjax(leaseProductService.updateLeaseProduct(leaseProduct));
    }

    /**
     * 删除租赁产品
     */
    @PreAuthorize("@ss.hasPermi('system:leaseProduct:remove')")
    @Log(title = "租赁产品", businessType = BusinessType.DELETE)
    @DeleteMapping("/{leaseIds}")
    public AjaxResult remove(@PathVariable String[] leaseIds)
    {
        return toAjax(leaseProductService.deleteLeaseProductByLeaseIds(leaseIds));
    }
}
