package com.cch.onlineoffice.wx.controller;

import com.cch.onlineoffice.wx.common.util.R;
import com.cch.onlineoffice.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author cch
 * @create 2022-11-07 11:25
 */
@RestController
@RequestMapping("/test")
@Api("测试Web接口")
public class TestController {

    @PostMapping("/sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHello(  @RequestBody TestSayHelloForm form){
        return R.ok().put("data","Hello,"+form.getName());
    }

    @PostMapping("/sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHellodev(  @RequestBody TestSayHelloForm form){
        return R.ok().put("data","Hello,"+form.getName());
    }
}
