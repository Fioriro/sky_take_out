package com.sky.controller.admin;

import com.sky.result.Result;
import com.sky.service.WorkSpaceService;
import com.sky.vo.BusinessDataVO;
import com.sky.vo.DishOverViewVO;
import com.sky.vo.OrderOverViewVO;
import com.sky.vo.SetmealOverViewVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("/admin/workspace")
@Slf4j
@Api("工作台相关接口")
public class WorkSpaceController {

    @Autowired
    private WorkSpaceService workSpaceService;


    /**
     * 获取今日数据
     * @return
     */
    @GetMapping("businessData")
    @ApiOperation("今日数据")
    public Result<BusinessDataVO> businessData(){
        log.info("今日数据");
        //获取当天开放时间
        LocalDateTime begin = LocalDateTime.now().with(LocalTime.MIN);
        //获取当天结束时间
        LocalDateTime end = LocalDateTime.now().with(LocalTime.MAX);

        BusinessDataVO businessDataVO = workSpaceService.getBusinessData(begin, end);
        return Result.success(businessDataVO);
    }


    /**
     * 获取全部订单信息
     * @return
     */
    @GetMapping("/overviewOrders")
    @ApiOperation("订单管理")
    public Result<OrderOverViewVO> orderOverView(){
        log.info("获取全部订单信息");
        return Result.success(workSpaceService.getOrderOverView());
    }

    /**
     * 菜品总览
     * @return
     */
    @GetMapping("/overviewDishes")
    @ApiOperation("菜品总览")
    public Result<DishOverViewVO> dishOverView(){
        log.info("菜品总览");
        DishOverViewVO dishOverViewVO = workSpaceService.getDishOverview();
        return Result.success(dishOverViewVO);
    }

    /**
     * 套餐总览
     * @return
     */
    @GetMapping("/overviewSetmeals")
    @ApiOperation("套餐总览")
    public Result<SetmealOverViewVO> setmealOverView(){
        log.info("套餐总览");
        SetmealOverViewVO setmealOverView = workSpaceService.getSetmealOverView();
        return Result.success(setmealOverView);
    }
}
