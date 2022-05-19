package com.wangye.workflow.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author yyds
 * @since 2022-05-19
 */
@TableName("doubao_department")
@ApiModel(value = "Department对象", description = "")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("部门编码")
    private Integer departmentCode;

    @ApiModelProperty("部门名称")
    private String departmentName;

    @ApiModelProperty("上级部门编码")
    private Integer departmentSuperiorCode;

    @ApiModelProperty("部门级别")
    private Integer departmentLevel;

    @ApiModelProperty("所属公司ID")
    private Integer companyId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public Integer getDepartmentSuperiorCode() {
        return departmentSuperiorCode;
    }

    public void setDepartmentSuperiorCode(Integer departmentSuperiorCode) {
        this.departmentSuperiorCode = departmentSuperiorCode;
    }
    public Integer getDepartmentLevel() {
        return departmentLevel;
    }

    public void setDepartmentLevel(Integer departmentLevel) {
        this.departmentLevel = departmentLevel;
    }
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Department{" +
            "id=" + id +
            ", departmentCode=" + departmentCode +
            ", departmentName=" + departmentName +
            ", departmentSuperiorCode=" + departmentSuperiorCode +
            ", departmentLevel=" + departmentLevel +
            ", companyId=" + companyId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
