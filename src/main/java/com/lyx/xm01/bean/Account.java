package com.lyx.xm01.bean;

import java.io.Serializable;

public class Account implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.balance
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private Long balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.balance
     *
     * @return the value of account.balance
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.balance
     *
     * @param balance the value for account.balance
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }
}