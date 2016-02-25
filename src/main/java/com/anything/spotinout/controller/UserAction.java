/*
 * This is com.anything.spotinout.controller.UserAction.java
 *
 * @author:  claud.kim
 * @email:  claud.kim81@gmail.com
 */
package com.anything.spotinout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anything.spotinout.common.vo.User;

// TODO: Auto-generated Javadoc
/**
 * The Class UserAction.
 */
@Controller
@RequestMapping("/users")
public class UserAction {

	/**
	 * Register user.
	 *
	 * @param name the name
	 * @param email the email
	 * @param password the password
	 * @param phone the phone
	 * @param birth the birth
	 * @param wifiMacAddress the wifi mac address
	 * @param bluetoothMacAddress the bluetooth mac address
	 * @param gender the gender
	 * @param timezone the timezone
	 * @return the user
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	User createUser(@RequestParam(value="name", required=true) String name,
			@RequestParam(value="email", required=true) String email,
			@RequestParam(value="password", required=true) String password,
			@RequestParam(value="phone", required=true) String phone,
			@RequestParam(value="birth", required=true) String birth,
			@RequestParam(value="wifiMacAddress", required=true) String wifiMacAddress,
			@RequestParam(value="bluetoothMacAddress", required=true) String bluetoothMacAddress,
			@RequestParam(value="gender", required=true) String gender,
			@RequestParam(value="timezone", required=true) String timezone) {

		User user = new User();
		
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setBirth(birth);
		user.setWifiMacAddress(wifiMacAddress);
		user.setBluetoothMacAddress(bluetoothMacAddress);
		user.setGender(gender);
		user.setTimezone(timezone);
		
		System.out.println(user.toString());
		//TODO: JDO

		/**
		 * http get 
		 */
		//http://localhost:8080/spotInOut/rest/json/brands/test
		return user;
	}
	
	/**
	 * Read by user id.
	 *
	 * @param userId the user id
	 * @return the string
	 */
	@RequestMapping(value = "/{userId}",method = RequestMethod.GET)
	public @ResponseBody
	String readByUserId(@PathVariable(value="userId") String userId){
		System.out.println(String.format("request : userId %s", userId));
		return "todo";
	}
	
	/**
	 * Read by phone.
	 *
	 * @param phone the phone
	 * @return the string
	 */
	@RequestMapping(value = "/phone/{phone}",method = RequestMethod.GET)
	public @ResponseBody
	String readByPhone(@PathVariable(value="phone") String phone){
		
		System.out.println(String.format("request : phone %s", phone));
		
		return "todo";
	}
	

	/**
	 * Update user info.
	 *
	 * @param userId the user id
	 * @return the string
	 */
	@RequestMapping(value = "/{userId}",method = RequestMethod.PUT)
	public @ResponseBody
	String updateUserInfo(@PathVariable(value="userId") String userId){
		
		System.out.println(String.format("request : userId %s", userId));
		
		return "todo";
	}
	
	/**
	 * Delete user info.
	 *
	 * @param userId the user id
	 * @return the string
	 */
	@RequestMapping(value = "/{userId}",method = RequestMethod.DELETE)
	public @ResponseBody
	String deleteUserInfo(@PathVariable(value="userId") String userId){
		
		System.out.println(String.format("request : userId %s", userId));
		return "todo";
	}
	
	/**
	 * Read by search criteria.
	 *
	 * @return the string
	 */
	public 
	String readBySearchCriteria(){
		
//		System.out.println(String.format("request : phone %s", phone));
		return "todo";
	}
	
}
