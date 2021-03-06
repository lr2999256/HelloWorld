package com.test.persistence.beans;

import java.io.Serializable;
import java.util.Date;

public class TTestUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_test_user.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_test_user.usr_nm
     *
     * @mbggenerated
     */
    private String usrNm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_test_user.pass_wd
     *
     * @mbggenerated
     */
    private String passWd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_test_user.tm_smp
     *
     * @mbggenerated
     */
    private Date tmSmp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_test_user.id
     *
     * @return the value of t_test_user.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_test_user.id
     *
     * @param id the value for t_test_user.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_test_user.usr_nm
     *
     * @return the value of t_test_user.usr_nm
     *
     * @mbggenerated
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_test_user.usr_nm
     *
     * @param usrNm the value for t_test_user.usr_nm
     *
     * @mbggenerated
     */
    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm == null ? null : usrNm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_test_user.pass_wd
     *
     * @return the value of t_test_user.pass_wd
     *
     * @mbggenerated
     */
    public String getPassWd() {
        return passWd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_test_user.pass_wd
     *
     * @param passWd the value for t_test_user.pass_wd
     *
     * @mbggenerated
     */
    public void setPassWd(String passWd) {
        this.passWd = passWd == null ? null : passWd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_test_user.tm_smp
     *
     * @return the value of t_test_user.tm_smp
     *
     * @mbggenerated
     */
    public Date getTmSmp() {
        return tmSmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_test_user.tm_smp
     *
     * @param tmSmp the value for t_test_user.tm_smp
     *
     * @mbggenerated
     */
    public void setTmSmp(Date tmSmp) {
        this.tmSmp = tmSmp;
    }
}