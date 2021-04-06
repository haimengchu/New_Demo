package com.hmc.crm.settings.bean;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author 海梦初
 * @Date 2021/4/6
 * @Time 14:38
 */
@Table(name = "t_user")
@NameStyle(Style.normal)
public class User {
    @Id
    private String uid;             //主键UUID
    private String account;         //登录账号
    private String username;        //用户姓名
    private String password;        //登录密码:不能明文登录 MD5加密
    private String email;           //邮箱
    private String agingTime;       //失效时间:注册的时候指定使用时期 yyyy-MM-dd HH:mm:ss 失效时间为空的时候表示永不失效
    private String lockState;       //账户是否被锁定 0表示被锁 1表示启用
    private String deptNumber;      //所在部门
    private String allowed;         //允许访问的IP 为空时表示不受限制
    private String creationTime;    //创建时间 yyyy-MM-dd HH:mm:ss
    private String creator;         //创建者
    private String changeTime;      //修改时间 yyyy-MM-dd HH:mm:ss
    private String editor;          //修改者

    public User() {
    }

    public User(String uid, String account, String username, String password, String email, String agingTime,
                String lockState, String deptNumber, String allowed, String creationTime, String creator,
                String changeTime, String editor) {
        this.uid = uid;
        this.account = account;
        this.username = username;
        this.password = password;
        this.email = email;
        this.agingTime = agingTime;
        this.lockState = lockState;
        this.deptNumber = deptNumber;
        this.allowed = allowed;
        this.creationTime = creationTime;
        this.creator = creator;
        this.changeTime = changeTime;
        this.editor = editor;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAgingTime() {
        return agingTime;
    }

    public void setAgingTime(String agingTime) {
        this.agingTime = agingTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getAllowed() {
        return allowed;
    }

    public void setAllowed(String allowed) {
        this.allowed = allowed;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", agingTime='" + agingTime + '\'' +
                ", lockState='" + lockState + '\'' +
                ", deptNumber='" + deptNumber + '\'' +
                ", allowed='" + allowed + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", creator='" + creator + '\'' +
                ", changeTime='" + changeTime + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
