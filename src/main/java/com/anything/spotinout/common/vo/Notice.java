/*
 * This is com.anything.spotinout.common.vo.Notice.java
 *
 * @author:  claud.kim
 * @email:  claud.kim81@gmail.com
 */
package com.anything.spotinout.common.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Notice.
 */
public class Notice {

	/** The spot id. */
	private int spotId;
	
	/** The user admin id. */
	private int userAdminId;
	
	/** The message id. */
	private String messageId;
	
	/** The title. */
	private String title;
	
	/** The message. */
	private String message;
	
	/** The regiter time. */
	private String regiterTime;
	
	/** The mdfy time. */
	private String mdfyTime;
	
	/**
	 * Gets the spot id.
	 *
	 * @return the spot id
	 */
	public int getSpotId() {
		return spotId;
	}
	
	/**
	 * Sets the spot id.
	 *
	 * @param spotId the new spot id
	 */
	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}
	
	/**
	 * Gets the user admin id.
	 *
	 * @return the user admin id
	 */
	public int getUserAdminId() {
		return userAdminId;
	}
	
	/**
	 * Sets the user admin id.
	 *
	 * @param userAdminId the new user admin id
	 */
	public void setUserAdminId(int userAdminId) {
		this.userAdminId = userAdminId;
	}
	
	/**
	 * Gets the message id.
	 *
	 * @return the message id
	 */
	public String getMessageId() {
		return messageId;
	}
	
	/**
	 * Sets the message id.
	 *
	 * @param messageId the new message id
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * Gets the regiter time.
	 *
	 * @return the regiter time
	 */
	public String getRegiterTime() {
		return regiterTime;
	}
	
	/**
	 * Sets the regiter time.
	 *
	 * @param regiterTime the new regiter time
	 */
	public void setRegiterTime(String regiterTime) {
		this.regiterTime = regiterTime;
	}
	
	/**
	 * Gets the mdfy time.
	 *
	 * @return the mdfy time
	 */
	public String getMdfyTime() {
		return mdfyTime;
	}
	
	/**
	 * Sets the mdfy time.
	 *
	 * @param mdfyTime the new mdfy time
	 */
	public void setMdfyTime(String mdfyTime) {
		this.mdfyTime = mdfyTime;
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
