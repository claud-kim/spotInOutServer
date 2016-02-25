/*
 * This is com.anything.spotinout.common.vo.SpotPoint.java
 *
 * @author:  claud.kim
 * @email:  claud.kim81@gmail.com
 */
package com.anything.spotinout.common.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class SpotPoint.
 */
public class SpotPoint {
	
	/** The spot id. */
	private int spotId;
	
	/** The spot name. */
	private String spotName;
	
	/** The wifi mac address. */
	private String wifiMacAddress;
	
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
	 * Gets the spot name.
	 *
	 * @return the spot name
	 */
	public String getSpotName() {
		return spotName;
	}
	
	/**
	 * Sets the spot name.
	 *
	 * @param spotName the new spot name
	 */
	public void setSpotName(String spotName) {
		this.spotName = spotName;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{ 
	    return ToStringBuilder.reflectionToString(this); 
	}
}
