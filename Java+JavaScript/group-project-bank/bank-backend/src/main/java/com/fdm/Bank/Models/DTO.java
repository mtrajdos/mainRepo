package com.fdm.Bank.Models;
import java.math.BigDecimal;

public class DTO {
	
	BigDecimal housePrice;
	BigDecimal deposit;
	BigDecimal termInYears;
	BigDecimal interestRate;
	
	
	public DTO(BigDecimal housePrice, BigDecimal deposit, BigDecimal termInYears, BigDecimal interestRate) {
		super();
		this.housePrice = housePrice;
		this.deposit = deposit;
		this.termInYears = termInYears;
		this.interestRate = interestRate;
	}


	public BigDecimal getHousePrice() {
		return housePrice;
	}


	public void setHousePrice(BigDecimal housePrice) {
		this.housePrice = housePrice;
	}


	public BigDecimal getDeposit() {
		return deposit;
	}


	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}


	public BigDecimal getTermInYears() {
		return termInYears;
	}


	public void setTermInYears(BigDecimal termInYears) {
		this.termInYears = termInYears;
	}


	public BigDecimal getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deposit == null) ? 0 : deposit.hashCode());
		result = prime * result + ((housePrice == null) ? 0 : housePrice.hashCode());
		result = prime * result + ((interestRate == null) ? 0 : interestRate.hashCode());
		result = prime * result + ((termInYears == null) ? 0 : termInYears.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTO other = (DTO) obj;
		if (deposit == null) {
			if (other.deposit != null)
				return false;
		} else if (!deposit.equals(other.deposit))
			return false;
		if (housePrice == null) {
			if (other.housePrice != null)
				return false;
		} else if (!housePrice.equals(other.housePrice))
			return false;
		if (interestRate == null) {
			if (other.interestRate != null)
				return false;
		} else if (!interestRate.equals(other.interestRate))
			return false;
		if (termInYears == null) {
			if (other.termInYears != null)
				return false;
		} else if (!termInYears.equals(other.termInYears))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "DTO [housePrice=" + housePrice + ", deposit=" + deposit + ", termInYears=" + termInYears
				+ ", interestRate=" + interestRate + "]";
	}
	
}
