package com.tzh.manage.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tzh.manage.entity.Staff;
import com.tzh.manage.mapper.StaffMapper;
import com.tzh.manage.service.StaffService;
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService{

}
