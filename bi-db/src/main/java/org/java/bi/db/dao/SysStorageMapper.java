package org.java.bi.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.java.bi.db.domain.SysStorage;
import org.java.bi.db.domain.SysStorageExample;

public interface SysStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    long countByExample(SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int deleteByExample(SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int insert(SysStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int insertSelective(SysStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysStorage selectOneByExample(SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysStorage selectOneByExampleSelective(@Param("example") SysStorageExample example, @Param("selective") SysStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SysStorage> selectByExampleSelective(@Param("example") SysStorageExample example, @Param("selective") SysStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    List<SysStorage> selectByExample(SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysStorage selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    SysStorage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysStorage selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysStorage record, @Param("example") SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysStorage record, @Param("example") SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}