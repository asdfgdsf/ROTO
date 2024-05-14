package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.ShotPackageMapper;
import com.ruoyi.domain.ShotPackage;
import com.ruoyi.service.IShotPackageService;

/**
 * 跟拍套餐Service业务层处理
 * 
 * @author jjzhaodi
 * @date 2023-12-14
 */
@Service
public class ShotPackageServiceImpl implements IShotPackageService 
{
    @Autowired
    private ShotPackageMapper shotPackageMapper;

    /**
     * 查询跟拍套餐
     * 
     * @param packageId 跟拍套餐主键
     * @return 跟拍套餐
     */
    @Override
    public ShotPackage selectShotPackageByPackageId(String packageId)
    {
        return shotPackageMapper.selectShotPackageByPackageId(packageId);
    }

    /**
     * 查询跟拍套餐列表
     * 
     * @param shotPackage 跟拍套餐
     * @return 跟拍套餐
     */
    @Override
    public List<ShotPackage> selectShotPackageList(ShotPackage shotPackage)
    {
        return shotPackageMapper.selectShotPackageList(shotPackage);
    }

    /**
     * 新增跟拍套餐
     * 
     * @param shotPackage 跟拍套餐
     * @return 结果
     */
    @Override
    public int insertShotPackage(ShotPackage shotPackage)
    {
        return shotPackageMapper.insertShotPackage(shotPackage);
    }

    /**
     * 修改跟拍套餐
     * 
     * @param shotPackage 跟拍套餐
     * @return 结果
     */
    @Override
    public int updateShotPackage(ShotPackage shotPackage)
    {
        return shotPackageMapper.updateShotPackage(shotPackage);
    }

    /**
     * 批量删除跟拍套餐
     * 
     * @param packageIds 需要删除的跟拍套餐主键
     * @return 结果
     */
    @Override
    public int deleteShotPackageByPackageIds(String[] packageIds)
    {
        return shotPackageMapper.deleteShotPackageByPackageIds(packageIds);
    }

    /**
     * 删除跟拍套餐信息
     * 
     * @param packageId 跟拍套餐主键
     * @return 结果
     */
    @Override
    public int deleteShotPackageByPackageId(String packageId)
    {
        return shotPackageMapper.deleteShotPackageByPackageId(packageId);
    }
}
