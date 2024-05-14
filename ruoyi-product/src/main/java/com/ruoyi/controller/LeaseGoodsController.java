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
import com.ruoyi.domain.LeaseGoods;
import com.ruoyi.service.ILeaseGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 租赁产品Controller
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
@RestController
@RequestMapping("/system/leaseGoogs")
public class LeaseGoodsController extends BaseController
{
    @Autowired
    private ILeaseGoodsService leaseGoodsService;

    /**
     * 查询租赁产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseGoogs:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaseGoods leaseGoods)
    {
        startPage();
        List<LeaseGoods> list = leaseGoodsService.selectLeaseGoodsList(leaseGoods);
        return getDataTable(list);
    }

    /**
     * 导出租赁产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:leaseGoogs:export')")
    @Log(title = "租赁产品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaseGoods leaseGoods)
    {
        List<LeaseGoods> list = leaseGoodsService.selectLeaseGoodsList(leaseGoods);
        ExcelUtil<LeaseGoods> util = new ExcelUtil<LeaseGoods>(LeaseGoods.class);
        util.exportExcel(response, list, "租赁产品数据");
    }

    /**
     * 获取租赁产品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:leaseGoogs:query')")
    @GetMapping(value = "/{leaseId}")
    public AjaxResult getInfo(@PathVariable("leaseId") String leaseId)
    {
        return success(leaseGoodsService.selectLeaseGoodsByLeaseId(leaseId));
    }

    /**
     * 新增租赁产品
     */
    @PreAuthorize("@ss.hasPermi('system:leaseGoogs:add')")
    @Log(title = "租赁产品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaseGoods leaseGoods)
    {
        return toAjax(leaseGoodsService.insertLeaseGoods(leaseGoods));
    }

    /**
     * 修改租赁产品
     */
    @PreAuthorize("@ss.hasPermi('system:leaseGoogs:edit')")
    @Log(title = "租赁产品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaseGoods leaseGoods)
    {
        return toAjax(leaseGoodsService.updateLeaseGoods(leaseGoods));
    }

    /**
     * 删除租赁产品
     */
    @PreAuthorize("@ss.hasPermi('system:leaseGoogs:remove')")
    @Log(title = "租赁产品", businessType = BusinessType.DELETE)
    @DeleteMapping("/{leaseIds}")
    public AjaxResult remove(@PathVariable String[] leaseIds)
    {
        return toAjax(leaseGoodsService.deleteLeaseGoodsByLeaseIds(leaseIds));
    }
}
