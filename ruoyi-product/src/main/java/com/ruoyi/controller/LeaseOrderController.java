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
import com.ruoyi.domain.LeaseOrder;
import com.ruoyi.service.ILeaseOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 租赁订单Controller
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/system/leaseOrder")
public class LeaseOrderController extends BaseController
{
    @Autowired
    private ILeaseOrderService leaseOrderService;

    /**
     * 查询租赁订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseOrder:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaseOrder leaseOrder)
    {
        startPage();
        List<LeaseOrder> list = leaseOrderService.selectLeaseOrderList(leaseOrder);
        return getDataTable(list);
    }

    /**
     * 导出租赁订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseOrder:export')")
    @Log(title = "租赁订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaseOrder leaseOrder)
    {
        List<LeaseOrder> list = leaseOrderService.selectLeaseOrderList(leaseOrder);
        ExcelUtil<LeaseOrder> util = new ExcelUtil<LeaseOrder>(LeaseOrder.class);
        util.exportExcel(response, list, "租赁订单数据");
    }

    /**
     * 获取租赁订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:leaseOrder:query')")
    @GetMapping(value = "/{leaseOrderId}")
    public AjaxResult getInfo(@PathVariable("leaseOrderId") String leaseOrderId)
    {
        return success(leaseOrderService.selectLeaseOrderByLeaseOrderId(leaseOrderId));
    }

    /**
     * 新增租赁订单
     */
    @PreAuthorize("@ss.hasPermi('system:leaseOrder:add')")
    @Log(title = "租赁订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaseOrder leaseOrder)
    {
        return toAjax(leaseOrderService.insertLeaseOrder(leaseOrder));
    }

    /**
     * 修改租赁订单
     */
    @PreAuthorize("@ss.hasPermi('system:leaseOrder:edit')")
    @Log(title = "租赁订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaseOrder leaseOrder)
    {
        return toAjax(leaseOrderService.updateLeaseOrder(leaseOrder));
    }

    /**
     * 删除租赁订单
     */
    @PreAuthorize("@ss.hasPermi('system:leaseOrder:remove')")
    @Log(title = "租赁订单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{leaseOrderIds}")
    public AjaxResult remove(@PathVariable String[] leaseOrderIds)
    {
        return toAjax(leaseOrderService.deleteLeaseOrderByLeaseOrderIds(leaseOrderIds));
    }
}
