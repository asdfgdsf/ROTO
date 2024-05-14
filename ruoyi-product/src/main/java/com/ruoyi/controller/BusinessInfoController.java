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
import com.ruoyi.domain.BusinessInfo;
import com.ruoyi.service.IBusinessInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商家信息Controller
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/system/bussinessInfo")
public class BusinessInfoController extends BaseController
{
    @Autowired
    private IBusinessInfoService businessInfoService;

    /**
     * 查询商家信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:bussinessInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusinessInfo businessInfo)
    {
        startPage();
        List<BusinessInfo> list = businessInfoService.selectBusinessInfoList(businessInfo);
        return getDataTable(list);
    }

    /**
     * 导出商家信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:bussinessInfo:export')")
    @Log(title = "商家信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusinessInfo businessInfo)
    {
        List<BusinessInfo> list = businessInfoService.selectBusinessInfoList(businessInfo);
        ExcelUtil<BusinessInfo> util = new ExcelUtil<BusinessInfo>(BusinessInfo.class);
        util.exportExcel(response, list, "商家信息数据");
    }

    /**
     * 获取商家信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:bussinessInfo:query')")
    @GetMapping(value = "/{businessId}")
    public AjaxResult getInfo(@PathVariable("businessId") String businessId)
    {
        return success(businessInfoService.selectBusinessInfoByBusinessId(businessId));
    }

    /**
     * 新增商家信息
     */
    @PreAuthorize("@ss.hasPermi('system:bussinessInfo:add')")
    @Log(title = "商家信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusinessInfo businessInfo)
    {
        return toAjax(businessInfoService.insertBusinessInfo(businessInfo));
    }

    /**
     * 修改商家信息
     */
    @PreAuthorize("@ss.hasPermi('system:bussinessInfo:edit')")
    @Log(title = "商家信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusinessInfo businessInfo)
    {
        return toAjax(businessInfoService.updateBusinessInfo(businessInfo));
    }

    /**
     * 删除商家信息
     */
    @PreAuthorize("@ss.hasPermi('system:bussinessInfo:remove')")
    @Log(title = "商家信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{businessIds}")
    public AjaxResult remove(@PathVariable String[] businessIds)
    {
        return toAjax(businessInfoService.deleteBusinessInfoByBusinessIds(businessIds));
    }
}
