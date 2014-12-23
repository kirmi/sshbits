package com.shinowit.entity;

import java.io.Serializable;

public class Stuinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuinfo.stuid
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    private Integer stuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuinfo.stucode
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    private String stucode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuinfo.stuname
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    private String stuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stuinfo.sexcode
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    private String sexcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuinfo.stuid
     *
     * @return the value of stuinfo.stuid
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public Integer getStuid() {
        return stuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuinfo.stuid
     *
     * @param stuid the value for stuinfo.stuid
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuinfo.stucode
     *
     * @return the value of stuinfo.stucode
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public String getStucode() {
        return stucode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuinfo.stucode
     *
     * @param stucode the value for stuinfo.stucode
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void setStucode(String stucode) {
        this.stucode = stucode == null ? null : stucode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuinfo.stuname
     *
     * @return the value of stuinfo.stuname
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public String getStuname() {
        return stuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuinfo.stuname
     *
     * @param stuname the value for stuinfo.stuname
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stuinfo.sexcode
     *
     * @return the value of stuinfo.sexcode
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public String getSexcode() {
        return sexcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stuinfo.sexcode
     *
     * @param sexcode the value for stuinfo.sexcode
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    public void setSexcode(String sexcode) {
        this.sexcode = sexcode == null ? null : sexcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
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
        Stuinfo other = (Stuinfo) that;
        return (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getStucode() == null ? other.getStucode() == null : this.getStucode().equals(other.getStucode()))
            && (this.getStuname() == null ? other.getStuname() == null : this.getStuname().equals(other.getStuname()))
            && (this.getSexcode() == null ? other.getSexcode() == null : this.getSexcode().equals(other.getSexcode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:16:48 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getStucode() == null) ? 0 : getStucode().hashCode());
        result = prime * result + ((getStuname() == null) ? 0 : getStuname().hashCode());
        result = prime * result + ((getSexcode() == null) ? 0 : getSexcode().hashCode());
        return result;
    }
}