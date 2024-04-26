package dto;

public class EmpTaxDeductionDTO {
	
	String empId;
	String firstName;
	String lastName;
	long yearlySalary;
	long taxAmount;
	long cessAmount;
	
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the yearlySalary
	 */
	public long getYearlySalary() {
		return yearlySalary;
	}
	/**
	 * @param yearlySalary the yearlySalary to set
	 */
	public void setYearlySalary(long yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	/**
	 * @return the taxAmount
	 */
	public long getTaxAmount() {
		return taxAmount;
	}
	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(long taxAmount) {
		this.taxAmount = taxAmount;
	}
	/**
	 * @return the cessAmount
	 */
	public long getCessAmount() {
		return cessAmount;
	}
	/**
	 * @param cessAmount the cessAmount to set
	 */
	public void setCessAmount(long cessAmount) {
		this.cessAmount = cessAmount;
	}
	
}
