package org.java.bi.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.java.bi.db.domain.SysTableFieldDesp;
import org.java.bi.db.domain.SysTableFieldDespExample;

public interface SysTableFieldDespMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    long countByExample(SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int deleteByExample(SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int insert(SysTableFieldDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int insertSelective(SysTableFieldDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableFieldDesp selectOneByExample(SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableFieldDesp selectOneByExampleSelective(@Param("example") SysTableFieldDespExample example, @Param("selective") SysTableFieldDesp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SysTableFieldDesp> selectByExampleSelective(@Param("example") SysTableFieldDespExample example, @Param("selective") SysTableFieldDesp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    List<SysTableFieldDesp> selectByExample(SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableFieldDesp selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysTableFieldDesp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    SysTableFieldDesp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableFieldDesp selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysTableFieldDesp record, @Param("example") SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysTableFieldDesp record, @Param("example") SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysTableFieldDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysTableFieldDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysTableFieldDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_field_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}