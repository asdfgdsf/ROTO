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
import com.ruoyi.domain.ShotGoods;
import com.ruoyi.service.IShotGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预约跟拍商品Controller
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
@RestController
@RequestMapping("/system/shotGoods")
public class ShotGoodsController extends BaseController
{
    @Autowired
    private IShotGoodsService shotGoodsService;

    /**
     * 查询预约跟拍商品列表
     */
    @PreAuthorize("@ss.hasPermi('system:shotGoods:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShotGoods shotGoods)
    {
        startPage();
        List<ShotGoods> list = shotGoodsService.selectShotGoodsList(shotGoods);
        return getDataTable(list);
    }

    /**
     * 导出预约跟拍商品列表
     */
    @PreAuthorize("@ss.hasPermi('system:shotGoods:export')")
    @Log(title = "预约跟拍商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShotGoods shotGoods)
    {
        List<ShotGoods> list = shotGoodsService.selectShotGoodsList(shotGoods);
        ExcelUtil<ShotGoods> util = new ExcelUtil<ShotGoods>(ShotGoods.class);
        util.exportExcel(response, list, "预约跟拍商品数据");
    }

    /**
     * 获取预约跟拍商品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shotGoods:query')")
    @GetMapping(value = "/{shotId}")
    public AjaxResult getInfo(@PathVariable("shotId") String shotId)
    {
        return success(shotGoodsService.selectShotGoodsByShotId(shotId));
    }

    /**
     * 新增预约跟拍商品
     */
    @PreAuthorize("@ss.hasPermi('system:shotGoods:add')")
    @Log(title = "预约跟拍商品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShotGoods shotGoods)
    {
        return toAjax(shotGoodsService.insertShotGoods(shotGoods));
    }

    /**
     * 修改预约跟拍商品
     */
    @PreAuthorize("@ss.hasPermi('system:shotGoods:edit')")
    @Log(title = "预约跟拍商品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShotGoods shotGoods)
    {
        return toAjax(shotGoodsService.updateShotGoods(shotGoods));
    }

    /**
     * 删除预约跟拍商品
     */
    @PreAuthorize("@ss.hasPermi('system:shotGoods:remove')")
    @Log(title = "预约跟拍商品", businessType = BusinessType.DELETE)
    @DeleteMapping("/{shotIds}")
    public AjaxResult remove(@PathVariable String[] shotIds)
    {
        return toAjax(shotGoodsService.deleteShotGoodsByShotIds(shotIds));
    }
}
