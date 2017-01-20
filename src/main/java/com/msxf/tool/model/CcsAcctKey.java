

package com.msxf.tool.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;

public class CcsAcctKey  implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	private Long acctNbr;
	private String acctType;

	public CcsAcctKey(){
	}

	public CcsAcctKey(
		Long acctNbr,
		String acctType
	){
		this.acctNbr = acctNbr;
		this.acctType = acctType;
	}

	
	
	public void setAcctNbr(Long value) {
		this.acctNbr = value;
	}
	
	@Column(name = "ACCT_NBR", unique = false, nullable = false, insertable = true, updatable = true, length = 16)	
	public Long getAcctNbr() {
		return this.acctNbr;
	}
	
	public void setAcctType(String value) {
		this.acctType = value;
	}
	
	@Column(name = "ACCT_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)	
	public String getAcctType() {
		return this.acctType;
	}
}