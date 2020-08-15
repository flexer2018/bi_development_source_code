package org.java.bi.db.domain;

import java.util.ArrayList;
import java.util.List;

public class ViewTableDefExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public ViewTableDefExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public ViewTableDefExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public ViewTableDefExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_table_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Criteria newAndCreateCriteria() {
        ViewTableDefExample example = new ViewTableDefExample();
        return example.createCriteria();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTableNameIsNull() {
            addCriterion("`table_name` is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("`table_name` is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("`table_name` =", value, "tableName");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableNameEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("`table_name` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("`table_name` <>", value, "tableName");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableNameNotEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("`table_name` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("`table_name` >", value, "tableName");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableNameGreaterThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("`table_name` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("`table_name` >=", value, "tableName");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableNameGreaterThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("`table_name` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("`table_name` <", value, "tableName");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableNameLessThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("`table_name` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("`table_name` <=", value, "tableName");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableNameLessThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("`table_name` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("`table_name` like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("`table_name` not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("`table_name` in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("`table_name` not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("`table_name` between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("`table_name` not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableCommentIsNull() {
            addCriterion("table_comment is null");
            return (Criteria) this;
        }

        public Criteria andTableCommentIsNotNull() {
            addCriterion("table_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTableCommentEqualTo(String value) {
            addCriterion("table_comment =", value, "tableComment");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableCommentEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_comment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableCommentNotEqualTo(String value) {
            addCriterion("table_comment <>", value, "tableComment");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableCommentNotEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_comment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableCommentGreaterThan(String value) {
            addCriterion("table_comment >", value, "tableComment");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableCommentGreaterThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_comment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableCommentGreaterThanOrEqualTo(String value) {
            addCriterion("table_comment >=", value, "tableComment");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableCommentGreaterThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_comment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableCommentLessThan(String value) {
            addCriterion("table_comment <", value, "tableComment");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableCommentLessThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_comment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableCommentLessThanOrEqualTo(String value) {
            addCriterion("table_comment <=", value, "tableComment");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableCommentLessThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_comment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableCommentLike(String value) {
            addCriterion("table_comment like", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotLike(String value) {
            addCriterion("table_comment not like", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentIn(List<String> values) {
            addCriterion("table_comment in", values, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotIn(List<String> values) {
            addCriterion("table_comment not in", values, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentBetween(String value1, String value2) {
            addCriterion("table_comment between", value1, value2, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotBetween(String value1, String value2) {
            addCriterion("table_comment not between", value1, value2, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNull() {
            addCriterion("table_type is null");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNotNull() {
            addCriterion("table_type is not null");
            return (Criteria) this;
        }

        public Criteria andTableTypeEqualTo(String value) {
            addCriterion("table_type =", value, "tableType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableTypeEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableTypeNotEqualTo(String value) {
            addCriterion("table_type <>", value, "tableType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableTypeNotEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThan(String value) {
            addCriterion("table_type >", value, "tableType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableTypeGreaterThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("table_type >=", value, "tableType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableTypeGreaterThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThan(String value) {
            addCriterion("table_type <", value, "tableType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableTypeLessThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThanOrEqualTo(String value) {
            addCriterion("table_type <=", value, "tableType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTableTypeLessThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("table_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTableTypeLike(String value) {
            addCriterion("table_type like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotLike(String value) {
            addCriterion("table_type not like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeIn(List<String> values) {
            addCriterion("table_type in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotIn(List<String> values) {
            addCriterion("table_type not in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeBetween(String value1, String value2) {
            addCriterion("table_type between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotBetween(String value1, String value2) {
            addCriterion("table_type not between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andOltTableDespIsNull() {
            addCriterion("olt_table_desp is null");
            return (Criteria) this;
        }

        public Criteria andOltTableDespIsNotNull() {
            addCriterion("olt_table_desp is not null");
            return (Criteria) this;
        }

        public Criteria andOltTableDespEqualTo(String value) {
            addCriterion("olt_table_desp =", value, "oltTableDesp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andOltTableDespEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("olt_table_desp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOltTableDespNotEqualTo(String value) {
            addCriterion("olt_table_desp <>", value, "oltTableDesp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andOltTableDespNotEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("olt_table_desp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOltTableDespGreaterThan(String value) {
            addCriterion("olt_table_desp >", value, "oltTableDesp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andOltTableDespGreaterThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("olt_table_desp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOltTableDespGreaterThanOrEqualTo(String value) {
            addCriterion("olt_table_desp >=", value, "oltTableDesp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andOltTableDespGreaterThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("olt_table_desp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOltTableDespLessThan(String value) {
            addCriterion("olt_table_desp <", value, "oltTableDesp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andOltTableDespLessThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("olt_table_desp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOltTableDespLessThanOrEqualTo(String value) {
            addCriterion("olt_table_desp <=", value, "oltTableDesp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andOltTableDespLessThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("olt_table_desp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOltTableDespLike(String value) {
            addCriterion("olt_table_desp like", value, "oltTableDesp");
            return (Criteria) this;
        }

        public Criteria andOltTableDespNotLike(String value) {
            addCriterion("olt_table_desp not like", value, "oltTableDesp");
            return (Criteria) this;
        }

        public Criteria andOltTableDespIn(List<String> values) {
            addCriterion("olt_table_desp in", values, "oltTableDesp");
            return (Criteria) this;
        }

        public Criteria andOltTableDespNotIn(List<String> values) {
            addCriterion("olt_table_desp not in", values, "oltTableDesp");
            return (Criteria) this;
        }

        public Criteria andOltTableDespBetween(String value1, String value2) {
            addCriterion("olt_table_desp between", value1, value2, "oltTableDesp");
            return (Criteria) this;
        }

        public Criteria andOltTableDespNotBetween(String value1, String value2) {
            addCriterion("olt_table_desp not between", value1, value2, "oltTableDesp");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeletedEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeletedNotEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeletedGreaterThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeletedGreaterThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeletedLessThanColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeletedLessThanOrEqualToColumn(ViewTableDef.Column column) {
            addCriterion(new StringBuilder("deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table view_table_def
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private ViewTableDefExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(ViewTableDefExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public ViewTableDefExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andDeletedEqualTo(ViewTableDef.IS_DELETED) : andDeletedNotEqualTo(ViewTableDef.IS_DELETED);
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table view_table_def
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table view_table_def
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table view_table_def
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}