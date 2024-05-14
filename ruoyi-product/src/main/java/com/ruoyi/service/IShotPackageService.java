package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.ShotPackage;

/**
 * 跟拍套餐Service接口
 * 
 * @author jjzhaodi
 * @date 2023-12-14
 */
public interface IShotPackageService 
{
    /**
     * 查询跟拍套餐
     * 
     * @param packageId 跟拍套餐主键
     * @return 跟拍套餐
     */
    public ShotPackage selectShotPackageByPackageId(String packageId);

    /**
     * 查询跟拍套餐列表
     * 
     * @param shotPackage 跟拍套餐
     * @return 跟拍套餐集合
     */
    public List<ShotPackage> selectShotPackageList(ShotPackage shotPackage);

    /**
     * 新增跟拍套餐
     * 
     * @param shotPackage 跟拍套餐
     * @return 结果
     */
    public int insertShotPackage(ShotPackage shotPackage);

    /**
     * 修改跟拍套餐
     * 
     * @param shotPackage 跟拍套餐
     * @return 结果
     */
    public int updateShotPackage(ShotPackage shotPackage);

    /**
     * 批量删除跟拍套餐
     * 
     * @param packageIds 需要删除的跟拍套餐主键集合
     * @return 结果
     */
    public int deleteShotPackageByPackageIds(String[] packageIds);

    /**
     * 删除跟拍套餐信息
     * 
     * @param packageId 跟拍套餐主键
     * @return 结果
     */
    public int deleteShotPackageByPackageId(String packageId);
}
