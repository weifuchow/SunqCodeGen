package com.msxf.zwf.model;

import com.msxf.zwf.utils.DataTypeUtils;
import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 ACTIVITIES_COURSE
 * Database Table:ACTIVITIES_COURSE to ClassName:ActivitiesCourse
 * @author weifuzhou
 */
@Entity
@Table(name = "ACTIVITIES_COURSE")
public class ActivitiesCourse implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "ACTIVITIES_COURSE";

	@Id
	@Column(name="ID", nullable=false, length = 18)
	private Long id;

	@Column(name="INS_ID", nullable=false, length = 18)
	private Long insId;

	@Column(name="TYPE_ID", nullable=false, length = 18)
	private Long typeId;

	@Column(name="TITLE", nullable=false, length = 200)
	private String title;

	@Column(name="ADDRESS", nullable=false, length = 200)
	private String address;

	@Column(name="ORGANIZER", nullable=false, length = 200)
	private String organizer;

	@Column(name="REGISTRATION", nullable=true, length = 200)
	private String registration;

	@Column(name="CONTACT", nullable=false, length = 200)
	private String contact;

	@Column(name="FEES", nullable=false, length = 200)
	private String fees;

	@Column(name="SPEAKER", nullable=false, length = 100)
	private String speaker;

	@Column(name="PSN_LIMIT", nullable=true, length = 5)
	private Integer psnLimit;

	@Column(name="MEET_OBJECT", nullable=true, length = 200)
	private String meetObject;

	@Column(name="START_DAY", nullable=false, length = 10)
	private String startDay;

	@Column(name="START_TIME", nullable=false, length = 5)
	private String startTime;

	@Column(name="START_DATE", nullable=false, length = 7)
	private Date startDate;

	@Column(name="END_DAY", nullable=false, length = 10)
	private String endDay;

	@Column(name="END_TIME", nullable=false, length = 5)
	private String endTime;

	@Column(name="END_DATE", nullable=false, length = 7)
	private Date endDate;

	@Column(name="REGISTRATION_FORMS_DAY", nullable=true, length = 20)
	private String registrationFormsDay;

	@Column(name="REGISTRATION_FORMS_TIME", nullable=true, length = 10)
	private String registrationFormsTime;

	@Column(name="REGISTRATION_FORMS_DATE", nullable=true, length = 7)
	private Date registrationFormsDate;

	@Column(name="ICON_URL", nullable=false, length = 200)
	private String iconUrl;

	@Column(name="STATUS", nullable=false, length = 1)
	private Boolean status;

	@Column(name="CREATE_PSN_ID", nullable=false, length = 18)
	private Long createPsnId;

	@Column(name="CREATE_DATE", nullable=false, length = 7)
	private Date createDate;

	@Column(name="AUDIT_PSN_ID", nullable=true, length = 18)
	private Long auditPsnId;

	@Column(name="AUDIT_DATE", nullable=true, length = 7)
	private Date auditDate;

	@Column(name="OVERDUE_TIME", nullable=false, length = 22)
	private BigDecimal overdueTime;

	@Column(name="FORM_ID", nullable=true, length = 18)
	private Long formId;

	@Column(name="SMS_FLAG", nullable=true, length = 1)
	private Boolean smsFlag;

	@Column(name="BRAND", nullable=true, length = 1)
	private Boolean brand;

	@Column(name="TOP_FLAG", nullable=true, length = 1)
	private Boolean topFlag;

	@Column(name="UNDERTAKER", nullable=true, length = 200)
	private String undertaker;

	@Column(name="CONTACT_PSN", nullable=true, length = 50)
	private String contactPsn;

	@Column(name="MODIFY_TIMES", nullable=true, length = 2)
	private Integer modifyTimes;

	@Column(name="FINISH_DATE", nullable=true, length = 7)
	private Date finishDate;

	@Column(name="COURSE_TYPE", nullable=true, length = 1)
	private Boolean courseType;

	@Column(name="HOLD_INS_ID", nullable=true, length = 2000)
	private String holdInsId;

	@Column(name="HOLD_ACHIVE_ID", nullable=true, length = 2000)
	private String holdAchiveId;

	@Column(name="HOLD_NEEDS_ID", nullable=true, length = 2000)
	private String holdNeedsId;

	@Column(name="INS_COUNT_PER_PAGE", nullable=true, length = 18)
	private Long insCountPerPage;

	@Column(name="INS_PAGE_COUNT", nullable=true, length = 18)
	private Long insPageCount;

	@Column(name="XQ_COUNT_PER_PAGE", nullable=true, length = 18)
	private Long xqCountPerPage;

	@Column(name="XQ_PAGE_COUNT", nullable=true, length = 18)
	private Long xqPageCount;

	@Column(name="CG_COUNT_PER_PAGE", nullable=true, length = 18)
	private Long cgCountPerPage;

	@Column(name="CG_PAGE_COUNT", nullable=true, length = 18)
	private Long cgPageCount;

	@Column(name="ZJ_COUNT_PER_PAGE", nullable=true, length = 18)
	private Long zjCountPerPage;

	@Column(name="ZJ_PAGE_COUNT", nullable=true, length = 18)
	private Long zjPageCount;

	@Column(name="STATIC_LAST_GEN_DATE", nullable=true, length = 7)
	private Date staticLastGenDate;

	@Column(name="STATIC_START_GEN__DATE", nullable=true, length = 7)
	private Date staticStartGenDate;

	@Column(name="MAIN_CATEGORY", nullable=true, length = 500)
	private String mainCategory;

	@Column(name="SECOND_CATEGORY", nullable=true, length = 2000)
	private String secondCategory;

	@Column(name="WIN_TYPE_ID", nullable=true, length = 5)
	private Integer winTypeId;

	@Column(name="WIN_PATH", nullable=true, length = 400)
	private String winPath;

	@Column(name="WIN_FLAG", nullable=true, length = 2)
	private Integer winFlag;

	@Column(name="ICON_URL_SMALL", nullable=true, length = 200)
	private String iconUrlSmall;

	@Column(name="SYS_ID", nullable=true, length = 18)
	private Long sysId;

	@Column(name="AREA_ID", nullable=true, length = 18)
	private Long areaId;

	@Column(name="TOTAL_ATTEND_COUNT", nullable=true, length = 18)
	private Long totalAttendCount;


    /**
     * <p>pk</p>
     */
    public void setId(Long value){
        this.id = value;
    }

    /**
     * <p>pk</p>
     */
    public Long getId() {
        return this.id;
    }

    /**
     * <p>机构id</p>
     */
    public void setInsId(Long value){
        this.insId = value;
    }

    /**
     * <p>机构id</p>
     */
    public Long getInsId() {
        return this.insId;
    }

    /**
     * <p>活动分类id，关联CONST_CATEGORY_ACTIVITIES表id</p>
     */
    public void setTypeId(Long value){
        this.typeId = value;
    }

    /**
     * <p>活动分类id，关联CONST_CATEGORY_ACTIVITIES表id</p>
     */
    public Long getTypeId() {
        return this.typeId;
    }

    /**
     * <p>课程标题</p>
     */
    public void setTitle(String value){
        this.title = value;
    }

    /**
     * <p>课程标题</p>
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * <p>举办地点</p>
     */
    public void setAddress(String value){
        this.address = value;
    }

    /**
     * <p>举办地点</p>
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * <p>主办单位</p>
     */
    public void setOrganizer(String value){
        this.organizer = value;
    }

    /**
     * <p>主办单位</p>
     */
    public String getOrganizer() {
        return this.organizer;
    }

    /**
     * <p>报名方式</p>
     */
    public void setRegistration(String value){
        this.registration = value;
    }

    /**
     * <p>报名方式</p>
     */
    public String getRegistration() {
        return this.registration;
    }

    /**
     * <p>联系方式</p>
     */
    public void setContact(String value){
        this.contact = value;
    }

    /**
     * <p>联系方式</p>
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * <p>课程费用</p>
     */
    public void setFees(String value){
        this.fees = value;
    }

    /**
     * <p>课程费用</p>
     */
    public String getFees() {
        return this.fees;
    }

    /**
     * <p>主讲人</p>
     */
    public void setSpeaker(String value){
        this.speaker = value;
    }

    /**
     * <p>主讲人</p>
     */
    public String getSpeaker() {
        return this.speaker;
    }

    /**
     * <p>人数限额</p>
     */
    public void setPsnLimit(Integer value){
        this.psnLimit = value;
    }

    /**
     * <p>人数限额</p>
     */
    public Integer getPsnLimit() {
        return this.psnLimit;
    }

    /**
     * <p>适应对象</p>
     */
    public void setMeetObject(String value){
        this.meetObject = value;
    }

    /**
     * <p>适应对象</p>
     */
    public String getMeetObject() {
        return this.meetObject;
    }

    /**
     * <p>举办时间-开始日期，如：2014/08/20</p>
     */
    public void setStartDay(String value){
        this.startDay = value;
    }

    /**
     * <p>举办时间-开始日期，如：2014/08/20</p>
     */
    public String getStartDay() {
        return this.startDay;
    }

    /**
     * <p>举办时间-开始时间，如：01:40</p>
     */
    public void setStartTime(String value){
        this.startTime = value;
    }

    /**
     * <p>举办时间-开始时间，如：01:40</p>
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>举办开始时间(冗余)</p>
     */
    public void setStartDate(Date value){
        this.startDate = value;
    }

    /**
     * <p>举办开始时间(冗余)</p>
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>举办时间-结束日期，如：2014/09/20</p>
     */
    public void setEndDay(String value){
        this.endDay = value;
    }

    /**
     * <p>举办时间-结束日期，如：2014/09/20</p>
     */
    public String getEndDay() {
        return this.endDay;
    }

    /**
     * <p>举办时间-结束时间，如：03:40</p>
     */
    public void setEndTime(String value){
        this.endTime = value;
    }

    /**
     * <p>举办时间-结束时间，如：03:40</p>
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>举办结束时间(冗余)</p>
     */
    public void setEndDate(Date value){
        this.endDate = value;
    }

    /**
     * <p>举办结束时间(冗余)</p>
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>报名截止日期，如：2014/08/20</p>
     */
    public void setRegistrationFormsDay(String value){
        this.registrationFormsDay = value;
    }

    /**
     * <p>报名截止日期，如：2014/08/20</p>
     */
    public String getRegistrationFormsDay() {
        return this.registrationFormsDay;
    }

    /**
     * <p>报名截止时间，如：17：00</p>
     */
    public void setRegistrationFormsTime(String value){
        this.registrationFormsTime = value;
    }

    /**
     * <p>报名截止时间，如：17：00</p>
     */
    public String getRegistrationFormsTime() {
        return this.registrationFormsTime;
    }

    /**
     * <p>报名截止时间(冗余)</p>
     */
    public void setRegistrationFormsDate(Date value){
        this.registrationFormsDate = value;
    }

    /**
     * <p>报名截止时间(冗余)</p>
     */
    public Date getRegistrationFormsDate() {
        return this.registrationFormsDate;
    }

    /**
     * <p>讲座图标图标地址</p>
     */
    public void setIconUrl(String value){
        this.iconUrl = value;
    }

    /**
     * <p>讲座图标图标地址</p>
     */
    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * <p>状态：0待审核，1已批准，2已拒绝，3活动完成，9删除</p>
     */
    public void setStatus(Boolean value){
        this.status = value;
    }

    /**
     * <p>状态：0待审核，1已批准，2已拒绝，3活动完成，9删除</p>
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * <p>创建人id</p>
     */
    public void setCreatePsnId(Long value){
        this.createPsnId = value;
    }

    /**
     * <p>创建人id</p>
     */
    public Long getCreatePsnId() {
        return this.createPsnId;
    }

    /**
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
     * <p>审核人id</p>
     */
    public void setAuditPsnId(Long value){
        this.auditPsnId = value;
    }

    /**
     * <p>审核人id</p>
     */
    public Long getAuditPsnId() {
        return this.auditPsnId;
    }

    /**
     * <p>审核时间</p>
     */
    public void setAuditDate(Date value){
        this.auditDate = value;
    }

    /**
     * <p>审核时间</p>
     */
    public Date getAuditDate() {
        return this.auditDate;
    }

    /**
     * <p>过期时间Date.geTime(),默认是报名截止时间/举办结束时间</p>
     */
    public void setOverdueTime(BigDecimal value){
        this.overdueTime = value;
    }

    /**
     * <p>过期时间Date.geTime(),默认是报名截止时间/举办结束时间</p>
     */
    public BigDecimal getOverdueTime() {
        return this.overdueTime;
    }

    /**
     * <p>formId</p>
     */
    public void setFormId(Long value){
        this.formId = value;
    }

    /**
     * <p>formId</p>
     */
    public Long getFormId() {
        return this.formId;
    }

    /**
     * <p>课程信息变动是否发短信，0：不发 1：发</p>
     */
    public void setSmsFlag(Boolean value){
        this.smsFlag = value;
    }

    /**
     * <p>课程信息变动是否发短信，0：不发 1：发</p>
     */
    public Boolean getSmsFlag() {
        return this.smsFlag;
    }

    /**
     * <p>是否品牌活动，是为1，否为0</p>
     */
    public void setBrand(Boolean value){
        this.brand = value;
    }

    /**
     * <p>是否品牌活动，是为1，否为0</p>
     */
    public Boolean getBrand() {
        return this.brand;
    }

    /**
     * <p>是否置顶活动，是为1，否为0</p>
     */
    public void setTopFlag(Boolean value){
        this.topFlag = value;
    }

    /**
     * <p>是否置顶活动，是为1，否为0</p>
     */
    public Boolean getTopFlag() {
        return this.topFlag;
    }

    /**
     * <p>承办单位</p>
     */
    public void setUndertaker(String value){
        this.undertaker = value;
    }

    /**
     * <p>承办单位</p>
     */
    public String getUndertaker() {
        return this.undertaker;
    }

    /**
     * <p>联系人</p>
     */
    public void setContactPsn(String value){
        this.contactPsn = value;
    }

    /**
     * <p>联系人</p>
     */
    public String getContactPsn() {
        return this.contactPsn;
    }

    /**
     * <p>活动修改次数</p>
     */
    public void setModifyTimes(Integer value){
        this.modifyTimes = value;
    }

    /**
     * <p>活动修改次数</p>
     */
    public Integer getModifyTimes() {
        return this.modifyTimes;
    }

    /**
     * <p>活动完成时间</p>
     */
    public void setFinishDate(Date value){
        this.finishDate = value;
    }

    /**
     * <p>活动完成时间</p>
     */
    public Date getFinishDate() {
        return this.finishDate;
    }

    /**
     * <p>活动类型，1：品牌活动2：大型双创活动</p>
     */
    public void setCourseType(Boolean value){
        this.courseType = value;
    }

    /**
     * <p>活动类型，1：品牌活动2：大型双创活动</p>
     */
    public Boolean getCourseType() {
        return this.courseType;
    }

    /**
     * <p>holdInsId</p>
     */
    public void setHoldInsId(String value){
        this.holdInsId = value;
    }

    /**
     * <p>holdInsId</p>
     */
    public String getHoldInsId() {
        return this.holdInsId;
    }

    /**
     * <p>holdAchiveId</p>
     */
    public void setHoldAchiveId(String value){
        this.holdAchiveId = value;
    }

    /**
     * <p>holdAchiveId</p>
     */
    public String getHoldAchiveId() {
        return this.holdAchiveId;
    }

    /**
     * <p>holdNeedsId</p>
     */
    public void setHoldNeedsId(String value){
        this.holdNeedsId = value;
    }

    /**
     * <p>holdNeedsId</p>
     */
    public String getHoldNeedsId() {
        return this.holdNeedsId;
    }

    /**
     * <p>insCountPerPage</p>
     */
    public void setInsCountPerPage(Long value){
        this.insCountPerPage = value;
    }

    /**
     * <p>insCountPerPage</p>
     */
    public Long getInsCountPerPage() {
        return this.insCountPerPage;
    }

    /**
     * <p>insPageCount</p>
     */
    public void setInsPageCount(Long value){
        this.insPageCount = value;
    }

    /**
     * <p>insPageCount</p>
     */
    public Long getInsPageCount() {
        return this.insPageCount;
    }

    /**
     * <p>xqCountPerPage</p>
     */
    public void setXqCountPerPage(Long value){
        this.xqCountPerPage = value;
    }

    /**
     * <p>xqCountPerPage</p>
     */
    public Long getXqCountPerPage() {
        return this.xqCountPerPage;
    }

    /**
     * <p>xqPageCount</p>
     */
    public void setXqPageCount(Long value){
        this.xqPageCount = value;
    }

    /**
     * <p>xqPageCount</p>
     */
    public Long getXqPageCount() {
        return this.xqPageCount;
    }

    /**
     * <p>cgCountPerPage</p>
     */
    public void setCgCountPerPage(Long value){
        this.cgCountPerPage = value;
    }

    /**
     * <p>cgCountPerPage</p>
     */
    public Long getCgCountPerPage() {
        return this.cgCountPerPage;
    }

    /**
     * <p>cgPageCount</p>
     */
    public void setCgPageCount(Long value){
        this.cgPageCount = value;
    }

    /**
     * <p>cgPageCount</p>
     */
    public Long getCgPageCount() {
        return this.cgPageCount;
    }

    /**
     * <p>zjCountPerPage</p>
     */
    public void setZjCountPerPage(Long value){
        this.zjCountPerPage = value;
    }

    /**
     * <p>zjCountPerPage</p>
     */
    public Long getZjCountPerPage() {
        return this.zjCountPerPage;
    }

    /**
     * <p>zjPageCount</p>
     */
    public void setZjPageCount(Long value){
        this.zjPageCount = value;
    }

    /**
     * <p>zjPageCount</p>
     */
    public Long getZjPageCount() {
        return this.zjPageCount;
    }

    /**
     * <p>staticLastGenDate</p>
     */
    public void setStaticLastGenDate(Date value){
        this.staticLastGenDate = value;
    }

    /**
     * <p>staticLastGenDate</p>
     */
    public Date getStaticLastGenDate() {
        return this.staticLastGenDate;
    }

    /**
     * <p>staticStartGenDate</p>
     */
    public void setStaticStartGenDate(Date value){
        this.staticStartGenDate = value;
    }

    /**
     * <p>staticStartGenDate</p>
     */
    public Date getStaticStartGenDate() {
        return this.staticStartGenDate;
    }

    /**
     * <p>mainCategory</p>
     */
    public void setMainCategory(String value){
        this.mainCategory = value;
    }

    /**
     * <p>mainCategory</p>
     */
    public String getMainCategory() {
        return this.mainCategory;
    }

    /**
     * <p>secondCategory</p>
     */
    public void setSecondCategory(String value){
        this.secondCategory = value;
    }

    /**
     * <p>secondCategory</p>
     */
    public String getSecondCategory() {
        return this.secondCategory;
    }

    /**
     * <p>winTypeId</p>
     */
    public void setWinTypeId(Integer value){
        this.winTypeId = value;
    }

    /**
     * <p>winTypeId</p>
     */
    public Integer getWinTypeId() {
        return this.winTypeId;
    }

    /**
     * <p>winPath</p>
     */
    public void setWinPath(String value){
        this.winPath = value;
    }

    /**
     * <p>winPath</p>
     */
    public String getWinPath() {
        return this.winPath;
    }

    /**
     * <p>winFlag</p>
     */
    public void setWinFlag(Integer value){
        this.winFlag = value;
    }

    /**
     * <p>winFlag</p>
     */
    public Integer getWinFlag() {
        return this.winFlag;
    }

    /**
     * <p>iconUrlSmall</p>
     */
    public void setIconUrlSmall(String value){
        this.iconUrlSmall = value;
    }

    /**
     * <p>iconUrlSmall</p>
     */
    public String getIconUrlSmall() {
        return this.iconUrlSmall;
    }

    /**
     * <p>所属系统id</p>
     */
    public void setSysId(Long value){
        this.sysId = value;
    }

    /**
     * <p>所属系统id</p>
     */
    public Long getSysId() {
        return this.sysId;
    }

    /**
     * <p>系统所在地区id</p>
     */
    public void setAreaId(Long value){
        this.areaId = value;
    }

    /**
     * <p>系统所在地区id</p>
     */
    public Long getAreaId() {
        return this.areaId;
    }

    /**
     * <p>totalAttendCount</p>
     */
    public void setTotalAttendCount(Long value){
        this.totalAttendCount = value;
    }

    /**
     * <p>totalAttendCount</p>
     */
    public Long getTotalAttendCount() {
        return this.totalAttendCount;
    }


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("insId", insId);
        map.put("typeId", typeId);
        map.put("title", title);
        map.put("address", address);
        map.put("organizer", organizer);
        map.put("registration", registration);
        map.put("contact", contact);
        map.put("fees", fees);
        map.put("speaker", speaker);
        map.put("psnLimit", psnLimit);
        map.put("meetObject", meetObject);
        map.put("startDay", startDay);
        map.put("startTime", startTime);
        map.put("startDate", startDate);
        map.put("endDay", endDay);
        map.put("endTime", endTime);
        map.put("endDate", endDate);
        map.put("registrationFormsDay", registrationFormsDay);
        map.put("registrationFormsTime", registrationFormsTime);
        map.put("registrationFormsDate", registrationFormsDate);
        map.put("iconUrl", iconUrl);
        map.put("status", status);
        map.put("createPsnId", createPsnId);
        map.put("createDate", createDate);
        map.put("auditPsnId", auditPsnId);
        map.put("auditDate", auditDate);
        map.put("overdueTime", overdueTime);
        map.put("formId", formId);
        map.put("smsFlag", smsFlag);
        map.put("brand", brand);
        map.put("topFlag", topFlag);
        map.put("undertaker", undertaker);
        map.put("contactPsn", contactPsn);
        map.put("modifyTimes", modifyTimes);
        map.put("finishDate", finishDate);
        map.put("courseType", courseType);
        map.put("holdInsId", holdInsId);
        map.put("holdAchiveId", holdAchiveId);
        map.put("holdNeedsId", holdNeedsId);
        map.put("insCountPerPage", insCountPerPage);
        map.put("insPageCount", insPageCount);
        map.put("xqCountPerPage", xqCountPerPage);
        map.put("xqPageCount", xqPageCount);
        map.put("cgCountPerPage", cgCountPerPage);
        map.put("cgPageCount", cgPageCount);
        map.put("zjCountPerPage", zjCountPerPage);
        map.put("zjPageCount", zjPageCount);
        map.put("staticLastGenDate", staticLastGenDate);
        map.put("staticStartGenDate", staticStartGenDate);
        map.put("mainCategory", mainCategory);
        map.put("secondCategory", secondCategory);
        map.put("winTypeId", winTypeId);
        map.put("winPath", winPath);
        map.put("winFlag", winFlag);
        map.put("iconUrlSmall", iconUrlSmall);
        map.put("sysId", sysId);
        map.put("areaId", areaId);
        map.put("totalAttendCount", totalAttendCount);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) this.setId(DataTypeUtils.getLongValue(map.get("id")));
        if(map.containsKey("insId")) this.setInsId(DataTypeUtils.getLongValue(map.get("insId")));
        if(map.containsKey("typeId")) this.setTypeId(DataTypeUtils.getLongValue(map.get("typeId")));
        if(map.containsKey("title")) this.setTitle(DataTypeUtils.getStringValue(map.get("title")));
        if(map.containsKey("address")) this.setAddress(DataTypeUtils.getStringValue(map.get("address")));
        if(map.containsKey("organizer")) this.setOrganizer(DataTypeUtils.getStringValue(map.get("organizer")));
        if(map.containsKey("registration")) this.setRegistration(DataTypeUtils.getStringValue(map.get("registration")));
        if(map.containsKey("contact")) this.setContact(DataTypeUtils.getStringValue(map.get("contact")));
        if(map.containsKey("fees")) this.setFees(DataTypeUtils.getStringValue(map.get("fees")));
        if(map.containsKey("speaker")) this.setSpeaker(DataTypeUtils.getStringValue(map.get("speaker")));
        if(map.containsKey("psnLimit")) this.setPsnLimit(DataTypeUtils.getIntegerValue(map.get("psnLimit")));
        if(map.containsKey("meetObject")) this.setMeetObject(DataTypeUtils.getStringValue(map.get("meetObject")));
        if(map.containsKey("startDay")) this.setStartDay(DataTypeUtils.getStringValue(map.get("startDay")));
        if(map.containsKey("startTime")) this.setStartTime(DataTypeUtils.getStringValue(map.get("startTime")));
        if(map.containsKey("startDate")) this.setStartDate(DataTypeUtils.getDateValue(map.get("startDate")));
        if(map.containsKey("endDay")) this.setEndDay(DataTypeUtils.getStringValue(map.get("endDay")));
        if(map.containsKey("endTime")) this.setEndTime(DataTypeUtils.getStringValue(map.get("endTime")));
        if(map.containsKey("endDate")) this.setEndDate(DataTypeUtils.getDateValue(map.get("endDate")));
        if(map.containsKey("registrationFormsDay")) this.setRegistrationFormsDay(DataTypeUtils.getStringValue(map.get("registrationFormsDay")));
        if(map.containsKey("registrationFormsTime")) this.setRegistrationFormsTime(DataTypeUtils.getStringValue(map.get("registrationFormsTime")));
        if(map.containsKey("registrationFormsDate")) this.setRegistrationFormsDate(DataTypeUtils.getDateValue(map.get("registrationFormsDate")));
        if(map.containsKey("iconUrl")) this.setIconUrl(DataTypeUtils.getStringValue(map.get("iconUrl")));
        if(map.containsKey("status")) this.setStatus(DataTypeUtils.getBooleanValue(map.get("status")));
        if(map.containsKey("createPsnId")) this.setCreatePsnId(DataTypeUtils.getLongValue(map.get("createPsnId")));
        if(map.containsKey("createDate")) this.setCreateDate(DataTypeUtils.getDateValue(map.get("createDate")));
        if(map.containsKey("auditPsnId")) this.setAuditPsnId(DataTypeUtils.getLongValue(map.get("auditPsnId")));
        if(map.containsKey("auditDate")) this.setAuditDate(DataTypeUtils.getDateValue(map.get("auditDate")));
        if(map.containsKey("overdueTime")) this.setOverdueTime(DataTypeUtils.getBigDecimalValue(map.get("overdueTime")));
        if(map.containsKey("formId")) this.setFormId(DataTypeUtils.getLongValue(map.get("formId")));
        if(map.containsKey("smsFlag")) this.setSmsFlag(DataTypeUtils.getBooleanValue(map.get("smsFlag")));
        if(map.containsKey("brand")) this.setBrand(DataTypeUtils.getBooleanValue(map.get("brand")));
        if(map.containsKey("topFlag")) this.setTopFlag(DataTypeUtils.getBooleanValue(map.get("topFlag")));
        if(map.containsKey("undertaker")) this.setUndertaker(DataTypeUtils.getStringValue(map.get("undertaker")));
        if(map.containsKey("contactPsn")) this.setContactPsn(DataTypeUtils.getStringValue(map.get("contactPsn")));
        if(map.containsKey("modifyTimes")) this.setModifyTimes(DataTypeUtils.getIntegerValue(map.get("modifyTimes")));
        if(map.containsKey("finishDate")) this.setFinishDate(DataTypeUtils.getDateValue(map.get("finishDate")));
        if(map.containsKey("courseType")) this.setCourseType(DataTypeUtils.getBooleanValue(map.get("courseType")));
        if(map.containsKey("holdInsId")) this.setHoldInsId(DataTypeUtils.getStringValue(map.get("holdInsId")));
        if(map.containsKey("holdAchiveId")) this.setHoldAchiveId(DataTypeUtils.getStringValue(map.get("holdAchiveId")));
        if(map.containsKey("holdNeedsId")) this.setHoldNeedsId(DataTypeUtils.getStringValue(map.get("holdNeedsId")));
        if(map.containsKey("insCountPerPage")) this.setInsCountPerPage(DataTypeUtils.getLongValue(map.get("insCountPerPage")));
        if(map.containsKey("insPageCount")) this.setInsPageCount(DataTypeUtils.getLongValue(map.get("insPageCount")));
        if(map.containsKey("xqCountPerPage")) this.setXqCountPerPage(DataTypeUtils.getLongValue(map.get("xqCountPerPage")));
        if(map.containsKey("xqPageCount")) this.setXqPageCount(DataTypeUtils.getLongValue(map.get("xqPageCount")));
        if(map.containsKey("cgCountPerPage")) this.setCgCountPerPage(DataTypeUtils.getLongValue(map.get("cgCountPerPage")));
        if(map.containsKey("cgPageCount")) this.setCgPageCount(DataTypeUtils.getLongValue(map.get("cgPageCount")));
        if(map.containsKey("zjCountPerPage")) this.setZjCountPerPage(DataTypeUtils.getLongValue(map.get("zjCountPerPage")));
        if(map.containsKey("zjPageCount")) this.setZjPageCount(DataTypeUtils.getLongValue(map.get("zjPageCount")));
        if(map.containsKey("staticLastGenDate")) this.setStaticLastGenDate(DataTypeUtils.getDateValue(map.get("staticLastGenDate")));
        if(map.containsKey("staticStartGenDate")) this.setStaticStartGenDate(DataTypeUtils.getDateValue(map.get("staticStartGenDate")));
        if(map.containsKey("mainCategory")) this.setMainCategory(DataTypeUtils.getStringValue(map.get("mainCategory")));
        if(map.containsKey("secondCategory")) this.setSecondCategory(DataTypeUtils.getStringValue(map.get("secondCategory")));
        if(map.containsKey("winTypeId")) this.setWinTypeId(DataTypeUtils.getIntegerValue(map.get("winTypeId")));
        if(map.containsKey("winPath")) this.setWinPath(DataTypeUtils.getStringValue(map.get("winPath")));
        if(map.containsKey("winFlag")) this.setWinFlag(DataTypeUtils.getIntegerValue(map.get("winFlag")));
        if(map.containsKey("iconUrlSmall")) this.setIconUrlSmall(DataTypeUtils.getStringValue(map.get("iconUrlSmall")));
        if(map.containsKey("sysId")) this.setSysId(DataTypeUtils.getLongValue(map.get("sysId")));
        if(map.containsKey("areaId")) this.setAreaId(DataTypeUtils.getLongValue(map.get("areaId")));
        if(map.containsKey("totalAttendCount")) this.setTotalAttendCount(DataTypeUtils.getLongValue(map.get("totalAttendCount")));
    }

}
