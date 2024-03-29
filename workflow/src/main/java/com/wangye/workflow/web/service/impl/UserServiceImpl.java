package com.wangye.workflow.web.service.impl;

import com.wangye.workflow.web.entity.User;
import com.wangye.workflow.web.mapper.UserMapper;
import com.wangye.workflow.web.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyds
 * @since 2022-05-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
