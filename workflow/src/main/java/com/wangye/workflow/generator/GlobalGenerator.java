package com.wangye.workflow.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;

public class GlobalGenerator {

    public static void main(String[] args) {
        /**
         * 代码生成器
         *     新版本生成器写法
         */
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis-test?useSSL=false&useUnicode=true&characterEncoding=UTF-8", "root", "sls123")
                .globalConfig(builder -> { // 全局配置
                    builder.author("yyds") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .commentDate("yyyy-MM-dd")  // 设置生成时间
                            .outputDir("workflow/src/main/java/"); // 指定输出目录
                })
                .packageConfig(builder -> { // 包配置
                    builder.parent("com.wangye.workflow") // 设置父包名
                            .moduleName("web") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "workflow/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> { // 策略配置
                    builder.addInclude("doubao_user", "doubao_company", "doubao_department", "doubao_operation_log", "doubao_position") // 设置需要生成的表名
                            .addTablePrefix("doubao_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}