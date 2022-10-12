package com.example.ytimserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ytimserver.pojo.Message;
import com.example.ytimserver.service.MessageService;
import com.example.ytimserver.mapper.MessageMapper;
import org.springframework.stereotype.Service;

/**
* @author wjh980515
* @description 针对表【message】的数据库操作Service实现
* @createDate 2022-10-12 18:24:38
*/
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message>
    implements MessageService {

}




