package com.wangye.workflow.web.service.impl;

import com.wangye.workflow.web.entity.Company;
import com.wangye.workflow.web.mapper.CompanyMapper;
import com.wangye.workflow.web.service.ICompanyService;
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
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
