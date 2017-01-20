package com.msxf.tool.model;

import com.msxf.tool.utils.DataTypeUtils;
import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 CCS_LOAN
 * Database Table:CCS_LOAN to ClassName:CcsLoan
 */
@Entity
@Table(name = "CCS_LOAN")
public class CcsLoan implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "CCS_LOAN";

	@Column(name="ORG", nullable=false, length = 12)
	private String org;

	@Id
	@Column(name="LOAN_ID", nullable=false, length = 16)
	private Long loanId;

	@Column(name="ACCT_NBR", nullable=false, length = 16)
	private Long acctNbr;

	@Column(name="ACCT_TYPE", nullable=false, length = 1)
	private String acctType;

	@Column(name="REF_NBR", nullable=false, length = 32)
	private String refNbr;

	@Column(name="DUE_BILL_NO", nullable=true, length = 32)
	private String dueBillNo;

	@Column(name="LOGIC_CARD_NBR", nullable=false, length = 19)
	private String logicCardNbr;

	@Column(name="CARD_NBR", nullable=false, length = 19)
	private String cardNbr;

	@Column(name="REGISTER_DATE", nullable=false, length = 7)
	private Date registerDate;

	@Column(name="REQUEST_TIME", nullable=false, length = 11)
	private Date requestTime;

	@Column(name="LOAN_TYPE", nullable=false, length = 5)
	private String loanType;

	@Column(name="LOAN_STATUS", nullable=false, length = 1)
	private String loanStatus;

	@Column(name="LAST_LOAN_STATUS", nullable=true, length = 1)
	private String lastLoanStatus;

	@Column(name="LOAN_INIT_TERM", nullable=false, length = 22)
	private BigDecimal loanInitTerm;

	@Column(name="CURR_TERM", nullable=false, length = 22)
	private BigDecimal currTerm;

	@Column(name="REMAIN_TERM", nullable=false, length = 22)
	private BigDecimal remainTerm;

	@Column(name="LOAN_INIT_PRIN", nullable=false, length = 15)
	private BigDecimal loanInitPrin;

	@Column(name="LOAN_FIXED_PMT_PRIN", nullable=false, length = 15)
	private BigDecimal loanFixedPmtPrin;

	@Column(name="LOAN_FIRST_TERM_PRIN", nullable=false, length = 15)
	private BigDecimal loanFirstTermPrin;

	@Column(name="LOAN_FINAL_TERM_PRIN", nullable=false, length = 15)
	private BigDecimal loanFinalTermPrin;

	@Column(name="LOAN_INIT_FEE", nullable=false, length = 15)
	private BigDecimal loanInitFee;

	@Column(name="LOAN_FIXED_FEE", nullable=false, length = 15)
	private BigDecimal loanFixedFee;

	@Column(name="LOAN_FIRST_TERM_FEE", nullable=false, length = 15)
	private BigDecimal loanFirstTermFee;

	@Column(name="LOAN_FINAL_TERM_FEE", nullable=false, length = 15)
	private BigDecimal loanFinalTermFee;

	@Column(name="UNSTMT_PRIN", nullable=false, length = 15)
	private BigDecimal unstmtPrin;

	@Column(name="UNSTMT_FEE", nullable=false, length = 15)
	private BigDecimal unstmtFee;

	@Column(name="ACTIVE_DATE", nullable=true, length = 7)
	private Date activeDate;

	@Column(name="PAID_OUT_DATE", nullable=true, length = 7)
	private Date paidOutDate;

	@Column(name="TERMINAL_DATE", nullable=true, length = 7)
	private Date terminalDate;

	@Column(name="TERMINAL_REASON_CD", nullable=true, length = 1)
	private String terminalReasonCd;

	@Column(name="PAID_PRINCIPAL", nullable=false, length = 15)
	private BigDecimal paidPrincipal;

	@Column(name="PAID_INTEREST", nullable=false, length = 15)
	private BigDecimal paidInterest;

	@Column(name="PAID_FEE", nullable=false, length = 15)
	private BigDecimal paidFee;

	@Column(name="LOAN_CURR_BAL", nullable=false, length = 15)
	private BigDecimal loanCurrBal;

	@Column(name="LOAN_BAL_XFROUT", nullable=false, length = 15)
	private BigDecimal loanBalXfrout;

	@Column(name="LOAN_BAL_XFRIN", nullable=false, length = 15)
	private BigDecimal loanBalXfrin;

	@Column(name="LOAN_PRIN_XFROUT", nullable=false, length = 15)
	private BigDecimal loanPrinXfrout;

	@Column(name="LOAN_PRIN_XFRIN", nullable=false, length = 15)
	private BigDecimal loanPrinXfrin;

	@Column(name="LOAN_FEE_XFROUT", nullable=false, length = 15)
	private BigDecimal loanFeeXfrout;

	@Column(name="LOAN_FEE_XFRIN", nullable=false, length = 15)
	private BigDecimal loanFeeXfrin;

	@Column(name="ORIG_TXN_AMT", nullable=false, length = 15)
	private BigDecimal origTxnAmt;

	@Column(name="ORIG_TRANS_DATE", nullable=true, length = 7)
	private Date origTransDate;

	@Column(name="ORIG_AUTH_CODE", nullable=true, length = 6)
	private String origAuthCode;

	@Column(name="LOAN_CODE", nullable=false, length = 4)
	private String loanCode;

	@Column(name="REGISTER_ID", nullable=false, length = 16)
	private Long registerId;

	@Column(name="EXTEND_INIT_PRIN", nullable=false, length = 15)
	private BigDecimal extendInitPrin;

	@Column(name="EXTEND_DATE", nullable=true, length = 7)
	private Date extendDate;

	@Column(name="BEF_EXTEND_FIXED_PMT_PRIN", nullable=false, length = 15)
	private BigDecimal befExtendFixedPmtPrin;

	@Column(name="BEF_EXTEND_INIT_TERM", nullable=true, length = 22)
	private BigDecimal befExtendInitTerm;

	@Column(name="BEF_EXTEND_FIRST_TERM_PRIN", nullable=false, length = 15)
	private BigDecimal befExtendFirstTermPrin;

	@Column(name="BEF_EXTEND_FINAL_TERM_PRIN", nullable=false, length = 15)
	private BigDecimal befExtendFinalTermPrin;

	@Column(name="BEF_EXTEND_INIT_FEE", nullable=false, length = 15)
	private BigDecimal befExtendInitFee;

	@Column(name="BEF_EXTEND_FIXED_FEE", nullable=false, length = 15)
	private BigDecimal befExtendFixedFee;

	@Column(name="BEF_EXTEND_FIRST_TERM_FEE", nullable=false, length = 15)
	private BigDecimal befExtendFirstTermFee;

	@Column(name="BEF_EXTEND_FINAL_TERM_FEE", nullable=false, length = 15)
	private BigDecimal befExtendFinalTermFee;

	@Column(name="EXTEND_FIRST_TERM_FEE", nullable=false, length = 15)
	private BigDecimal extendFirstTermFee;

	@Column(name="LOAN_FEE_METHOD", nullable=false, length = 1)
	private String loanFeeMethod;

	@Column(name="FLOAT_RATE", nullable=true, length = 5)
	private BigDecimal floatRate;

	@Column(name="LOAN_EXPIRE_DATE", nullable=true, length = 7)
	private Date loanExpireDate;

	@Column(name="LOAN_AGE_CODE", nullable=true, length = 2)
	private String loanAgeCode;

	@Column(name="PAYMENT_HST", nullable=true, length = 24)
	private String paymentHst;

	@Column(name="CTD_REPAY_AMT", nullable=true, length = 15)
	private BigDecimal ctdRepayAmt;

	@Column(name="PAST_EXTEND_CNT", nullable=true, length = 22)
	private BigDecimal pastExtendCnt;

	@Column(name="PAST_SHORTEN_CNT", nullable=true, length = 22)
	private BigDecimal pastShortenCnt;

	@Column(name="ADV_PMT_AMT", nullable=true, length = 15)
	private BigDecimal advPmtAmt;

	@Column(name="LAST_ACTION_DATE", nullable=true, length = 7)
	private Date lastActionDate;

	@Column(name="LAST_ACTION_TYPE", nullable=true, length = 1)
	private String lastActionType;

	@Column(name="CONTR_NBR", nullable=true, length = 20)
	private String contrNbr;

	@Column(name="GUARANTY_ID", nullable=true, length = 32)
	private String guarantyId;

	@Column(name="STAMPDUTY_AMT", nullable=true, length = 15)
	private BigDecimal stampdutyAmt;

	@Column(name="UNSTMT_STAMPDUTY_AMT", nullable=true, length = 15)
	private BigDecimal unstmtStampdutyAmt;

	@Column(name="LOAN_STAMPDUTY_AMT", nullable=true, length = 15)
	private BigDecimal loanStampdutyAmt;

	@Column(name="PAID_STAMPDUTY_AMT", nullable=true, length = 15)
	private BigDecimal paidStampdutyAmt;

	@Column(name="TOT_LIFE_INSU_AMT", nullable=true, length = 15)
	private BigDecimal totLifeInsuAmt;

	@Column(name="UNSTMT_LIFE_INSU_AMT", nullable=true, length = 15)
	private BigDecimal unstmtLifeInsuAmt;

	@Column(name="PAST_LIFE_INSU_AMT", nullable=true, length = 15)
	private BigDecimal pastLifeInsuAmt;

	@Column(name="PAID_LIFE_INSU_AMT", nullable=true, length = 15)
	private BigDecimal paidLifeInsuAmt;

	@Column(name="LIFE_INSU_FEE_RATE", nullable=true, length = 12)
	private BigDecimal lifeInsuFeeRate;

	@Column(name="OVERDUE_DATE", nullable=true, length = 7)
	private Date overdueDate;

	@Column(name="LAST_PENALTY_DATE", nullable=true, length = 7)
	private Date lastPenaltyDate;

	@Column(name="INSURANCE_AMT", nullable=true, length = 15)
	private BigDecimal insuranceAmt;

	@Column(name="UNSTMT_INSURANCE_AMT", nullable=true, length = 15)
	private BigDecimal unstmtInsuranceAmt;

	@Column(name="LOAN_INSURANCE_AMT", nullable=true, length = 15)
	private BigDecimal loanInsuranceAmt;

	@Column(name="PAID_INSURANCE_AMT", nullable=true, length = 15)
	private BigDecimal paidInsuranceAmt;

	@Column(name="LOAN_INS_FEE_METHOD", nullable=true, length = 1)
	private String loanInsFeeMethod;

	@Column(name="STAMPDUTY_METHOD", nullable=true, length = 1)
	private String stampdutyMethod;

	@Column(name="LIFE_INSU_FEE_METHOD", nullable=true, length = 1)
	private String lifeInsuFeeMethod;

	@Column(name="CREATE_TIME", nullable=true, length = 11)
	private Date createTime;

	@Column(name="CREATE_USER", nullable=true, length = 32)
	private String createUser;

	@Column(name="LST_UPD_TIME", nullable=true, length = 11)
	private Date lstUpdTime;

	@Column(name="LST_UPD_USER", nullable=true, length = 32)
	private String lstUpdUser;

	@Column(name="JPA_VERSION", nullable=false, length = 22)
	private BigDecimal jpaVersion;

	@Column(name="MAX_CPD", nullable=true, length = 22)
	private BigDecimal maxCpd;

	@Column(name="MAX_CPD_DATE", nullable=true, length = 7)
	private Date maxCpdDate;

	@Column(name="MAX_DPD", nullable=true, length = 22)
	private BigDecimal maxDpd;

	@Column(name="MAX_DPD_DATE", nullable=true, length = 7)
	private Date maxDpdDate;

	@Column(name="STAMP_CUSTOM_IND", nullable=true, length = 1)
	private String stampCustomInd;

	@Column(name="IS_OFFSET_RATE", nullable=true, length = 1)
	private String isOffsetRate;

	@Column(name="CPD_BEGIN_DATE", nullable=true, length = 7)
	private Date cpdBeginDate;

	@Column(name="TOT_PREPAY_PKG_AMT", nullable=true, length = 15)
	private BigDecimal totPrepayPkgAmt;

	@Column(name="UNSTMT_PREPAY_PKG_AMT", nullable=true, length = 15)
	private BigDecimal unstmtPrepayPkgAmt;

	@Column(name="PAST_PREPAY_PKG_AMT", nullable=true, length = 15)
	private BigDecimal pastPrepayPkgAmt;

	@Column(name="PAID_PREPAY_PKG_AMT", nullable=true, length = 15)
	private BigDecimal paidPrepayPkgAmt;

	@Column(name="PREPAY_PKG_FEE_RATE", nullable=true, length = 12)
	private BigDecimal prepayPkgFeeRate;

	@Column(name="PREPAY_PKG_FEE_METHOD", nullable=true, length = 1)
	private String prepayPkgFeeMethod;

	@Column(name="LOAN_FEE_DEF_ID", nullable=true, length = 8)
	private String loanFeeDefId;

	@Column(name="INTEREST_RATE", nullable=true, length = 12)
	private BigDecimal interestRate;

	@Column(name="PENALTY_RATE", nullable=true, length = 12)
	private BigDecimal penaltyRate;

	@Column(name="COMPOUND_RATE", nullable=true, length = 12)
	private BigDecimal compoundRate;

	@Column(name="ADDEDVALUETAX_RATE", nullable=true, length = 12)
	private BigDecimal addedvaluetaxRate;

	@Column(name="STAMPDUTY_RATE", nullable=true, length = 12)
	private BigDecimal stampdutyRate;

	@Column(name="INSURANCE_RATE", nullable=true, length = 12)
	private BigDecimal insuranceRate;

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

	@Column(name="INS_AMT", nullable=true, length = 15)
	private BigDecimal insAmt;

	@Column(name="STAMP_AMT", nullable=true, length = 15)
	private BigDecimal stampAmt;

	@Column(name="JOIN_LIFE_INSU_IND", nullable=true, length = 1)
	private String joinLifeInsuInd;

	@Column(name="UNSTMT_SVC_FEE", nullable=true, length = 15)
	private BigDecimal unstmtSvcFee;

	@Column(name="SVCFEE_METHOD", nullable=true, length = 1)
	private String svcfeeMethod;

	@Column(name="TOL_SVC_FEE", nullable=true, length = 15)
	private BigDecimal tolSvcFee;

	@Column(name="PAST_SVC_FEE", nullable=true, length = 15)
	private BigDecimal pastSvcFee;

	@Column(name="PAID_SVC_FEE", nullable=true, length = 15)
	private BigDecimal paidSvcFee;

	@Column(name="REPLACE_SVC_FEE_RATE", nullable=true, length = 12)
	private BigDecimal replaceSvcFeeRate;

	@Column(name="REPLACE_SVC_FEE_AMT", nullable=true, length = 15)
	private BigDecimal replaceSvcFeeAmt;

	@Column(name="REPLACE_SVC_FEE_METHOD", nullable=true, length = 1)
	private String replaceSvcFeeMethod;

	@Column(name="TOT_REPLACE_SVC_FEE", nullable=true, length = 15)
	private BigDecimal totReplaceSvcFee;

	@Column(name="UNSTMT_REPLACE_SVC_FEE", nullable=true, length = 15)
	private BigDecimal unstmtReplaceSvcFee;

	@Column(name="PAST_REPLACE_SVC_FEE", nullable=true, length = 15)
	private BigDecimal pastReplaceSvcFee;

	@Column(name="PAID_REPLACE_SVC_FEE", nullable=true, length = 15)
	private BigDecimal paidReplaceSvcFee;

	@Column(name="PREMIUM_AMT", nullable=true, length = 15)
	private BigDecimal premiumAmt;

	@Column(name="PREMIUM_IND", nullable=true, length = 1)
	private String premiumInd;

	@Column(name="REPLACE_PENALTY_RATE", nullable=true, length = 12)
	private BigDecimal replacePenaltyRate;

	@Column(name="COMPENSATE_COUNT", nullable=true, length = 7)
	private Integer compensateCount;

	@Column(name="COMPENSATE_AMT_SUM", nullable=true, length = 15)
	private BigDecimal compensateAmtSum;

	@Column(name="COMPENSATE_REFUND_COUNT", nullable=true, length = 7)
	private Integer compensateRefundCount;

	@Column(name="COMPENSATE_REFUND_AMT_SUM", nullable=true, length = 15)
	private BigDecimal compensateRefundAmtSum;

	@Column(name="PREPAY_PKG_IND", nullable=true, length = 1)
	private String prepayPkgInd;

	@Column(name="APPLY_TERM", nullable=true, length = 2)
	private Integer applyTerm;

	@Column(name="APPLY_DELAY_TERM", nullable=true, length = 2)
	private Integer applyDelayTerm;

	@Column(name="ACCU_APPLY_COUNT", nullable=true, length = 2)
	private Integer accuApplyCount;

	@Column(name="ACCU_DELAY_COUNT", nullable=true, length = 2)
	private Integer accuDelayCount;

	@Column(name="PAY_DATE_TERM", nullable=true, length = 2)
	private Integer payDateTerm;

	@Column(name="PAY_DATE_BEG_DATE", nullable=true, length = 7)
	private Date payDateBegDate;

	@Column(name="PAY_DATE_ACCU", nullable=true, length = 2)
	private Integer payDateAccu;

	@Column(name="SCREEN_INSU_FEE_METHOD", nullable=true, length = 1)
	private String screenInsuFeeMethod;

	@Column(name="JOIN_SCREEN_INSU_IND", nullable=true, length = 1)
	private String joinScreenInsuInd;

	@Column(name="TOT_SCREEN_INSU_AMT", nullable=true, length = 15)
	private BigDecimal totScreenInsuAmt;

	@Column(name="UNSTMT_SCREEN_INSU_AMT", nullable=true, length = 15)
	private BigDecimal unstmtScreenInsuAmt;

	@Column(name="PAST_SCREEN_INSU_AMT", nullable=true, length = 15)
	private BigDecimal pastScreenInsuAmt;

	@Column(name="PAID_SCREEN_INSU_AMT", nullable=true, length = 15)
	private BigDecimal paidScreenInsuAmt;

	@Column(name="SCREEN_INSU_FEE_RATE", nullable=true, length = 12)
	private BigDecimal screenInsuFeeRate;

	@Column(name="SCREEN_INSU_FEE_AMT", nullable=true, length = 15)
	private BigDecimal screenInsuFeeAmt;


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
     * <p>loanId</p>
     */
    public void setLoanId(Long value){
        this.loanId = value;
    }

    /*
     * <p>loanId</p>
     */
    public Long getLoanId() {
        return this.loanId;
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
     * <p>refNbr</p>
     */
    public void setRefNbr(String value){
        this.refNbr = value;
    }

    /*
     * <p>refNbr</p>
     */
    public String getRefNbr() {
        return this.refNbr;
    }

    /*
     * <p>dueBillNo</p>
     */
    public void setDueBillNo(String value){
        this.dueBillNo = value;
    }

    /*
     * <p>dueBillNo</p>
     */
    public String getDueBillNo() {
        return this.dueBillNo;
    }

    /*
     * <p>主卡逻辑卡号</p>
     */
    public void setLogicCardNbr(String value){
        this.logicCardNbr = value;
    }

    /*
     * <p>主卡逻辑卡号</p>
     */
    public String getLogicCardNbr() {
        return this.logicCardNbr;
    }

    /*
     * <p>cardNbr</p>
     */
    public void setCardNbr(String value){
        this.cardNbr = value;
    }

    /*
     * <p>cardNbr</p>
     */
    public String getCardNbr() {
        return this.cardNbr;
    }

    /*
     * <p>registerDate</p>
     */
    public void setRegisterDate(Date value){
        this.registerDate = value;
    }

    /*
     * <p>registerDate</p>
     */
    public Date getRegisterDate() {
        return this.registerDate;
    }

    /*
     * <p>请求日期时间</p>
     */
    public void setRequestTime(Date value){
        this.requestTime = value;
    }

    /*
     * <p>请求日期时间</p>
     */
    public Date getRequestTime() {
        return this.requestTime;
    }

    /*
     * <p>R|消费转分期 C|现金转分期 B|账单分期 P|POS分期 M|大额分期（专项分期） /// @com.sunline.ppy.dictionary.enums.LoanType</p>
     */
    public void setLoanType(String value){
        this.loanType = value;
    }

    /*
     * <p>R|消费转分期 C|现金转分期 B|账单分期 P|POS分期 M|大额分期（专项分期） /// @com.sunline.ppy.dictionary.enums.LoanType</p>
     */
    public String getLoanType() {
        return this.loanType;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.LoanStatus</p>
     */
    public void setLoanStatus(String value){
        this.loanStatus = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.LoanStatus</p>
     */
    public String getLoanStatus() {
        return this.loanStatus;
    }

    /*
     * <p>I|注册但未活动 A|活动状态(active) M|人工终止(manual terminate) D|逾期终止(delinquncy terminate) R|退货终止(refund) /// @com.sunline.ppy.dictionary.enums.LoanStatus</p>
     */
    public void setLastLoanStatus(String value){
        this.lastLoanStatus = value;
    }

    /*
     * <p>I|注册但未活动 A|活动状态(active) M|人工终止(manual terminate) D|逾期终止(delinquncy terminate) R|退货终止(refund) /// @com.sunline.ppy.dictionary.enums.LoanStatus</p>
     */
    public String getLastLoanStatus() {
        return this.lastLoanStatus;
    }

    /*
     * <p>loanInitTerm</p>
     */
    public void setLoanInitTerm(BigDecimal value){
        this.loanInitTerm = value;
    }

    /*
     * <p>loanInitTerm</p>
     */
    public BigDecimal getLoanInitTerm() {
        return this.loanInitTerm;
    }

    /*
     * <p>currTerm</p>
     */
    public void setCurrTerm(BigDecimal value){
        this.currTerm = value;
    }

    /*
     * <p>currTerm</p>
     */
    public BigDecimal getCurrTerm() {
        return this.currTerm;
    }

    /*
     * <p>remainTerm</p>
     */
    public void setRemainTerm(BigDecimal value){
        this.remainTerm = value;
    }

    /*
     * <p>remainTerm</p>
     */
    public BigDecimal getRemainTerm() {
        return this.remainTerm;
    }

    /*
     * <p>loanInitPrin</p>
     */
    public void setLoanInitPrin(BigDecimal value){
        this.loanInitPrin = value;
    }

    /*
     * <p>loanInitPrin</p>
     */
    public BigDecimal getLoanInitPrin() {
        return this.loanInitPrin;
    }

    /*
     * <p>loanFixedPmtPrin</p>
     */
    public void setLoanFixedPmtPrin(BigDecimal value){
        this.loanFixedPmtPrin = value;
    }

    /*
     * <p>loanFixedPmtPrin</p>
     */
    public BigDecimal getLoanFixedPmtPrin() {
        return this.loanFixedPmtPrin;
    }

    /*
     * <p>loanFirstTermPrin</p>
     */
    public void setLoanFirstTermPrin(BigDecimal value){
        this.loanFirstTermPrin = value;
    }

    /*
     * <p>loanFirstTermPrin</p>
     */
    public BigDecimal getLoanFirstTermPrin() {
        return this.loanFirstTermPrin;
    }

    /*
     * <p>loanFinalTermPrin</p>
     */
    public void setLoanFinalTermPrin(BigDecimal value){
        this.loanFinalTermPrin = value;
    }

    /*
     * <p>loanFinalTermPrin</p>
     */
    public BigDecimal getLoanFinalTermPrin() {
        return this.loanFinalTermPrin;
    }

    /*
     * <p>loanInitFee</p>
     */
    public void setLoanInitFee(BigDecimal value){
        this.loanInitFee = value;
    }

    /*
     * <p>loanInitFee</p>
     */
    public BigDecimal getLoanInitFee() {
        return this.loanInitFee;
    }

    /*
     * <p>loanFixedFee</p>
     */
    public void setLoanFixedFee(BigDecimal value){
        this.loanFixedFee = value;
    }

    /*
     * <p>loanFixedFee</p>
     */
    public BigDecimal getLoanFixedFee() {
        return this.loanFixedFee;
    }

    /*
     * <p>loanFirstTermFee</p>
     */
    public void setLoanFirstTermFee(BigDecimal value){
        this.loanFirstTermFee = value;
    }

    /*
     * <p>loanFirstTermFee</p>
     */
    public BigDecimal getLoanFirstTermFee() {
        return this.loanFirstTermFee;
    }

    /*
     * <p>loanFinalTermFee</p>
     */
    public void setLoanFinalTermFee(BigDecimal value){
        this.loanFinalTermFee = value;
    }

    /*
     * <p>loanFinalTermFee</p>
     */
    public BigDecimal getLoanFinalTermFee() {
        return this.loanFinalTermFee;
    }

    /*
     * <p>unstmtPrin</p>
     */
    public void setUnstmtPrin(BigDecimal value){
        this.unstmtPrin = value;
    }

    /*
     * <p>unstmtPrin</p>
     */
    public BigDecimal getUnstmtPrin() {
        return this.unstmtPrin;
    }

    /*
     * <p>unstmtFee</p>
     */
    public void setUnstmtFee(BigDecimal value){
        this.unstmtFee = value;
    }

    /*
     * <p>unstmtFee</p>
     */
    public BigDecimal getUnstmtFee() {
        return this.unstmtFee;
    }

    /*
     * <p>activeDate</p>
     */
    public void setActiveDate(Date value){
        this.activeDate = value;
    }

    /*
     * <p>activeDate</p>
     */
    public Date getActiveDate() {
        return this.activeDate;
    }

    /*
     * <p>paidOutDate</p>
     */
    public void setPaidOutDate(Date value){
        this.paidOutDate = value;
    }

    /*
     * <p>paidOutDate</p>
     */
    public Date getPaidOutDate() {
        return this.paidOutDate;
    }

    /*
     * <p>terminalDate</p>
     */
    public void setTerminalDate(Date value){
        this.terminalDate = value;
    }

    /*
     * <p>terminalDate</p>
     */
    public Date getTerminalDate() {
        return this.terminalDate;
    }

    /*
     * <p>V|持卡人主动终止（volunteer） M|银行业务人员手工终止（manual） D|逾期自动终止（delinquncy） /// @com.sunline.param.def.enums.LoanTerminateReason</p>
     */
    public void setTerminalReasonCd(String value){
        this.terminalReasonCd = value;
    }

    /*
     * <p>V|持卡人主动终止（volunteer） M|银行业务人员手工终止（manual） D|逾期自动终止（delinquncy） /// @com.sunline.param.def.enums.LoanTerminateReason</p>
     */
    public String getTerminalReasonCd() {
        return this.terminalReasonCd;
    }

    /*
     * <p>paidPrincipal</p>
     */
    public void setPaidPrincipal(BigDecimal value){
        this.paidPrincipal = value;
    }

    /*
     * <p>paidPrincipal</p>
     */
    public BigDecimal getPaidPrincipal() {
        return this.paidPrincipal;
    }

    /*
     * <p>paidInterest</p>
     */
    public void setPaidInterest(BigDecimal value){
        this.paidInterest = value;
    }

    /*
     * <p>paidInterest</p>
     */
    public BigDecimal getPaidInterest() {
        return this.paidInterest;
    }

    /*
     * <p>paidFee</p>
     */
    public void setPaidFee(BigDecimal value){
        this.paidFee = value;
    }

    /*
     * <p>paidFee</p>
     */
    public BigDecimal getPaidFee() {
        return this.paidFee;
    }

    /*
     * <p>loanCurrBal</p>
     */
    public void setLoanCurrBal(BigDecimal value){
        this.loanCurrBal = value;
    }

    /*
     * <p>loanCurrBal</p>
     */
    public BigDecimal getLoanCurrBal() {
        return this.loanCurrBal;
    }

    /*
     * <p>loanBalXfrout</p>
     */
    public void setLoanBalXfrout(BigDecimal value){
        this.loanBalXfrout = value;
    }

    /*
     * <p>loanBalXfrout</p>
     */
    public BigDecimal getLoanBalXfrout() {
        return this.loanBalXfrout;
    }

    /*
     * <p>loanBalXfrin</p>
     */
    public void setLoanBalXfrin(BigDecimal value){
        this.loanBalXfrin = value;
    }

    /*
     * <p>loanBalXfrin</p>
     */
    public BigDecimal getLoanBalXfrin() {
        return this.loanBalXfrin;
    }

    /*
     * <p>loanPrinXfrout</p>
     */
    public void setLoanPrinXfrout(BigDecimal value){
        this.loanPrinXfrout = value;
    }

    /*
     * <p>loanPrinXfrout</p>
     */
    public BigDecimal getLoanPrinXfrout() {
        return this.loanPrinXfrout;
    }

    /*
     * <p>loanPrinXfrin</p>
     */
    public void setLoanPrinXfrin(BigDecimal value){
        this.loanPrinXfrin = value;
    }

    /*
     * <p>loanPrinXfrin</p>
     */
    public BigDecimal getLoanPrinXfrin() {
        return this.loanPrinXfrin;
    }

    /*
     * <p>loanFeeXfrout</p>
     */
    public void setLoanFeeXfrout(BigDecimal value){
        this.loanFeeXfrout = value;
    }

    /*
     * <p>loanFeeXfrout</p>
     */
    public BigDecimal getLoanFeeXfrout() {
        return this.loanFeeXfrout;
    }

    /*
     * <p>loanFeeXfrin</p>
     */
    public void setLoanFeeXfrin(BigDecimal value){
        this.loanFeeXfrin = value;
    }

    /*
     * <p>loanFeeXfrin</p>
     */
    public BigDecimal getLoanFeeXfrin() {
        return this.loanFeeXfrin;
    }

    /*
     * <p>origTxnAmt</p>
     */
    public void setOrigTxnAmt(BigDecimal value){
        this.origTxnAmt = value;
    }

    /*
     * <p>origTxnAmt</p>
     */
    public BigDecimal getOrigTxnAmt() {
        return this.origTxnAmt;
    }

    /*
     * <p>origTransDate</p>
     */
    public void setOrigTransDate(Date value){
        this.origTransDate = value;
    }

    /*
     * <p>origTransDate</p>
     */
    public Date getOrigTransDate() {
        return this.origTransDate;
    }

    /*
     * <p>origAuthCode</p>
     */
    public void setOrigAuthCode(String value){
        this.origAuthCode = value;
    }

    /*
     * <p>origAuthCode</p>
     */
    public String getOrigAuthCode() {
        return this.origAuthCode;
    }

    /*
     * <p>loanCode</p>
     */
    public void setLoanCode(String value){
        this.loanCode = value;
    }

    /*
     * <p>loanCode</p>
     */
    public String getLoanCode() {
        return this.loanCode;
    }

    /*
     * <p>registerId</p>
     */
    public void setRegisterId(Long value){
        this.registerId = value;
    }

    /*
     * <p>registerId</p>
     */
    public Long getRegisterId() {
        return this.registerId;
    }

    /*
     * <p>extendInitPrin</p>
     */
    public void setExtendInitPrin(BigDecimal value){
        this.extendInitPrin = value;
    }

    /*
     * <p>extendInitPrin</p>
     */
    public BigDecimal getExtendInitPrin() {
        return this.extendInitPrin;
    }

    /*
     * <p>extendDate</p>
     */
    public void setExtendDate(Date value){
        this.extendDate = value;
    }

    /*
     * <p>extendDate</p>
     */
    public Date getExtendDate() {
        return this.extendDate;
    }

    /*
     * <p>befExtendFixedPmtPrin</p>
     */
    public void setBefExtendFixedPmtPrin(BigDecimal value){
        this.befExtendFixedPmtPrin = value;
    }

    /*
     * <p>befExtendFixedPmtPrin</p>
     */
    public BigDecimal getBefExtendFixedPmtPrin() {
        return this.befExtendFixedPmtPrin;
    }

    /*
     * <p>befExtendInitTerm</p>
     */
    public void setBefExtendInitTerm(BigDecimal value){
        this.befExtendInitTerm = value;
    }

    /*
     * <p>befExtendInitTerm</p>
     */
    public BigDecimal getBefExtendInitTerm() {
        return this.befExtendInitTerm;
    }

    /*
     * <p>befExtendFirstTermPrin</p>
     */
    public void setBefExtendFirstTermPrin(BigDecimal value){
        this.befExtendFirstTermPrin = value;
    }

    /*
     * <p>befExtendFirstTermPrin</p>
     */
    public BigDecimal getBefExtendFirstTermPrin() {
        return this.befExtendFirstTermPrin;
    }

    /*
     * <p>befExtendFinalTermPrin</p>
     */
    public void setBefExtendFinalTermPrin(BigDecimal value){
        this.befExtendFinalTermPrin = value;
    }

    /*
     * <p>befExtendFinalTermPrin</p>
     */
    public BigDecimal getBefExtendFinalTermPrin() {
        return this.befExtendFinalTermPrin;
    }

    /*
     * <p>befExtendInitFee</p>
     */
    public void setBefExtendInitFee(BigDecimal value){
        this.befExtendInitFee = value;
    }

    /*
     * <p>befExtendInitFee</p>
     */
    public BigDecimal getBefExtendInitFee() {
        return this.befExtendInitFee;
    }

    /*
     * <p>befExtendFixedFee</p>
     */
    public void setBefExtendFixedFee(BigDecimal value){
        this.befExtendFixedFee = value;
    }

    /*
     * <p>befExtendFixedFee</p>
     */
    public BigDecimal getBefExtendFixedFee() {
        return this.befExtendFixedFee;
    }

    /*
     * <p>befExtendFirstTermFee</p>
     */
    public void setBefExtendFirstTermFee(BigDecimal value){
        this.befExtendFirstTermFee = value;
    }

    /*
     * <p>befExtendFirstTermFee</p>
     */
    public BigDecimal getBefExtendFirstTermFee() {
        return this.befExtendFirstTermFee;
    }

    /*
     * <p>befExtendFinalTermFee</p>
     */
    public void setBefExtendFinalTermFee(BigDecimal value){
        this.befExtendFinalTermFee = value;
    }

    /*
     * <p>befExtendFinalTermFee</p>
     */
    public BigDecimal getBefExtendFinalTermFee() {
        return this.befExtendFinalTermFee;
    }

    /*
     * <p>extendFirstTermFee</p>
     */
    public void setExtendFirstTermFee(BigDecimal value){
        this.extendFirstTermFee = value;
    }

    /*
     * <p>extendFirstTermFee</p>
     */
    public BigDecimal getExtendFirstTermFee() {
        return this.extendFirstTermFee;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public void setLoanFeeMethod(String value){
        this.loanFeeMethod = value;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public String getLoanFeeMethod() {
        return this.loanFeeMethod;
    }

    /*
     * <p>floatRate</p>
     */
    public void setFloatRate(BigDecimal value){
        this.floatRate = value;
    }

    /*
     * <p>floatRate</p>
     */
    public BigDecimal getFloatRate() {
        return this.floatRate;
    }

    /*
     * <p>loanExpireDate</p>
     */
    public void setLoanExpireDate(Date value){
        this.loanExpireDate = value;
    }

    /*
     * <p>loanExpireDate</p>
     */
    public Date getLoanExpireDate() {
        return this.loanExpireDate;
    }

    /*
     * <p>通过每个账单日扫描plan的还款状态，应还未还的转入plan个数</p>
     */
    public void setLoanAgeCode(String value){
        this.loanAgeCode = value;
    }

    /*
     * <p>通过每个账单日扫描plan的还款状态，应还未还的转入plan个数</p>
     */
    public String getLoanAgeCode() {
        return this.loanAgeCode;
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
     * <p>pastExtendCnt</p>
     */
    public void setPastExtendCnt(BigDecimal value){
        this.pastExtendCnt = value;
    }

    /*
     * <p>pastExtendCnt</p>
     */
    public BigDecimal getPastExtendCnt() {
        return this.pastExtendCnt;
    }

    /*
     * <p>pastShortenCnt</p>
     */
    public void setPastShortenCnt(BigDecimal value){
        this.pastShortenCnt = value;
    }

    /*
     * <p>pastShortenCnt</p>
     */
    public BigDecimal getPastShortenCnt() {
        return this.pastShortenCnt;
    }

    /*
     * <p>advPmtAmt</p>
     */
    public void setAdvPmtAmt(BigDecimal value){
        this.advPmtAmt = value;
    }

    /*
     * <p>advPmtAmt</p>
     */
    public BigDecimal getAdvPmtAmt() {
        return this.advPmtAmt;
    }

    /*
     * <p>lastActionDate</p>
     */
    public void setLastActionDate(Date value){
        this.lastActionDate = value;
    }

    /*
     * <p>lastActionDate</p>
     */
    public Date getLastActionDate() {
        return this.lastActionDate;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.LoanAction</p>
     */
    public void setLastActionType(String value){
        this.lastActionType = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.LoanAction</p>
     */
    public String getLastActionType() {
        return this.lastActionType;
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
     * <p>stampdutyAmt</p>
     */
    public void setStampdutyAmt(BigDecimal value){
        this.stampdutyAmt = value;
    }

    /*
     * <p>stampdutyAmt</p>
     */
    public BigDecimal getStampdutyAmt() {
        return this.stampdutyAmt;
    }

    /*
     * <p>unstmtStampdutyAmt</p>
     */
    public void setUnstmtStampdutyAmt(BigDecimal value){
        this.unstmtStampdutyAmt = value;
    }

    /*
     * <p>unstmtStampdutyAmt</p>
     */
    public BigDecimal getUnstmtStampdutyAmt() {
        return this.unstmtStampdutyAmt;
    }

    /*
     * <p>loanStampdutyAmt</p>
     */
    public void setLoanStampdutyAmt(BigDecimal value){
        this.loanStampdutyAmt = value;
    }

    /*
     * <p>loanStampdutyAmt</p>
     */
    public BigDecimal getLoanStampdutyAmt() {
        return this.loanStampdutyAmt;
    }

    /*
     * <p>paidStampdutyAmt</p>
     */
    public void setPaidStampdutyAmt(BigDecimal value){
        this.paidStampdutyAmt = value;
    }

    /*
     * <p>paidStampdutyAmt</p>
     */
    public BigDecimal getPaidStampdutyAmt() {
        return this.paidStampdutyAmt;
    }

    /*
     * <p>totLifeInsuAmt</p>
     */
    public void setTotLifeInsuAmt(BigDecimal value){
        this.totLifeInsuAmt = value;
    }

    /*
     * <p>totLifeInsuAmt</p>
     */
    public BigDecimal getTotLifeInsuAmt() {
        return this.totLifeInsuAmt;
    }

    /*
     * <p>unstmtLifeInsuAmt</p>
     */
    public void setUnstmtLifeInsuAmt(BigDecimal value){
        this.unstmtLifeInsuAmt = value;
    }

    /*
     * <p>unstmtLifeInsuAmt</p>
     */
    public BigDecimal getUnstmtLifeInsuAmt() {
        return this.unstmtLifeInsuAmt;
    }

    /*
     * <p>pastLifeInsuAmt</p>
     */
    public void setPastLifeInsuAmt(BigDecimal value){
        this.pastLifeInsuAmt = value;
    }

    /*
     * <p>pastLifeInsuAmt</p>
     */
    public BigDecimal getPastLifeInsuAmt() {
        return this.pastLifeInsuAmt;
    }

    /*
     * <p>paidLifeInsuAmt</p>
     */
    public void setPaidLifeInsuAmt(BigDecimal value){
        this.paidLifeInsuAmt = value;
    }

    /*
     * <p>paidLifeInsuAmt</p>
     */
    public BigDecimal getPaidLifeInsuAmt() {
        return this.paidLifeInsuAmt;
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
     * <p>overdueDate</p>
     */
    public void setOverdueDate(Date value){
        this.overdueDate = value;
    }

    /*
     * <p>overdueDate</p>
     */
    public Date getOverdueDate() {
        return this.overdueDate;
    }

    /*
     * <p>lastPenaltyDate</p>
     */
    public void setLastPenaltyDate(Date value){
        this.lastPenaltyDate = value;
    }

    /*
     * <p>lastPenaltyDate</p>
     */
    public Date getLastPenaltyDate() {
        return this.lastPenaltyDate;
    }

    /*
     * <p>分期总保费</p>
     */
    public void setInsuranceAmt(BigDecimal value){
        this.insuranceAmt = value;
    }

    /*
     * <p>分期总保费</p>
     */
    public BigDecimal getInsuranceAmt() {
        return this.insuranceAmt;
    }

    /*
     * <p>unstmtInsuranceAmt</p>
     */
    public void setUnstmtInsuranceAmt(BigDecimal value){
        this.unstmtInsuranceAmt = value;
    }

    /*
     * <p>unstmtInsuranceAmt</p>
     */
    public BigDecimal getUnstmtInsuranceAmt() {
        return this.unstmtInsuranceAmt;
    }

    /*
     * <p>loanInsuranceAmt</p>
     */
    public void setLoanInsuranceAmt(BigDecimal value){
        this.loanInsuranceAmt = value;
    }

    /*
     * <p>loanInsuranceAmt</p>
     */
    public BigDecimal getLoanInsuranceAmt() {
        return this.loanInsuranceAmt;
    }

    /*
     * <p>paidInsuranceAmt</p>
     */
    public void setPaidInsuranceAmt(BigDecimal value){
        this.paidInsuranceAmt = value;
    }

    /*
     * <p>paidInsuranceAmt</p>
     */
    public BigDecimal getPaidInsuranceAmt() {
        return this.paidInsuranceAmt;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public void setLoanInsFeeMethod(String value){
        this.loanInsFeeMethod = value;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public String getLoanInsFeeMethod() {
        return this.loanInsFeeMethod;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public void setStampdutyMethod(String value){
        this.stampdutyMethod = value;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public String getStampdutyMethod() {
        return this.stampdutyMethod;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public void setLifeInsuFeeMethod(String value){
        this.lifeInsuFeeMethod = value;
    }

    /*
     * <p>联机时填入，一期固定为E F|一次性收取 E|分期收取 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public String getLifeInsuFeeMethod() {
        return this.lifeInsuFeeMethod;
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
     * <p>maxCpd</p>
     */
    public void setMaxCpd(BigDecimal value){
        this.maxCpd = value;
    }

    /*
     * <p>maxCpd</p>
     */
    public BigDecimal getMaxCpd() {
        return this.maxCpd;
    }

    /*
     * <p>maxCpdDate</p>
     */
    public void setMaxCpdDate(Date value){
        this.maxCpdDate = value;
    }

    /*
     * <p>maxCpdDate</p>
     */
    public Date getMaxCpdDate() {
        return this.maxCpdDate;
    }

    /*
     * <p>maxDpd</p>
     */
    public void setMaxDpd(BigDecimal value){
        this.maxDpd = value;
    }

    /*
     * <p>maxDpd</p>
     */
    public BigDecimal getMaxDpd() {
        return this.maxDpd;
    }

    /*
     * <p>maxDpdDate</p>
     */
    public void setMaxDpdDate(Date value){
        this.maxDpdDate = value;
    }

    /*
     * <p>maxDpdDate</p>
     */
    public Date getMaxDpdDate() {
        return this.maxDpdDate;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setStampCustomInd(String value){
        this.stampCustomInd = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getStampCustomInd() {
        return this.stampCustomInd;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public void setIsOffsetRate(String value){
        this.isOffsetRate = value;
    }

    /*
     * <p>/// @com.sunline.ppy.dictionary.enums.Indicator</p>
     */
    public String getIsOffsetRate() {
        return this.isOffsetRate;
    }

    /*
     * <p>cpdBeginDate</p>
     */
    public void setCpdBeginDate(Date value){
        this.cpdBeginDate = value;
    }

    /*
     * <p>cpdBeginDate</p>
     */
    public Date getCpdBeginDate() {
        return this.cpdBeginDate;
    }

    /*
     * <p>totPrepayPkgAmt</p>
     */
    public void setTotPrepayPkgAmt(BigDecimal value){
        this.totPrepayPkgAmt = value;
    }

    /*
     * <p>totPrepayPkgAmt</p>
     */
    public BigDecimal getTotPrepayPkgAmt() {
        return this.totPrepayPkgAmt;
    }

    /*
     * <p>unstmtPrepayPkgAmt</p>
     */
    public void setUnstmtPrepayPkgAmt(BigDecimal value){
        this.unstmtPrepayPkgAmt = value;
    }

    /*
     * <p>unstmtPrepayPkgAmt</p>
     */
    public BigDecimal getUnstmtPrepayPkgAmt() {
        return this.unstmtPrepayPkgAmt;
    }

    /*
     * <p>pastPrepayPkgAmt</p>
     */
    public void setPastPrepayPkgAmt(BigDecimal value){
        this.pastPrepayPkgAmt = value;
    }

    /*
     * <p>pastPrepayPkgAmt</p>
     */
    public BigDecimal getPastPrepayPkgAmt() {
        return this.pastPrepayPkgAmt;
    }

    /*
     * <p>paidPrepayPkgAmt</p>
     */
    public void setPaidPrepayPkgAmt(BigDecimal value){
        this.paidPrepayPkgAmt = value;
    }

    /*
     * <p>paidPrepayPkgAmt</p>
     */
    public BigDecimal getPaidPrepayPkgAmt() {
        return this.paidPrepayPkgAmt;
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
     * <p>prepayPkgFeeMethod</p>
     */
    public void setPrepayPkgFeeMethod(String value){
        this.prepayPkgFeeMethod = value;
    }

    /*
     * <p>prepayPkgFeeMethod</p>
     */
    public String getPrepayPkgFeeMethod() {
        return this.prepayPkgFeeMethod;
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
     * <p>addedvaluetaxRate</p>
     */
    public void setAddedvaluetaxRate(BigDecimal value){
        this.addedvaluetaxRate = value;
    }

    /*
     * <p>addedvaluetaxRate</p>
     */
    public BigDecimal getAddedvaluetaxRate() {
        return this.addedvaluetaxRate;
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
     * <p>unstmtSvcFee</p>
     */
    public void setUnstmtSvcFee(BigDecimal value){
        this.unstmtSvcFee = value;
    }

    /*
     * <p>unstmtSvcFee</p>
     */
    public BigDecimal getUnstmtSvcFee() {
        return this.unstmtSvcFee;
    }

    /*
     * <p>svcfeeMethod</p>
     */
    public void setSvcfeeMethod(String value){
        this.svcfeeMethod = value;
    }

    /*
     * <p>svcfeeMethod</p>
     */
    public String getSvcfeeMethod() {
        return this.svcfeeMethod;
    }

    /*
     * <p>tolSvcFee</p>
     */
    public void setTolSvcFee(BigDecimal value){
        this.tolSvcFee = value;
    }

    /*
     * <p>tolSvcFee</p>
     */
    public BigDecimal getTolSvcFee() {
        return this.tolSvcFee;
    }

    /*
     * <p>pastSvcFee</p>
     */
    public void setPastSvcFee(BigDecimal value){
        this.pastSvcFee = value;
    }

    /*
     * <p>pastSvcFee</p>
     */
    public BigDecimal getPastSvcFee() {
        return this.pastSvcFee;
    }

    /*
     * <p>paidSvcFee</p>
     */
    public void setPaidSvcFee(BigDecimal value){
        this.paidSvcFee = value;
    }

    /*
     * <p>paidSvcFee</p>
     */
    public BigDecimal getPaidSvcFee() {
        return this.paidSvcFee;
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
     * <p>replaceSvcFeeMethod</p>
     */
    public void setReplaceSvcFeeMethod(String value){
        this.replaceSvcFeeMethod = value;
    }

    /*
     * <p>replaceSvcFeeMethod</p>
     */
    public String getReplaceSvcFeeMethod() {
        return this.replaceSvcFeeMethod;
    }

    /*
     * <p>totReplaceSvcFee</p>
     */
    public void setTotReplaceSvcFee(BigDecimal value){
        this.totReplaceSvcFee = value;
    }

    /*
     * <p>totReplaceSvcFee</p>
     */
    public BigDecimal getTotReplaceSvcFee() {
        return this.totReplaceSvcFee;
    }

    /*
     * <p>unstmtReplaceSvcFee</p>
     */
    public void setUnstmtReplaceSvcFee(BigDecimal value){
        this.unstmtReplaceSvcFee = value;
    }

    /*
     * <p>unstmtReplaceSvcFee</p>
     */
    public BigDecimal getUnstmtReplaceSvcFee() {
        return this.unstmtReplaceSvcFee;
    }

    /*
     * <p>pastReplaceSvcFee</p>
     */
    public void setPastReplaceSvcFee(BigDecimal value){
        this.pastReplaceSvcFee = value;
    }

    /*
     * <p>pastReplaceSvcFee</p>
     */
    public BigDecimal getPastReplaceSvcFee() {
        return this.pastReplaceSvcFee;
    }

    /*
     * <p>paidReplaceSvcFee</p>
     */
    public void setPaidReplaceSvcFee(BigDecimal value){
        this.paidReplaceSvcFee = value;
    }

    /*
     * <p>paidReplaceSvcFee</p>
     */
    public BigDecimal getPaidReplaceSvcFee() {
        return this.paidReplaceSvcFee;
    }

    /*
     * <p>premiumAmt</p>
     */
    public void setPremiumAmt(BigDecimal value){
        this.premiumAmt = value;
    }

    /*
     * <p>premiumAmt</p>
     */
    public BigDecimal getPremiumAmt() {
        return this.premiumAmt;
    }

    /*
     * <p>premiumInd</p>
     */
    public void setPremiumInd(String value){
        this.premiumInd = value;
    }

    /*
     * <p>premiumInd</p>
     */
    public String getPremiumInd() {
        return this.premiumInd;
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
     * <p>compensateCount</p>
     */
    public void setCompensateCount(Integer value){
        this.compensateCount = value;
    }

    /*
     * <p>compensateCount</p>
     */
    public Integer getCompensateCount() {
        return this.compensateCount;
    }

    /*
     * <p>compensateAmtSum</p>
     */
    public void setCompensateAmtSum(BigDecimal value){
        this.compensateAmtSum = value;
    }

    /*
     * <p>compensateAmtSum</p>
     */
    public BigDecimal getCompensateAmtSum() {
        return this.compensateAmtSum;
    }

    /*
     * <p>compensateRefundCount</p>
     */
    public void setCompensateRefundCount(Integer value){
        this.compensateRefundCount = value;
    }

    /*
     * <p>compensateRefundCount</p>
     */
    public Integer getCompensateRefundCount() {
        return this.compensateRefundCount;
    }

    /*
     * <p>compensateRefundAmtSum</p>
     */
    public void setCompensateRefundAmtSum(BigDecimal value){
        this.compensateRefundAmtSum = value;
    }

    /*
     * <p>compensateRefundAmtSum</p>
     */
    public BigDecimal getCompensateRefundAmtSum() {
        return this.compensateRefundAmtSum;
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
     * <p>applyTerm</p>
     */
    public void setApplyTerm(Integer value){
        this.applyTerm = value;
    }

    /*
     * <p>applyTerm</p>
     */
    public Integer getApplyTerm() {
        return this.applyTerm;
    }

    /*
     * <p>applyDelayTerm</p>
     */
    public void setApplyDelayTerm(Integer value){
        this.applyDelayTerm = value;
    }

    /*
     * <p>applyDelayTerm</p>
     */
    public Integer getApplyDelayTerm() {
        return this.applyDelayTerm;
    }

    /*
     * <p>accuApplyCount</p>
     */
    public void setAccuApplyCount(Integer value){
        this.accuApplyCount = value;
    }

    /*
     * <p>accuApplyCount</p>
     */
    public Integer getAccuApplyCount() {
        return this.accuApplyCount;
    }

    /*
     * <p>accuDelayCount</p>
     */
    public void setAccuDelayCount(Integer value){
        this.accuDelayCount = value;
    }

    /*
     * <p>accuDelayCount</p>
     */
    public Integer getAccuDelayCount() {
        return this.accuDelayCount;
    }

    /*
     * <p>payDateTerm</p>
     */
    public void setPayDateTerm(Integer value){
        this.payDateTerm = value;
    }

    /*
     * <p>payDateTerm</p>
     */
    public Integer getPayDateTerm() {
        return this.payDateTerm;
    }

    /*
     * <p>payDateBegDate</p>
     */
    public void setPayDateBegDate(Date value){
        this.payDateBegDate = value;
    }

    /*
     * <p>payDateBegDate</p>
     */
    public Date getPayDateBegDate() {
        return this.payDateBegDate;
    }

    /*
     * <p>payDateAccu</p>
     */
    public void setPayDateAccu(Integer value){
        this.payDateAccu = value;
    }

    /*
     * <p>payDateAccu</p>
     */
    public Integer getPayDateAccu() {
        return this.payDateAccu;
    }

    /*
     * <p>/// F|一次性收取 E|分期收取 C|自行指定 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public void setScreenInsuFeeMethod(String value){
        this.screenInsuFeeMethod = value;
    }

    /*
     * <p>/// F|一次性收取 E|分期收取 C|自行指定 /// @com.sunline.ppy.dictionary.enums.LoanFeeMethod</p>
     */
    public String getScreenInsuFeeMethod() {
        return this.screenInsuFeeMethod;
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
     * <p>碎屏险总金额</p>
     */
    public void setTotScreenInsuAmt(BigDecimal value){
        this.totScreenInsuAmt = value;
    }

    /*
     * <p>碎屏险总金额</p>
     */
    public BigDecimal getTotScreenInsuAmt() {
        return this.totScreenInsuAmt;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public void setUnstmtScreenInsuAmt(BigDecimal value){
        this.unstmtScreenInsuAmt = value;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public BigDecimal getUnstmtScreenInsuAmt() {
        return this.unstmtScreenInsuAmt;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public void setPastScreenInsuAmt(BigDecimal value){
        this.pastScreenInsuAmt = value;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public BigDecimal getPastScreenInsuAmt() {
        return this.pastScreenInsuAmt;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public void setPaidScreenInsuAmt(BigDecimal value){
        this.paidScreenInsuAmt = value;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public BigDecimal getPaidScreenInsuAmt() {
        return this.paidScreenInsuAmt;
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

    /*
     * <p>碎屏险金额</p>
     */
    public void setScreenInsuFeeAmt(BigDecimal value){
        this.screenInsuFeeAmt = value;
    }

    /*
     * <p>碎屏险金额</p>
     */
    public BigDecimal getScreenInsuFeeAmt() {
        return this.screenInsuFeeAmt;
    }


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("org", org);
        map.put("loanId", loanId);
        map.put("acctNbr", acctNbr);
        map.put("acctType", acctType);
        map.put("refNbr", refNbr);
        map.put("dueBillNo", dueBillNo);
        map.put("logicCardNbr", logicCardNbr);
        map.put("cardNbr", cardNbr);
        map.put("registerDate", registerDate);
        map.put("requestTime", requestTime);
        map.put("loanType", loanType);
        map.put("loanStatus", loanStatus);
        map.put("lastLoanStatus", lastLoanStatus);
        map.put("loanInitTerm", loanInitTerm);
        map.put("currTerm", currTerm);
        map.put("remainTerm", remainTerm);
        map.put("loanInitPrin", loanInitPrin);
        map.put("loanFixedPmtPrin", loanFixedPmtPrin);
        map.put("loanFirstTermPrin", loanFirstTermPrin);
        map.put("loanFinalTermPrin", loanFinalTermPrin);
        map.put("loanInitFee", loanInitFee);
        map.put("loanFixedFee", loanFixedFee);
        map.put("loanFirstTermFee", loanFirstTermFee);
        map.put("loanFinalTermFee", loanFinalTermFee);
        map.put("unstmtPrin", unstmtPrin);
        map.put("unstmtFee", unstmtFee);
        map.put("activeDate", activeDate);
        map.put("paidOutDate", paidOutDate);
        map.put("terminalDate", terminalDate);
        map.put("terminalReasonCd", terminalReasonCd);
        map.put("paidPrincipal", paidPrincipal);
        map.put("paidInterest", paidInterest);
        map.put("paidFee", paidFee);
        map.put("loanCurrBal", loanCurrBal);
        map.put("loanBalXfrout", loanBalXfrout);
        map.put("loanBalXfrin", loanBalXfrin);
        map.put("loanPrinXfrout", loanPrinXfrout);
        map.put("loanPrinXfrin", loanPrinXfrin);
        map.put("loanFeeXfrout", loanFeeXfrout);
        map.put("loanFeeXfrin", loanFeeXfrin);
        map.put("origTxnAmt", origTxnAmt);
        map.put("origTransDate", origTransDate);
        map.put("origAuthCode", origAuthCode);
        map.put("loanCode", loanCode);
        map.put("registerId", registerId);
        map.put("extendInitPrin", extendInitPrin);
        map.put("extendDate", extendDate);
        map.put("befExtendFixedPmtPrin", befExtendFixedPmtPrin);
        map.put("befExtendInitTerm", befExtendInitTerm);
        map.put("befExtendFirstTermPrin", befExtendFirstTermPrin);
        map.put("befExtendFinalTermPrin", befExtendFinalTermPrin);
        map.put("befExtendInitFee", befExtendInitFee);
        map.put("befExtendFixedFee", befExtendFixedFee);
        map.put("befExtendFirstTermFee", befExtendFirstTermFee);
        map.put("befExtendFinalTermFee", befExtendFinalTermFee);
        map.put("extendFirstTermFee", extendFirstTermFee);
        map.put("loanFeeMethod", loanFeeMethod);
        map.put("floatRate", floatRate);
        map.put("loanExpireDate", loanExpireDate);
        map.put("loanAgeCode", loanAgeCode);
        map.put("paymentHst", paymentHst);
        map.put("ctdRepayAmt", ctdRepayAmt);
        map.put("pastExtendCnt", pastExtendCnt);
        map.put("pastShortenCnt", pastShortenCnt);
        map.put("advPmtAmt", advPmtAmt);
        map.put("lastActionDate", lastActionDate);
        map.put("lastActionType", lastActionType);
        map.put("contrNbr", contrNbr);
        map.put("guarantyId", guarantyId);
        map.put("stampdutyAmt", stampdutyAmt);
        map.put("unstmtStampdutyAmt", unstmtStampdutyAmt);
        map.put("loanStampdutyAmt", loanStampdutyAmt);
        map.put("paidStampdutyAmt", paidStampdutyAmt);
        map.put("totLifeInsuAmt", totLifeInsuAmt);
        map.put("unstmtLifeInsuAmt", unstmtLifeInsuAmt);
        map.put("pastLifeInsuAmt", pastLifeInsuAmt);
        map.put("paidLifeInsuAmt", paidLifeInsuAmt);
        map.put("lifeInsuFeeRate", lifeInsuFeeRate);
        map.put("overdueDate", overdueDate);
        map.put("lastPenaltyDate", lastPenaltyDate);
        map.put("insuranceAmt", insuranceAmt);
        map.put("unstmtInsuranceAmt", unstmtInsuranceAmt);
        map.put("loanInsuranceAmt", loanInsuranceAmt);
        map.put("paidInsuranceAmt", paidInsuranceAmt);
        map.put("loanInsFeeMethod", loanInsFeeMethod);
        map.put("stampdutyMethod", stampdutyMethod);
        map.put("lifeInsuFeeMethod", lifeInsuFeeMethod);
        map.put("createTime", createTime);
        map.put("createUser", createUser);
        map.put("lstUpdTime", lstUpdTime);
        map.put("lstUpdUser", lstUpdUser);
        map.put("jpaVersion", jpaVersion);
        map.put("maxCpd", maxCpd);
        map.put("maxCpdDate", maxCpdDate);
        map.put("maxDpd", maxDpd);
        map.put("maxDpdDate", maxDpdDate);
        map.put("stampCustomInd", stampCustomInd);
        map.put("isOffsetRate", isOffsetRate);
        map.put("cpdBeginDate", cpdBeginDate);
        map.put("totPrepayPkgAmt", totPrepayPkgAmt);
        map.put("unstmtPrepayPkgAmt", unstmtPrepayPkgAmt);
        map.put("pastPrepayPkgAmt", pastPrepayPkgAmt);
        map.put("paidPrepayPkgAmt", paidPrepayPkgAmt);
        map.put("prepayPkgFeeRate", prepayPkgFeeRate);
        map.put("prepayPkgFeeMethod", prepayPkgFeeMethod);
        map.put("loanFeeDefId", loanFeeDefId);
        map.put("interestRate", interestRate);
        map.put("penaltyRate", penaltyRate);
        map.put("compoundRate", compoundRate);
        map.put("addedvaluetaxRate", addedvaluetaxRate);
        map.put("stampdutyRate", stampdutyRate);
        map.put("insuranceRate", insuranceRate);
        map.put("agreementRateInd", agreementRateInd);
        map.put("feeRate", feeRate);
        map.put("feeAmt", feeAmt);
        map.put("lifeInsuFeeAmt", lifeInsuFeeAmt);
        map.put("installmentFeeRate", installmentFeeRate);
        map.put("installmentFeeAmt", installmentFeeAmt);
        map.put("prepayPkgFeeAmt", prepayPkgFeeAmt);
        map.put("insAmt", insAmt);
        map.put("stampAmt", stampAmt);
        map.put("joinLifeInsuInd", joinLifeInsuInd);
        map.put("unstmtSvcFee", unstmtSvcFee);
        map.put("svcfeeMethod", svcfeeMethod);
        map.put("tolSvcFee", tolSvcFee);
        map.put("pastSvcFee", pastSvcFee);
        map.put("paidSvcFee", paidSvcFee);
        map.put("replaceSvcFeeRate", replaceSvcFeeRate);
        map.put("replaceSvcFeeAmt", replaceSvcFeeAmt);
        map.put("replaceSvcFeeMethod", replaceSvcFeeMethod);
        map.put("totReplaceSvcFee", totReplaceSvcFee);
        map.put("unstmtReplaceSvcFee", unstmtReplaceSvcFee);
        map.put("pastReplaceSvcFee", pastReplaceSvcFee);
        map.put("paidReplaceSvcFee", paidReplaceSvcFee);
        map.put("premiumAmt", premiumAmt);
        map.put("premiumInd", premiumInd);
        map.put("replacePenaltyRate", replacePenaltyRate);
        map.put("compensateCount", compensateCount);
        map.put("compensateAmtSum", compensateAmtSum);
        map.put("compensateRefundCount", compensateRefundCount);
        map.put("compensateRefundAmtSum", compensateRefundAmtSum);
        map.put("prepayPkgInd", prepayPkgInd);
        map.put("applyTerm", applyTerm);
        map.put("applyDelayTerm", applyDelayTerm);
        map.put("accuApplyCount", accuApplyCount);
        map.put("accuDelayCount", accuDelayCount);
        map.put("payDateTerm", payDateTerm);
        map.put("payDateBegDate", payDateBegDate);
        map.put("payDateAccu", payDateAccu);
        map.put("screenInsuFeeMethod", screenInsuFeeMethod);
        map.put("joinScreenInsuInd", joinScreenInsuInd);
        map.put("totScreenInsuAmt", totScreenInsuAmt);
        map.put("unstmtScreenInsuAmt", unstmtScreenInsuAmt);
        map.put("pastScreenInsuAmt", pastScreenInsuAmt);
        map.put("paidScreenInsuAmt", paidScreenInsuAmt);
        map.put("screenInsuFeeRate", screenInsuFeeRate);
        map.put("screenInsuFeeAmt", screenInsuFeeAmt);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("org")) this.setOrg(DataTypeUtils.getStringValue(map.get("org")));
        if(map.containsKey("loanId")) this.setLoanId(DataTypeUtils.getLongValue(map.get("loanId")));
        if(map.containsKey("acctNbr")) this.setAcctNbr(DataTypeUtils.getLongValue(map.get("acctNbr")));
        if(map.containsKey("acctType")) this.setAcctType(DataTypeUtils.getStringValue(map.get("acctType")));
        if(map.containsKey("refNbr")) this.setRefNbr(DataTypeUtils.getStringValue(map.get("refNbr")));
        if(map.containsKey("dueBillNo")) this.setDueBillNo(DataTypeUtils.getStringValue(map.get("dueBillNo")));
        if(map.containsKey("logicCardNbr")) this.setLogicCardNbr(DataTypeUtils.getStringValue(map.get("logicCardNbr")));
        if(map.containsKey("cardNbr")) this.setCardNbr(DataTypeUtils.getStringValue(map.get("cardNbr")));
        if(map.containsKey("registerDate")) this.setRegisterDate(DataTypeUtils.getDateValue(map.get("registerDate")));
        if(map.containsKey("requestTime")) this.setRequestTime(DataTypeUtils.getDateValue(map.get("requestTime")));
        if(map.containsKey("loanType")) this.setLoanType(DataTypeUtils.getStringValue(map.get("loanType")));
        if(map.containsKey("loanStatus")) this.setLoanStatus(DataTypeUtils.getStringValue(map.get("loanStatus")));
        if(map.containsKey("lastLoanStatus")) this.setLastLoanStatus(DataTypeUtils.getStringValue(map.get("lastLoanStatus")));
        if(map.containsKey("loanInitTerm")) this.setLoanInitTerm(DataTypeUtils.getBigDecimalValue(map.get("loanInitTerm")));
        if(map.containsKey("currTerm")) this.setCurrTerm(DataTypeUtils.getBigDecimalValue(map.get("currTerm")));
        if(map.containsKey("remainTerm")) this.setRemainTerm(DataTypeUtils.getBigDecimalValue(map.get("remainTerm")));
        if(map.containsKey("loanInitPrin")) this.setLoanInitPrin(DataTypeUtils.getBigDecimalValue(map.get("loanInitPrin")));
        if(map.containsKey("loanFixedPmtPrin")) this.setLoanFixedPmtPrin(DataTypeUtils.getBigDecimalValue(map.get("loanFixedPmtPrin")));
        if(map.containsKey("loanFirstTermPrin")) this.setLoanFirstTermPrin(DataTypeUtils.getBigDecimalValue(map.get("loanFirstTermPrin")));
        if(map.containsKey("loanFinalTermPrin")) this.setLoanFinalTermPrin(DataTypeUtils.getBigDecimalValue(map.get("loanFinalTermPrin")));
        if(map.containsKey("loanInitFee")) this.setLoanInitFee(DataTypeUtils.getBigDecimalValue(map.get("loanInitFee")));
        if(map.containsKey("loanFixedFee")) this.setLoanFixedFee(DataTypeUtils.getBigDecimalValue(map.get("loanFixedFee")));
        if(map.containsKey("loanFirstTermFee")) this.setLoanFirstTermFee(DataTypeUtils.getBigDecimalValue(map.get("loanFirstTermFee")));
        if(map.containsKey("loanFinalTermFee")) this.setLoanFinalTermFee(DataTypeUtils.getBigDecimalValue(map.get("loanFinalTermFee")));
        if(map.containsKey("unstmtPrin")) this.setUnstmtPrin(DataTypeUtils.getBigDecimalValue(map.get("unstmtPrin")));
        if(map.containsKey("unstmtFee")) this.setUnstmtFee(DataTypeUtils.getBigDecimalValue(map.get("unstmtFee")));
        if(map.containsKey("activeDate")) this.setActiveDate(DataTypeUtils.getDateValue(map.get("activeDate")));
        if(map.containsKey("paidOutDate")) this.setPaidOutDate(DataTypeUtils.getDateValue(map.get("paidOutDate")));
        if(map.containsKey("terminalDate")) this.setTerminalDate(DataTypeUtils.getDateValue(map.get("terminalDate")));
        if(map.containsKey("terminalReasonCd")) this.setTerminalReasonCd(DataTypeUtils.getStringValue(map.get("terminalReasonCd")));
        if(map.containsKey("paidPrincipal")) this.setPaidPrincipal(DataTypeUtils.getBigDecimalValue(map.get("paidPrincipal")));
        if(map.containsKey("paidInterest")) this.setPaidInterest(DataTypeUtils.getBigDecimalValue(map.get("paidInterest")));
        if(map.containsKey("paidFee")) this.setPaidFee(DataTypeUtils.getBigDecimalValue(map.get("paidFee")));
        if(map.containsKey("loanCurrBal")) this.setLoanCurrBal(DataTypeUtils.getBigDecimalValue(map.get("loanCurrBal")));
        if(map.containsKey("loanBalXfrout")) this.setLoanBalXfrout(DataTypeUtils.getBigDecimalValue(map.get("loanBalXfrout")));
        if(map.containsKey("loanBalXfrin")) this.setLoanBalXfrin(DataTypeUtils.getBigDecimalValue(map.get("loanBalXfrin")));
        if(map.containsKey("loanPrinXfrout")) this.setLoanPrinXfrout(DataTypeUtils.getBigDecimalValue(map.get("loanPrinXfrout")));
        if(map.containsKey("loanPrinXfrin")) this.setLoanPrinXfrin(DataTypeUtils.getBigDecimalValue(map.get("loanPrinXfrin")));
        if(map.containsKey("loanFeeXfrout")) this.setLoanFeeXfrout(DataTypeUtils.getBigDecimalValue(map.get("loanFeeXfrout")));
        if(map.containsKey("loanFeeXfrin")) this.setLoanFeeXfrin(DataTypeUtils.getBigDecimalValue(map.get("loanFeeXfrin")));
        if(map.containsKey("origTxnAmt")) this.setOrigTxnAmt(DataTypeUtils.getBigDecimalValue(map.get("origTxnAmt")));
        if(map.containsKey("origTransDate")) this.setOrigTransDate(DataTypeUtils.getDateValue(map.get("origTransDate")));
        if(map.containsKey("origAuthCode")) this.setOrigAuthCode(DataTypeUtils.getStringValue(map.get("origAuthCode")));
        if(map.containsKey("loanCode")) this.setLoanCode(DataTypeUtils.getStringValue(map.get("loanCode")));
        if(map.containsKey("registerId")) this.setRegisterId(DataTypeUtils.getLongValue(map.get("registerId")));
        if(map.containsKey("extendInitPrin")) this.setExtendInitPrin(DataTypeUtils.getBigDecimalValue(map.get("extendInitPrin")));
        if(map.containsKey("extendDate")) this.setExtendDate(DataTypeUtils.getDateValue(map.get("extendDate")));
        if(map.containsKey("befExtendFixedPmtPrin")) this.setBefExtendFixedPmtPrin(DataTypeUtils.getBigDecimalValue(map.get("befExtendFixedPmtPrin")));
        if(map.containsKey("befExtendInitTerm")) this.setBefExtendInitTerm(DataTypeUtils.getBigDecimalValue(map.get("befExtendInitTerm")));
        if(map.containsKey("befExtendFirstTermPrin")) this.setBefExtendFirstTermPrin(DataTypeUtils.getBigDecimalValue(map.get("befExtendFirstTermPrin")));
        if(map.containsKey("befExtendFinalTermPrin")) this.setBefExtendFinalTermPrin(DataTypeUtils.getBigDecimalValue(map.get("befExtendFinalTermPrin")));
        if(map.containsKey("befExtendInitFee")) this.setBefExtendInitFee(DataTypeUtils.getBigDecimalValue(map.get("befExtendInitFee")));
        if(map.containsKey("befExtendFixedFee")) this.setBefExtendFixedFee(DataTypeUtils.getBigDecimalValue(map.get("befExtendFixedFee")));
        if(map.containsKey("befExtendFirstTermFee")) this.setBefExtendFirstTermFee(DataTypeUtils.getBigDecimalValue(map.get("befExtendFirstTermFee")));
        if(map.containsKey("befExtendFinalTermFee")) this.setBefExtendFinalTermFee(DataTypeUtils.getBigDecimalValue(map.get("befExtendFinalTermFee")));
        if(map.containsKey("extendFirstTermFee")) this.setExtendFirstTermFee(DataTypeUtils.getBigDecimalValue(map.get("extendFirstTermFee")));
        if(map.containsKey("loanFeeMethod")) this.setLoanFeeMethod(DataTypeUtils.getStringValue(map.get("loanFeeMethod")));
        if(map.containsKey("floatRate")) this.setFloatRate(DataTypeUtils.getBigDecimalValue(map.get("floatRate")));
        if(map.containsKey("loanExpireDate")) this.setLoanExpireDate(DataTypeUtils.getDateValue(map.get("loanExpireDate")));
        if(map.containsKey("loanAgeCode")) this.setLoanAgeCode(DataTypeUtils.getStringValue(map.get("loanAgeCode")));
        if(map.containsKey("paymentHst")) this.setPaymentHst(DataTypeUtils.getStringValue(map.get("paymentHst")));
        if(map.containsKey("ctdRepayAmt")) this.setCtdRepayAmt(DataTypeUtils.getBigDecimalValue(map.get("ctdRepayAmt")));
        if(map.containsKey("pastExtendCnt")) this.setPastExtendCnt(DataTypeUtils.getBigDecimalValue(map.get("pastExtendCnt")));
        if(map.containsKey("pastShortenCnt")) this.setPastShortenCnt(DataTypeUtils.getBigDecimalValue(map.get("pastShortenCnt")));
        if(map.containsKey("advPmtAmt")) this.setAdvPmtAmt(DataTypeUtils.getBigDecimalValue(map.get("advPmtAmt")));
        if(map.containsKey("lastActionDate")) this.setLastActionDate(DataTypeUtils.getDateValue(map.get("lastActionDate")));
        if(map.containsKey("lastActionType")) this.setLastActionType(DataTypeUtils.getStringValue(map.get("lastActionType")));
        if(map.containsKey("contrNbr")) this.setContrNbr(DataTypeUtils.getStringValue(map.get("contrNbr")));
        if(map.containsKey("guarantyId")) this.setGuarantyId(DataTypeUtils.getStringValue(map.get("guarantyId")));
        if(map.containsKey("stampdutyAmt")) this.setStampdutyAmt(DataTypeUtils.getBigDecimalValue(map.get("stampdutyAmt")));
        if(map.containsKey("unstmtStampdutyAmt")) this.setUnstmtStampdutyAmt(DataTypeUtils.getBigDecimalValue(map.get("unstmtStampdutyAmt")));
        if(map.containsKey("loanStampdutyAmt")) this.setLoanStampdutyAmt(DataTypeUtils.getBigDecimalValue(map.get("loanStampdutyAmt")));
        if(map.containsKey("paidStampdutyAmt")) this.setPaidStampdutyAmt(DataTypeUtils.getBigDecimalValue(map.get("paidStampdutyAmt")));
        if(map.containsKey("totLifeInsuAmt")) this.setTotLifeInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("totLifeInsuAmt")));
        if(map.containsKey("unstmtLifeInsuAmt")) this.setUnstmtLifeInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("unstmtLifeInsuAmt")));
        if(map.containsKey("pastLifeInsuAmt")) this.setPastLifeInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("pastLifeInsuAmt")));
        if(map.containsKey("paidLifeInsuAmt")) this.setPaidLifeInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("paidLifeInsuAmt")));
        if(map.containsKey("lifeInsuFeeRate")) this.setLifeInsuFeeRate(DataTypeUtils.getBigDecimalValue(map.get("lifeInsuFeeRate")));
        if(map.containsKey("overdueDate")) this.setOverdueDate(DataTypeUtils.getDateValue(map.get("overdueDate")));
        if(map.containsKey("lastPenaltyDate")) this.setLastPenaltyDate(DataTypeUtils.getDateValue(map.get("lastPenaltyDate")));
        if(map.containsKey("insuranceAmt")) this.setInsuranceAmt(DataTypeUtils.getBigDecimalValue(map.get("insuranceAmt")));
        if(map.containsKey("unstmtInsuranceAmt")) this.setUnstmtInsuranceAmt(DataTypeUtils.getBigDecimalValue(map.get("unstmtInsuranceAmt")));
        if(map.containsKey("loanInsuranceAmt")) this.setLoanInsuranceAmt(DataTypeUtils.getBigDecimalValue(map.get("loanInsuranceAmt")));
        if(map.containsKey("paidInsuranceAmt")) this.setPaidInsuranceAmt(DataTypeUtils.getBigDecimalValue(map.get("paidInsuranceAmt")));
        if(map.containsKey("loanInsFeeMethod")) this.setLoanInsFeeMethod(DataTypeUtils.getStringValue(map.get("loanInsFeeMethod")));
        if(map.containsKey("stampdutyMethod")) this.setStampdutyMethod(DataTypeUtils.getStringValue(map.get("stampdutyMethod")));
        if(map.containsKey("lifeInsuFeeMethod")) this.setLifeInsuFeeMethod(DataTypeUtils.getStringValue(map.get("lifeInsuFeeMethod")));
        if(map.containsKey("createTime")) this.setCreateTime(DataTypeUtils.getDateValue(map.get("createTime")));
        if(map.containsKey("createUser")) this.setCreateUser(DataTypeUtils.getStringValue(map.get("createUser")));
        if(map.containsKey("lstUpdTime")) this.setLstUpdTime(DataTypeUtils.getDateValue(map.get("lstUpdTime")));
        if(map.containsKey("lstUpdUser")) this.setLstUpdUser(DataTypeUtils.getStringValue(map.get("lstUpdUser")));
        if(map.containsKey("jpaVersion")) this.setJpaVersion(DataTypeUtils.getBigDecimalValue(map.get("jpaVersion")));
        if(map.containsKey("maxCpd")) this.setMaxCpd(DataTypeUtils.getBigDecimalValue(map.get("maxCpd")));
        if(map.containsKey("maxCpdDate")) this.setMaxCpdDate(DataTypeUtils.getDateValue(map.get("maxCpdDate")));
        if(map.containsKey("maxDpd")) this.setMaxDpd(DataTypeUtils.getBigDecimalValue(map.get("maxDpd")));
        if(map.containsKey("maxDpdDate")) this.setMaxDpdDate(DataTypeUtils.getDateValue(map.get("maxDpdDate")));
        if(map.containsKey("stampCustomInd")) this.setStampCustomInd(DataTypeUtils.getStringValue(map.get("stampCustomInd")));
        if(map.containsKey("isOffsetRate")) this.setIsOffsetRate(DataTypeUtils.getStringValue(map.get("isOffsetRate")));
        if(map.containsKey("cpdBeginDate")) this.setCpdBeginDate(DataTypeUtils.getDateValue(map.get("cpdBeginDate")));
        if(map.containsKey("totPrepayPkgAmt")) this.setTotPrepayPkgAmt(DataTypeUtils.getBigDecimalValue(map.get("totPrepayPkgAmt")));
        if(map.containsKey("unstmtPrepayPkgAmt")) this.setUnstmtPrepayPkgAmt(DataTypeUtils.getBigDecimalValue(map.get("unstmtPrepayPkgAmt")));
        if(map.containsKey("pastPrepayPkgAmt")) this.setPastPrepayPkgAmt(DataTypeUtils.getBigDecimalValue(map.get("pastPrepayPkgAmt")));
        if(map.containsKey("paidPrepayPkgAmt")) this.setPaidPrepayPkgAmt(DataTypeUtils.getBigDecimalValue(map.get("paidPrepayPkgAmt")));
        if(map.containsKey("prepayPkgFeeRate")) this.setPrepayPkgFeeRate(DataTypeUtils.getBigDecimalValue(map.get("prepayPkgFeeRate")));
        if(map.containsKey("prepayPkgFeeMethod")) this.setPrepayPkgFeeMethod(DataTypeUtils.getStringValue(map.get("prepayPkgFeeMethod")));
        if(map.containsKey("loanFeeDefId")) this.setLoanFeeDefId(DataTypeUtils.getStringValue(map.get("loanFeeDefId")));
        if(map.containsKey("interestRate")) this.setInterestRate(DataTypeUtils.getBigDecimalValue(map.get("interestRate")));
        if(map.containsKey("penaltyRate")) this.setPenaltyRate(DataTypeUtils.getBigDecimalValue(map.get("penaltyRate")));
        if(map.containsKey("compoundRate")) this.setCompoundRate(DataTypeUtils.getBigDecimalValue(map.get("compoundRate")));
        if(map.containsKey("addedvaluetaxRate")) this.setAddedvaluetaxRate(DataTypeUtils.getBigDecimalValue(map.get("addedvaluetaxRate")));
        if(map.containsKey("stampdutyRate")) this.setStampdutyRate(DataTypeUtils.getBigDecimalValue(map.get("stampdutyRate")));
        if(map.containsKey("insuranceRate")) this.setInsuranceRate(DataTypeUtils.getBigDecimalValue(map.get("insuranceRate")));
        if(map.containsKey("agreementRateInd")) this.setAgreementRateInd(DataTypeUtils.getStringValue(map.get("agreementRateInd")));
        if(map.containsKey("feeRate")) this.setFeeRate(DataTypeUtils.getBigDecimalValue(map.get("feeRate")));
        if(map.containsKey("feeAmt")) this.setFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("feeAmt")));
        if(map.containsKey("lifeInsuFeeAmt")) this.setLifeInsuFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("lifeInsuFeeAmt")));
        if(map.containsKey("installmentFeeRate")) this.setInstallmentFeeRate(DataTypeUtils.getBigDecimalValue(map.get("installmentFeeRate")));
        if(map.containsKey("installmentFeeAmt")) this.setInstallmentFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("installmentFeeAmt")));
        if(map.containsKey("prepayPkgFeeAmt")) this.setPrepayPkgFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("prepayPkgFeeAmt")));
        if(map.containsKey("insAmt")) this.setInsAmt(DataTypeUtils.getBigDecimalValue(map.get("insAmt")));
        if(map.containsKey("stampAmt")) this.setStampAmt(DataTypeUtils.getBigDecimalValue(map.get("stampAmt")));
        if(map.containsKey("joinLifeInsuInd")) this.setJoinLifeInsuInd(DataTypeUtils.getStringValue(map.get("joinLifeInsuInd")));
        if(map.containsKey("unstmtSvcFee")) this.setUnstmtSvcFee(DataTypeUtils.getBigDecimalValue(map.get("unstmtSvcFee")));
        if(map.containsKey("svcfeeMethod")) this.setSvcfeeMethod(DataTypeUtils.getStringValue(map.get("svcfeeMethod")));
        if(map.containsKey("tolSvcFee")) this.setTolSvcFee(DataTypeUtils.getBigDecimalValue(map.get("tolSvcFee")));
        if(map.containsKey("pastSvcFee")) this.setPastSvcFee(DataTypeUtils.getBigDecimalValue(map.get("pastSvcFee")));
        if(map.containsKey("paidSvcFee")) this.setPaidSvcFee(DataTypeUtils.getBigDecimalValue(map.get("paidSvcFee")));
        if(map.containsKey("replaceSvcFeeRate")) this.setReplaceSvcFeeRate(DataTypeUtils.getBigDecimalValue(map.get("replaceSvcFeeRate")));
        if(map.containsKey("replaceSvcFeeAmt")) this.setReplaceSvcFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("replaceSvcFeeAmt")));
        if(map.containsKey("replaceSvcFeeMethod")) this.setReplaceSvcFeeMethod(DataTypeUtils.getStringValue(map.get("replaceSvcFeeMethod")));
        if(map.containsKey("totReplaceSvcFee")) this.setTotReplaceSvcFee(DataTypeUtils.getBigDecimalValue(map.get("totReplaceSvcFee")));
        if(map.containsKey("unstmtReplaceSvcFee")) this.setUnstmtReplaceSvcFee(DataTypeUtils.getBigDecimalValue(map.get("unstmtReplaceSvcFee")));
        if(map.containsKey("pastReplaceSvcFee")) this.setPastReplaceSvcFee(DataTypeUtils.getBigDecimalValue(map.get("pastReplaceSvcFee")));
        if(map.containsKey("paidReplaceSvcFee")) this.setPaidReplaceSvcFee(DataTypeUtils.getBigDecimalValue(map.get("paidReplaceSvcFee")));
        if(map.containsKey("premiumAmt")) this.setPremiumAmt(DataTypeUtils.getBigDecimalValue(map.get("premiumAmt")));
        if(map.containsKey("premiumInd")) this.setPremiumInd(DataTypeUtils.getStringValue(map.get("premiumInd")));
        if(map.containsKey("replacePenaltyRate")) this.setReplacePenaltyRate(DataTypeUtils.getBigDecimalValue(map.get("replacePenaltyRate")));
        if(map.containsKey("compensateCount")) this.setCompensateCount(DataTypeUtils.getIntegerValue(map.get("compensateCount")));
        if(map.containsKey("compensateAmtSum")) this.setCompensateAmtSum(DataTypeUtils.getBigDecimalValue(map.get("compensateAmtSum")));
        if(map.containsKey("compensateRefundCount")) this.setCompensateRefundCount(DataTypeUtils.getIntegerValue(map.get("compensateRefundCount")));
        if(map.containsKey("compensateRefundAmtSum")) this.setCompensateRefundAmtSum(DataTypeUtils.getBigDecimalValue(map.get("compensateRefundAmtSum")));
        if(map.containsKey("prepayPkgInd")) this.setPrepayPkgInd(DataTypeUtils.getStringValue(map.get("prepayPkgInd")));
        if(map.containsKey("applyTerm")) this.setApplyTerm(DataTypeUtils.getIntegerValue(map.get("applyTerm")));
        if(map.containsKey("applyDelayTerm")) this.setApplyDelayTerm(DataTypeUtils.getIntegerValue(map.get("applyDelayTerm")));
        if(map.containsKey("accuApplyCount")) this.setAccuApplyCount(DataTypeUtils.getIntegerValue(map.get("accuApplyCount")));
        if(map.containsKey("accuDelayCount")) this.setAccuDelayCount(DataTypeUtils.getIntegerValue(map.get("accuDelayCount")));
        if(map.containsKey("payDateTerm")) this.setPayDateTerm(DataTypeUtils.getIntegerValue(map.get("payDateTerm")));
        if(map.containsKey("payDateBegDate")) this.setPayDateBegDate(DataTypeUtils.getDateValue(map.get("payDateBegDate")));
        if(map.containsKey("payDateAccu")) this.setPayDateAccu(DataTypeUtils.getIntegerValue(map.get("payDateAccu")));
        if(map.containsKey("screenInsuFeeMethod")) this.setScreenInsuFeeMethod(DataTypeUtils.getStringValue(map.get("screenInsuFeeMethod")));
        if(map.containsKey("joinScreenInsuInd")) this.setJoinScreenInsuInd(DataTypeUtils.getStringValue(map.get("joinScreenInsuInd")));
        if(map.containsKey("totScreenInsuAmt")) this.setTotScreenInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("totScreenInsuAmt")));
        if(map.containsKey("unstmtScreenInsuAmt")) this.setUnstmtScreenInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("unstmtScreenInsuAmt")));
        if(map.containsKey("pastScreenInsuAmt")) this.setPastScreenInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("pastScreenInsuAmt")));
        if(map.containsKey("paidScreenInsuAmt")) this.setPaidScreenInsuAmt(DataTypeUtils.getBigDecimalValue(map.get("paidScreenInsuAmt")));
        if(map.containsKey("screenInsuFeeRate")) this.setScreenInsuFeeRate(DataTypeUtils.getBigDecimalValue(map.get("screenInsuFeeRate")));
        if(map.containsKey("screenInsuFeeAmt")) this.setScreenInsuFeeAmt(DataTypeUtils.getBigDecimalValue(map.get("screenInsuFeeAmt")));
    }

}
