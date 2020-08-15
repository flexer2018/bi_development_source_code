package org.java.bi.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.java.bi.db.domain.SysTableDesp;
import org.java.bi.db.domain.SysTableDespExample;

public interface SysTableDespMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    long countByExample(SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int deleteByExample(SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int insert(SysTableDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int insertSelective(SysTableDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableDesp selectOneByExample(SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableDesp selectOneByExampleSelective(@Param("example") SysTableDespExample example, @Param("selective") SysTableDesp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SysTableDesp> selectByExampleSelective(@Param("example") SysTableDespExample example, @Param("selective") SysTableDesp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    List<SysTableDesp> selectByExample(SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableDesp selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysTableDesp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    SysTableDesp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysTableDesp selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysTableDesp record, @Param("example") SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysTableDesp record, @Param("example") SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysTableDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysTableDesp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysTableDespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}