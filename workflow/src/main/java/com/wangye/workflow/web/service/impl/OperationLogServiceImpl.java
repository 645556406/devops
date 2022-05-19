package com.wangye.workflow.web.service.impl;

import com.wangye.workflow.web.entity.OperationLog;
import com.wangye.workflow.web.mapper.OperationLogMapper;
import com.wangye.workflow.web.service.IOperationLogService;
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
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
