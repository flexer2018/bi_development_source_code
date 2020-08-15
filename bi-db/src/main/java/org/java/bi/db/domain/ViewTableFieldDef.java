package org.java.bi.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class ViewTableFieldDef {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_table_field_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Integer NOT_DELETED = 0;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_table_field_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Integer IS_DELETED = 1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.table_comment
     *
     * @mbg.generated
     */
    private String tableComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.table_type
     *
     * @mbg.generated
     */
    private String tableType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.table_name
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.column_name
     *
     * @mbg.generated
     */
    private String columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.column_comment
     *
     * @mbg.generated
     */
    private String columnComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.lei_xing
     *
     * @mbg.generated
     */
    private String leiXing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.field_length
     *
     * @mbg.generated
     */
    private Long fieldLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.field_if_null
     *
     * @mbg.generated
     */
    private String fieldIfNull;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.field_default
     *
     * @mbg.generated
     */
    private String fieldDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_table_field_def.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.table_comment
     *
     * @return the value of view_table_field_def.table_comment
     *
     * @mbg.generated
     */
    public String getTableComment() {
        return tableComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.table_comment
     *
     * @param tableComment the value for view_table_field_def.table_comment
     *
     * @mbg.generated
     */
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.table_type
     *
     * @return the value of view_table_field_def.table_type
     *
     * @mbg.generated
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.table_type
     *
     * @param tableType the value for view_table_field_def.table_type
     *
     * @mbg.generated
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.table_name
     *
     * @return the value of view_table_field_def.table_name
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.table_name
     *
     * @param tableName the value for view_table_field_def.table_name
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.column_name
     *
     * @return the value of view_table_field_def.column_name
     *
     * @mbg.generated
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.column_name
     *
     * @param columnName the value for view_table_field_def.column_name
     *
     * @mbg.generated
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.column_comment
     *
     * @return the value of view_table_field_def.column_comment
     *
     * @mbg.generated
     */
    public String getColumnComment() {
        return columnComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.column_comment
     *
     * @param columnComment the value for view_table_field_def.column_comment
     *
     * @mbg.generated
     */
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.lei_xing
     *
     * @return the value of view_table_field_def.lei_xing
     *
     * @mbg.generated
     */
    public String getLeiXing() {
        return leiXing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.lei_xing
     *
     * @param leiXing the value for view_table_field_def.lei_xing
     *
     * @mbg.generated
     */
    public void setLeiXing(String leiXing) {
        this.leiXing = leiXing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.field_length
     *
     * @return the value of view_table_field_def.field_length
     *
     * @mbg.generated
     */
    public Long getFieldLength() {
        return fieldLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.field_length
     *
     * @param fieldLength the value for view_table_field_def.field_length
     *
     * @mbg.generated
     */
    public void setFieldLength(Long fieldLength) {
        this.fieldLength = fieldLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.field_if_null
     *
     * @return the value of view_table_field_def.field_if_null
     *
     * @mbg.generated
     */
    public String getFieldIfNull() {
        return fieldIfNull;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.field_if_null
     *
     * @param fieldIfNull the value for view_table_field_def.field_if_null
     *
     * @mbg.generated
     */
    public void setFieldIfNull(String fieldIfNull) {
        this.fieldIfNull = fieldIfNull;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.field_default
     *
     * @return the value of view_table_field_def.field_default
     *
     * @mbg.generated
     */
    public String getFieldDefault() {
        return fieldDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.field_default
     *
     * @param fieldDefault the value for view_table_field_def.field_default
     *
     * @mbg.generated
     */
    public void setFieldDefault(String fieldDefault) {
        this.fieldDefault = fieldDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_table_field_def.deleted
     *
     * @return the value of view_table_field_def.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_table_field_def.deleted
     *
     * @param deleted the value for view_table_field_def.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_field_def
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableComment=").append(tableComment);
        sb.append(", tableType=").append(tableType);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", columnComment=").append(columnComment);
        sb.append(", leiXing=").append(leiXing);
        sb.append(", fieldLength=").append(fieldLength);
        sb.append(", fieldIfNull=").append(fieldIfNull);
        sb.append(", fieldDefault=").append(fieldDefault);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_field_def
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
        ViewTableFieldDef other = (ViewTableFieldDef) that;
        return (this.getTableComment() == null ? other.getTableComment() == null : this.getTableComment().equals(other.getTableComment()))
            && (this.getTableType() == null ? other.getTableType() == null : this.getTableType().equals(other.getTableType()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getColumnComment() == null ? other.getColumnComment() == null : this.getColumnComment().equals(other.getColumnComment()))
            && (this.getLeiXing() == null ? other.getLeiXing() == null : this.getLeiXing().equals(other.getLeiXing()))
            && (this.getFieldLength() == null ? other.getFieldLength() == null : this.getFieldLength().equals(other.getFieldLength()))
            && (this.getFieldIfNull() == null ? other.getFieldIfNull() == null : this.getFieldIfNull().equals(other.getFieldIfNull()))
            && (this.getFieldDefault() == null ? other.getFieldDefault() == null : this.getFieldDefault().equals(other.getFieldDefault()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_field_def
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableComment() == null) ? 0 : getTableComment().hashCode());
        result = prime * result + ((getTableType() == null) ? 0 : getTableType().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getColumnComment() == null) ? 0 : getColumnComment().hashCode());
        result = prime * result + ((getLeiXing() == null) ? 0 : getLeiXing().hashCode());
        result = prime * result + ((getFieldLength() == null) ? 0 : getFieldLength().hashCode());
        result = prime * result + ((getFieldIfNull() == null) ? 0 : getFieldIfNull().hashCode());
        result = prime * result + ((getFieldDefault() == null) ? 0 : getFieldDefault().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_field_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table view_table_field_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        tableComment("table_comment", "tableComment", "VARCHAR", false),
        tableType("table_type", "tableType", "CHAR", false),
        tableName("table_name", "tableName", "VARCHAR", true),
        columnName("column_name", "columnName", "VARCHAR", true),
        columnComment("column_comment", "columnComment", "VARCHAR", false),
        leiXing("lei_xing", "leiXing", "VARCHAR", false),
        fieldLength("field_length", "fieldLength", "BIGINT", false),
        fieldIfNull("field_if_null", "fieldIfNull", "VARCHAR", false),
        fieldDefault("field_default", "fieldDefault", "VARCHAR", false),
        deleted("deleted", "deleted", "INTEGER", false),
        dataType("data_type", "dataType", "LONGVARCHAR", false),
        columnType("column_type", "columnType", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
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
         * This method corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_field_def
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
         * This method corresponds to the database table view_table_field_def
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