package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class StuinfoCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public StuinfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
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
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria=customCriteria;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public int getSkipRecordCount() {
        int count=(this.pageIndex-1)*this.pageSize;
        if (count<0){
             count=0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex*this.pageSize;
    }

    public StuinfoCriteria(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
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

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStucodeIsNull() {
            addCriterion("stucode is null");
            return (Criteria) this;
        }

        public Criteria andStucodeIsNotNull() {
            addCriterion("stucode is not null");
            return (Criteria) this;
        }

        public Criteria andStucodeEqualTo(String value) {
            addCriterion("stucode =", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeNotEqualTo(String value) {
            addCriterion("stucode <>", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeGreaterThan(String value) {
            addCriterion("stucode >", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeGreaterThanOrEqualTo(String value) {
            addCriterion("stucode >=", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeLessThan(String value) {
            addCriterion("stucode <", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeLessThanOrEqualTo(String value) {
            addCriterion("stucode <=", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeLike(String value) {
            addCriterion("stucode like", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeNotLike(String value) {
            addCriterion("stucode not like", value, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeIn(List<String> values) {
            addCriterion("stucode in", values, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeNotIn(List<String> values) {
            addCriterion("stucode not in", values, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeBetween(String value1, String value2) {
            addCriterion("stucode between", value1, value2, "stucode");
            return (Criteria) this;
        }

        public Criteria andStucodeNotBetween(String value1, String value2) {
            addCriterion("stucode not between", value1, value2, "stucode");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andSexcodeIsNull() {
            addCriterion("sexcode is null");
            return (Criteria) this;
        }

        public Criteria andSexcodeIsNotNull() {
            addCriterion("sexcode is not null");
            return (Criteria) this;
        }

        public Criteria andSexcodeEqualTo(String value) {
            addCriterion("sexcode =", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotEqualTo(String value) {
            addCriterion("sexcode <>", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeGreaterThan(String value) {
            addCriterion("sexcode >", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sexcode >=", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeLessThan(String value) {
            addCriterion("sexcode <", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeLessThanOrEqualTo(String value) {
            addCriterion("sexcode <=", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeLike(String value) {
            addCriterion("sexcode like", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotLike(String value) {
            addCriterion("sexcode not like", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeIn(List<String> values) {
            addCriterion("sexcode in", values, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotIn(List<String> values) {
            addCriterion("sexcode not in", values, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeBetween(String value1, String value2) {
            addCriterion("sexcode between", value1, value2, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotBetween(String value1, String value2) {
            addCriterion("sexcode not between", value1, value2, "sexcode");
            return (Criteria) this;
        }

        public Criteria andStucodeLikeInsensitive(String value) {
            addCriterion("upper(stucode) like", value.toUpperCase(), "stucode");
            return (Criteria) this;
        }

        public Criteria andStunameLikeInsensitive(String value) {
            addCriterion("upper(stuname) like", value.toUpperCase(), "stuname");
            return (Criteria) this;
        }

        public Criteria andSexcodeLikeInsensitive(String value) {
            addCriterion("upper(sexcode) like", value.toUpperCase(), "sexcode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stuinfo
     *
     * @mbggenerated do_not_delete_during_merge Tue Dec 23 15:16:48 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
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