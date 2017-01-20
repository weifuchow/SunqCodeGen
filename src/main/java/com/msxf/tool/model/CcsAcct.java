package com.msxf.tool.model;

import com.msxf.tool.utils.DataTypeUtils;
import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 CCS_ACCT
 * Database Table:CCS_ACCT to ClassName:CcsAcct
 */
@Entity
@Table(name = "CCS_ACCT")
@IdClass(CcsAcctKey.class)
public class CcsAcct implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "CCS_ACCT";

	@Column(name="ORG", nullable=false, length = 12)
	private String org;

	@Id
	@Column(name="ACCT_NBR", nullable=false, length = 16)
	private Long acctNbr;

	@Id
	@Column(name="ACCT_TYPE", nullable=false, length = 1)
	private String acctType;

	@Column(name="CUST_ID", nullable=false, length = 16)
	private Long custId;

	@Column(name="CUST_LMT_ID", nullable=false, length = 16)
	private Long custLmtId;

	@Column(name="PRODUCT_CD", nullable=false, length = 6)
	private String productCd;

	@Column(name="DEFAULT_LOGIC_CARD_NBR", nullable=false, length = 19)
	private String defaultLogicCardNbr;

	@Column(name="CURRENCY", nullable=false, length = 3)
	private String currency;

	@Column(name="CREDIT_LMT", nullable=false, length = 15)
	private BigDecimal creditLmt;

	@Column(name="TEMP_LMT", nullable=false, length = 15)
	private BigDecimal tempLmt;

	@Column(name="TEMP_LMT_BEG_DATE", nullable=true, length = 7)
	private Date tempLmtBegDate;

	@Column(name="TEMP_LMT_END_DATE", nullable=true, length = 7)
	private Date tempLmtEndDate;

	@Column(name="CASH_LMT_RATE", nullable=true, length = 5)
	private BigDecimal cashLmtRate;

	@Column(name="OVRLMT_RATE", nullable=true, length = 5)
	private BigDecimal ovrlmtRate;

	@Column(name="LOAN_LMT_RATE", nullable=true, length = 5)
	private BigDecimal loanLmtRate;

	@Column(name="CURR_BAL", nullable=false, length = 15)
	private BigDecimal currBal;

	@Column(name="CASH_BAL", nullable=false, length = 15)
	private BigDecimal cashBal;

	@Column(name="PRINCIPAL_BAL", nullable=false, length = 15)
	private BigDecimal principalBal;

	@Column(name="LOAN_BAL", nullable=false, length = 15)
	private BigDecimal loanBal;

	@Column(name="DISPUTE_AMT", nullable=false, length = 15)
	private BigDecimal disputeAmt;

	@Column(name="BEG_BAL", nullable=false, length = 15)
	private BigDecimal begBal;

	@Column(name="PMT_DUE_DAY_BAL", nullable=false, length = 15)
	private BigDecimal pmtDueDayBal;

	@Column(name="QUAL_GRACE_BAL", nullable=false, length = 15)
	private BigDecimal qualGraceBal;

	@Column(name="GRACE_DAYS_FULL_IND", nullable=false, length = 1)
	private String graceDaysFullInd;

	@Column(name="POINTS_BEG_BAL", nullable=false, length = 13)
	private Long pointsBegBal;

	@Column(name="CTD_POINTS", nullable=false, length = 13)
	private Long ctdPoints;

	@Column(name="CTD_SPEND_POINTS", nullable=false, length = 13)
	private Long ctdSpendPoints;

	@Column(name="CTD_ADJ_POINTS", nullable=false, length = 13)
	private Long ctdAdjPoints;

	@Column(name="POINTS_BAL", nullable=false, length = 13)
	private Long pointsBal;

	@Column(name="SETUP_DATE", nullable=false, length = 7)
	private Date setupDate;

	@Column(name="DORMENT_DATE", nullable=true, length = 7)
	private Date dormentDate;

	@Column(name="EACTIVE_DATE", nullable=true, length = 7)
	private Date eactiveDate;

	@Column(name="OVRLMT_DATE", nullable=true, length = 7)
	private Date ovrlmtDate;

	@Column(name="OVRLMT_NBR_OF_CYC", nullable=false, length = 22)
	private BigDecimal ovrlmtNbrOfCyc;

	@Column(name="NAME", nullable=false, length = 80)
	private String name;

	@Column(name="GENDER", nullable=true, length = 1)
	private String gender;

	@Column(name="OWNING_BRANCH", nullable=false, length = 9)
	private String owningBranch;

	@Column(name="MOBILE_NO", nullable=true, length = 20)
	private String mobileNo;

	@Column(name="CORP_NAME", nullable=true, length = 80)
	private String corpName;

	@Column(name="CYCLE_DAY", nullable=false, length = 2)
	private String cycleDay;

	@Column(name="STMT_FLAG", nullable=false, length = 1)
	private String stmtFlag;

	@Column(name="STMT_MAIL_ADDR_IND", nullable=true, length = 1)
	private String stmtMailAddrInd;

	@Column(name="STMT_MEDIA_TYPE", nullable=false, length = 1)
	private String stmtMediaType;

	@Column(name="STMT_COUNTRY_CODE", nullable=true, length = 3)
	private String stmtCountryCode;

	@Column(name="STMT_STATE", nullable=true, length = 40)
	private String stmtState;

	@Column(name="STMT_CITY", nullable=true, length = 40)
	private String stmtCity;

	@Column(name="STMT_DISTRICT", nullable=true, length = 40)
	private String stmtDistrict;

	@Column(name="STMT_ADDRESS", nullable=true, length = 200)
	private String stmtAddress;

	@Column(name="STMT_POSTCODE", nullable=true, length = 10)
	private String stmtPostcode;

	@Column(name="EMAIL", nullable=true, length = 80)
	private String email;

	@Column(name="BLOCK_CODE", nullable=true, length = 27)
	private String blockCode;

	@Column(name="AGE_CODE", nullable=false, length = 1)
	private String ageCode;

	@Column(name="AGE_CODE_GL", nullable=false, length = 1)
	private String ageCodeGl;

	@Column(name="MEMO_DB", nullable=false, length = 15)
	private BigDecimal memoDb;

	@Column(name="MEMO_CASH", nullable=false, length = 15)
	private BigDecimal memoCash;

	@Column(name="MEMO_CR", nullable=false, length = 15)
	private BigDecimal memoCr;

	@Column(name="DD_IND", nullable=false, length = 1)
	private String ddInd;

	@Column(name="DD_BANK_NAME", nullable=true, length = 160)
	private String ddBankName;

	@Column(name="DD_BANK_BRANCH", nullable=true, length = 9)
	private String ddBankBranch;

	@Column(name="DD_BANK_ACCT_NBR", nullable=true, length = 40)
	private String ddBankAcctNbr;

	@Column(name="DD_BANK_ACCT_NAME", nullable=true, length = 160)
	private String ddBankAcctName;

	@Column(name="LAST_DD_AMT", nullable=false, length = 15)
	private BigDecimal lastDdAmt;

	@Column(name="LAST_DD_DATE", nullable=true, length = 7)
	private Date lastDdDate;

	@Column(name="DUAL_BILLING_FLAG", nullable=false, length = 1)
	private String dualBillingFlag;

	@Column(name="LAST_PMT_AMT", nullable=false, length = 15)
	private BigDecimal lastPmtAmt;

	@Column(name="LAST_PMT_DATE", nullable=true, length = 7)
	private Date lastPmtDate;

	@Column(name="LAST_STMT_DATE", nullable=true, length = 7)
	private Date lastStmtDate;

	@Column(name="LAST_PMT_DUE_DATE", nullable=true, length = 7)
	private Date lastPmtDueDate;

	@Column(name="LAST_AGING_DATE", nullable=true, length = 7)
	private Date lastAgingDate;

	@Column(name="COLLECT_IN_DATE", nullable=true, length = 7)
	private Date collectInDate;

	@Column(name="COLLECT_OUT_DATE", nullable=true, length = 7)
	private Date collectOutDate;

	@Column(name="NEXT_STMT_DATE", nullable=false, length = 7)
	private Date nextStmtDate;

	@Column(name="PMT_DUE_DATE", nullable=true, length = 7)
	private Date pmtDueDate;

	@Column(name="DD_DATE", nullable=true, length = 7)
	private Date ddDate;

	@Column(name="GRACE_DATE", nullable=true, length = 7)
	private Date graceDate;

	@Column(name="DUAL_BILLING_DATE", nullable=true, length = 7)
	private Date dualBillingDate;

	@Column(name="FIRST_STMT_DATE", nullable=true, length = 7)
	private Date firstStmtDate;

	@Column(name="CHARGE_OFF_DATE", nullable=true, length = 7)
	private Date chargeOffDate;

	@Column(name="CLOSE_DATE", nullable=true, length = 7)
	private Date closeDate;

	@Column(name="CLOSED_DATE", nullable=true, length = 7)
	private Date closedDate;

	@Column(name="FIRST_RETL_DATE", nullable=true, length = 7)
	private Date firstRetlDate;

	@Column(name="FIRST_RETL_AMT", nullable=false, length = 15)
	private BigDecimal firstRetlAmt;

	@Column(name="TOT_DUE_AMT", nullable=false, length = 15)
	private BigDecimal totDueAmt;

	@Column(name="CURR_DUE_AMT", nullable=false, length = 15)
	private BigDecimal currDueAmt;

	@Column(name="PAST_DUE_AMT1", nullable=false, length = 15)
	private BigDecimal pastDueAmt1;

	@Column(name="PAST_DUE_AMT2", nullable=false, length = 15)
	private BigDecimal pastDueAmt2;

	@Column(name="PAST_DUE_AMT3", nullable=false, length = 15)
	private BigDecimal pastDueAmt3;

	@Column(name="PAST_DUE_AMT4", nullable=false, length = 15)
	private BigDecimal pastDueAmt4;

	@Column(name="PAST_DUE_AMT5", nullable=false, length = 15)
	private BigDecimal pastDueAmt5;

	@Column(name="PAST_DUE_AMT6", nullable=false, length = 15)
	private BigDecimal pastDueAmt6;

	@Column(name="PAST_DUE_AMT7", nullable=false, length = 15)
	private BigDecimal pastDueAmt7;

	@Column(name="PAST_DUE_AMT8", nullable=false, length = 15)
	private BigDecimal pastDueAmt8;

	@Column(name="CTD_CASH_AMT", nullable=false, length = 15)
	private BigDecimal ctdCashAmt;

	@Column(name="CTD_CASH_CNT", nullable=false, length = 22)
	private BigDecimal ctdCashCnt;

	@Column(name="CTD_RETAIL_AMT", nullable=false, length = 15)
	private BigDecimal ctdRetailAmt;

	@Column(name="CTD_RETAIL_CNT", nullable=false, length = 22)
	private BigDecimal ctdRetailCnt;

	@Column(name="CTD_REPAY_AMT", nullable=false, length = 15)
	private BigDecimal ctdRepayAmt;

	@Column(name="CTD_REPAY_CNT", nullable=false, length = 22)
	private BigDecimal ctdRepayCnt;

	@Column(name="CTD_DB_ADJ_AMT", nullable=false, length = 15)
	private BigDecimal ctdDbAdjAmt;

	@Column(name="CTD_DB_ADJ_CNT", nullable=false, length = 22)
	private BigDecimal ctdDbAdjCnt;

	@Column(name="CTD_CR_ADJ_AMT", nullable=false, length = 15)
	private BigDecimal ctdCrAdjAmt;

	@Column(name="CTD_CR_ADJ_CNT", nullable=false, length = 22)
	private BigDecimal ctdCrAdjCnt;

	@Column(name="CTD_FEE_AMT", nullable=false, length = 15)
	private BigDecimal ctdFeeAmt;

	@Column(name="CTD_FEE_CNT", nullable=false, length = 22)
	private BigDecimal ctdFeeCnt;

	@Column(name="CTD_INTEREST_AMT", nullable=true, length = 15)
	private BigDecimal ctdInterestAmt;

	@Column(name="CTD_INTEREST_CNT", nullable=true, length = 22)
	private BigDecimal ctdInterestCnt;

	@Column(name="CTD_REFUND_AMT", nullable=false, length = 15)
	private BigDecimal ctdRefundAmt;

	@Column(name="CTD_REFUND_CNT", nullable=false, length = 22)
	private BigDecimal ctdRefundCnt;

	@Column(name="CTD_MAX_OVRLMT_AMT", nullable=false, length = 15)
	private BigDecimal ctdMaxOvrlmtAmt;

	@Column(name="MTD_RETAIL_AMT", nullable=false, length = 15)
	private BigDecimal mtdRetailAmt;

	@Column(name="MTD_RETAIL_CNT", nullable=false, length = 22)
	private BigDecimal mtdRetailCnt;

	@Column(name="MTD_CASH_AMT", nullable=false, length = 15)
	private BigDecimal mtdCashAmt;

	@Column(name="MTD_CASH_CNT", nullable=false, length = 22)
	private BigDecimal mtdCashCnt;

	@Column(name="MTD_REFUND_AMT", nullable=false, length = 15)
	private BigDecimal mtdRefundAmt;

	@Column(name="MTD_REFUND_CNT", nullable=false, length = 22)
	private BigDecimal mtdRefundCnt;

	@Column(name="YTD_RETAIL_AMT", nullable=false, length = 15)
	private BigDecimal ytdRetailAmt;

	@Column(name="YTD_RETAIL_CNT", nullable=false, length = 22)
	private BigDecimal ytdRetailCnt;

	@Column(name="YTD_CASH_AMT", nullable=false, length = 15)
	private BigDecimal ytdCashAmt;

	@Column(name="YTD_CASH_CNT", nullable=false, length = 22)
	private BigDecimal ytdCashCnt;

	@Column(name="YTD_REFUND_AMT", nullable=false, length = 15)
	private BigDecimal ytdRefundAmt;

	@Column(name="YTD_REFUND_CNT", nullable=false, length = 22)
	private BigDecimal ytdRefundCnt;

	@Column(name="YTD_OVRLMT_FEE_AMT", nullable=false, length = 15)
	private BigDecimal ytdOvrlmtFeeAmt;

	@Column(name="YTD_OVRLMT_FEE_CNT", nullable=false, length = 22)
	private BigDecimal ytdOvrlmtFeeCnt;

	@Column(name="YTD_LATE_FEE_AMT", nullable=false, length = 15)
	private BigDecimal ytdLateFeeAmt;

	@Column(name="YTD_LATE_FEE_CNT", nullable=false, length = 22)
	private BigDecimal ytdLateFeeCnt;

	@Column(name="LTD_RETAIL_AMT", nullable=false, length = 15)
	private BigDecimal ltdRetailAmt;

	@Column(name="LTD_RETAIL_CNT", nullable=false, length = 22)
	private BigDecimal ltdRetailCnt;

	@Column(name="LTD_CASH_AMT", nullable=false, length = 15)
	private BigDecimal ltdCashAmt;

	@Column(name="LTD_CASH_CNT", nullable=false, length = 22)
	private BigDecimal ltdCashCnt;

	@Column(name="LTD_REFUND_AMT", nullable=false, length = 15)
	private BigDecimal ltdRefundAmt;

	@Column(name="LTD_REFUND_CNT", nullable=false, length = 22)
	private BigDecimal ltdRefundCnt;

	@Column(name="LTD_HIGHEST_PRIN", nullable=false, length = 15)
	private BigDecimal ltdHighestPrin;

	@Column(name="LTD_HIGHEST_CR_BAL", nullable=false, length = 15)
	private BigDecimal ltdHighestCrBal;

	@Column(name="LTD_HIGHEST_BAL", nullable=false, length = 15)
	private BigDecimal ltdHighestBal;

	@Column(name="COLLECT_CNT", nullable=true, length = 22)
	private BigDecimal collectCnt;

	@Column(name="COLLECTOR", nullable=true, length = 8)
	private String collector;

	@Column(name="COLLECT_REASON", nullable=true, length = 2)
	private String collectReason;

	@Column(name="AGE_HST", nullable=true, length = 24)
	private String ageHst;

	@Column(name="PAYMENT_HST", nullable=true, length = 24)
	private String paymentHst;

	@Column(name="WAIVE_OVLFEE_IND", nullable=false, length = 1)
	private String waiveOvlfeeInd;

	@Column(name="WAIVE_CARDFEE_IND", nullable=false, length = 1)
	private String waiveCardfeeInd;

	@Column(name="WAIVE_LATEFEE_IND", nullable=false, length = 1)
	private String waiveLatefeeInd;

	@Column(name="WAIVE_SVCFEE_IND", nullable=false, length = 1)
	private String waiveSvcfeeInd;

	@Column(name="USER_CODE1", nullable=true, length = 4)
	private String userCode1;

	@Column(name="USER_CODE2", nullable=true, length = 4)
	private String userCode2;

	@Column(name="USER_CODE3", nullable=true, length = 4)
	private String userCode3;

	@Column(name="USER_CODE4", nullable=true, length = 4)
	private String userCode4;

	@Column(name="USER_CODE5", nullable=true, length = 4)
	private String userCode5;

	@Column(name="USER_CODE6", nullable=true, length = 4)
	private String userCode6;

	@Column(name="USER_DATE1", nullable=true, length = 7)
	private Date userDate1;

	@Column(name="USER_DATE2", nullable=true, length = 7)
	private Date userDate2;

	@Column(name="USER_DATE3", nullable=true, length = 7)
	private Date userDate3;

	@Column(name="USER_DATE4", nullable=true, length = 7)
	private Date userDate4;

	@Column(name="USER_DATE5", nullable=true, length = 7)
	private Date userDate5;

	@Column(name="USER_DATE6", nullable=true, length = 7)
	private Date userDate6;

	@Column(name="USER_NUMBER1", nullable=false, length = 22)
	private BigDecimal userNumber1;

	@Column(name="USER_NUMBER2", nullable=false, length = 22)
	private BigDecimal userNumber2;

	@Column(name="USER_NUMBER3", nullable=false, length = 22)
	private BigDecimal userNumber3;

	@Column(name="USER_NUMBER4", nullable=false, length = 22)
	private BigDecimal userNumber4;

	@Column(name="USER_NUMBER5", nullable=false, length = 22)
	private BigDecimal userNumber5;

	@Column(name="USER_NUMBER6", nullable=false, length = 22)
	private BigDecimal userNumber6;

	@Column(name="USER_FIELD1", nullable=true, length = 40)
	private String userField1;

	@Column(name="USER_FIELD2", nullable=true, length = 40)
	private String userField2;

	@Column(name="USER_FIELD3", nullable=true, length = 40)
	private String userField3;

	@Column(name="USER_FIELD4", nullable=true, length = 40)
	private String userField4;

	@Column(name="USER_FIELD5", nullable=true, length = 40)
	private String userField5;

	@Column(name="USER_FIELD6", nullable=true, length = 40)
	private String userField6;

	@Column(name="USER_AMT1", nullable=false, length = 15)
	private BigDecimal userAmt1;

	@Column(name="USER_AMT2", nullable=false, length = 15)
	private BigDecimal userAmt2;

	@Column(name="USER_AMT3", nullable=false, length = 15)
	private BigDecimal userAmt3;

	@Column(name="USER_AMT4", nullable=false, length = 15)
	private BigDecimal userAmt4;

	@Column(name="USER_AMT5", nullable=false, length = 15)
	private BigDecimal userAmt5;

	@Column(name="USER_AMT6", nullable=false, length = 15)
	private BigDecimal userAmt6;

	@Column(name="MTD_PAYMENT_AMT", nullable=false, length = 15)
	private BigDecimal mtdPaymentAmt;

	@Column(name="MTD_PAYMENT_CNT", nullable=false, length = 22)
	private BigDecimal mtdPaymentCnt;

	@Column(name="YTD_REPAY_AMT", nullable=false, length = 15)
	private BigDecimal ytdRepayAmt;

	@Column(name="YTD_REPAY_CNT", nullable=false, length = 22)
	private BigDecimal ytdRepayCnt;

	@Column(name="LTD_REPAY_AMT", nullable=false, length = 15)
	private BigDecimal ltdRepayAmt;

	@Column(name="LTD_REPAY_CNT", nullable=false, length = 22)
	private BigDecimal ltdRepayCnt;

	@Column(name="SMS_IND", nullable=false, length = 1)
	private String smsInd;

	@Column(name="USER_SMS_AMT", nullable=true, length = 15)
	private BigDecimal userSmsAmt;

	@Column(name="YTD_CYCLE_CHAG_CNT", nullable=true, length = 22)
	private BigDecimal ytdCycleChagCnt;

	@Column(name="LAST_POST_DATE", nullable=true, length = 7)
	private Date lastPostDate;

	@Column(name="CONTR_NBR", nullable=true, length = 20)
	private String contrNbr;

	@Column(name="GUARANTY_ID", nullable=true, length = 32)
	private String guarantyId;

	@Column(name="DD_BANK_PROVINCE", nullable=true, length = 66)
	private String ddBankProvince;

	@Column(name="DD_BANK_PROVINCE_CODE", nullable=true, length = 10)
	private String ddBankProvinceCode;

	@Column(name="DD_BANK_CITY", nullable=true, length = 66)
	private String ddBankCity;

	@Column(name="DD_BANK_CITY_CODE", nullable=true, length = 10)
	private String ddBankCityCode;

	@Column(name="CUST_SOURCE", nullable=true, length = 10)
	private String custSource;

	@Column(name="CREATE_TIME", nullable=true, length = 11)
	private Date createTime;

	@Column(name="CREATE_USER", nullable=true, length = 32)
	private String createUser;

	@Column(name="LST_UPD_TIME", nullable=true, length = 11)
	private Date lstUpdTime;

	@Column(name="LST_UPD_USER", nullable=true, length = 32)
	private String lstUpdUser;

	@Column(name="JPA_VERSION", nullable=true, length = 22)
	private BigDecimal jpaVersion;

	@Column(name="LTD_LOAN_AMT", nullable=true, length = 15)
	private BigDecimal ltdLoanAmt;

	@Column(name="APPLICATION_NO", nullable=true, length = 32)
	private String applicationNo;

	@Column(name="AGREEMENT_RATE_EXPIRE_DATE", nullable=true, length = 7)
	private Date agreementRateExpireDate;

	@Column(name="ACCT_EXPIRE_DATE", nullable=true, length = 7)
	private Date acctExpireDate;

	@Column(name="LOAN_MOLD", nullable=true, length = 1)
	private String loanMold;

	@Column(name="ACQ_ID", nullable=true, length = 8)
	private String acqId;

	@Column(name="LAST_SYNC_DATE", nullable=true, length = 7)
	private Date lastSyncDate;

	@Column(name="AGREEMENT_RATE_IND", nullable=true, length = 1)
	private String agreementRateInd;

	@Column(name="FEE_RATE", nullable=true, length = 12)
	private BigDecimal feeRate;

	@Column(name="FEE_AMT", nullable=true, length = 15)
	private BigDecimal feeAmt;

	@Column(name="LIFE_INSU_FEE_AMT", nullable=true, length = 15)
	private BigDecimal lifeInsuFeeAmt;

	@Column(name="INSTALLMENT_FEE_RATE", nullable=true, length = 12)
	private BigDecimal installmentFeeRate;

	@Column(name="INSTALLMENT_FEE_AMT", nullable=true, length = 15)
	private BigDecimal installmentFeeAmt;

	@Column(name="PREPAY_PKG_FEE_AMT", nullable=true, length = 15)
	private BigDecimal prepayPkgFeeAmt;

	@Column(name="PENALTY_RATE", nullable=true, length = 12)
	private BigDecimal penaltyRate;

	@Column(name="COMPOUND_RATE", nullable=true, length = 12)
	private BigDecimal compoundRate;

	@Column(name="INTEREST_RATE", nullable=true, length = 12)
	private BigDecimal interestRate;

	@Column(name="LIFE_INSU_FEE_RATE", nullable=true, length = 12)
	private BigDecimal lifeInsuFeeRate;

	@Column(name="INSURANCE_RATE", nullable=true, length = 12)
	private BigDecimal insuranceRate;

	@Column(name="INS_AMT", nullable=true, length = 15)
	private BigDecimal insAmt;

	@Column(name="STAMP_AMT", nullable=true, length = 15)
	private BigDecimal stampAmt;

	@Column(name="STAMPDUTY_RATE", nullable=true, length = 12)
	private BigDecimal stampdutyRate;

	@Column(name="LAST_LIMIT_ADJ_DATE", nullable=true, length = 7)
	private Date lastLimitAdjDate;

	@Column(name="LOAN_FEE_DEF_ID", nullable=true, length = 8)
	private String loanFeeDefId;

	@Column(name="APPLY_DATE", nullable=true, length = 7)
	private Date applyDate;

	@Column(name="PURPOSE", nullable=true, length = 8)
	private String purpose;

	@Column(name="SUB_TERMINAL_TYPE", nullable=true, length = 10)
	private String subTerminalType;

	@Column(name="PREPAY_PKG_FEE_RATE", nullable=true, length = 12)
	private BigDecimal prepayPkgFeeRate;

	@Column(name="JOIN_LIFE_INSU_IND", nullable=true, length = 1)
	private String joinLifeInsuInd;

	@Column(name="JOIN_PREPAY_PKG_IND", nullable=true, length = 1)
	private String joinPrepayPkgInd;

	@Column(name="REPLACE_SVC_FEE_RATE", nullable=true, length = 12)
	private BigDecimal replaceSvcFeeRate;

	@Column(name="REPLACE_SVC_FEE_AMT", nullable=true, length = 15)
	private BigDecimal replaceSvcFeeAmt;

	@Column(name="REPLACE_PENALTY_RATE", nullable=true, length = 12)
	private BigDecimal replacePenaltyRate;

	@Column(name="PREPAY_PKG_IND", nullable=true, length = 1)
	private String prepayPkgInd;

	@Column(name="JOIN_SCREEN_INSU_IND", nullable=true, length = 1)
	private String joinScreenInsuInd;

	@Column(name="SCREEN_INSU_FEE_AMT", nullable=true, length = 15)
	private BigDecimal screenInsuFeeAmt;

	@Column(name="SCREEN_INSU_FEE_RATE", nullable=true, length = 12)
	private BigDecimal screenInsuFeeRate;


    /*
     * <p>org</p>
     */
    public void setOrg(String value){
        this.org = value;
    }

    /*
     * <p>org</p>
     */
    public String getOrg() {
        return this.org;
    }

    /*
     * <p>acctNbr</p>
     */
    public void setAcctNbr(Long value){
        this.acctNbr = value;
    }

    /*
     * <p>acctNbr</p>
     */
    public Long getAcctNbr() {
        return this.acctNbr;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.AccountType</p>
     */
    public void setAcctType(String value){
        this.acctType = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.AccountType</p>
     */
    public String getAcctType() {
        return this.acctType;
    }

    /*
     * <p>顺序号，如未来需要校验位，可在后面补充</p>
     */
    public void setCustId(Long value){
        this.custId = value;
    }

    /*
     * <p>顺序号，如未来需要校验位，可在后面补充</p>
     */
    public Long getCustId() {
        return this.custId;
    }

    /*
     * <p>custLmtId</p>
     */
    public void setCustLmtId(Long value){
        this.custLmtId = value;
    }

    /*
     * <p>custLmtId</p>
     */
    public Long getCustLmtId() {
        return this.custLmtId;
    }

    /*
     * <p>productCd</p>
     */
    public void setProductCd(String value){
        this.productCd = value;
    }

    /*
     * <p>productCd</p>
     */
    public String getProductCd() {
        return this.productCd;
    }

    /*
     * <p>取自默认卡产品的主卡卡号，用于作为滞纳金、超限费的入账卡号</p>
     */
    public void setDefaultLogicCardNbr(String value){
        this.defaultLogicCardNbr = value;
    }

    /*
     * <p>取自默认卡产品的主卡卡号，用于作为滞纳金、超限费的入账卡号</p>
     */
    public String getDefaultLogicCardNbr() {
        return this.defaultLogicCardNbr;
    }

    /*
     * <p>currency</p>
     */
    public void setCurrency(String value){
        this.currency = value;
    }

    /*
     * <p>currency</p>
     */
    public String getCurrency() {
        return this.currency;
    }

    /*
     * <p>creditLmt</p>
     */
    public void setCreditLmt(BigDecimal value){
        this.creditLmt = value;
    }

    /*
     * <p>creditLmt</p>
     */
    public BigDecimal getCreditLmt() {
        return this.creditLmt;
    }

    /*
     * <p>tempLmt</p>
     */
    public void setTempLmt(BigDecimal value){
        this.tempLmt = value;
    }

    /*
     * <p>tempLmt</p>
     */
    public BigDecimal getTempLmt() {
        return this.tempLmt;
    }

    /*
     * <p>tempLmtBegDate</p>
     */
    public void setTempLmtBegDate(Date value){
        this.tempLmtBegDate = value;
    }

    /*
     * <p>tempLmtBegDate</p>
     */
    public Date getTempLmtBegDate() {
        return this.tempLmtBegDate;
    }

    /*
     * <p>tempLmtEndDate</p>
     */
    public void setTempLmtEndDate(Date value){
        this.tempLmtEndDate = value;
    }

    /*
     * <p>tempLmtEndDate</p>
     */
    public Date getTempLmtEndDate() {
        return this.tempLmtEndDate;
    }

    /*
     * <p>取现额度比例（占用账户信用额度）</p>
     */
    public void setCashLmtRate(BigDecimal value){
        this.cashLmtRate = value;
    }

    /*
     * <p>取现额度比例（占用账户信用额度）</p>
     */
    public BigDecimal getCashLmtRate() {
        return this.cashLmtRate;
    }

    /*
     * <p>授权允许的超限比例，来自账户下最高级别卡产品的参数定义。</p>
     */
    public void setOvrlmtRate(BigDecimal value){
        this.ovrlmtRate = value;
    }

    /*
     * <p>授权允许的超限比例，来自账户下最高级别卡产品的参数定义。</p>
     */
    public BigDecimal getOvrlmtRate() {
        return this.ovrlmtRate;
    }

    /*
     * <p>额度内分期额度比例</p>
     */
    public void setLoanLmtRate(BigDecimal value){
        this.loanLmtRate = value;
    }

    /*
     * <p>额度内分期额度比例</p>
     */
    public BigDecimal getLoanLmtRate() {
        return this.loanLmtRate;
    }

    /*
     * <p>当前欠款（负值表示有溢缴款）</p>
     */
    public void setCurrBal(BigDecimal value){
        this.currBal = value;
    }

    /*
     * <p>当前欠款（负值表示有溢缴款）</p>
     */
    public BigDecimal getCurrBal() {
        return this.currBal;
    }

    /*
     * <p>cashBal</p>
     */
    public void setCashBal(BigDecimal value){
        this.cashBal = value;
    }

    /*
     * <p>cashBal</p>
     */
    public BigDecimal getCashBal() {
        return this.cashBal;
    }

    /*
     * <p>当前本金余额</p>
     */
    public void setPrincipalBal(BigDecimal value){
        this.principalBal = value;
    }

    /*
     * <p>当前本金余额</p>
     */
    public BigDecimal getPrincipalBal() {
        return this.principalBal;
    }

    /*
     * <p>当前额度内分期余额</p>
     */
    public void setLoanBal(BigDecimal value){
        this.loanBal = value;
    }

    /*
     * <p>当前额度内分期余额</p>
     */
    public BigDecimal getLoanBal() {
        return this.loanBal;
    }

    /*
     * <p>当前争议金额</p>
     */
    public void setDisputeAmt(BigDecimal value){
        this.disputeAmt = value;
    }

    /*
     * <p>当前争议金额</p>
     */
    public BigDecimal getDisputeAmt() {
        return this.disputeAmt;
    }

    /*
     * <p>begBal</p>
     */
    public void setBegBal(BigDecimal value){
        this.begBal = value;
    }

    /*
     * <p>begBal</p>
     */
    public BigDecimal getBegBal() {
        return this.begBal;
    }

    /*
     * <p>到期还款日余额</p>
     */
    public void setPmtDueDayBal(BigDecimal value){
        this.pmtDueDayBal = value;
    }

    /*
     * <p>到期还款日余额</p>
     */
    public BigDecimal getPmtDueDayBal() {
        return this.pmtDueDayBal;
    }

    /*
     * <p>持卡人还清该欠款，则会对账户进行全额还款免息，该金额会显示在账单上，小于等于账户账单余额</p>
     */
    public void setQualGraceBal(BigDecimal value){
        this.qualGraceBal = value;
    }

    /*
     * <p>持卡人还清该欠款，则会对账户进行全额还款免息，该金额会显示在账单上，小于等于账户账单余额</p>
     */
    public BigDecimal getQualGraceBal() {
        return this.qualGraceBal;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setGraceDaysFullInd(String value){
        this.graceDaysFullInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getGraceDaysFullInd() {
        return this.graceDaysFullInd;
    }

    /*
     * <p>pointsBegBal</p>
     */
    public void setPointsBegBal(Long value){
        this.pointsBegBal = value;
    }

    /*
     * <p>pointsBegBal</p>
     */
    public Long getPointsBegBal() {
        return this.pointsBegBal;
    }

    /*
     * <p>当期新增积分</p>
     */
    public void setCtdPoints(Long value){
        this.ctdPoints = value;
    }

    /*
     * <p>当期新增积分</p>
     */
    public Long getCtdPoints() {
        return this.ctdPoints;
    }

    /*
     * <p>当期兑换积分</p>
     */
    public void setCtdSpendPoints(Long value){
        this.ctdSpendPoints = value;
    }

    /*
     * <p>当期兑换积分</p>
     */
    public Long getCtdSpendPoints() {
        return this.ctdSpendPoints;
    }

    /*
     * <p>当期调整积分</p>
     */
    public void setCtdAdjPoints(Long value){
        this.ctdAdjPoints = value;
    }

    /*
     * <p>当期调整积分</p>
     */
    public Long getCtdAdjPoints() {
        return this.ctdAdjPoints;
    }

    /*
     * <p>积分余额</p>
     */
    public void setPointsBal(Long value){
        this.pointsBal = value;
    }

    /*
     * <p>积分余额</p>
     */
    public Long getPointsBal() {
        return this.pointsBal;
    }

    /*
     * <p>setupDate</p>
     */
    public void setSetupDate(Date value){
        this.setupDate = value;
    }

    /*
     * <p>setupDate</p>
     */
    public Date getSetupDate() {
        return this.setupDate;
    }

    /*
     * <p>账户睡眠日期</p>
     */
    public void setDormentDate(Date value){
        this.dormentDate = value;
    }

    /*
     * <p>账户睡眠日期</p>
     */
    public Date getDormentDate() {
        return this.dormentDate;
    }

    /*
     * <p>账户恢复活动日期</p>
     */
    public void setEactiveDate(Date value){
        this.eactiveDate = value;
    }

    /*
     * <p>账户恢复活动日期</p>
     */
    public Date getEactiveDate() {
        return this.eactiveDate;
    }

    /*
     * <p>超限日期</p>
     */
    public void setOvrlmtDate(Date value){
        this.ovrlmtDate = value;
    }

    /*
     * <p>超限日期</p>
     */
    public Date getOvrlmtDate() {
        return this.ovrlmtDate;
    }

    /*
     * <p>连续超限账期</p>
     */
    public void setOvrlmtNbrOfCyc(BigDecimal value){
        this.ovrlmtNbrOfCyc = value;
    }

    /*
     * <p>连续超限账期</p>
     */
    public BigDecimal getOvrlmtNbrOfCyc() {
        return this.ovrlmtNbrOfCyc;
    }

    /*
     * <p>客户姓名 - 冗余字段，从客户表复制过来，这样批量处理时可以不用关联客户信息</p>
     */
    public void setName(String value){
        this.name = value;
    }

    /*
     * <p>客户姓名 - 冗余字段，从客户表复制过来，这样批量处理时可以不用关联客户信息</p>
     */
    public String getName() {
        return this.name;
    }

    /*
     * <p>M|男 F|女 /// @com.sunline.ppy.dictionary.enums.Gender</p>
     */
    public void setGender(String value){
        this.gender = value;
    }

    /*
     * <p>M|男 F|女 /// @com.sunline.ppy.dictionary.enums.Gender</p>
     */
    public String getGender() {
        return this.gender;
    }

    /*
     * <p>owningBranch</p>
     */
    public void setOwningBranch(String value){
        this.owningBranch = value;
    }

    /*
     * <p>owningBranch</p>
     */
    public String getOwningBranch() {
        return this.owningBranch;
    }

    /*
     * <p>mobileNo</p>
     */
    public void setMobileNo(String value){
        this.mobileNo = value;
    }

    /*
     * <p>mobileNo</p>
     */
    public String getMobileNo() {
        return this.mobileNo;
    }

    /*
     * <p>corpName</p>
     */
    public void setCorpName(String value){
        this.corpName = value;
    }

    /*
     * <p>corpName</p>
     */
    public String getCorpName() {
        return this.corpName;
    }

    /*
     * <p>账户的账单日期</p>
     */
    public void setCycleDay(String value){
        this.cycleDay = value;
    }

    /*
     * <p>账户的账单日期</p>
     */
    public String getCycleDay() {
        return this.cycleDay;
    }

    /*
     * <p>标识账户是否出账单，及出联机账单还是实体账单 Y|要求出账单 N|不输出账单 /// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setStmtFlag(String value){
        this.stmtFlag = value;
    }

    /*
     * <p>标识账户是否出账单，及出联机账单还是实体账单 Y|要求出账单 N|不输出账单 /// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getStmtFlag() {
        return this.stmtFlag;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.AddressType</p>
     */
    public void setStmtMailAddrInd(String value){
        this.stmtMailAddrInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.AddressType</p>
     */
    public String getStmtMailAddrInd() {
        return this.stmtMailAddrInd;
    }

    /*
     * <p>P|纸质账单 E|电子账单 M|彩信账单 B|both /// @com.sunline.ppy.dictionary.enums.StmtMediaType</p>
     */
    public void setStmtMediaType(String value){
        this.stmtMediaType = value;
    }

    /*
     * <p>P|纸质账单 E|电子账单 M|彩信账单 B|both /// @com.sunline.ppy.dictionary.enums.StmtMediaType</p>
     */
    public String getStmtMediaType() {
        return this.stmtMediaType;
    }

    /*
     * <p>账单地址国家代码（从客户信息复制过来，保证核心快速处理）</p>
     */
    public void setStmtCountryCode(String value){
        this.stmtCountryCode = value;
    }

    /*
     * <p>账单地址国家代码（从客户信息复制过来，保证核心快速处理）</p>
     */
    public String getStmtCountryCode() {
        return this.stmtCountryCode;
    }

    /*
     * <p>账单地址省份</p>
     */
    public void setStmtState(String value){
        this.stmtState = value;
    }

    /*
     * <p>账单地址省份</p>
     */
    public String getStmtState() {
        return this.stmtState;
    }

    /*
     * <p>账单地址城市</p>
     */
    public void setStmtCity(String value){
        this.stmtCity = value;
    }

    /*
     * <p>账单地址城市</p>
     */
    public String getStmtCity() {
        return this.stmtCity;
    }

    /*
     * <p>账单地址行政区</p>
     */
    public void setStmtDistrict(String value){
        this.stmtDistrict = value;
    }

    /*
     * <p>账单地址行政区</p>
     */
    public String getStmtDistrict() {
        return this.stmtDistrict;
    }

    /*
     * <p>账单地址</p>
     */
    public void setStmtAddress(String value){
        this.stmtAddress = value;
    }

    /*
     * <p>账单地址</p>
     */
    public String getStmtAddress() {
        return this.stmtAddress;
    }

    /*
     * <p>账单地址邮政编码</p>
     */
    public void setStmtPostcode(String value){
        this.stmtPostcode = value;
    }

    /*
     * <p>账单地址邮政编码</p>
     */
    public String getStmtPostcode() {
        return this.stmtPostcode;
    }

    /*
     * <p>email</p>
     */
    public void setEmail(String value){
        this.email = value;
    }

    /*
     * <p>email</p>
     */
    public String getEmail() {
        return this.email;
    }

    /*
     * <p>blockCode</p>
     */
    public void setBlockCode(String value){
        this.blockCode = value;
    }

    /*
     * <p>blockCode</p>
     */
    public String getBlockCode() {
        return this.blockCode;
    }

    /*
     * <p>实体账单不需要显示此域（但可以用作账单拖欠信息提醒）， 联机账单需要</p>
     */
    public void setAgeCode(String value){
        this.ageCode = value;
    }

    /*
     * <p>实体账单不需要显示此域（但可以用作账单拖欠信息提醒）， 联机账单需要</p>
     */
    public String getAgeCode() {
        return this.ageCode;
    }

    /*
     * <p>ageCodeGl</p>
     */
    public void setAgeCodeGl(String value){
        this.ageCodeGl = value;
    }

    /*
     * <p>ageCodeGl</p>
     */
    public String getAgeCodeGl() {
        return this.ageCodeGl;
    }

    /*
     * <p>memoDb</p>
     */
    public void setMemoDb(BigDecimal value){
        this.memoDb = value;
    }

    /*
     * <p>memoDb</p>
     */
    public BigDecimal getMemoDb() {
        return this.memoDb;
    }

    /*
     * <p>memoCash</p>
     */
    public void setMemoCash(BigDecimal value){
        this.memoCash = value;
    }

    /*
     * <p>memoCash</p>
     */
    public BigDecimal getMemoCash() {
        return this.memoCash;
    }

    /*
     * <p>memoCr</p>
     */
    public void setMemoCr(BigDecimal value){
        this.memoCr = value;
    }

    /*
     * <p>memoCr</p>
     */
    public BigDecimal getMemoCr() {
        return this.memoCr;
    }

    /*
     * <p>M|最小额扣款 F|全额扣款 C|最小额储蓄购汇 E|全额储蓄购汇 /// @com.sunline.ppy.dictionary.enums.DdIndicator</p>
     */
    public void setDdInd(String value){
        this.ddInd = value;
    }

    /*
     * <p>M|最小额扣款 F|全额扣款 C|最小额储蓄购汇 E|全额储蓄购汇 /// @com.sunline.ppy.dictionary.enums.DdIndicator</p>
     */
    public String getDdInd() {
        return this.ddInd;
    }

    /*
     * <p>约定还款扣款账户银行名称</p>
     */
    public void setDdBankName(String value){
        this.ddBankName = value;
    }

    /*
     * <p>约定还款扣款账户银行名称</p>
     */
    public String getDdBankName() {
        return this.ddBankName;
    }

    /*
     * <p>ddBankBranch</p>
     */
    public void setDdBankBranch(String value){
        this.ddBankBranch = value;
    }

    /*
     * <p>ddBankBranch</p>
     */
    public String getDdBankBranch() {
        return this.ddBankBranch;
    }

    /*
     * <p>约定还款扣款账号</p>
     */
    public void setDdBankAcctNbr(String value){
        this.ddBankAcctNbr = value;
    }

    /*
     * <p>约定还款扣款账号</p>
     */
    public String getDdBankAcctNbr() {
        return this.ddBankAcctNbr;
    }

    /*
     * <p>约定还款扣款账户姓名</p>
     */
    public void setDdBankAcctName(String value){
        this.ddBankAcctName = value;
    }

    /*
     * <p>约定还款扣款账户姓名</p>
     */
    public String getDdBankAcctName() {
        return this.ddBankAcctName;
    }

    /*
     * <p>上期约定还款金额</p>
     */
    public void setLastDdAmt(BigDecimal value){
        this.lastDdAmt = value;
    }

    /*
     * <p>上期约定还款金额</p>
     */
    public BigDecimal getLastDdAmt() {
        return this.lastDdAmt;
    }

    /*
     * <p>上期约定还款日期</p>
     */
    public void setLastDdDate(Date value){
        this.lastDdDate = value;
    }

    /*
     * <p>上期约定还款日期</p>
     */
    public Date getLastDdDate() {
        return this.lastDdDate;
    }

    /*
     * <p>取值为M,F时账单系统需要将本外币账单接口合并生成实体账单 N|不还款 M|最小额还款 F|全额还款 /// @com.sunline.ppy.dictionary.enums.DualBillingInd</p>
     */
    public void setDualBillingFlag(String value){
        this.dualBillingFlag = value;
    }

    /*
     * <p>取值为M,F时账单系统需要将本外币账单接口合并生成实体账单 N|不还款 M|最小额还款 F|全额还款 /// @com.sunline.ppy.dictionary.enums.DualBillingInd</p>
     */
    public String getDualBillingFlag() {
        return this.dualBillingFlag;
    }

    /*
     * <p>上笔还款金额</p>
     */
    public void setLastPmtAmt(BigDecimal value){
        this.lastPmtAmt = value;
    }

    /*
     * <p>上笔还款金额</p>
     */
    public BigDecimal getLastPmtAmt() {
        return this.lastPmtAmt;
    }

    /*
     * <p>lastPmtDate</p>
     */
    public void setLastPmtDate(Date value){
        this.lastPmtDate = value;
    }

    /*
     * <p>lastPmtDate</p>
     */
    public Date getLastPmtDate() {
        return this.lastPmtDate;
    }

    /*
     * <p>上个账单日</p>
     */
    public void setLastStmtDate(Date value){
        this.lastStmtDate = value;
    }

    /*
     * <p>上个账单日</p>
     */
    public Date getLastStmtDate() {
        return this.lastStmtDate;
    }

    /*
     * <p>上个到期还款日</p>
     */
    public void setLastPmtDueDate(Date value){
        this.lastPmtDueDate = value;
    }

    /*
     * <p>上个到期还款日</p>
     */
    public Date getLastPmtDueDate() {
        return this.lastPmtDueDate;
    }

    /*
     * <p>上次账龄提升日，可以用来代替DELQ DAYS的计算</p>
     */
    public void setLastAgingDate(Date value){
        this.lastAgingDate = value;
    }

    /*
     * <p>上次账龄提升日，可以用来代替DELQ DAYS的计算</p>
     */
    public Date getLastAgingDate() {
        return this.lastAgingDate;
    }

    /*
     * <p>进入催收日期</p>
     */
    public void setCollectInDate(Date value){
        this.collectInDate = value;
    }

    /*
     * <p>进入催收日期</p>
     */
    public Date getCollectInDate() {
        return this.collectInDate;
    }

    /*
     * <p>出催收队列时间</p>
     */
    public void setCollectOutDate(Date value){
        this.collectOutDate = value;
    }

    /*
     * <p>出催收队列时间</p>
     */
    public Date getCollectOutDate() {
        return this.collectOutDate;
    }

    /*
     * <p>下个账单日</p>
     */
    public void setNextStmtDate(Date value){
        this.nextStmtDate = value;
    }

    /*
     * <p>下个账单日</p>
     */
    public Date getNextStmtDate() {
        return this.nextStmtDate;
    }

    /*
     * <p>pmtDueDate</p>
     */
    public void setPmtDueDate(Date value){
        this.pmtDueDate = value;
    }

    /*
     * <p>pmtDueDate</p>
     */
    public Date getPmtDueDate() {
        return this.pmtDueDate;
    }

    /*
     * <p>约定还款扣款文件生成日期</p>
     */
    public void setDdDate(Date value){
        this.ddDate = value;
    }

    /*
     * <p>约定还款扣款文件生成日期</p>
     */
    public Date getDdDate() {
        return this.ddDate;
    }

    /*
     * <p>宽限日</p>
     */
    public void setGraceDate(Date value){
        this.graceDate = value;
    }

    /*
     * <p>宽限日</p>
     */
    public Date getGraceDate() {
        return this.graceDate;
    }

    /*
     * <p>本币还外币日期</p>
     */
    public void setDualBillingDate(Date value){
        this.dualBillingDate = value;
    }

    /*
     * <p>本币还外币日期</p>
     */
    public Date getDualBillingDate() {
        return this.dualBillingDate;
    }

    /*
     * <p>首个账单日</p>
     */
    public void setFirstStmtDate(Date value){
        this.firstStmtDate = value;
    }

    /*
     * <p>首个账单日</p>
     */
    public Date getFirstStmtDate() {
        return this.firstStmtDate;
    }

    /*
     * <p>转呆账日期</p>
     */
    public void setChargeOffDate(Date value){
        this.chargeOffDate = value;
    }

    /*
     * <p>转呆账日期</p>
     */
    public Date getChargeOffDate() {
        return this.chargeOffDate;
    }

    /*
     * <p>卡片账户置上待销卡销户锁定码的日期 在销卡时置上销卡日期，在销卡撤销时清零销卡日期</p>
     */
    public void setCloseDate(Date value){
        this.closeDate = value;
    }

    /*
     * <p>卡片账户置上待销卡销户锁定码的日期 在销卡时置上销卡日期，在销卡撤销时清零销卡日期</p>
     */
    public Date getCloseDate() {
        return this.closeDate;
    }

    /*
     * <p>最终销户日期，指账户closed</p>
     */
    public void setClosedDate(Date value){
        this.closedDate = value;
    }

    /*
     * <p>最终销户日期，指账户closed</p>
     */
    public Date getClosedDate() {
        return this.closedDate;
    }

    /*
     * <p>首次消费日期，无消费是该字段为NULL</p>
     */
    public void setFirstRetlDate(Date value){
        this.firstRetlDate = value;
    }

    /*
     * <p>首次消费日期，无消费是该字段为NULL</p>
     */
    public Date getFirstRetlDate() {
        return this.firstRetlDate;
    }

    /*
     * <p>首次消费金额，无消费是该字段为NULL</p>
     */
    public void setFirstRetlAmt(BigDecimal value){
        this.firstRetlAmt = value;
    }

    /*
     * <p>首次消费金额，无消费是该字段为NULL</p>
     */
    public BigDecimal getFirstRetlAmt() {
        return this.firstRetlAmt;
    }

    /*
     * <p>totDueAmt</p>
     */
    public void setTotDueAmt(BigDecimal value){
        this.totDueAmt = value;
    }

    /*
     * <p>totDueAmt</p>
     */
    public BigDecimal getTotDueAmt() {
        return this.totDueAmt;
    }

    /*
     * <p>currDueAmt</p>
     */
    public void setCurrDueAmt(BigDecimal value){
        this.currDueAmt = value;
    }

    /*
     * <p>currDueAmt</p>
     */
    public BigDecimal getCurrDueAmt() {
        return this.currDueAmt;
    }

    /*
     * <p>上个月最小还款额</p>
     */
    public void setPastDueAmt1(BigDecimal value){
        this.pastDueAmt1 = value;
    }

    /*
     * <p>上个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt1() {
        return this.pastDueAmt1;
    }

    /*
     * <p>上2个月最小还款额</p>
     */
    public void setPastDueAmt2(BigDecimal value){
        this.pastDueAmt2 = value;
    }

    /*
     * <p>上2个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt2() {
        return this.pastDueAmt2;
    }

    /*
     * <p>上3个月最小还款额</p>
     */
    public void setPastDueAmt3(BigDecimal value){
        this.pastDueAmt3 = value;
    }

    /*
     * <p>上3个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt3() {
        return this.pastDueAmt3;
    }

    /*
     * <p>上4个月最小还款额</p>
     */
    public void setPastDueAmt4(BigDecimal value){
        this.pastDueAmt4 = value;
    }

    /*
     * <p>上4个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt4() {
        return this.pastDueAmt4;
    }

    /*
     * <p>上5个月最小还款额</p>
     */
    public void setPastDueAmt5(BigDecimal value){
        this.pastDueAmt5 = value;
    }

    /*
     * <p>上5个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt5() {
        return this.pastDueAmt5;
    }

    /*
     * <p>上6个月最小还款额</p>
     */
    public void setPastDueAmt6(BigDecimal value){
        this.pastDueAmt6 = value;
    }

    /*
     * <p>上6个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt6() {
        return this.pastDueAmt6;
    }

    /*
     * <p>上7个月最小还款额</p>
     */
    public void setPastDueAmt7(BigDecimal value){
        this.pastDueAmt7 = value;
    }

    /*
     * <p>上7个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt7() {
        return this.pastDueAmt7;
    }

    /*
     * <p>上8个月最小还款额</p>
     */
    public void setPastDueAmt8(BigDecimal value){
        this.pastDueAmt8 = value;
    }

    /*
     * <p>上8个月最小还款额</p>
     */
    public BigDecimal getPastDueAmt8() {
        return this.pastDueAmt8;
    }

    /*
     * <p>ctdCashAmt</p>
     */
    public void setCtdCashAmt(BigDecimal value){
        this.ctdCashAmt = value;
    }

    /*
     * <p>ctdCashAmt</p>
     */
    public BigDecimal getCtdCashAmt() {
        return this.ctdCashAmt;
    }

    /*
     * <p>本账期取现笔数</p>
     */
    public void setCtdCashCnt(BigDecimal value){
        this.ctdCashCnt = value;
    }

    /*
     * <p>本账期取现笔数</p>
     */
    public BigDecimal getCtdCashCnt() {
        return this.ctdCashCnt;
    }

    /*
     * <p>本账期联机借记金额累计值，在授权时维护，批量不参与</p>
     */
    public void setCtdRetailAmt(BigDecimal value){
        this.ctdRetailAmt = value;
    }

    /*
     * <p>本账期联机借记金额累计值，在授权时维护，批量不参与</p>
     */
    public BigDecimal getCtdRetailAmt() {
        return this.ctdRetailAmt;
    }

    /*
     * <p>本账期消费笔数</p>
     */
    public void setCtdRetailCnt(BigDecimal value){
        this.ctdRetailCnt = value;
    }

    /*
     * <p>本账期消费笔数</p>
     */
    public BigDecimal getCtdRetailCnt() {
        return this.ctdRetailCnt;
    }

    /*
     * <p>本账期还款金额</p>
     */
    public void setCtdRepayAmt(BigDecimal value){
        this.ctdRepayAmt = value;
    }

    /*
     * <p>本账期还款金额</p>
     */
    public BigDecimal getCtdRepayAmt() {
        return this.ctdRepayAmt;
    }

    /*
     * <p>本账期还款笔数</p>
     */
    public void setCtdRepayCnt(BigDecimal value){
        this.ctdRepayCnt = value;
    }

    /*
     * <p>本账期还款笔数</p>
     */
    public BigDecimal getCtdRepayCnt() {
        return this.ctdRepayCnt;
    }

    /*
     * <p>本账期借记调整金额</p>
     */
    public void setCtdDbAdjAmt(BigDecimal value){
        this.ctdDbAdjAmt = value;
    }

    /*
     * <p>本账期借记调整金额</p>
     */
    public BigDecimal getCtdDbAdjAmt() {
        return this.ctdDbAdjAmt;
    }

    /*
     * <p>本账期借记调整笔数</p>
     */
    public void setCtdDbAdjCnt(BigDecimal value){
        this.ctdDbAdjCnt = value;
    }

    /*
     * <p>本账期借记调整笔数</p>
     */
    public BigDecimal getCtdDbAdjCnt() {
        return this.ctdDbAdjCnt;
    }

    /*
     * <p>本账期贷记调整金额</p>
     */
    public void setCtdCrAdjAmt(BigDecimal value){
        this.ctdCrAdjAmt = value;
    }

    /*
     * <p>本账期贷记调整金额</p>
     */
    public BigDecimal getCtdCrAdjAmt() {
        return this.ctdCrAdjAmt;
    }

    /*
     * <p>本账期贷记调整笔数</p>
     */
    public void setCtdCrAdjCnt(BigDecimal value){
        this.ctdCrAdjCnt = value;
    }

    /*
     * <p>本账期贷记调整笔数</p>
     */
    public BigDecimal getCtdCrAdjCnt() {
        return this.ctdCrAdjCnt;
    }

    /*
     * <p>本账期费用金额</p>
     */
    public void setCtdFeeAmt(BigDecimal value){
        this.ctdFeeAmt = value;
    }

    /*
     * <p>本账期费用金额</p>
     */
    public BigDecimal getCtdFeeAmt() {
        return this.ctdFeeAmt;
    }

    /*
     * <p>本账期费用笔数</p>
     */
    public void setCtdFeeCnt(BigDecimal value){
        this.ctdFeeCnt = value;
    }

    /*
     * <p>本账期费用笔数</p>
     */
    public BigDecimal getCtdFeeCnt() {
        return this.ctdFeeCnt;
    }

    /*
     * <p>ctdInterestAmt</p>
     */
    public void setCtdInterestAmt(BigDecimal value){
        this.ctdInterestAmt = value;
    }

    /*
     * <p>ctdInterestAmt</p>
     */
    public BigDecimal getCtdInterestAmt() {
        return this.ctdInterestAmt;
    }

    /*
     * <p>ctdInterestCnt</p>
     */
    public void setCtdInterestCnt(BigDecimal value){
        this.ctdInterestCnt = value;
    }

    /*
     * <p>ctdInterestCnt</p>
     */
    public BigDecimal getCtdInterestCnt() {
        return this.ctdInterestCnt;
    }

    /*
     * <p>本账期退货金额</p>
     */
    public void setCtdRefundAmt(BigDecimal value){
        this.ctdRefundAmt = value;
    }

    /*
     * <p>本账期退货金额</p>
     */
    public BigDecimal getCtdRefundAmt() {
        return this.ctdRefundAmt;
    }

    /*
     * <p>本账期退货笔数</p>
     */
    public void setCtdRefundCnt(BigDecimal value){
        this.ctdRefundCnt = value;
    }

    /*
     * <p>本账期退货笔数</p>
     */
    public BigDecimal getCtdRefundCnt() {
        return this.ctdRefundCnt;
    }

    /*
     * <p>ctdMaxOvrlmtAmt</p>
     */
    public void setCtdMaxOvrlmtAmt(BigDecimal value){
        this.ctdMaxOvrlmtAmt = value;
    }

    /*
     * <p>ctdMaxOvrlmtAmt</p>
     */
    public BigDecimal getCtdMaxOvrlmtAmt() {
        return this.ctdMaxOvrlmtAmt;
    }

    /*
     * <p>mtdRetailAmt</p>
     */
    public void setMtdRetailAmt(BigDecimal value){
        this.mtdRetailAmt = value;
    }

    /*
     * <p>mtdRetailAmt</p>
     */
    public BigDecimal getMtdRetailAmt() {
        return this.mtdRetailAmt;
    }

    /*
     * <p>本月消费笔数</p>
     */
    public void setMtdRetailCnt(BigDecimal value){
        this.mtdRetailCnt = value;
    }

    /*
     * <p>本月消费笔数</p>
     */
    public BigDecimal getMtdRetailCnt() {
        return this.mtdRetailCnt;
    }

    /*
     * <p>mtdCashAmt</p>
     */
    public void setMtdCashAmt(BigDecimal value){
        this.mtdCashAmt = value;
    }

    /*
     * <p>mtdCashAmt</p>
     */
    public BigDecimal getMtdCashAmt() {
        return this.mtdCashAmt;
    }

    /*
     * <p>本月取现笔数</p>
     */
    public void setMtdCashCnt(BigDecimal value){
        this.mtdCashCnt = value;
    }

    /*
     * <p>本月取现笔数</p>
     */
    public BigDecimal getMtdCashCnt() {
        return this.mtdCashCnt;
    }

    /*
     * <p>mtdRefundAmt</p>
     */
    public void setMtdRefundAmt(BigDecimal value){
        this.mtdRefundAmt = value;
    }

    /*
     * <p>mtdRefundAmt</p>
     */
    public BigDecimal getMtdRefundAmt() {
        return this.mtdRefundAmt;
    }

    /*
     * <p>本月退货笔数</p>
     */
    public void setMtdRefundCnt(BigDecimal value){
        this.mtdRefundCnt = value;
    }

    /*
     * <p>本月退货笔数</p>
     */
    public BigDecimal getMtdRefundCnt() {
        return this.mtdRefundCnt;
    }

    /*
     * <p>ytdRetailAmt</p>
     */
    public void setYtdRetailAmt(BigDecimal value){
        this.ytdRetailAmt = value;
    }

    /*
     * <p>ytdRetailAmt</p>
     */
    public BigDecimal getYtdRetailAmt() {
        return this.ytdRetailAmt;
    }

    /*
     * <p>本年消费笔数</p>
     */
    public void setYtdRetailCnt(BigDecimal value){
        this.ytdRetailCnt = value;
    }

    /*
     * <p>本年消费笔数</p>
     */
    public BigDecimal getYtdRetailCnt() {
        return this.ytdRetailCnt;
    }

    /*
     * <p>本年取现金额</p>
     */
    public void setYtdCashAmt(BigDecimal value){
        this.ytdCashAmt = value;
    }

    /*
     * <p>本年取现金额</p>
     */
    public BigDecimal getYtdCashAmt() {
        return this.ytdCashAmt;
    }

    /*
     * <p>本年取现次数</p>
     */
    public void setYtdCashCnt(BigDecimal value){
        this.ytdCashCnt = value;
    }

    /*
     * <p>本年取现次数</p>
     */
    public BigDecimal getYtdCashCnt() {
        return this.ytdCashCnt;
    }

    /*
     * <p>本年退货金额</p>
     */
    public void setYtdRefundAmt(BigDecimal value){
        this.ytdRefundAmt = value;
    }

    /*
     * <p>本年退货金额</p>
     */
    public BigDecimal getYtdRefundAmt() {
        return this.ytdRefundAmt;
    }

    /*
     * <p>本年退货次数</p>
     */
    public void setYtdRefundCnt(BigDecimal value){
        this.ytdRefundCnt = value;
    }

    /*
     * <p>本年退货次数</p>
     */
    public BigDecimal getYtdRefundCnt() {
        return this.ytdRefundCnt;
    }

    /*
     * <p>ytdOvrlmtFeeAmt</p>
     */
    public void setYtdOvrlmtFeeAmt(BigDecimal value){
        this.ytdOvrlmtFeeAmt = value;
    }

    /*
     * <p>ytdOvrlmtFeeAmt</p>
     */
    public BigDecimal getYtdOvrlmtFeeAmt() {
        return this.ytdOvrlmtFeeAmt;
    }

    /*
     * <p>ytdOvrlmtFeeCnt</p>
     */
    public void setYtdOvrlmtFeeCnt(BigDecimal value){
        this.ytdOvrlmtFeeCnt = value;
    }

    /*
     * <p>ytdOvrlmtFeeCnt</p>
     */
    public BigDecimal getYtdOvrlmtFeeCnt() {
        return this.ytdOvrlmtFeeCnt;
    }

    /*
     * <p>ytdLateFeeAmt</p>
     */
    public void setYtdLateFeeAmt(BigDecimal value){
        this.ytdLateFeeAmt = value;
    }

    /*
     * <p>ytdLateFeeAmt</p>
     */
    public BigDecimal getYtdLateFeeAmt() {
        return this.ytdLateFeeAmt;
    }

    /*
     * <p>ytdLateFeeCnt</p>
     */
    public void setYtdLateFeeCnt(BigDecimal value){
        this.ytdLateFeeCnt = value;
    }

    /*
     * <p>ytdLateFeeCnt</p>
     */
    public BigDecimal getYtdLateFeeCnt() {
        return this.ytdLateFeeCnt;
    }

    /*
     * <p>ltdRetailAmt</p>
     */
    public void setLtdRetailAmt(BigDecimal value){
        this.ltdRetailAmt = value;
    }

    /*
     * <p>ltdRetailAmt</p>
     */
    public BigDecimal getLtdRetailAmt() {
        return this.ltdRetailAmt;
    }

    /*
     * <p>历史消费次数</p>
     */
    public void setLtdRetailCnt(BigDecimal value){
        this.ltdRetailCnt = value;
    }

    /*
     * <p>历史消费次数</p>
     */
    public BigDecimal getLtdRetailCnt() {
        return this.ltdRetailCnt;
    }

    /*
     * <p>ltdCashAmt</p>
     */
    public void setLtdCashAmt(BigDecimal value){
        this.ltdCashAmt = value;
    }

    /*
     * <p>ltdCashAmt</p>
     */
    public BigDecimal getLtdCashAmt() {
        return this.ltdCashAmt;
    }

    /*
     * <p>ltdCashCnt</p>
     */
    public void setLtdCashCnt(BigDecimal value){
        this.ltdCashCnt = value;
    }

    /*
     * <p>ltdCashCnt</p>
     */
    public BigDecimal getLtdCashCnt() {
        return this.ltdCashCnt;
    }

    /*
     * <p>历史退货金额</p>
     */
    public void setLtdRefundAmt(BigDecimal value){
        this.ltdRefundAmt = value;
    }

    /*
     * <p>历史退货金额</p>
     */
    public BigDecimal getLtdRefundAmt() {
        return this.ltdRefundAmt;
    }

    /*
     * <p>历史退货次数</p>
     */
    public void setLtdRefundCnt(BigDecimal value){
        this.ltdRefundCnt = value;
    }

    /*
     * <p>历史退货次数</p>
     */
    public BigDecimal getLtdRefundCnt() {
        return this.ltdRefundCnt;
    }

    /*
     * <p>历史最高本金欠款</p>
     */
    public void setLtdHighestPrin(BigDecimal value){
        this.ltdHighestPrin = value;
    }

    /*
     * <p>历史最高本金欠款</p>
     */
    public BigDecimal getLtdHighestPrin() {
        return this.ltdHighestPrin;
    }

    /*
     * <p>历史最高溢缴款</p>
     */
    public void setLtdHighestCrBal(BigDecimal value){
        this.ltdHighestCrBal = value;
    }

    /*
     * <p>历史最高溢缴款</p>
     */
    public BigDecimal getLtdHighestCrBal() {
        return this.ltdHighestCrBal;
    }

    /*
     * <p>历史最高欠款</p>
     */
    public void setLtdHighestBal(BigDecimal value){
        this.ltdHighestBal = value;
    }

    /*
     * <p>历史最高欠款</p>
     */
    public BigDecimal getLtdHighestBal() {
        return this.ltdHighestBal;
    }

    /*
     * <p>进入催收队列次数</p>
     */
    public void setCollectCnt(BigDecimal value){
        this.collectCnt = value;
    }

    /*
     * <p>进入催收队列次数</p>
     */
    public BigDecimal getCollectCnt() {
        return this.collectCnt;
    }

    /*
     * <p>催收系统分配的催收员代码</p>
     */
    public void setCollector(String value){
        this.collector = value;
    }

    /*
     * <p>催收系统分配的催收员代码</p>
     */
    public String getCollector() {
        return this.collector;
    }

    /*
     * <p>B0|锁定码催收，优先级第1 A0|首次还款拖欠催收，优先级第2 A1|账龄拖欠催收，优先级第3 O0|超限催收，优先级第4 /// @com.sunline.ppy.dictionary.enums.CollectionReason</p>
     */
    public void setCollectReason(String value){
        this.collectReason = value;
    }

    /*
     * <p>B0|锁定码催收，优先级第1 A0|首次还款拖欠催收，优先级第2 A1|账龄拖欠催收，优先级第3 O0|超限催收，优先级第4 /// @com.sunline.ppy.dictionary.enums.CollectionReason</p>
     */
    public String getCollectReason() {
        return this.collectReason;
    }

    /*
     * <p>过去24个账单周期的账龄，取值范围为0-9</p>
     */
    public void setAgeHst(String value){
        this.ageHst = value;
    }

    /*
     * <p>过去24个账单周期的账龄，取值范围为0-9</p>
     */
    public String getAgeHst() {
        return this.ageHst;
    }

    /*
     * <p>?记录过去24个月的还款历史，每个字节的含义如下： 引用枚举值com.sunline.ppy.dictionary.enums.PaymentStatus B|全额还款 D|部分还款 U|还款未达最小还款额 N|未还款 C|无需还款</p>
     */
    public void setPaymentHst(String value){
        this.paymentHst = value;
    }

    /*
     * <p>?记录过去24个月的还款历史，每个字节的含义如下： 引用枚举值com.sunline.ppy.dictionary.enums.PaymentStatus B|全额还款 D|部分还款 U|还款未达最小还款额 N|未还款 C|无需还款</p>
     */
    public String getPaymentHst() {
        return this.paymentHst;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setWaiveOvlfeeInd(String value){
        this.waiveOvlfeeInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getWaiveOvlfeeInd() {
        return this.waiveOvlfeeInd;
    }

    /*
     * <p>账户上的卡年费免除标志对其下所有卡生，卡片上的仅对本卡生效 /// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setWaiveCardfeeInd(String value){
        this.waiveCardfeeInd = value;
    }

    /*
     * <p>账户上的卡年费免除标志对其下所有卡生，卡片上的仅对本卡生效 /// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getWaiveCardfeeInd() {
        return this.waiveCardfeeInd;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setWaiveLatefeeInd(String value){
        this.waiveLatefeeInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getWaiveLatefeeInd() {
        return this.waiveLatefeeInd;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setWaiveSvcfeeInd(String value){
        this.waiveSvcfeeInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getWaiveSvcfeeInd() {
        return this.waiveSvcfeeInd;
    }

    /*
     * <p>userCode1</p>
     */
    public void setUserCode1(String value){
        this.userCode1 = value;
    }

    /*
     * <p>userCode1</p>
     */
    public String getUserCode1() {
        return this.userCode1;
    }

    /*
     * <p>userCode2</p>
     */
    public void setUserCode2(String value){
        this.userCode2 = value;
    }

    /*
     * <p>userCode2</p>
     */
    public String getUserCode2() {
        return this.userCode2;
    }

    /*
     * <p>userCode3</p>
     */
    public void setUserCode3(String value){
        this.userCode3 = value;
    }

    /*
     * <p>userCode3</p>
     */
    public String getUserCode3() {
        return this.userCode3;
    }

    /*
     * <p>userCode4</p>
     */
    public void setUserCode4(String value){
        this.userCode4 = value;
    }

    /*
     * <p>userCode4</p>
     */
    public String getUserCode4() {
        return this.userCode4;
    }

    /*
     * <p>userCode5</p>
     */
    public void setUserCode5(String value){
        this.userCode5 = value;
    }

    /*
     * <p>userCode5</p>
     */
    public String getUserCode5() {
        return this.userCode5;
    }

    /*
     * <p>userCode6</p>
     */
    public void setUserCode6(String value){
        this.userCode6 = value;
    }

    /*
     * <p>userCode6</p>
     */
    public String getUserCode6() {
        return this.userCode6;
    }

    /*
     * <p>userDate1</p>
     */
    public void setUserDate1(Date value){
        this.userDate1 = value;
    }

    /*
     * <p>userDate1</p>
     */
    public Date getUserDate1() {
        return this.userDate1;
    }

    /*
     * <p>userDate2</p>
     */
    public void setUserDate2(Date value){
        this.userDate2 = value;
    }

    /*
     * <p>userDate2</p>
     */
    public Date getUserDate2() {
        return this.userDate2;
    }

    /*
     * <p>userDate3</p>
     */
    public void setUserDate3(Date value){
        this.userDate3 = value;
    }

    /*
     * <p>userDate3</p>
     */
    public Date getUserDate3() {
        return this.userDate3;
    }

    /*
     * <p>userDate4</p>
     */
    public void setUserDate4(Date value){
        this.userDate4 = value;
    }

    /*
     * <p>userDate4</p>
     */
    public Date getUserDate4() {
        return this.userDate4;
    }

    /*
     * <p>userDate5</p>
     */
    public void setUserDate5(Date value){
        this.userDate5 = value;
    }

    /*
     * <p>userDate5</p>
     */
    public Date getUserDate5() {
        return this.userDate5;
    }

    /*
     * <p>userDate6</p>
     */
    public void setUserDate6(Date value){
        this.userDate6 = value;
    }

    /*
     * <p>userDate6</p>
     */
    public Date getUserDate6() {
        return this.userDate6;
    }

    /*
     * <p>userNumber1</p>
     */
    public void setUserNumber1(BigDecimal value){
        this.userNumber1 = value;
    }

    /*
     * <p>userNumber1</p>
     */
    public BigDecimal getUserNumber1() {
        return this.userNumber1;
    }

    /*
     * <p>userNumber2</p>
     */
    public void setUserNumber2(BigDecimal value){
        this.userNumber2 = value;
    }

    /*
     * <p>userNumber2</p>
     */
    public BigDecimal getUserNumber2() {
        return this.userNumber2;
    }

    /*
     * <p>userNumber3</p>
     */
    public void setUserNumber3(BigDecimal value){
        this.userNumber3 = value;
    }

    /*
     * <p>userNumber3</p>
     */
    public BigDecimal getUserNumber3() {
        return this.userNumber3;
    }

    /*
     * <p>userNumber4</p>
     */
    public void setUserNumber4(BigDecimal value){
        this.userNumber4 = value;
    }

    /*
     * <p>userNumber4</p>
     */
    public BigDecimal getUserNumber4() {
        return this.userNumber4;
    }

    /*
     * <p>userNumber5</p>
     */
    public void setUserNumber5(BigDecimal value){
        this.userNumber5 = value;
    }

    /*
     * <p>userNumber5</p>
     */
    public BigDecimal getUserNumber5() {
        return this.userNumber5;
    }

    /*
     * <p>userNumber6</p>
     */
    public void setUserNumber6(BigDecimal value){
        this.userNumber6 = value;
    }

    /*
     * <p>userNumber6</p>
     */
    public BigDecimal getUserNumber6() {
        return this.userNumber6;
    }

    /*
     * <p>userField1</p>
     */
    public void setUserField1(String value){
        this.userField1 = value;
    }

    /*
     * <p>userField1</p>
     */
    public String getUserField1() {
        return this.userField1;
    }

    /*
     * <p>userField2</p>
     */
    public void setUserField2(String value){
        this.userField2 = value;
    }

    /*
     * <p>userField2</p>
     */
    public String getUserField2() {
        return this.userField2;
    }

    /*
     * <p>userField3</p>
     */
    public void setUserField3(String value){
        this.userField3 = value;
    }

    /*
     * <p>userField3</p>
     */
    public String getUserField3() {
        return this.userField3;
    }

    /*
     * <p>userField4</p>
     */
    public void setUserField4(String value){
        this.userField4 = value;
    }

    /*
     * <p>userField4</p>
     */
    public String getUserField4() {
        return this.userField4;
    }

    /*
     * <p>userField5</p>
     */
    public void setUserField5(String value){
        this.userField5 = value;
    }

    /*
     * <p>userField5</p>
     */
    public String getUserField5() {
        return this.userField5;
    }

    /*
     * <p>userField6</p>
     */
    public void setUserField6(String value){
        this.userField6 = value;
    }

    /*
     * <p>userField6</p>
     */
    public String getUserField6() {
        return this.userField6;
    }

    /*
     * <p>userAmt1</p>
     */
    public void setUserAmt1(BigDecimal value){
        this.userAmt1 = value;
    }

    /*
     * <p>userAmt1</p>
     */
    public BigDecimal getUserAmt1() {
        return this.userAmt1;
    }

    /*
     * <p>userAmt2</p>
     */
    public void setUserAmt2(BigDecimal value){
        this.userAmt2 = value;
    }

    /*
     * <p>userAmt2</p>
     */
    public BigDecimal getUserAmt2() {
        return this.userAmt2;
    }

    /*
     * <p>userAmt3</p>
     */
    public void setUserAmt3(BigDecimal value){
        this.userAmt3 = value;
    }

    /*
     * <p>userAmt3</p>
     */
    public BigDecimal getUserAmt3() {
        return this.userAmt3;
    }

    /*
     * <p>userAmt4</p>
     */
    public void setUserAmt4(BigDecimal value){
        this.userAmt4 = value;
    }

    /*
     * <p>userAmt4</p>
     */
    public BigDecimal getUserAmt4() {
        return this.userAmt4;
    }

    /*
     * <p>userAmt5</p>
     */
    public void setUserAmt5(BigDecimal value){
        this.userAmt5 = value;
    }

    /*
     * <p>userAmt5</p>
     */
    public BigDecimal getUserAmt5() {
        return this.userAmt5;
    }

    /*
     * <p>userAmt6</p>
     */
    public void setUserAmt6(BigDecimal value){
        this.userAmt6 = value;
    }

    /*
     * <p>userAmt6</p>
     */
    public BigDecimal getUserAmt6() {
        return this.userAmt6;
    }

    /*
     * <p>mtdPaymentAmt</p>
     */
    public void setMtdPaymentAmt(BigDecimal value){
        this.mtdPaymentAmt = value;
    }

    /*
     * <p>mtdPaymentAmt</p>
     */
    public BigDecimal getMtdPaymentAmt() {
        return this.mtdPaymentAmt;
    }

    /*
     * <p>mtdPaymentCnt</p>
     */
    public void setMtdPaymentCnt(BigDecimal value){
        this.mtdPaymentCnt = value;
    }

    /*
     * <p>mtdPaymentCnt</p>
     */
    public BigDecimal getMtdPaymentCnt() {
        return this.mtdPaymentCnt;
    }

    /*
     * <p>ytdRepayAmt</p>
     */
    public void setYtdRepayAmt(BigDecimal value){
        this.ytdRepayAmt = value;
    }

    /*
     * <p>ytdRepayAmt</p>
     */
    public BigDecimal getYtdRepayAmt() {
        return this.ytdRepayAmt;
    }

    /*
     * <p>ytdRepayCnt</p>
     */
    public void setYtdRepayCnt(BigDecimal value){
        this.ytdRepayCnt = value;
    }

    /*
     * <p>ytdRepayCnt</p>
     */
    public BigDecimal getYtdRepayCnt() {
        return this.ytdRepayCnt;
    }

    /*
     * <p>ltdRepayAmt</p>
     */
    public void setLtdRepayAmt(BigDecimal value){
        this.ltdRepayAmt = value;
    }

    /*
     * <p>ltdRepayAmt</p>
     */
    public BigDecimal getLtdRepayAmt() {
        return this.ltdRepayAmt;
    }

    /*
     * <p>ltdRepayCnt</p>
     */
    public void setLtdRepayCnt(BigDecimal value){
        this.ltdRepayCnt = value;
    }

    /*
     * <p>ltdRepayCnt</p>
     */
    public BigDecimal getLtdRepayCnt() {
        return this.ltdRepayCnt;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.SmsInd</p>
     */
    public void setSmsInd(String value){
        this.smsInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.SmsInd</p>
     */
    public String getSmsInd() {
        return this.smsInd;
    }

    /*
     * <p>userSmsAmt</p>
     */
    public void setUserSmsAmt(BigDecimal value){
        this.userSmsAmt = value;
    }

    /*
     * <p>userSmsAmt</p>
     */
    public BigDecimal getUserSmsAmt() {
        return this.userSmsAmt;
    }

    /*
     * <p>ytdCycleChagCnt</p>
     */
    public void setYtdCycleChagCnt(BigDecimal value){
        this.ytdCycleChagCnt = value;
    }

    /*
     * <p>ytdCycleChagCnt</p>
     */
    public BigDecimal getYtdCycleChagCnt() {
        return this.ytdCycleChagCnt;
    }

    /*
     * <p>lastPostDate</p>
     */
    public void setLastPostDate(Date value){
        this.lastPostDate = value;
    }

    /*
     * <p>lastPostDate</p>
     */
    public Date getLastPostDate() {
        return this.lastPostDate;
    }

    /*
     * <p>contrNbr</p>
     */
    public void setContrNbr(String value){
        this.contrNbr = value;
    }

    /*
     * <p>contrNbr</p>
     */
    public String getContrNbr() {
        return this.contrNbr;
    }

    /*
     * <p>guarantyId</p>
     */
    public void setGuarantyId(String value){
        this.guarantyId = value;
    }

    /*
     * <p>guarantyId</p>
     */
    public String getGuarantyId() {
        return this.guarantyId;
    }

    /*
     * <p>ddBankProvince</p>
     */
    public void setDdBankProvince(String value){
        this.ddBankProvince = value;
    }

    /*
     * <p>ddBankProvince</p>
     */
    public String getDdBankProvince() {
        return this.ddBankProvince;
    }

    /*
     * <p>ddBankProvinceCode</p>
     */
    public void setDdBankProvinceCode(String value){
        this.ddBankProvinceCode = value;
    }

    /*
     * <p>ddBankProvinceCode</p>
     */
    public String getDdBankProvinceCode() {
        return this.ddBankProvinceCode;
    }

    /*
     * <p>ddBankCity</p>
     */
    public void setDdBankCity(String value){
        this.ddBankCity = value;
    }

    /*
     * <p>ddBankCity</p>
     */
    public String getDdBankCity() {
        return this.ddBankCity;
    }

    /*
     * <p>ddBankCityCode</p>
     */
    public void setDdBankCityCode(String value){
        this.ddBankCityCode = value;
    }

    /*
     * <p>ddBankCityCode</p>
     */
    public String getDdBankCityCode() {
        return this.ddBankCityCode;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.InputSource</p>
     */
    public void setCustSource(String value){
        this.custSource = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.InputSource</p>
     */
    public String getCustSource() {
        return this.custSource;
    }

    /*
     * <p>createTime</p>
     */
    public void setCreateTime(Date value){
        this.createTime = value;
    }

    /*
     * <p>createTime</p>
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /*
     * <p>createUser</p>
     */
    public void setCreateUser(String value){
        this.createUser = value;
    }

    /*
     * <p>createUser</p>
     */
    public String getCreateUser() {
        return this.createUser;
    }

    /*
     * <p>lstUpdTime</p>
     */
    public void setLstUpdTime(Date value){
        this.lstUpdTime = value;
    }

    /*
     * <p>lstUpdTime</p>
     */
    public Date getLstUpdTime() {
        return this.lstUpdTime;
    }

    /*
     * <p>lstUpdUser</p>
     */
    public void setLstUpdUser(String value){
        this.lstUpdUser = value;
    }

    /*
     * <p>lstUpdUser</p>
     */
    public String getLstUpdUser() {
        return this.lstUpdUser;
    }

    /*
     * <p>jpaVersion</p>
     */
    public void setJpaVersion(BigDecimal value){
        this.jpaVersion = value;
    }

    /*
     * <p>jpaVersion</p>
     */
    public BigDecimal getJpaVersion() {
        return this.jpaVersion;
    }

    /*
     * <p>ltdLoanAmt</p>
     */
    public void setLtdLoanAmt(BigDecimal value){
        this.ltdLoanAmt = value;
    }

    /*
     * <p>ltdLoanAmt</p>
     */
    public BigDecimal getLtdLoanAmt() {
        return this.ltdLoanAmt;
    }

    /*
     * <p>applicationNo</p>
     */
    public void setApplicationNo(String value){
        this.applicationNo = value;
    }

    /*
     * <p>applicationNo</p>
     */
    public String getApplicationNo() {
        return this.applicationNo;
    }

    /*
     * <p>agreementRateExpireDate</p>
     */
    public void setAgreementRateExpireDate(Date value){
        this.agreementRateExpireDate = value;
    }

    /*
     * <p>agreementRateExpireDate</p>
     */
    public Date getAgreementRateExpireDate() {
        return this.agreementRateExpireDate;
    }

    /*
     * <p>acctExpireDate</p>
     */
    public void setAcctExpireDate(Date value){
        this.acctExpireDate = value;
    }

    /*
     * <p>acctExpireDate</p>
     */
    public Date getAcctExpireDate() {
        return this.acctExpireDate;
    }

    /*
     * <p>loanMold</p>
     */
    public void setLoanMold(String value){
        this.loanMold = value;
    }

    /*
     * <p>loanMold</p>
     */
    public String getLoanMold() {
        return this.loanMold;
    }

    /*
     * <p>acqId</p>
     */
    public void setAcqId(String value){
        this.acqId = value;
    }

    /*
     * <p>acqId</p>
     */
    public String getAcqId() {
        return this.acqId;
    }

    /*
     * <p>lastSyncDate</p>
     */
    public void setLastSyncDate(Date value){
        this.lastSyncDate = value;
    }

    /*
     * <p>lastSyncDate</p>
     */
    public Date getLastSyncDate() {
        return this.lastSyncDate;
    }

    /*
     * <p>agreementRateInd</p>
     */
    public void setAgreementRateInd(String value){
        this.agreementRateInd = value;
    }

    /*
     * <p>agreementRateInd</p>
     */
    public String getAgreementRateInd() {
        return this.agreementRateInd;
    }

    /*
     * <p>feeRate</p>
     */
    public void setFeeRate(BigDecimal value){
        this.feeRate = value;
    }

    /*
     * <p>feeRate</p>
     */
    public BigDecimal getFeeRate() {
        return this.feeRate;
    }

    /*
     * <p>feeAmt</p>
     */
    public void setFeeAmt(BigDecimal value){
        this.feeAmt = value;
    }

    /*
     * <p>feeAmt</p>
     */
    public BigDecimal getFeeAmt() {
        return this.feeAmt;
    }

    /*
     * <p>lifeInsuFeeAmt</p>
     */
    public void setLifeInsuFeeAmt(BigDecimal value){
        this.lifeInsuFeeAmt = value;
    }

    /*
     * <p>lifeInsuFeeAmt</p>
     */
    public BigDecimal getLifeInsuFeeAmt() {
        return this.lifeInsuFeeAmt;
    }

    /*
     * <p>installmentFeeRate</p>
     */
    public void setInstallmentFeeRate(BigDecimal value){
        this.installmentFeeRate = value;
    }

    /*
     * <p>installmentFeeRate</p>
     */
    public BigDecimal getInstallmentFeeRate() {
        return this.installmentFeeRate;
    }

    /*
     * <p>installmentFeeAmt</p>
     */
    public void setInstallmentFeeAmt(BigDecimal value){
        this.installmentFeeAmt = value;
    }

    /*
     * <p>installmentFeeAmt</p>
     */
    public BigDecimal getInstallmentFeeAmt() {
        return this.installmentFeeAmt;
    }

    /*
     * <p>prepayPkgFeeAmt</p>
     */
    public void setPrepayPkgFeeAmt(BigDecimal value){
        this.prepayPkgFeeAmt = value;
    }

    /*
     * <p>prepayPkgFeeAmt</p>
     */
    public BigDecimal getPrepayPkgFeeAmt() {
        return this.prepayPkgFeeAmt;
    }

    /*
     * <p>penaltyRate</p>
     */
    public void setPenaltyRate(BigDecimal value){
        this.penaltyRate = value;
    }

    /*
     * <p>penaltyRate</p>
     */
    public BigDecimal getPenaltyRate() {
        return this.penaltyRate;
    }

    /*
     * <p>compoundRate</p>
     */
    public void setCompoundRate(BigDecimal value){
        this.compoundRate = value;
    }

    /*
     * <p>compoundRate</p>
     */
    public BigDecimal getCompoundRate() {
        return this.compoundRate;
    }

    /*
     * <p>interestRate</p>
     */
    public void setInterestRate(BigDecimal value){
        this.interestRate = value;
    }

    /*
     * <p>interestRate</p>
     */
    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    /*
     * <p>lifeInsuFeeRate</p>
     */
    public void setLifeInsuFeeRate(BigDecimal value){
        this.lifeInsuFeeRate = value;
    }

    /*
     * <p>lifeInsuFeeRate</p>
     */
    public BigDecimal getLifeInsuFeeRate() {
        return this.lifeInsuFeeRate;
    }

    /*
     * <p>insuranceRate</p>
     */
    public void setInsuranceRate(BigDecimal value){
        this.insuranceRate = value;
    }

    /*
     * <p>insuranceRate</p>
     */
    public BigDecimal getInsuranceRate() {
        return this.insuranceRate;
    }

    /*
     * <p>insAmt</p>
     */
    public void setInsAmt(BigDecimal value){
        this.insAmt = value;
    }

    /*
     * <p>insAmt</p>
     */
    public BigDecimal getInsAmt() {
        return this.insAmt;
    }

    /*
     * <p>stampAmt</p>
     */
    public void setStampAmt(BigDecimal value){
        this.stampAmt = value;
    }

    /*
     * <p>stampAmt</p>
     */
    public BigDecimal getStampAmt() {
        return this.stampAmt;
    }

    /*
     * <p>stampdutyRate</p>
     */
    public void setStampdutyRate(BigDecimal value){
        this.stampdutyRate = value;
    }

    /*
     * <p>stampdutyRate</p>
     */
    public BigDecimal getStampdutyRate() {
        return this.stampdutyRate;
    }

    /*
     * <p>lastLimitAdjDate</p>
     */
    public void setLastLimitAdjDate(Date value){
        this.lastLimitAdjDate = value;
    }

    /*
     * <p>lastLimitAdjDate</p>
     */
    public Date getLastLimitAdjDate() {
        return this.lastLimitAdjDate;
    }

    /*
     * <p>loanFeeDefId</p>
     */
    public void setLoanFeeDefId(String value){
        this.loanFeeDefId = value;
    }

    /*
     * <p>loanFeeDefId</p>
     */
    public String getLoanFeeDefId() {
        return this.loanFeeDefId;
    }

    /*
     * <p>applyDate</p>
     */
    public void setApplyDate(Date value){
        this.applyDate = value;
    }

    /*
     * <p>applyDate</p>
     */
    public Date getApplyDate() {
        return this.applyDate;
    }

    /*
     * <p>purpose</p>
     */
    public void setPurpose(String value){
        this.purpose = value;
    }

    /*
     * <p>purpose</p>
     */
    public String getPurpose() {
        return this.purpose;
    }

    /*
     * <p>subTerminalType</p>
     */
    public void setSubTerminalType(String value){
        this.subTerminalType = value;
    }

    /*
     * <p>subTerminalType</p>
     */
    public String getSubTerminalType() {
        return this.subTerminalType;
    }

    /*
     * <p>prepayPkgFeeRate</p>
     */
    public void setPrepayPkgFeeRate(BigDecimal value){
        this.prepayPkgFeeRate = value;
    }

    /*
     * <p>prepayPkgFeeRate</p>
     */
    public BigDecimal getPrepayPkgFeeRate() {
        return this.prepayPkgFeeRate;
    }

    /*
     * <p>joinLifeInsuInd</p>
     */
    public void setJoinLifeInsuInd(String value){
        this.joinLifeInsuInd = value;
    }

    /*
     * <p>joinLifeInsuInd</p>
     */
    public String getJoinLifeInsuInd() {
        return this.joinLifeInsuInd;
    }

    /*
     * <p>joinPrepayPkgInd</p>
     */
    public void setJoinPrepayPkgInd(String value){
        this.joinPrepayPkgInd = value;
    }

    /*
     * <p>joinPrepayPkgInd</p>
     */
    public String getJoinPrepayPkgInd() {
        return this.joinPrepayPkgInd;
    }

    /*
     * <p>replaceSvcFeeRate</p>
     */
    public void setReplaceSvcFeeRate(BigDecimal value){
        this.replaceSvcFeeRate = value;
    }

    /*
     * <p>replaceSvcFeeRate</p>
     */
    public BigDecimal getReplaceSvcFeeRate() {
        return this.replaceSvcFeeRate;
    }

    /*
     * <p>replaceSvcFeeAmt</p>
     */
    public void setReplaceSvcFeeAmt(BigDecimal value){
        this.replaceSvcFeeAmt = value;
    }

    /*
     * <p>replaceSvcFeeAmt</p>
     */
    public BigDecimal getReplaceSvcFeeAmt() {
        return this.replaceSvcFeeAmt;
    }

    /*
     * <p>replacePenaltyRate</p>
     */
    public void setReplacePenaltyRate(BigDecimal value){
        this.replacePenaltyRate = value;
    }

    /*
     * <p>replacePenaltyRate</p>
     */
    public BigDecimal getReplacePenaltyRate() {
        return this.replacePenaltyRate;
    }

    /*
     * <p>prepayPkgInd</p>
     */
    public void setPrepayPkgInd(String value){
        this.prepayPkgInd = value;
    }

    /*
     * <p>prepayPkgInd</p>
     */
    public String getPrepayPkgInd() {
        return this.prepayPkgInd;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setJoinScreenInsuInd(String value){
        this.joinScreenInsuInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getJoinScreenInsuInd() {
        return this.joinScreenInsuInd;
    }

    /*
     * <p>碎屏险固定金额</p>
     */
    public void setScreenInsuFeeAmt(BigDecimal value){
        this.screenInsuFeeAmt = value;
    }

    /*
     * <p>碎屏险固定金额</p>
     */
    public BigDecimal getScreenInsuFeeAmt() {
        return this.screenInsuFeeAmt;
    }

    /*
     * <p>碎屏险费率</p>
     */
    public void setScreenInsuFeeRate(BigDecimal value){
        this.screenInsuFeeRate = value;
    }

    /*
     * <p>碎屏险费率</p>
     */
    public BigDecimal getScreenInsuFeeRate() {
        return this.screenInsuFeeRate;
    }


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("org", org);
        map.put("acctNbr", acctNbr);
        map.put("acctType", acctType);
        map.put("custId", custId);
        map.put("custLmtId", custLmtId);
        map.put("productCd", productCd);
        map.put("defaultLogicCardNbr", defaultLogicCardNbr);
        map.put("currency", currency);
        map.put("creditLmt", creditLmt);
        map.put("tempLmt", tempLmt);
        map.put("tempLmtBegDate", tempLmtBegDate);
        map.put("tempLmtEndDate", tempLmtEndDate);
        map.put("cashLmtRate", cashLmtRate);
        map.put("ovrlmtRate", ovrlmtRate);
        map.put("loanLmtRate", loanLmtRate);
        map.put("currBal", currBal);
        map.put("cashBal", cashBal);
        map.put("principalBal", principalBal);
        map.put("loanBal", loanBal);
        map.put("disputeAmt", disputeAmt);
        map.put("begBal", begBal);
        map.put("pmtDueDayBal", pmtDueDayBal);
        map.put("qualGraceBal", qualGraceBal);
        map.put("graceDaysFullInd", graceDaysFullInd);
        map.put("pointsBegBal", pointsBegBal);
        map.put("ctdPoints", ctdPoints);
        map.put("ctdSpendPoints", ctdSpendPoints);
        map.put("ctdAdjPoints", ctdAdjPoints);
        map.put("pointsBal", pointsBal);
        map.put("setupDate", setupDate);
        map.put("dormentDate", dormentDate);
        map.put("eactiveDate", eactiveDate);
        map.put("ovrlmtDate", ovrlmtDate);
        map.put("ovrlmtNbrOfCyc", ovrlmtNbrOfCyc);
        map.put("name", name);
        map.put("gender", gender);
        map.put("owningBranch", owningBranch);
        map.put("mobileNo", mobileNo);
        map.put("corpName", corpName);
        map.put("cycleDay", cycleDay);
        map.put("stmtFlag", stmtFlag);
        map.put("stmtMailAddrInd", stmtMailAddrInd);
        map.put("stmtMediaType", stmtMediaType);
        map.put("stmtCountryCode", stmtCountryCode);
        map.put("stmtState", stmtState);
        map.put("stmtCity", stmtCity);
        map.put("stmtDistrict", stmtDistrict);
        map.put("stmtAddress", stmtAddress);
        map.put("stmtPostcode", stmtPostcode);
        map.put("email", email);
        map.put("blockCode", blockCode);
        map.put("ageCode", ageCode);
        map.put("ageCodeGl", ageCodeGl);
        map.put("memoDb", memoDb);
        map.put("memoCash", memoCash);
        map.put("memoCr", memoCr);
        map.put("ddInd", ddInd);
        map.put("ddBankName", ddBankName);
        map.put("ddBankBranch", ddBankBranch);
        map.put("ddBankAcctNbr", ddBankAcctNbr);
        map.put("ddBankAcctName", ddBankAcctName);
        map.put("lastDdAmt", lastDdAmt);
        map.put("lastDdDate", lastDdDate);
        map.put("dualBillingFlag", dualBillingFlag);
        map.put("lastPmtAmt", lastPmtAmt);
        map.put("lastPmtDate", lastPmtDate);
        map.put("lastStmtDate", lastStmtDate);
        map.put("lastPmtDueDate", lastPmtDueDate);
        map.put("lastAgingDate", lastAgingDate);
        map.put("collectInDate", collectInDate);
        map.put("collectOutDate", collectOutDate);
        map.put("nextStmtDate", nextStmtDate);
        map.put("pmtDueDate", pmtDueDate);
        map.put("ddDate", ddDate);
        map.put("graceDate", graceDate);
        map.put("dualBillingDate", dualBillingDate);
        map.put("firstStmtDate", firstStmtDate);
        map.put("chargeOffDate", chargeOffDate);
        map.put("closeDate", closeDate);
        map.put("closedDate", closedDate);
        map.put("firstRetlDate", firstRetlDate);
        map.put("firstRetlAmt", firstRetlAmt);
        map.put("totDueAmt", totDueAmt);
        map.put("currDueAmt", currDueAmt);
        map.put("pastDueAmt1", pastDueAmt1);
        map.put("pastDueAmt2", pastDueAmt2);
        map.put("pastDueAmt3", pastDueAmt3);
        map.put("pastDueAmt4", pastDueAmt4);
        map.put("pastDueAmt5", pastDueAmt5);
        map.put("pastDueAmt6", pastDueAmt6);
        map.put("pastDueAmt7", pastDueAmt7);
        map.put("pastDueAmt8", pastDueAmt8);
        map.put("ctdCashAmt", ctdCashAmt);
        map.put("ctdCashCnt", ctdCashCnt);
        map.put("ctdRetailAmt", ctdRetailAmt);
        map.put("ctdRetailCnt", ctdRetailCnt);
        map.put("ctdRepayAmt", ctdRepayAmt);
        map.put("ctdRepayCnt", ctdRepayCnt);
        map.put("ctdDbAdjAmt", ctdDbAdjAmt);
        map.put("ctdDbAdjCnt", ctdDbAdjCnt);
        map.put("ctdCrAdjAmt", ctdCrAdjAmt);
        map.put("ctdCrAdjCnt", ctdCrAdjCnt);
        map.put("ctdFeeAmt", ctdFeeAmt);
        map.put("ctdFeeCnt", ctdFeeCnt);
        map.put("ctdInterestAmt", ctdInterestAmt);
        map.put("ctdInterestCnt", ctdInterestCnt);
        map.put("ctdRefundAmt", ctdRefundAmt);
        map.put("ctdRefundCnt", ctdRefundCnt);
        map.put("ctdMaxOvrlmtAmt", ctdMaxOvrlmtAmt);
        map.put("mtdRetailAmt", mtdRetailAmt);
        map.put("mtdRetailCnt", mtdRetailCnt);
        map.put("mtdCashAmt", mtdCashAmt);
        map.put("mtdCashCnt", mtdCashCnt);
        map.put("mtdRefundAmt", mtdRefundAmt);
        map.put("mtdRefundCnt", mtdRefundCnt);
        map.put("ytdRetailAmt", ytdRetailAmt);
        map.put("ytdRetailCnt", ytdRetailCnt);
        map.put("ytdCashAmt", ytdCashAmt);
        map.put("ytdCashCnt", ytdCashCnt);
        map.put("ytdRefundAmt", ytdRefundAmt);
        map.put("ytdRefundCnt", ytdRefundCnt);
        map.put("ytdOvrlmtFeeAmt", ytdOvrlmtFeeAmt);
        map.put("ytdOvrlmtFeeCnt", ytdOvrlmtFeeCnt);
        map.put("ytdLateFeeAmt", ytdLateFeeAmt);
        map.put("ytdLateFeeCnt", ytdLateFeeCnt);
        map.put("ltdRetailAmt", ltdRetailAmt);
        map.put("ltdRetailCnt", ltdRetailCnt);
        map.put("ltdCashAmt", ltdCashAmt);
        map.put("ltdCashCnt", ltdCashCnt);
        map.put("ltdRefundAmt", ltdRefundAmt);
        map.put("ltdRefundCnt", ltdRefundCnt);
        map.put("ltdHighestPrin", ltdHighestPrin);
        map.put("ltdHighestCrBal", ltdHighestCrBal);
        map.put("ltdHighestBal", ltdHighestBal);
        map.put("collectCnt", collectCnt);
        map.put("collector", collector);
        map.put("collectReason", collectReason);
        map.put("ageHst", ageHst);
        map.put("paymentHst", paymentHst);
        map.put("waiveOvlfeeInd", waiveOvlfeeInd);
        map.put("waiveCardfeeInd", waiveCardfeeInd);
        map.put("waiveLatefeeInd", waiveLatefeeInd);
        map.put("waiveSvcfeeInd", waiveSvcfeeInd);
        map.put("userCode1", userCode1);
        map.put("userCode2", userCode2);
        map.put("userCode3", userCode3);
        map.put("userCode4", userCode4);
        map.put("userCode5", userCode5);
        map.put("userCode6", userCode6);
        map.put("userDate1", userDate1);
        map.put("userDate2", userDate2);
        map.put("userDate3", userDate3);
        map.put("userDate4", userDate4);
        map.put("userDate5", userDate5);
        map.put("userDate6", userDate6);
        map.put("userNumber1", userNumber1);
        map.put("userNumber2", userNumber2);
        map.put("userNumber3", userNumber3);
        map.put("userNumber4", userNumber4);
        map.put("userNumber5", userNumber5);
        map.put("userNumber6", userNumber6);
        map.put("userField1", userField1);
        map.put("userField2", userField2);
        map.put("userField3", userField3);
        map.put("userField4", userField4);
        map.put("userField5", userField5);
        map.put("userField6", userField6);
        map.put("userAmt1", userAmt1);
        map.put("userAmt2", userAmt2);
        map.put("userAmt3", userAmt3);
        map.put("userAmt4", userAmt4);
        map.put("userAmt5", userAmt5);
        map.put("userAmt6", userAmt6);
        map.put("mtdPaymentAmt", mtdPaymentAmt);
        map.put("mtdPaymentCnt", mtdPaymentCnt);
        map.put("ytdRepayAmt", ytdRepayAmt);
        map.put("ytdRepayCnt", ytdRepayCnt);
        map.put("ltdRepayAmt", ltdRepayAmt);
        map.put("ltdRepayCnt", ltdRepayCnt);
        map.put("smsInd", smsInd);
        map.put("userSmsAmt", userSmsAmt);
        map.put("ytdCycleChagCnt", ytdCycleChagCnt);
        map.put("lastPostDate", lastPostDate);
        map.put("contrNbr", contrNbr);
        map.put("guarantyId", guarantyId);
        map.put("ddBankProvince", ddBankProvince);
        map.put("ddBankProvinceCode", ddBankProvinceCode);
        map.put("ddBankCity", ddBankCity);
        map.put("ddBankCityCode", ddBankCityCode);
        map.put("custSource", custSource);
        map.put("createTime", createTime);
        map.put("createUser", createUser);
        map.put("lstUpdTime", lstUpdTime);
        map.put("lstUpdUser", lstUpdUser);
        map.put("jpaVersion", jpaVersion);
        map.put("ltdLoanAmt", ltdLoanAmt);
        map.put("applicationNo", applicationNo);
        map.put("agreementRateExpireDate", agreementRateExpireDate);
        map.put("acctExpireDate", acctExpireDate);
        map.put("loanMold", loanMold);
        map.put("acqId", acqId);
        map.put("lastSyncDate", lastSyncDate);
        map.put("agreementRateInd", agreementRateInd);
        map.put("feeRate", feeRate);
        map.put("feeAmt", feeAmt);
        map.put("lifeInsuFeeAmt", lifeInsuFeeAmt);
        map.put("installmentFeeRate", installmentFeeRate);
        map.put("installmentFeeAmt", installmentFeeAmt);
        map.put("prepayPkgFeeAmt", prepayPkgFeeAmt);
        map.put("penaltyRate", penaltyRate);
        map.put("compoundRate", compoundRate);
        map.put("interestRate", interestRate);
        map.put("lifeInsuFeeRate", lifeInsuFeeRate);
        map.put("insuranceRate", insuranceRate);
        map.put("insAmt", insAmt);
        map.put("stampAmt", stampAmt);
        map.put("stampdutyRate", stampdutyRate);
        map.put("lastLimitAdjDate", lastLimitAdjDate);
        map.put("loanFeeDefId", loanFeeDefId);
        map.put("applyDate", applyDate);
        map.put("purpose", purpose);
        map.put("subTerminalType", subTerminalType);
        map.put("prepayPkgFeeRate", prepayPkgFeeRate);
        map.put("joinLifeInsuInd", joinLifeInsuInd);
        map.put("joinPrepayPkgInd", joinPrepayPkgInd);
        map.put("replaceSvcFeeRate", replaceSvcFeeRate);
        map.put("replaceSvcFeeAmt", replaceSvcFeeAmt);
        map.put("replacePenaltyRate", replacePenaltyRate);
        map.put("prepayPkgInd", prepayPkgInd);
        map.put("joinScreenInsuInd", joinScreenInsuInd);
        map.put("screenInsuFeeAmt", screenInsuFeeAmt);
        map.put("screenInsuFeeRate", screenInsuFeeRate);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("org")) this.setOrg(DataTypeUtils.getStringValue(map.get("org")));
        if(map.containsKey("acctNbr")) this.setAcctNbr(DataTypeUtils.getLongValue(map.get("acctNbr")));
        if(map.containsKey("acctType")) this.setAcctType(DataTypeUtils.getStringValue(map.get("acctType")));
        if(map.containsKey("custId")) this.setCustId(DataTypeUtils.getLongValue(map.get("custId")));
        if(map.containsKey("custLmtId")) this.setCustLmtId(DataTypeUtils.getLongValue(map.get("custLmtId")));
        if(map.containsKey("productCd")) this.setProductCd(DataTypeUtils.getStringValue(map.get("productCd")));
        if(map.containsKey("defaultLogicCardNbr")) this.setDefaultLogicCardNbr(DataTypeUtils.getStringValue(map.get("defaultLogicCardNbr")));
        if(map.containsKey("currency")) this.setCurrency(DataTypeUtils.getStringValue(map.get("currency")));
        if(map.containsKey("creditLmt")) this.setCreditLmt(DataTypeUtils.getBigDecimalValue(map.get("creditLmt")));
        if(map.containsKey("tempLmt")) this.setTempLmt(DataTypeUtils.getBigDecimalValue(map.get("tempLmt")));
        if(map.containsKey("tempLmtBegDate")) this.setTempLmtBegDate(DataTypeUtils.getDateValue(map.get("tempLmtBegDate")));
        if(map.containsKey("tempLmtEndDate")) this.setTempLmtEndDate(DataTypeUtils.getDateValue(map.get("tempLmtEndDate")));
        if(map.containsKey("cashLmtRate")) this.setCashLmtRate(DataTypeUtils.getBigDecimalValue(map.get("cashLmtRate")));
        if(map.containsKey("ovrlmtRate")) this.setOvrlmtRate(DataTypeUtils.getBigDecimalValue(map.get("ovrlmtRate")));
        if(map.containsKey("loanLmtRate")) this.setLoanLmtRate(DataTypeUtils.getBigDecimalValue(map.get("loanLmtRate")));
        if(map.containsKey("currBal")) this.setCurrBal(DataTypeUtils.getBigDecimalValue(map.get("currBal")));
        if(map.containsKey("cashBal")) this.setCashBal(DataTypeUtils.getBigDecimalValue(map.get("cashBal")));
        if(map.containsKey("principalBal")) this.setPrincipalBal(DataTypeUtils.getBigDecimalValue(map.get("principalBal")));
        if(map.containsKey("loanBal")) this.setLoanBal(DataTypeUtils.getBigDecimalValue(map.get("loanBal")));
        if(map.containsKey("disputeAmt")) this.setDisputeAmt(DataTypeUtils.getBigDecimalValue(map.get("disputeAmt")));
        if(map.containsKey("begBal")) this.setBegBal(DataTypeUtils.getBigDecimalValue(map.get("begBal")));
        if(map.containsKey("pmtDueDayBal")) this.setPmtDueDayBal(DataTypeUtils.getBigDecimalValue(map.get("pmtDueDayBal")));
        if(map.containsKey("qualGraceBal")) this.setQualGraceBal(DataTypeUtils.getBigDecimalValue(map.get("qualGraceBal")));
        if(map.containsKey("graceDaysFullInd")) this.setGraceDaysFullInd(DataTypeUtils.getStringValue(map.get("graceDaysFullInd")));
        if(map.containsKey("pointsBegBal")) this.setPointsBegBal(DataTypeUtils.getLongValue(map.get("pointsBegBal")));
        if(map.containsKey("ctdPoints")) this.setCtdPoints(DataTypeUtils.getLongValue(map.get("ctdPoints")));
        if(map.containsKey("ctdSpendPoints")) this.setCtdSpendPoints(DataTypeUtils.getLongValue(map.get("ctdSpendPoints")));
        if(map.containsKey("ctdAdjPoints")) this.setCtdAdjPoints(DataTypeUtils.getLongValue(map.get("ctdAdjPoints")));
        if(map.containsKey("pointsBal")) this.setPointsBal(DataTypeUtils.getLongValue(map.get("pointsBal")));
        if(map.containsKey("setupDate")) this.setSetupDate(DataTypeUtils.getDateValue(map.get("setupDate")));
        if(map.containsKey("dormentDate")) this.setDormentDate(DataTypeUtils.getDateValue(map.get("dormentDate")));
        if(map.containsKey("eactiveDate")) this.setEactiveDate(DataTypeUtils.getDateValue(map.get("eactiveDate")));
        if(map.containsKey("ovrlmtDate")) this.setOvrlmtDate(DataTypeUtils.getDateValue(map.get("ovrlmtDate")));
        if(map.containsKey("ovrlmtNbrOfCyc")) this.setOvrlmtNbrOfCyc(DataTypeUtils.getBigDecimalValue(map.get("ovrlmtNbrOfCyc")));
        if(map.containsKey("name")) this.setName(DataTypeUtils.getStringValue(map.get("name")));
        if(map.containsKey("gender")) this.setGender(DataTypeUtils.getStringValue(map.get("gender")));
        if(map.containsKey("owningBranch")) this.setOwningBranch(DataTypeUtils.getStringValue(map.get("owningBranch")));
        if(map.containsKey("mobileNo")) this.setMobileNo(DataTypeUtils.getStringValue(map.get("mobileNo")));
        if(map.containsKey("corpName")) this.setCorpName(DataTypeUtils.getStringValue(map.get("corpName")));
        if(map.containsKey("cycleDay")) this.setCycleDay(DataTypeUtils.getStringValue(map.get("cycleDay")));
        if(map.containsKey("stmtFlag")) this.setStmtFlag(DataTypeUtils.getStringValue(map.get("stmtFlag")));
        if(map.containsKey("stmtMailAddrInd")) this.setStmtMailAddrInd(DataTypeUtils.getStringValue(map.get("stmtMailAddrInd")));
        if(map.containsKey("stmtMediaType")) this.setStmtMediaType(DataTypeUtils.getStringValue(map.get("stmtMediaType")));
        if(map.containsKey("stmtCountryCode")) this.setStmtCountryCode(DataTypeUtils.getStringValue(map.get("stmtCountryCode")));
        if(map.containsKey("stmtState")) this.setStmtState(DataTypeUtils.getStringValue(map.get("stmtState")));
        if(map.containsKey("stmtCity")) this.setStmtCity(DataTypeUtils.getStringValue(map.get("stmtCity")));
        if(map.containsKey("stmtDistrict")) this.setStmtDistrict(DataTypeUtils.getStringValue(map.get("stmtDistrict")));
        if(map.containsKey("stmtAddress")) this.setStmtAddress(DataTypeUtils.getStringValue(map.get("stmtAddress")));
        if(map.containsKey("stmtPostcode")) this.setStmtPostcode(DataTypeUtils.getStringValue(map.get("stmtPostcode")));
        if(map.containsKey("email")) this.setEmail(DataTypeUtils.getStringValue(map.get("email")));
        if(map.containsKey("blockCode")) this.setBlockCode(DataTypeUtils.getStringValue(map.get("blockCode")));
        if(map.containsKey("ageCode")) this.setAgeCode(DataTypeUtils.getStringValue(map.get("ageCode")));
        if(map.containsKey("ageCodeGl")) this.setAgeCodeGl(DataTypeUtils.getStringValue(map.get("ageCodeGl")));
        if(map.containsKey("memoDb")) this.setMemoDb(DataTypeUtils.getBigDecimalValue(map.get("memoDb")));
        if(map.containsKey("memoCash")) this.setMemoCash(DataTypeUtils.getBigDecimalValue(map.get("memoCash")));
        if(map.containsKey("memoCr")) this.setMemoCr(DataTypeUtils.getBigDecimalValue(map.get("memoCr")));
        if(map.containsKey("ddInd")) this.setDdInd(DataTypeUtils.getStringValue(map.get("ddInd")));
        if(map.containsKey("ddBankName")) this.setDdBankName(DataTypeUtils.getStringValue(map.get("ddBankName")));
        if(map.containsKey("ddBankBranch")) this.setDdBankBranch(DataTypeUtils.getStringValue(map.get("ddBankBranch")));
        if(map.containsKey("ddBankAcctNbr")) this.setDdBankAcctNbr(DataTypeUtils.getStringValue(map.get("ddBankAcctNbr")));
        if(map.containsKey("ddBankAcctName")) this.setDdBankAcctName(DataTypeUtils.getStringValue(map.get("ddBankAcctName")));
        if(map.containsKey("lastDdAmt")) this.setLastDdAmt(DataTypeUtils.getBigDecimalValue(map.get("lastDdAmt")));
        if(map.containsKey("lastDdDate")) this.setLastDdDate(DataTypeUtils.getDateValue(map.get("lastDdDate")));
        if(map.containsKey("dualBillingFlag")) this.setDualBillingFlag(DataTypeUtils.getStringValue(map.get("dualBillingFlag")));
        if(map.containsKey("lastPmtAmt")) this.setLastPmtAmt(DataTypeUtils.getBigDecimalValue(map.get("lastPmtAmt")));
        if(map.containsKey("lastPmtDate")) this.setLastPmtDate(DataTypeUtils.getDateValue(map.get("lastPmtDate")));
        if(map.containsKey("lastStmtDate")) this.setLastStmtDate(DataTypeUtils.getDateValue(map.get("lastStmtDate")));
        if(map.containsKey("lastPmtDueDate")) this.setLastPmtDueDate(DataTypeUtils.getDateValue(map.get("lastPmtDueDate")));
        if(map.containsKey("lastAgingDate")) this.setLastAgingDate(DataTypeUtils.getDateValue(map.get("lastAgingDate")));
        if(map.containsKey("collectInDate")) this.setCollectInDate(DataTypeUtils.getDateValue(map.get("collectInDate")));
        if(map.containsKey("collectOutDate")) this.setCollectOutDate(DataTypeUtils.getDateValue(map.get("collectOutDate")));
        if(map.containsKey("nextStmtDate")) this.setNextStmtDate(DataTypeUtils.getDateValue(map.get("nextStmtDate")));
        if(map.containsKey("pmtDueDate")) this.setPmtDueDate(DataTypeUtils.getDateValue(map.get("pmtDueDate")));
        if(map.containsKey("ddDate")) this.setDdDate(DataTypeUtils.getDateValue(map.get("ddDate")));
        if(map.containsKey("graceDate")) this.setGraceDate(DataTypeUtils.getDateValue(map.get("graceDate")));
        if(map.containsKey("dualBillingDate")) this.setDualBillingDate(DataTypeUtils.getDateValue(map.get("dualBillingDate")));
        if(map.containsKey("firstStmtDate")) this.setFirstStmtDate(DataTypeUtils.getDateValue(map.get("firstStmtDate")));
        if(map.containsKey("chargeOffDate")) this.setChargeOffDate(DataTypeUtils.getDateValue(map.get("chargeOffDate")));
        if(map.containsKey("closeDate")) this.setCloseDate(DataTypeUtils.getDateValue(map.get("closeDate")));
        if(map.containsKey("closedDate")) this.setClosedDate(DataTypeUtils.getDateValue(map.get("closedDate")));
        if(map.containsKey("firstRetlDate")) this.setFirstRetlDate(DataTypeUtils.getDateValue(map.get("firstRetlDate")));
        if(map.containsKey("firstRetlAmt")) this.setFirstRetlAmt(DataTypeUtils.getBigDecimalValue(map.get("firstRetlAmt")));
        if(map.containsKey("totDueAmt")) this.setTotDueAmt(DataTypeUtils.getBigDecimalValue(map.get("totDueAmt")));
        if(map.containsKey("currDueAmt")) this.setCurrDueAmt(DataTypeUtils.getBigDecimalValue(map.get("currDueAmt")));
        if(map.containsKey("pastDueAmt1")) this.setPastDueAmt1(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt1")));
        if(map.containsKey("pastDueAmt2")) this.setPastDueAmt2(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt2")));
        if(map.containsKey("pastDueAmt3")) this.setPastDueAmt3(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt3")));
        if(map.containsKey("pastDueAmt4")) this.setPastDueAmt4(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt4")));
        if(map.containsKey("pastDueAmt5")) this.setPastDueAmt5(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt5")));
        if(map.containsKey("pastDueAmt6")) this.setPastDueAmt6(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt6")));
        if(map.containsKey("pastDueAmt7")) this.setPastDueAmt7(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt7")));
        if(map.containsKey("pastDueAmt8")) this.setPastDueAmt8(DataTypeUtils.getBigDecimalValue(map.get("pastDueAmt8")));
        if(map.containsKey("ctdCashAmt")) this.setCtdCashAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdCashAmt")));
        if(map.containsKey("ctdCashCnt")) this.setCtdCashCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdCashCnt")));
        if(map.containsKey("ctdRetailAmt")) this.setCtdRetailAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdRetailAmt")));
        if(map.containsKey("ctdRetailCnt")) this.setCtdRetailCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdRetailCnt")));
        if(map.containsKey("ctdRepayAmt")) this.setCtdRepayAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdRepayAmt")));
        if(map.containsKey("ctdRepayCnt")) this.setCtdRepayCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdRepayCnt")));
        if(map.containsKey("ctdDbAdjAmt")) this.setCtdDbAdjAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdDbAdjAmt")));
        if(map.containsKey("ctdDbAdjCnt")) this.setCtdDbAdjCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdDbAdjCnt")));
        if(map.containsKey("ctdCrAdjAmt")) this.setCtdCrAdjAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdCrAdjAmt")));
        if(map.containsKey("ctdCrAdjCnt")) this.setCtdCrAdjCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdCrAdjCnt")));
        if(map.containsKey("ctdFeeAmt")) this.setCtdFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdFeeAmt")));
        if(map.containsKey("ctdFeeCnt")) this.setCtdFeeCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdFeeCnt")));
        if(map.containsKey("ctdInterestAmt")) this.setCtdInterestAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdInterestAmt")));
        if(map.containsKey("ctdInterestCnt")) this.setCtdInterestCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdInterestCnt")));
        if(map.containsKey("ctdRefundAmt")) this.setCtdRefundAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdRefundAmt")));
        if(map.containsKey("ctdRefundCnt")) this.setCtdRefundCnt(DataTypeUtils.getBigDecimalValue(map.get("ctdRefundCnt")));
        if(map.containsKey("ctdMaxOvrlmtAmt")) this.setCtdMaxOvrlmtAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdMaxOvrlmtAmt")));
        if(map.containsKey("mtdRetailAmt")) this.setMtdRetailAmt(DataTypeUtils.getBigDecimalValue(map.get("mtdRetailAmt")));
        if(map.containsKey("mtdRetailCnt")) this.setMtdRetailCnt(DataTypeUtils.getBigDecimalValue(map.get("mtdRetailCnt")));
        if(map.containsKey("mtdCashAmt")) this.setMtdCashAmt(DataTypeUtils.getBigDecimalValue(map.get("mtdCashAmt")));
        if(map.containsKey("mtdCashCnt")) this.setMtdCashCnt(DataTypeUtils.getBigDecimalValue(map.get("mtdCashCnt")));
        if(map.containsKey("mtdRefundAmt")) this.setMtdRefundAmt(DataTypeUtils.getBigDecimalValue(map.get("mtdRefundAmt")));
        if(map.containsKey("mtdRefundCnt")) this.setMtdRefundCnt(DataTypeUtils.getBigDecimalValue(map.get("mtdRefundCnt")));
        if(map.containsKey("ytdRetailAmt")) this.setYtdRetailAmt(DataTypeUtils.getBigDecimalValue(map.get("ytdRetailAmt")));
        if(map.containsKey("ytdRetailCnt")) this.setYtdRetailCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdRetailCnt")));
        if(map.containsKey("ytdCashAmt")) this.setYtdCashAmt(DataTypeUtils.getBigDecimalValue(map.get("ytdCashAmt")));
        if(map.containsKey("ytdCashCnt")) this.setYtdCashCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdCashCnt")));
        if(map.containsKey("ytdRefundAmt")) this.setYtdRefundAmt(DataTypeUtils.getBigDecimalValue(map.get("ytdRefundAmt")));
        if(map.containsKey("ytdRefundCnt")) this.setYtdRefundCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdRefundCnt")));
        if(map.containsKey("ytdOvrlmtFeeAmt")) this.setYtdOvrlmtFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("ytdOvrlmtFeeAmt")));
        if(map.containsKey("ytdOvrlmtFeeCnt")) this.setYtdOvrlmtFeeCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdOvrlmtFeeCnt")));
        if(map.containsKey("ytdLateFeeAmt")) this.setYtdLateFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("ytdLateFeeAmt")));
        if(map.containsKey("ytdLateFeeCnt")) this.setYtdLateFeeCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdLateFeeCnt")));
        if(map.containsKey("ltdRetailAmt")) this.setLtdRetailAmt(DataTypeUtils.getBigDecimalValue(map.get("ltdRetailAmt")));
        if(map.containsKey("ltdRetailCnt")) this.setLtdRetailCnt(DataTypeUtils.getBigDecimalValue(map.get("ltdRetailCnt")));
        if(map.containsKey("ltdCashAmt")) this.setLtdCashAmt(DataTypeUtils.getBigDecimalValue(map.get("ltdCashAmt")));
        if(map.containsKey("ltdCashCnt")) this.setLtdCashCnt(DataTypeUtils.getBigDecimalValue(map.get("ltdCashCnt")));
        if(map.containsKey("ltdRefundAmt")) this.setLtdRefundAmt(DataTypeUtils.getBigDecimalValue(map.get("ltdRefundAmt")));
        if(map.containsKey("ltdRefundCnt")) this.setLtdRefundCnt(DataTypeUtils.getBigDecimalValue(map.get("ltdRefundCnt")));
        if(map.containsKey("ltdHighestPrin")) this.setLtdHighestPrin(DataTypeUtils.getBigDecimalValue(map.get("ltdHighestPrin")));
        if(map.containsKey("ltdHighestCrBal")) this.setLtdHighestCrBal(DataTypeUtils.getBigDecimalValue(map.get("ltdHighestCrBal")));
        if(map.containsKey("ltdHighestBal")) this.setLtdHighestBal(DataTypeUtils.getBigDecimalValue(map.get("ltdHighestBal")));
        if(map.containsKey("collectCnt")) this.setCollectCnt(DataTypeUtils.getBigDecimalValue(map.get("collectCnt")));
        if(map.containsKey("collector")) this.setCollector(DataTypeUtils.getStringValue(map.get("collector")));
        if(map.containsKey("collectReason")) this.setCollectReason(DataTypeUtils.getStringValue(map.get("collectReason")));
        if(map.containsKey("ageHst")) this.setAgeHst(DataTypeUtils.getStringValue(map.get("ageHst")));
        if(map.containsKey("paymentHst")) this.setPaymentHst(DataTypeUtils.getStringValue(map.get("paymentHst")));
        if(map.containsKey("waiveOvlfeeInd")) this.setWaiveOvlfeeInd(DataTypeUtils.getStringValue(map.get("waiveOvlfeeInd")));
        if(map.containsKey("waiveCardfeeInd")) this.setWaiveCardfeeInd(DataTypeUtils.getStringValue(map.get("waiveCardfeeInd")));
        if(map.containsKey("waiveLatefeeInd")) this.setWaiveLatefeeInd(DataTypeUtils.getStringValue(map.get("waiveLatefeeInd")));
        if(map.containsKey("waiveSvcfeeInd")) this.setWaiveSvcfeeInd(DataTypeUtils.getStringValue(map.get("waiveSvcfeeInd")));
        if(map.containsKey("userCode1")) this.setUserCode1(DataTypeUtils.getStringValue(map.get("userCode1")));
        if(map.containsKey("userCode2")) this.setUserCode2(DataTypeUtils.getStringValue(map.get("userCode2")));
        if(map.containsKey("userCode3")) this.setUserCode3(DataTypeUtils.getStringValue(map.get("userCode3")));
        if(map.containsKey("userCode4")) this.setUserCode4(DataTypeUtils.getStringValue(map.get("userCode4")));
        if(map.containsKey("userCode5")) this.setUserCode5(DataTypeUtils.getStringValue(map.get("userCode5")));
        if(map.containsKey("userCode6")) this.setUserCode6(DataTypeUtils.getStringValue(map.get("userCode6")));
        if(map.containsKey("userDate1")) this.setUserDate1(DataTypeUtils.getDateValue(map.get("userDate1")));
        if(map.containsKey("userDate2")) this.setUserDate2(DataTypeUtils.getDateValue(map.get("userDate2")));
        if(map.containsKey("userDate3")) this.setUserDate3(DataTypeUtils.getDateValue(map.get("userDate3")));
        if(map.containsKey("userDate4")) this.setUserDate4(DataTypeUtils.getDateValue(map.get("userDate4")));
        if(map.containsKey("userDate5")) this.setUserDate5(DataTypeUtils.getDateValue(map.get("userDate5")));
        if(map.containsKey("userDate6")) this.setUserDate6(DataTypeUtils.getDateValue(map.get("userDate6")));
        if(map.containsKey("userNumber1")) this.setUserNumber1(DataTypeUtils.getBigDecimalValue(map.get("userNumber1")));
        if(map.containsKey("userNumber2")) this.setUserNumber2(DataTypeUtils.getBigDecimalValue(map.get("userNumber2")));
        if(map.containsKey("userNumber3")) this.setUserNumber3(DataTypeUtils.getBigDecimalValue(map.get("userNumber3")));
        if(map.containsKey("userNumber4")) this.setUserNumber4(DataTypeUtils.getBigDecimalValue(map.get("userNumber4")));
        if(map.containsKey("userNumber5")) this.setUserNumber5(DataTypeUtils.getBigDecimalValue(map.get("userNumber5")));
        if(map.containsKey("userNumber6")) this.setUserNumber6(DataTypeUtils.getBigDecimalValue(map.get("userNumber6")));
        if(map.containsKey("userField1")) this.setUserField1(DataTypeUtils.getStringValue(map.get("userField1")));
        if(map.containsKey("userField2")) this.setUserField2(DataTypeUtils.getStringValue(map.get("userField2")));
        if(map.containsKey("userField3")) this.setUserField3(DataTypeUtils.getStringValue(map.get("userField3")));
        if(map.containsKey("userField4")) this.setUserField4(DataTypeUtils.getStringValue(map.get("userField4")));
        if(map.containsKey("userField5")) this.setUserField5(DataTypeUtils.getStringValue(map.get("userField5")));
        if(map.containsKey("userField6")) this.setUserField6(DataTypeUtils.getStringValue(map.get("userField6")));
        if(map.containsKey("userAmt1")) this.setUserAmt1(DataTypeUtils.getBigDecimalValue(map.get("userAmt1")));
        if(map.containsKey("userAmt2")) this.setUserAmt2(DataTypeUtils.getBigDecimalValue(map.get("userAmt2")));
        if(map.containsKey("userAmt3")) this.setUserAmt3(DataTypeUtils.getBigDecimalValue(map.get("userAmt3")));
        if(map.containsKey("userAmt4")) this.setUserAmt4(DataTypeUtils.getBigDecimalValue(map.get("userAmt4")));
        if(map.containsKey("userAmt5")) this.setUserAmt5(DataTypeUtils.getBigDecimalValue(map.get("userAmt5")));
        if(map.containsKey("userAmt6")) this.setUserAmt6(DataTypeUtils.getBigDecimalValue(map.get("userAmt6")));
        if(map.containsKey("mtdPaymentAmt")) this.setMtdPaymentAmt(DataTypeUtils.getBigDecimalValue(map.get("mtdPaymentAmt")));
        if(map.containsKey("mtdPaymentCnt")) this.setMtdPaymentCnt(DataTypeUtils.getBigDecimalValue(map.get("mtdPaymentCnt")));
        if(map.containsKey("ytdRepayAmt")) this.setYtdRepayAmt(DataTypeUtils.getBigDecimalValue(map.get("ytdRepayAmt")));
        if(map.containsKey("ytdRepayCnt")) this.setYtdRepayCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdRepayCnt")));
        if(map.containsKey("ltdRepayAmt")) this.setLtdRepayAmt(DataTypeUtils.getBigDecimalValue(map.get("ltdRepayAmt")));
        if(map.containsKey("ltdRepayCnt")) this.setLtdRepayCnt(DataTypeUtils.getBigDecimalValue(map.get("ltdRepayCnt")));
        if(map.containsKey("smsInd")) this.setSmsInd(DataTypeUtils.getStringValue(map.get("smsInd")));
        if(map.containsKey("userSmsAmt")) this.setUserSmsAmt(DataTypeUtils.getBigDecimalValue(map.get("userSmsAmt")));
        if(map.containsKey("ytdCycleChagCnt")) this.setYtdCycleChagCnt(DataTypeUtils.getBigDecimalValue(map.get("ytdCycleChagCnt")));
        if(map.containsKey("lastPostDate")) this.setLastPostDate(DataTypeUtils.getDateValue(map.get("lastPostDate")));
        if(map.containsKey("contrNbr")) this.setContrNbr(DataTypeUtils.getStringValue(map.get("contrNbr")));
        if(map.containsKey("guarantyId")) this.setGuarantyId(DataTypeUtils.getStringValue(map.get("guarantyId")));
        if(map.containsKey("ddBankProvince")) this.setDdBankProvince(DataTypeUtils.getStringValue(map.get("ddBankProvince")));
        if(map.containsKey("ddBankProvinceCode")) this.setDdBankProvinceCode(DataTypeUtils.getStringValue(map.get("ddBankProvinceCode")));
        if(map.containsKey("ddBankCity")) this.setDdBankCity(DataTypeUtils.getStringValue(map.get("ddBankCity")));
        if(map.containsKey("ddBankCityCode")) this.setDdBankCityCode(DataTypeUtils.getStringValue(map.get("ddBankCityCode")));
        if(map.containsKey("custSource")) this.setCustSource(DataTypeUtils.getStringValue(map.get("custSource")));
        if(map.containsKey("createTime")) this.setCreateTime(DataTypeUtils.getDateValue(map.get("createTime")));
        if(map.containsKey("createUser")) this.setCreateUser(DataTypeUtils.getStringValue(map.get("createUser")));
        if(map.containsKey("lstUpdTime")) this.setLstUpdTime(DataTypeUtils.getDateValue(map.get("lstUpdTime")));
        if(map.containsKey("lstUpdUser")) this.setLstUpdUser(DataTypeUtils.getStringValue(map.get("lstUpdUser")));
        if(map.containsKey("jpaVersion")) this.setJpaVersion(DataTypeUtils.getBigDecimalValue(map.get("jpaVersion")));
        if(map.containsKey("ltdLoanAmt")) this.setLtdLoanAmt(DataTypeUtils.getBigDecimalValue(map.get("ltdLoanAmt")));
        if(map.containsKey("applicationNo")) this.setApplicationNo(DataTypeUtils.getStringValue(map.get("applicationNo")));
        if(map.containsKey("agreementRateExpireDate")) this.setAgreementRateExpireDate(DataTypeUtils.getDateValue(map.get("agreementRateExpireDate")));
        if(map.containsKey("acctExpireDate")) this.setAcctExpireDate(DataTypeUtils.getDateValue(map.get("acctExpireDate")));
        if(map.containsKey("loanMold")) this.setLoanMold(DataTypeUtils.getStringValue(map.get("loanMold")));
        if(map.containsKey("acqId")) this.setAcqId(DataTypeUtils.getStringValue(map.get("acqId")));
        if(map.containsKey("lastSyncDate")) this.setLastSyncDate(DataTypeUtils.getDateValue(map.get("lastSyncDate")));
        if(map.containsKey("agreementRateInd")) this.setAgreementRateInd(DataTypeUtils.getStringValue(map.get("agreementRateInd")));
        if(map.containsKey("feeRate")) this.setFeeRate(DataTypeUtils.getBigDecimalValue(map.get("feeRate")));
        if(map.containsKey("feeAmt")) this.setFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("feeAmt")));
        if(map.containsKey("lifeInsuFeeAmt")) this.setLifeInsuFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("lifeInsuFeeAmt")));
        if(map.containsKey("installmentFeeRate")) this.setInstallmentFeeRate(DataTypeUtils.getBigDecimalValue(map.get("installmentFeeRate")));
        if(map.containsKey("installmentFeeAmt")) this.setInstallmentFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("installmentFeeAmt")));
        if(map.containsKey("prepayPkgFeeAmt")) this.setPrepayPkgFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("prepayPkgFeeAmt")));
        if(map.containsKey("penaltyRate")) this.setPenaltyRate(DataTypeUtils.getBigDecimalValue(map.get("penaltyRate")));
        if(map.containsKey("compoundRate")) this.setCompoundRate(DataTypeUtils.getBigDecimalValue(map.get("compoundRate")));
        if(map.containsKey("interestRate")) this.setInterestRate(DataTypeUtils.getBigDecimalValue(map.get("interestRate")));
        if(map.containsKey("lifeInsuFeeRate")) this.setLifeInsuFeeRate(DataTypeUtils.getBigDecimalValue(map.get("lifeInsuFeeRate")));
        if(map.containsKey("insuranceRate")) this.setInsuranceRate(DataTypeUtils.getBigDecimalValue(map.get("insuranceRate")));
        if(map.containsKey("insAmt")) this.setInsAmt(DataTypeUtils.getBigDecimalValue(map.get("insAmt")));
        if(map.containsKey("stampAmt")) this.setStampAmt(DataTypeUtils.getBigDecimalValue(map.get("stampAmt")));
        if(map.containsKey("stampdutyRate")) this.setStampdutyRate(DataTypeUtils.getBigDecimalValue(map.get("stampdutyRate")));
        if(map.containsKey("lastLimitAdjDate")) this.setLastLimitAdjDate(DataTypeUtils.getDateValue(map.get("lastLimitAdjDate")));
        if(map.containsKey("loanFeeDefId")) this.setLoanFeeDefId(DataTypeUtils.getStringValue(map.get("loanFeeDefId")));
        if(map.containsKey("applyDate")) this.setApplyDate(DataTypeUtils.getDateValue(map.get("applyDate")));
        if(map.containsKey("purpose")) this.setPurpose(DataTypeUtils.getStringValue(map.get("purpose")));
        if(map.containsKey("subTerminalType")) this.setSubTerminalType(DataTypeUtils.getStringValue(map.get("subTerminalType")));
        if(map.containsKey("prepayPkgFeeRate")) this.setPrepayPkgFeeRate(DataTypeUtils.getBigDecimalValue(map.get("prepayPkgFeeRate")));
        if(map.containsKey("joinLifeInsuInd")) this.setJoinLifeInsuInd(DataTypeUtils.getStringValue(map.get("joinLifeInsuInd")));
        if(map.containsKey("joinPrepayPkgInd")) this.setJoinPrepayPkgInd(DataTypeUtils.getStringValue(map.get("joinPrepayPkgInd")));
        if(map.containsKey("replaceSvcFeeRate")) this.setReplaceSvcFeeRate(DataTypeUtils.getBigDecimalValue(map.get("replaceSvcFeeRate")));
        if(map.containsKey("replaceSvcFeeAmt")) this.setReplaceSvcFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("replaceSvcFeeAmt")));
        if(map.containsKey("replacePenaltyRate")) this.setReplacePenaltyRate(DataTypeUtils.getBigDecimalValue(map.get("replacePenaltyRate")));
        if(map.containsKey("prepayPkgInd")) this.setPrepayPkgInd(DataTypeUtils.getStringValue(map.get("prepayPkgInd")));
        if(map.containsKey("joinScreenInsuInd")) this.setJoinScreenInsuInd(DataTypeUtils.getStringValue(map.get("joinScreenInsuInd")));
        if(map.containsKey("screenInsuFeeAmt")) this.setScreenInsuFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("screenInsuFeeAmt")));
        if(map.containsKey("screenInsuFeeRate")) this.setScreenInsuFeeRate(DataTypeUtils.getBigDecimalValue(map.get("screenInsuFeeRate")));
    }

}
