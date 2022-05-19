package com.wangye.workflow.web.service.impl;

import com.wangye.workflow.web.entity.Department;
import com.wangye.workflow.web.mapper.DepartmentMapper;
import com.wangye.workflow.web.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
