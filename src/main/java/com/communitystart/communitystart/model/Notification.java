package com.communitystart.communitystart.model;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.id
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Integer notifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.receiver
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Integer receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.outId
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Long outid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.type
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.gmt_create
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.status
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier_name
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private String notifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.out_title
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    private String outTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.id
     *
     * @return the value of notification.id
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.id
     *
     * @param id the value for notification.id
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier
     *
     * @return the value of notification.notifier
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Integer getNotifier() {
        return notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier
     *
     * @param notifier the value for notification.notifier
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setNotifier(Integer notifier) {
        this.notifier = notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.receiver
     *
     * @return the value of notification.receiver
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Integer getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.receiver
     *
     * @param receiver the value for notification.receiver
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.outId
     *
     * @return the value of notification.outId
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Long getOutid() {
        return outid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.outId
     *
     * @param outid the value for notification.outId
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setOutid(Long outid) {
        this.outid = outid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.type
     *
     * @return the value of notification.type
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.type
     *
     * @param type the value for notification.type
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.gmt_create
     *
     * @return the value of notification.gmt_create
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.gmt_create
     *
     * @param gmtCreate the value for notification.gmt_create
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.status
     *
     * @return the value of notification.status
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.status
     *
     * @param status the value for notification.status
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier_name
     *
     * @return the value of notification.notifier_name
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public String getNotifierName() {
        return notifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier_name
     *
     * @param notifierName the value for notification.notifier_name
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setNotifierName(String notifierName) {
        this.notifierName = notifierName == null ? null : notifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.out_title
     *
     * @return the value of notification.out_title
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public String getOutTitle() {
        return outTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.out_title
     *
     * @param outTitle the value for notification.out_title
     *
     * @mbg.generated Wed May 24 21:54:53 CST 2023
     */
    public void setOutTitle(String outTitle) {
        this.outTitle = outTitle == null ? null : outTitle.trim();
    }
}