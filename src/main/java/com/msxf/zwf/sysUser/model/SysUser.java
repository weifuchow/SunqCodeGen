package com.msxf.zwf.sysUser.model;

import com.msxf.zwf.sysUser.utils.DataTypeUtils;
import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 SYS_USER的实体类
 * @category 能够登录的 人员信息表 hello
 * @author weifuzhou 2018-03-23 14:09:06
 * 
 */
@Entity
@Table(name = "SYS_USER")
public class SysUser implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "SYS_USER";

	@Id
	@SequenceGenerator(name = "SEQ_STORE", sequenceName = "SEQ_PERSON", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STORE")
	@Column(name="ID", nullable=false, length = 18)
	private Long id;

	@Column(name="LOGIN_NAME", nullable=false, length = 200)
	private String loginName;

	@Column(name="PASSWORD", nullable=false, length = 40)
	private String password;

	@Column(name="ENABLED", nullable=false, length = 1)
	private Boolean enabled;

	@Column(name="TOKEN_CHANGED", nullable=true, length = 1)
	private String tokenChanged;

	@Column(name="EMAIL", nullable=true, length = 50)
	private String email;

	@Column(name="URL_PARAMS", nullable=true, length = 1)
	private Boolean urlParams;

	@Column(name="UUID", nullable=true, length = 200)
	private String uuid;

	@Column(name="SYS_ID_FIRST", nullable=true, length = 18)
	private Long sysIdFirst;

	@Column(name="SYS_ID_LAST", nullable=true, length = 18)
	private Long sysIdLast;


    /**
     * SYS_USER
     * <p>关键字</p>
     */
    public void setId(Long value){
        this.id = value;
    }

    /**
     * <p>关键字</p>
     */
    public Long getId() {
        return this.id;
    }

    /**
     * SYS_USER
     * <p>登录名</p>
     */
    public void setLoginName(String value){
        this.loginName = value;
    }

    /**
     * <p>登录名</p>
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * SYS_USER
     * <p>密码</p>
     */
    public void setPassword(String value){
        this.password = value;
    }

    /**
     * <p>密码</p>
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * SYS_USER
     * <p>帐号状态 0 禁用,1正常（激活）,2-删除用户</p>
     */
    public void setEnabled(Boolean value){
        this.enabled = value;
    }

    /**
     * <p>帐号状态 0 禁用,1正常（激活）,2-删除用户</p>
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * SYS_USER
     * <p>标记是否已确认忘记密码邮件 0-未确认邮件  1-已确认邮件</p>
     */
    public void setTokenChanged(String value){
        this.tokenChanged = value;
    }

    /**
     * <p>标记是否已确认忘记密码邮件 0-未确认邮件  1-已确认邮件</p>
     */
    public String getTokenChanged() {
        return this.tokenChanged;
    }

    /**
     * SYS_USER
     * <p>首选通信邮件地址</p>
     */
    public void setEmail(String value){
        this.email = value;
    }

    /**
     * <p>首选通信邮件地址</p>
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * SYS_USER
     * <p>是否生成直接登陆url参数，1已经生成，0未生成。查看sys_user_params</p>
     */
    public void setUrlParams(Boolean value){
        this.urlParams = value;
    }

    /**
     * <p>是否生成直接登陆url参数，1已经生成，0未生成。查看sys_user_params</p>
     */
    public Boolean getUrlParams() {
        return this.urlParams;
    }

    /**
     * SYS_USER
     * <p>重置密码参数</p>
     */
    public void setUuid(String value){
        this.uuid = value;
    }

    /**
     * <p>重置密码参数</p>
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * SYS_USER
     * <p>用户注册的系统</p>
     */
    public void setSysIdFirst(Long value){
        this.sysIdFirst = value;
    }

    /**
     * <p>用户注册的系统</p>
     */
    public Long getSysIdFirst() {
        return this.sysIdFirst;
    }

    /**
     * SYS_USER
     * <p>用户所属地的系统，（所属地没有系统时，填写用户注册的系统）</p>
     */
    public void setSysIdLast(Long value){
        this.sysIdLast = value;
    }

    /**
     * <p>用户所属地的系统，（所属地没有系统时，填写用户注册的系统）</p>
     */
    public Long getSysIdLast() {
        return this.sysIdLast;
    }


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("loginName", loginName);
        map.put("password", password);
        map.put("enabled", enabled);
        map.put("tokenChanged", tokenChanged);
        map.put("email", email);
        map.put("urlParams", urlParams);
        map.put("uuid", uuid);
        map.put("sysIdFirst", sysIdFirst);
        map.put("sysIdLast", sysIdLast);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) this.setId(DataTypeUtils.getLongValue(map.get("id")));
        if(map.containsKey("loginName")) this.setLoginName(DataTypeUtils.getStringValue(map.get("loginName")));
        if(map.containsKey("password")) this.setPassword(DataTypeUtils.getStringValue(map.get("password")));
        if(map.containsKey("enabled")) this.setEnabled(DataTypeUtils.getBooleanValue(map.get("enabled")));
        if(map.containsKey("tokenChanged")) this.setTokenChanged(DataTypeUtils.getStringValue(map.get("tokenChanged")));
        if(map.containsKey("email")) this.setEmail(DataTypeUtils.getStringValue(map.get("email")));
        if(map.containsKey("urlParams")) this.setUrlParams(DataTypeUtils.getBooleanValue(map.get("urlParams")));
        if(map.containsKey("uuid")) this.setUuid(DataTypeUtils.getStringValue(map.get("uuid")));
        if(map.containsKey("sysIdFirst")) this.setSysIdFirst(DataTypeUtils.getLongValue(map.get("sysIdFirst")));
        if(map.containsKey("sysIdLast")) this.setSysIdLast(DataTypeUtils.getLongValue(map.get("sysIdLast")));
    }

}
