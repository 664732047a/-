package com.lyx.xm01.bean;

import java.io.Serializable;

public class Product implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.yongtu
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private String yongtu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.yongtu
     *
     * @return the value of product.yongtu
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public String getYongtu() {
        return yongtu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.yongtu
     *
     * @param yongtu the value for product.yongtu
     *
     * @mbg.generated Sun Dec 13 15:17:38 CST 2020
     */
    public void setYongtu(String yongtu) {
        this.yongtu = yongtu == null ? null : yongtu.trim();
    }
}