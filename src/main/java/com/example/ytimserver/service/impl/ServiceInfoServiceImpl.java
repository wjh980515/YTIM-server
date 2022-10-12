package com.example.ytimserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ytimserver.pojo.ServiceInfo;
import com.example.ytimserver.service.ServiceInfoService;
import com.example.ytimserver.mapper.ServiceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author wjh980515
* @description 针对表【service_info】的数据库操作Service实现
* @createDate 2022-10-12 18:23:47
*/
@Service
public class ServiceInfoServiceImpl extends ServiceImpl<ServiceInfoMapper, ServiceInfo>
    implements ServiceInfoService{

}




