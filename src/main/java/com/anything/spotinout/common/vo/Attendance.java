/*
 * This is com.anything.spotinout.common.vo.Attendance.java
 *
 * @author:  claud.kim
 * @email:  claud.kim81@gmail.com
 */
package com.anything.spotinout.common.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Attendance.
 */
public class Attendance {
	
	/** The spot id. */
	private int spotId;
	
	/** The user id. */
	private int userId;
	
	/** The attendance type. */
	private String attendanceType;
	
	
	
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
	 * Gets the attendance type.
	 *
	 * @return the attendance type
	 */
	public String getAttendanceType() {
		return attendanceType;
	}



	/**
	 * Sets the attendance type.
	 *
	 * @param attendanceType the new attendance type
	 */
	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
}
