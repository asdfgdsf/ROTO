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
import com.ruoyi.domain.LeaseBusiness;
import com.ruoyi.service.ILeaseBusinessService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 租赁商家Controller
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
@RestController
@RequestMapping("/system/leaseBusiness")
public class LeaseBusinessController extends BaseController
{
    @Autowired
    private ILeaseBusinessService leaseBusinessService;

    /**
     * 查询租赁商家列表
     */
    @PreAuthorize("@ss.hasPermi('system:business:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaseBusiness leaseBusiness)
    {
        startPage();
        List<LeaseBusiness> list = leaseBusinessService.selectLeaseBusinessList(leaseBusiness);
        return getDataTable(list);
    }

    /**
     * 导出租赁商家列表
     */
    @PreAuthorize("@ss.hasPermi('system:business:export')")
    @Log(title = "租赁商家", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaseBusiness leaseBusiness)
    {
        List<LeaseBusiness> list = leaseBusinessService.selectLeaseBusinessList(leaseBusiness);
        ExcelUtil<LeaseBusiness> util = new ExcelUtil<LeaseBusiness>(LeaseBusiness.class);
        util.exportExcel(response, list, "租赁商家数据");
    }

    /**
     * 获取租赁商家详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:business:query')")
    @GetMapping(value = "/{applicableProduct}")
    public AjaxResult getInfo(@PathVariable("applicableProduct") String applicableProduct)
    {
        return success(leaseBusinessService.selectLeaseBusinessByApplicableProduct(applicableProduct));
    }

    /**
     * 新增租赁商家
     */
    @PreAuthorize("@ss.hasPermi('system:business:add')")
    @Log(title = "租赁商家", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaseBusiness leaseBusiness)
    {
        return toAjax(leaseBusinessService.insertLeaseBusiness(leaseBusiness));
    }

    /**
     * 修改租赁商家
     */
    @PreAuthorize("@ss.hasPermi('system:business:edit')")
    @Log(title = "租赁商家", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaseBusiness leaseBusiness)
    {
        return toAjax(leaseBusinessService.updateLeaseBusiness(leaseBusiness));
    }

    /**
     * 删除租赁商家
     */
    @PreAuthorize("@ss.hasPermi('system:business:remove')")
    @Log(title = "租赁商家", businessType = BusinessType.DELETE)
    @PostMapping("/delete")
    public AjaxResult remove(@RequestBody LeaseBusiness leaseBusiness)
    {
        return toAjax(leaseBusinessService.deleteLeaseBusinessByApplicableProduct(leaseBusiness));
    }
}
