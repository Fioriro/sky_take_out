package com.sky.service;

import com.sky.result.Result;
import com.sky.vo.BusinessDataVO;
import com.sky.vo.DishOverViewVO;
import com.sky.vo.OrderOverViewVO;
import com.sky.vo.SetmealOverViewVO;

import java.time.LocalDateTime;

public interface WorkSpaceService {

    /**
     * 获取今日数据
     * @param begin
     * @param end
     * @return
     */
    BusinessDataVO getBussinessData(LocalDateTime begin, LocalDateTime end);

    /**
     * 获取全部订单信息
     * @return
     */
    OrderOverViewVO getOrderOverView();

    /**
     * 菜品总览
     * @return
     */
    DishOverViewVO getDishOverview();

    /**
     * 套餐总览
     * @return
     */
    SetmealOverViewVO getSetmealOverView();
}
