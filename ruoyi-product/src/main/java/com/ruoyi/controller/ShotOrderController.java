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
import com.ruoyi.domain.ShotOrder;
import com.ruoyi.service.IShotOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 跟拍订单Controller
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/system/shotOrder")
public class ShotOrderController extends BaseController
{
    @Autowired
    private IShotOrderService shotOrderService;

    /**
     * 查询跟拍订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:shotOrder:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShotOrder shotOrder)
    {
        startPage();
        List<ShotOrder> list = shotOrderService.selectShotOrderList(shotOrder);
        return getDataTable(list);
    }

    /**
     * 导出跟拍订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:shotOrder:export')")
    @Log(title = "跟拍订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShotOrder shotOrder)
    {
        List<ShotOrder> list = shotOrderService.selectShotOrderList(shotOrder);
        ExcelUtil<ShotOrder> util = new ExcelUtil<ShotOrder>(ShotOrder.class);
        util.exportExcel(response, list, "跟拍订单数据");
    }

    /**
     * 获取跟拍订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shotOrder:query')")
    @GetMapping(value = "/{shotOrderId}")
    public AjaxResult getInfo(@PathVariable("shotOrderId") String shotOrderId)
    {
        return success(shotOrderService.selectShotOrderByShotOrderId(shotOrderId));
    }

    /**
     * 新增跟拍订单
     */
    @PreAuthorize("@ss.hasPermi('system:shotOrder:add')")
    @Log(title = "跟拍订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShotOrder shotOrder)
    {
        return toAjax(shotOrderService.insertShotOrder(shotOrder));
    }

    /**
     * 修改跟拍订单
     */
    @PreAuthorize("@ss.hasPermi('system:shotOrder:edit')")
    @Log(title = "跟拍订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShotOrder shotOrder)
    {
        return toAjax(shotOrderService.updateShotOrder(shotOrder));
    }

    /**
     * 删除跟拍订单
     */
    @PreAuthorize("@ss.hasPermi('system:shotOrder:remove')")
    @Log(title = "跟拍订单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{shotOrderIds}")
    public AjaxResult remove(@PathVariable String[] shotOrderIds)
    {
        return toAjax(shotOrderService.deleteShotOrderByShotOrderIds(shotOrderIds));
    }
}
