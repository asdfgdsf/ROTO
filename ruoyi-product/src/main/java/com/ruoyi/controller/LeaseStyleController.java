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
import com.ruoyi.domain.LeaseStyle;
import com.ruoyi.service.ILeaseStyleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 租赁产品款式Controller
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
@RestController
@RequestMapping("/system/leaseStyle")
public class LeaseStyleController extends BaseController
{
    @Autowired
    private ILeaseStyleService leaseStyleService;

    /**
     * 查询租赁产品款式列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseStyle:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaseStyle leaseStyle)
    {
        startPage();
        List<LeaseStyle> list = leaseStyleService.selectLeaseStyleList(leaseStyle);
        return getDataTable(list);
    }

    /**
     * 导出租赁产品款式列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseStyle:export')")
    @Log(title = "租赁产品款式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaseStyle leaseStyle)
    {
        List<LeaseStyle> list = leaseStyleService.selectLeaseStyleList(leaseStyle);
        ExcelUtil<LeaseStyle> util = new ExcelUtil<LeaseStyle>(LeaseStyle.class);
        util.exportExcel(response, list, "租赁产品款式数据");
    }

    /**
     * 获取租赁产品款式详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:leaseStyle:query')")
    @GetMapping(value = "/{styleId}")
    public AjaxResult getInfo(@PathVariable("styleId") String styleId)
    {
        return success(leaseStyleService.selectLeaseStyleByStyleId(styleId));
    }

    /**
     * 新增租赁产品款式
     */
    @PreAuthorize("@ss.hasPermi('system:leaseStyle:add')")
    @Log(title = "租赁产品款式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaseStyle leaseStyle)
    {
        return toAjax(leaseStyleService.insertLeaseStyle(leaseStyle));
    }

    /**
     * 修改租赁产品款式
     */
    @PreAuthorize("@ss.hasPermi('system:leaseStyle:edit')")
    @Log(title = "租赁产品款式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaseStyle leaseStyle)
    {
        return toAjax(leaseStyleService.updateLeaseStyle(leaseStyle));
    }

    /**
     * 删除租赁产品款式
     */
    @PreAuthorize("@ss.hasPermi('system:leaseStyle:remove')")
    @Log(title = "租赁产品款式", businessType = BusinessType.DELETE)
    @DeleteMapping("/{styleIds}")
    public AjaxResult remove(@PathVariable String[] styleIds)
    {
        return toAjax(leaseStyleService.deleteLeaseStyleByStyleIds(styleIds));
    }
}
