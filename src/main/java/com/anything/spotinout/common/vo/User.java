/**
 * This is com.anything.spotinout.common.vo.User.java
 *
 * @author:  claud.kim
 * @email:  claud.kim81@gmail.com
 */
package com.anything.spotinout.common.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
 // TODO: Auto-generated Javadoc

 /**
  * The Class User.
  */
 //TODO: JDO
public class User {
	
	/** The user id. */
	private int userId;
	
	/** The name. */
	private String name;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The phone. */
	private String phone;
	
	/** The birth. */
	private String birth;
	
	/** The wifi mac address. */
	private String wifiMacAddress;
	
	private String bluetoothMacAddress;
	
	/** The gender. */
	private String gender;
	
	/** The timezone. */
	private String timezone;
	
	
	
	
	public String getBluetoothMacAddress() {
		return bluetoothMacAddress;
	}

	public void setBluetoothMacAddress(String bluetoothMacAddress) {
		this.bluetoothMacAddress = bluetoothMacAddress;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Gets the birth.
	 *
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}
	
	/**
	 * Sets the birth.
	 *
	 * @param birth the new birth
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	/**
	 * Gets the wifi mac address.
	 *
	 * @return the wifi mac address
	 */
	public String getWifiMacAddress() {
		return wifiMacAddress;
	}
	
	/**
	 * Sets the wifi mac address.
	 *
	 * @param wifiMacAddress the new wifi mac address
	 */
	public void setWifiMacAddress(String wifiMacAddress) {
		this.wifiMacAddress = wifiMacAddress;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the timezone.
	 *
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}
	
	/**
	 * Sets the timezone.
	 *
	 * @param timezone the new timezone
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}


	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{ 
	    return ToStringBuilder.reflectionToString(this); 
	}
}
