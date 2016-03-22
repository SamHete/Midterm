package com.cisc181.core;
import java.util.*;
import java.util.regex.Pattern;
public class PersonException extends Exception {
	private Person person;
	private Date DOB;
	private String phone_number;
	
	/**
	 * @param person
	 * creates instance of person, thrown to caller
	 */
	public PersonException(Person person){
		this.person = person;
	}

	public PersonException(PersonException PersonException) {
		super();
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}
	/**
	 * @param dOB
	 * @throws PersonException
	 * throws exception if the DOB given is more than 100 years older than the current date
	 */
	public void setDOB(Date dOB) throws PersonException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 100);
		if(calendar.getTime().before(DOB)){
			throw new PersonException(this);
		}
		this.DOB = dOB;
	}
	/**
	 * @return the phone number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number
	 * @throws PersonException
	 * throws exception if the phone number isn’t formatted (###)-###-#### 
	 */
	public void setPhone_number(String phone_number) throws PersonException {
		Pattern pattern = Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");
		if(!pattern.matcher(phone_number).matches()){
			throw new PersonException(this);
		}
		this.phone_number = phone_number;
	}
}