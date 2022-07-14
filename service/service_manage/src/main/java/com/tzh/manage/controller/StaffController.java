package com.tzh.manage.controller;

import com.tzh.manage.entity.Staff;
import com.tzh.manage.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "员工管理")
@RestController
@RequestMapping("/manage/staff")
public class StaffController {
    @Resource
    private StaffService staffService;

    @ApiOperation(value = "测试api")
    @GetMapping("test")
    public List<Staff> test(){
        List<Staff> list = staffService.list(null);
        return list;
    }
}
