package com.ruoyi;

import com.ruoyi.domain.BusinessInfo;
import com.ruoyi.domain.LeaseOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RuoYiApplicationTests {
    @Autowired
    private com.ruoyi.service.IBusinessInfoService businessInfoService;
    @Autowired
    private com.ruoyi.service.ILeaseOrderService leaseOrderService;
    /**
     * 查询商家信息功能单元测试
     */
    @Test
    public void test1(){
        BusinessInfo businessInfo = businessInfoService.selectBusinessInfoByBusinessId("1");
        System.out.println("测试结果 businessinfo为："+businessInfo.toString());
    }
    /**
     * 查询商家信息列表功能单元测试
     */
    @Test
    public void test2(){
        BusinessInfo businessInfo1 = new BusinessInfo();
        List<BusinessInfo> businessInfoList = businessInfoService.selectBusinessInfoList(businessInfo1);
        businessInfoList.forEach(businessInfo -> {
            System.out.println("测试结果 businessinfo为："+businessInfo.toString());
        });
    }
    /**
     * 新增商家信息功能单元测试
     */
    @Test
    public void test3(){
        BusinessInfo businessInfo = new BusinessInfo();
        businessInfo.setBusinessId("9");
        businessInfo.setBusinessName("测试");
        businessInfo.setBusinessPhone("123456789");
        businessInfo.setBusinessAddress("测试");
        businessInfo.setLicense("123456789");
        businessInfo.setLegalNum("123456789");
        businessInfo.setShopName("测试");
        int i = businessInfoService.insertBusinessInfo(businessInfo);
        if (i>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }
    /**
     * 查询租赁订单功能单元测试
     */
    @Test
    public void test4(){
        LeaseOrder leaseOrder = leaseOrderService.selectLeaseOrderByLeaseOrderId("1");
        System.out.println("测试结果 leaseOrder为："+leaseOrder.toString());
    }
    /**
     * 查询租赁订单列表功能单元测试
     */
    @Test
    public void test5(){
        List<LeaseOrder> leaseOrderList = leaseOrderService.selectLeaseOrderList(new LeaseOrder());
        leaseOrderList.forEach(leaseOrder -> {
            System.out.println("测试结果 leaseOrder为："+leaseOrder.toString());
        });
    }
}
