package org.java.bi.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class SysTableDesp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.db_name
     *
     * @mbg.generated
     */
    private String dbName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.db_table_or_view_name
     *
     * @mbg.generated
     */
    private String dbTableOrViewName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.chinese_desc
     *
     * @mbg.generated
     */
    private String chineseDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.primary_field_name
     *
     * @mbg.generated
     */
    private String primaryFieldName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.ordernumber
     *
     * @mbg.generated
     */
    private Integer ordernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.tenant_id
     *
     * @mbg.generated
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.add_by
     *
     * @mbg.generated
     */
    private String addBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_table_desp.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.id
     *
     * @return the value of sys_table_desp.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.id
     *
     * @param id the value for sys_table_desp.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.db_name
     *
     * @return the value of sys_table_desp.db_name
     *
     * @mbg.generated
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.db_name
     *
     * @param dbName the value for sys_table_desp.db_name
     *
     * @mbg.generated
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.db_table_or_view_name
     *
     * @return the value of sys_table_desp.db_table_or_view_name
     *
     * @mbg.generated
     */
    public String getDbTableOrViewName() {
        return dbTableOrViewName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.db_table_or_view_name
     *
     * @param dbTableOrViewName the value for sys_table_desp.db_table_or_view_name
     *
     * @mbg.generated
     */
    public void setDbTableOrViewName(String dbTableOrViewName) {
        this.dbTableOrViewName = dbTableOrViewName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.chinese_desc
     *
     * @return the value of sys_table_desp.chinese_desc
     *
     * @mbg.generated
     */
    public String getChineseDesc() {
        return chineseDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.chinese_desc
     *
     * @param chineseDesc the value for sys_table_desp.chinese_desc
     *
     * @mbg.generated
     */
    public void setChineseDesc(String chineseDesc) {
        this.chineseDesc = chineseDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.primary_field_name
     *
     * @return the value of sys_table_desp.primary_field_name
     *
     * @mbg.generated
     */
    public String getPrimaryFieldName() {
        return primaryFieldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.primary_field_name
     *
     * @param primaryFieldName the value for sys_table_desp.primary_field_name
     *
     * @mbg.generated
     */
    public void setPrimaryFieldName(String primaryFieldName) {
        this.primaryFieldName = primaryFieldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.ordernumber
     *
     * @return the value of sys_table_desp.ordernumber
     *
     * @mbg.generated
     */
    public Integer getOrdernumber() {
        return ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.ordernumber
     *
     * @param ordernumber the value for sys_table_desp.ordernumber
     *
     * @mbg.generated
     */
    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.tenant_id
     *
     * @return the value of sys_table_desp.tenant_id
     *
     * @mbg.generated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.tenant_id
     *
     * @param tenantId the value for sys_table_desp.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.add_time
     *
     * @return the value of sys_table_desp.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.add_time
     *
     * @param addTime the value for sys_table_desp.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.add_by
     *
     * @return the value of sys_table_desp.add_by
     *
     * @mbg.generated
     */
    public String getAddBy() {
        return addBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.add_by
     *
     * @param addBy the value for sys_table_desp.add_by
     *
     * @mbg.generated
     */
    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.update_time
     *
     * @return the value of sys_table_desp.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.update_time
     *
     * @param updateTime the value for sys_table_desp.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.update_by
     *
     * @return the value of sys_table_desp.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.update_by
     *
     * @param updateBy the value for sys_table_desp.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_table_desp.deleted
     *
     * @return the value of sys_table_desp.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_table_desp.deleted
     *
     * @param deleted the value for sys_table_desp.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dbName=").append(dbName);
        sb.append(", dbTableOrViewName=").append(dbTableOrViewName);
        sb.append(", chineseDesc=").append(chineseDesc);
        sb.append(", primaryFieldName=").append(primaryFieldName);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", addTime=").append(addTime);
        sb.append(", addBy=").append(addBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysTableDesp other = (SysTableDesp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDbName() == null ? other.getDbName() == null : this.getDbName().equals(other.getDbName()))
            && (this.getDbTableOrViewName() == null ? other.getDbTableOrViewName() == null : this.getDbTableOrViewName().equals(other.getDbTableOrViewName()))
            && (this.getChineseDesc() == null ? other.getChineseDesc() == null : this.getChineseDesc().equals(other.getChineseDesc()))
            && (this.getPrimaryFieldName() == null ? other.getPrimaryFieldName() == null : this.getPrimaryFieldName().equals(other.getPrimaryFieldName()))
            && (this.getOrdernumber() == null ? other.getOrdernumber() == null : this.getOrdernumber().equals(other.getOrdernumber()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getAddBy() == null ? other.getAddBy() == null : this.getAddBy().equals(other.getAddBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDbName() == null) ? 0 : getDbName().hashCode());
        result = prime * result + ((getDbTableOrViewName() == null) ? 0 : getDbTableOrViewName().hashCode());
        result = prime * result + ((getChineseDesc() == null) ? 0 : getChineseDesc().hashCode());
        result = prime * result + ((getPrimaryFieldName() == null) ? 0 : getPrimaryFieldName().hashCode());
        result = prime * result + ((getOrdernumber() == null) ? 0 : getOrdernumber().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getAddBy() == null) ? 0 : getAddBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table sys_table_desp
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        dbName("db_name", "dbName", "VARCHAR", false),
        dbTableOrViewName("db_table_or_view_name", "dbTableOrViewName", "VARCHAR", false),
        chineseDesc("chinese_desc", "chineseDesc", "VARCHAR", false),
        primaryFieldName("primary_field_name", "primaryFieldName", "VARCHAR", false),
        ordernumber("ordernumber", "ordernumber", "INTEGER", false),
        tenantId("tenant_id", "tenantId", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        addBy("add_by", "addBy", "VARCHAR", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        updateBy("update_by", "updateBy", "VARCHAR", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_table_desp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}