package com.kaishengit.erp.service;

import com.github.pagehelper.PageInfo;
import com.kaishengit.erp.entity.*;
import com.kaishengit.erp.exception.ServiceException;
import com.kaishengit.erp.vo.OrderVo;

import java.util.List;
import java.util.Map;

/**
 * @author jinjianghao
 * @date 2018/8/2
 */
public interface OrderService {
    /**
     * 查询所有的服务类型
     * @return
     */
    List<ServiceType> findAllServiceType();

    /**
     * 获得所有的配件类型
     * @return
     */
    List<Type> findAllPartsType();

    /**
     * 新增订单
     * @param orderVo
     * @param employeeId 操作的员工id
     */
    void newOrder(OrderVo orderVo, Integer employeeId);

    /**
     * 通过状态查询订单列表
     * @return
     */
    PageInfo<Order> findPageByParam(Map<String,Object> queryMap);


    /**
     * 查看订单详情
     * @param id
     * @return order
     */
    Order findOrderById(Integer id) throws ServiceException;

    /**
     * 获得服务类型
     * @param serviceTypeId
     * @return
     */
    ServiceType findServiceTypeById(Integer serviceTypeId);

    /**
     * 更新订单
     * @param orderVo
     */
    void editOrder(OrderVo orderVo)  throws ServiceException;

    /**
     * 订单下发
     * @param id
     */
    void transOrder(Integer id)  throws ServiceException;

    /**
     * 解析json数据改变订单状态
     * @param json
     */
    void editOrderState(String json);


    /**
     * 统计每天的订单数量和金额
     */
    void countDailyOrder();
}
