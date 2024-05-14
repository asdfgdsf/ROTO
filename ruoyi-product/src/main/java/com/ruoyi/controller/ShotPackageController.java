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
import com.ruoyi.domain.ShotPackage;
import com.ruoyi.service.IShotPackageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 跟拍套餐Controller
 * 
 * @author jjzhaodi
 * @date 2023-12-14
 */
@RestController
@RequestMapping("/product/package")
public class ShotPackageController extends BaseController
{
    @Autowired
    private IShotPackageService shotPackageService;

    /**
     * 查询跟拍套餐列表
     */
    @PreAuthorize("@ss.hasPermi('product:package:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShotPackage shotPackage)
    {
        startPage();
        List<ShotPackage> list = shotPackageService.selectShotPackageList(shotPackage);
        return getDataTable(list);
    }

    /**
     * 导出跟拍套餐列表
     */
    @PreAuthorize("@ss.hasPermi('product:package:export')")
    @Log(title = "跟拍套餐", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShotPackage shotPackage)
    {
        List<ShotPackage> list = shotPackageService.selectShotPackageList(shotPackage);
        ExcelUtil<ShotPackage> util = new ExcelUtil<ShotPackage>(ShotPackage.class);
        util.exportExcel(response, list, "跟拍套餐数据");
    }

    /**
     * 获取跟拍套餐详细信息
     */
    @PreAuthorize("@ss.hasPermi('product:package:query')")
    @GetMapping(value = "/{packageId}")
    public AjaxResult getInfo(@PathVariable("packageId") String packageId)
    {
        return success(shotPackageService.selectShotPackageByPackageId(packageId));
    }

    /**
     * 新增跟拍套餐
     */
    @PreAuthorize("@ss.hasPermi('product:package:add')")
    @Log(title = "跟拍套餐", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShotPackage shotPackage)
    {
        return toAjax(shotPackageService.insertShotPackage(shotPackage));
    }

    /**
     * 修改跟拍套餐
     */
    @PreAuthorize("@ss.hasPermi('product:package:edit')")
    @Log(title = "跟拍套餐", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShotPackage shotPackage)
    {
        return toAjax(shotPackageService.updateShotPackage(shotPackage));
    }

    /**
     * 删除跟拍套餐
     */
    @PreAuthorize("@ss.hasPermi('product:package:remove')")
    @Log(title = "跟拍套餐", businessType = BusinessType.DELETE)
	@DeleteMapping("/{packageIds}")
    public AjaxResult remove(@PathVariable String[] packageIds)
    {
        return toAjax(shotPackageService.deleteShotPackageByPackageIds(packageIds));
    }
}
