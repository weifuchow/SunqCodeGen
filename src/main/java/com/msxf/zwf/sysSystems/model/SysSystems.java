package com.msxf.zwf.sysSystems.model;

import com.msxf.zwf.utils.DataTypeUtils;
import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 SYS_SYSTEMS的实体类
 * @category 互联子地方平台信息
 * @author weifuzhou 2018-03-23 17:56:09
 * 
 */
@Entity
@Table(name = "SYS_SYSTEMS")
public class SysSystems implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "SYS_SYSTEMS";

	@Id
	@Column(name="ID", nullable=false, length = 18)
	private Long id;

	@Column(name="DOMAIN", nullable=false, length = 200)
	private String domain;

	@Column(name="SYSTEM_IN_NAME", nullable=false, length = 200)
	private String systemInName;

	@Column(name="CREATE_DATE", nullable=false, length = 7)
	private Date createDate;

	@Column(name="DISPLAY_NAME", nullable=false, length = 500)
	private String displayName;

	@Column(name="REGION_ID", nullable=false, length = 22)
	private BigDecimal regionId;

	@Column(name="IP_SCOPE", nullable=true, length = 200)
	private String ipScope;

	@Column(name="SYSTEM_TYPE", nullable=true, length = 100)
	private String systemType;

	@Column(name="LOCALE_OPERATION", nullable=true, length = 100)
	private String localeOperation;

	@Column(name="LOCALE_PERSON", nullable=true, length = 100)
	private String localePerson;

	@Column(name="LOCALE_CONTRACT", nullable=true, length = 100)
	private String localeContract;

	@Column(name="HEAD_FOOT_TYPE", nullable=true, length = 100)
	private String headFootType;

	@Column(name="HEAD_FOOT_ID", nullable=true, length = 18)
	private Long headFootId;

	@Column(name="MOD_IDS", nullable=true, length = 1000)
	private String modIds;

	@Column(name="MOD_REF_SYS_ID", nullable=true, length = 18)
	private Long modRefSysId;

	@Column(name="PARENT_ID", nullable=true, length = 18)
	private Long parentId;

	@Column(name="CHILD_IDS", nullable=true, length = 100)
	private String childIds;

	@Column(name="TEXT_HEADER_LOGO_URL", nullable=true, length = 200)
	private String textHeaderLogoUrl;

	@Column(name="TEXT_HEADER_LOGO_LINK", nullable=true, length = 300)
	private String textHeaderLogoLink;

	@Column(name="TEXT_FOOTER_HTML", nullable=true, length = 1000)
	private String textFooterHtml;

	@Column(name="PAGE_HEADER_NAME", nullable=true, length = 100)
	private String pageHeaderName;

	@Column(name="PAGE_FOOTER_NAME", nullable=true, length = 100)
	private String pageFooterName;

	@Column(name="BEGIN_DATE", nullable=true, length = 7)
	private Date beginDate;

	@Column(name="END_DATE", nullable=true, length = 7)
	private Date endDate;

	@Column(name="MOD_IDS_NAME", nullable=true, length = 700)
	private String modIdsName;

	@Column(name="REGION_NAME", nullable=true, length = 200)
	private String regionName;

	@Column(name="CHANNEL_IDS", nullable=true, length = 200)
	private String channelIds;

	@Column(name="INDEX_ARTICLE_ID", nullable=true, length = 18)
	private Long indexArticleId;

	@Column(name="STATUS", nullable=true, length = 1)
	private Boolean status;


    /**
     * SYS_SYSTEMS
     * <p>id</p>
     */
    public void setId(Long value){
        this.id = value;
    }

    /**
     * <p>id</p>
     */
    public Long getId() {
        return this.id;
    }

    /**
     * SYS_SYSTEMS
     * <p>域名</p>
     */
    public void setDomain(String value){
        this.domain = value;
    }

    /**
     * <p>域名</p>
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * SYS_SYSTEMS
     * <p>系统内部简称</p>
     */
    public void setSystemInName(String value){
        this.systemInName = value;
    }

    /**
     * <p>系统内部简称</p>
     */
    public String getSystemInName() {
        return this.systemInName;
    }

    /**
     * SYS_SYSTEMS
     * <p>创建时间</p>
     */
    public void setCreateDate(Date value){
        this.createDate = value;
    }

    /**
     * <p>创建时间</p>
     */
    public Date getCreateDate() {
        return this.createDate;
    }

    /**
     * SYS_SYSTEMS
     * <p>显示名称</p>
     */
    public void setDisplayName(String value){
        this.displayName = value;
    }

    /**
     * <p>显示名称</p>
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * SYS_SYSTEMS
     * <p>地区编码</p>
     */
    public void setRegionId(BigDecimal value){
        this.regionId = value;
    }

    /**
     * <p>地区编码</p>
     */
    public BigDecimal getRegionId() {
        return this.regionId;
    }

    /**
     * SYS_SYSTEMS
     * <p>ip范围</p>
     */
    public void setIpScope(String value){
        this.ipScope = value;
    }

    /**
     * <p>ip范围</p>
     */
    public String getIpScope() {
        return this.ipScope;
    }

    /**
     * SYS_SYSTEMS
     * <p>系统类型： 服务类型， 专利交易类型（用于显示不同的模版）</p>
     */
    public void setSystemType(String value){
        this.systemType = value;
    }

    /**
     * <p>系统类型： 服务类型， 专利交易类型（用于显示不同的模版）</p>
     */
    public String getSystemType() {
        return this.systemType;
    }

    /**
     * SYS_SYSTEMS
     * <p>运营单位</p>
     */
    public void setLocaleOperation(String value){
        this.localeOperation = value;
    }

    /**
     * <p>运营单位</p>
     */
    public String getLocaleOperation() {
        return this.localeOperation;
    }

    /**
     * SYS_SYSTEMS
     * <p>运营联系人</p>
     */
    public void setLocalePerson(String value){
        this.localePerson = value;
    }

    /**
     * <p>运营联系人</p>
     */
    public String getLocalePerson() {
        return this.localePerson;
    }

    /**
     * SYS_SYSTEMS
     * <p>运营联系方式</p>
     */
    public void setLocaleContract(String value){
        this.localeContract = value;
    }

    /**
     * <p>运营联系方式</p>
     */
    public String getLocaleContract() {
        return this.localeContract;
    }

    /**
     * SYS_SYSTEMS
     * <p>顶部底部 定制模式 page/text</p>
     */
    public void setHeadFootType(String value){
        this.headFootType = value;
    }

    /**
     * <p>顶部底部 定制模式 page/text</p>
     */
    public String getHeadFootType() {
        return this.headFootType;
    }

    /**
     * SYS_SYSTEMS
     * <p>headFootId</p>
     */
    public void setHeadFootId(Long value){
        this.headFootId = value;
    }

    /**
     * <p>headFootId</p>
     */
    public Long getHeadFootId() {
        return this.headFootId;
    }

    /**
     * SYS_SYSTEMS
     * <p>模块ids，逗号隔开有值优先用,无值取mod_ref_sys_id</p>
     */
    public void setModIds(String value){
        this.modIds = value;
    }

    /**
     * <p>模块ids，逗号隔开有值优先用,无值取mod_ref_sys_id</p>
     */
    public String getModIds() {
        return this.modIds;
    }

    /**
     * SYS_SYSTEMS
     * <p>若有值，资源菜单也包括include,except</p>
     */
    public void setModRefSysId(Long value){
        this.modRefSysId = value;
    }

    /**
     * <p>若有值，资源菜单也包括include,except</p>
     */
    public Long getModRefSysId() {
        return this.modRefSysId;
    }

    /**
     * SYS_SYSTEMS
     * <p>父系统</p>
     */
    public void setParentId(Long value){
        this.parentId = value;
    }

    /**
     * <p>父系统</p>
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * SYS_SYSTEMS
     * <p>子系统，多个以逗号隔开</p>
     */
    public void setChildIds(String value){
        this.childIds = value;
    }

    /**
     * <p>子系统，多个以逗号隔开</p>
     */
    public String getChildIds() {
        return this.childIds;
    }

    /**
     * SYS_SYSTEMS
     * <p>Header LOGO图片图像地址</p>
     */
    public void setTextHeaderLogoUrl(String value){
        this.textHeaderLogoUrl = value;
    }

    /**
     * <p>Header LOGO图片图像地址</p>
     */
    public String getTextHeaderLogoUrl() {
        return this.textHeaderLogoUrl;
    }

    /**
     * SYS_SYSTEMS
     * <p>Header LOGO图片点击链接</p>
     */
    public void setTextHeaderLogoLink(String value){
        this.textHeaderLogoLink = value;
    }

    /**
     * <p>Header LOGO图片点击链接</p>
     */
    public String getTextHeaderLogoLink() {
        return this.textHeaderLogoLink;
    }

    /**
     * SYS_SYSTEMS
     * <p>底部HTML</p>
     */
    public void setTextFooterHtml(String value){
        this.textFooterHtml = value;
    }

    /**
     * <p>底部HTML</p>
     */
    public String getTextFooterHtml() {
        return this.textFooterHtml;
    }

    /**
     * SYS_SYSTEMS
     * <p>项目路径 skins/xx 头部页面引用名</p>
     */
    public void setPageHeaderName(String value){
        this.pageHeaderName = value;
    }

    /**
     * <p>项目路径 skins/xx 头部页面引用名</p>
     */
    public String getPageHeaderName() {
        return this.pageHeaderName;
    }

    /**
     * SYS_SYSTEMS
     * <p>项目路径 skins/xx 底部页面引用名</p>
     */
    public void setPageFooterName(String value){
        this.pageFooterName = value;
    }

    /**
     * <p>项目路径 skins/xx 底部页面引用名</p>
     */
    public String getPageFooterName() {
        return this.pageFooterName;
    }

    /**
     * SYS_SYSTEMS
     * <p>有效开通时间</p>
     */
    public void setBeginDate(Date value){
        this.beginDate = value;
    }

    /**
     * <p>有效开通时间</p>
     */
    public Date getBeginDate() {
        return this.beginDate;
    }

    /**
     * SYS_SYSTEMS
     * <p>有效截止时间</p>
     */
    public void setEndDate(Date value){
        this.endDate = value;
    }

    /**
     * <p>有效截止时间</p>
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * SYS_SYSTEMS
     * <p>模块名称</p>
     */
    public void setModIdsName(String value){
        this.modIdsName = value;
    }

    /**
     * <p>模块名称</p>
     */
    public String getModIdsName() {
        return this.modIdsName;
    }

    /**
     * SYS_SYSTEMS
     * <p>地区名</p>
     */
    public void setRegionName(String value){
        this.regionName = value;
    }

    /**
     * <p>地区名</p>
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * SYS_SYSTEMS
     * <p>信息发布频道ids</p>
     */
    public void setChannelIds(String value){
        this.channelIds = value;
    }

    /**
     * <p>信息发布频道ids</p>
     */
    public String getChannelIds() {
        return this.channelIds;
    }

    /**
     * SYS_SYSTEMS
     * <p>首页文章Id</p>
     */
    public void setIndexArticleId(Long value){
        this.indexArticleId = value;
    }

    /**
     * <p>首页文章Id</p>
     */
    public Long getIndexArticleId() {
        return this.indexArticleId;
    }

    /**
     * SYS_SYSTEMS
     * <p>状态，1为有效，0无效</p>
     */
    public void setStatus(Boolean value){
        this.status = value;
    }

    /**
     * <p>状态，1为有效，0无效</p>
     */
    public Boolean getStatus() {
        return this.status;
    }


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("domain", domain);
        map.put("systemInName", systemInName);
        map.put("createDate", createDate);
        map.put("displayName", displayName);
        map.put("regionId", regionId);
        map.put("ipScope", ipScope);
        map.put("systemType", systemType);
        map.put("localeOperation", localeOperation);
        map.put("localePerson", localePerson);
        map.put("localeContract", localeContract);
        map.put("headFootType", headFootType);
        map.put("headFootId", headFootId);
        map.put("modIds", modIds);
        map.put("modRefSysId", modRefSysId);
        map.put("parentId", parentId);
        map.put("childIds", childIds);
        map.put("textHeaderLogoUrl", textHeaderLogoUrl);
        map.put("textHeaderLogoLink", textHeaderLogoLink);
        map.put("textFooterHtml", textFooterHtml);
        map.put("pageHeaderName", pageHeaderName);
        map.put("pageFooterName", pageFooterName);
        map.put("beginDate", beginDate);
        map.put("endDate", endDate);
        map.put("modIdsName", modIdsName);
        map.put("regionName", regionName);
        map.put("channelIds", channelIds);
        map.put("indexArticleId", indexArticleId);
        map.put("status", status);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) this.setId(DataTypeUtils.getLongValue(map.get("id")));
        if(map.containsKey("domain")) this.setDomain(DataTypeUtils.getStringValue(map.get("domain")));
        if(map.containsKey("systemInName")) this.setSystemInName(DataTypeUtils.getStringValue(map.get("systemInName")));
        if(map.containsKey("createDate")) this.setCreateDate(DataTypeUtils.getDateValue(map.get("createDate")));
        if(map.containsKey("displayName")) this.setDisplayName(DataTypeUtils.getStringValue(map.get("displayName")));
        if(map.containsKey("regionId")) this.setRegionId(DataTypeUtils.getBigDecimalValue(map.get("regionId")));
        if(map.containsKey("ipScope")) this.setIpScope(DataTypeUtils.getStringValue(map.get("ipScope")));
        if(map.containsKey("systemType")) this.setSystemType(DataTypeUtils.getStringValue(map.get("systemType")));
        if(map.containsKey("localeOperation")) this.setLocaleOperation(DataTypeUtils.getStringValue(map.get("localeOperation")));
        if(map.containsKey("localePerson")) this.setLocalePerson(DataTypeUtils.getStringValue(map.get("localePerson")));
        if(map.containsKey("localeContract")) this.setLocaleContract(DataTypeUtils.getStringValue(map.get("localeContract")));
        if(map.containsKey("headFootType")) this.setHeadFootType(DataTypeUtils.getStringValue(map.get("headFootType")));
        if(map.containsKey("headFootId")) this.setHeadFootId(DataTypeUtils.getLongValue(map.get("headFootId")));
        if(map.containsKey("modIds")) this.setModIds(DataTypeUtils.getStringValue(map.get("modIds")));
        if(map.containsKey("modRefSysId")) this.setModRefSysId(DataTypeUtils.getLongValue(map.get("modRefSysId")));
        if(map.containsKey("parentId")) this.setParentId(DataTypeUtils.getLongValue(map.get("parentId")));
        if(map.containsKey("childIds")) this.setChildIds(DataTypeUtils.getStringValue(map.get("childIds")));
        if(map.containsKey("textHeaderLogoUrl")) this.setTextHeaderLogoUrl(DataTypeUtils.getStringValue(map.get("textHeaderLogoUrl")));
        if(map.containsKey("textHeaderLogoLink")) this.setTextHeaderLogoLink(DataTypeUtils.getStringValue(map.get("textHeaderLogoLink")));
        if(map.containsKey("textFooterHtml")) this.setTextFooterHtml(DataTypeUtils.getStringValue(map.get("textFooterHtml")));
        if(map.containsKey("pageHeaderName")) this.setPageHeaderName(DataTypeUtils.getStringValue(map.get("pageHeaderName")));
        if(map.containsKey("pageFooterName")) this.setPageFooterName(DataTypeUtils.getStringValue(map.get("pageFooterName")));
        if(map.containsKey("beginDate")) this.setBeginDate(DataTypeUtils.getDateValue(map.get("beginDate")));
        if(map.containsKey("endDate")) this.setEndDate(DataTypeUtils.getDateValue(map.get("endDate")));
        if(map.containsKey("modIdsName")) this.setModIdsName(DataTypeUtils.getStringValue(map.get("modIdsName")));
        if(map.containsKey("regionName")) this.setRegionName(DataTypeUtils.getStringValue(map.get("regionName")));
        if(map.containsKey("channelIds")) this.setChannelIds(DataTypeUtils.getStringValue(map.get("channelIds")));
        if(map.containsKey("indexArticleId")) this.setIndexArticleId(DataTypeUtils.getLongValue(map.get("indexArticleId")));
        if(map.containsKey("status")) this.setStatus(DataTypeUtils.getBooleanValue(map.get("status")));
    }

}
