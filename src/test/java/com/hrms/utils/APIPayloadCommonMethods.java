package com.hrms.utils;

import org.json.JSONObject;

public class APIPayloadCommonMethods {

	public static String createEmployeeBody() {

		String createEmployeeBody = "{\n" + "  \"emp_firstname\": \"syntaxFirstName\",\n"
				+ "  \"emp_lastname\": \"syntaxLastName\",\n" + "  \"emp_middle_name\": \"syntaxMiddleName\",\n"
				+ "  \"emp_gender\": \"F\",\n" + "  \"emp_birthday\": \"2000-07-11\",\n"
				+ "  \"emp_status\": \"Employee\",\n" + "  \"emp_job_title\": \"Cloud Architect\"\n" + "}";

		return createEmployeeBody;
	}

	public static String createEmployeePayload() {
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "syntaxFirstName");
		obj.put("emp_lastname", "syntaxLastName");
		obj.put("emp_middle_name", "syntaxMiddleName");
		obj.put("emp_gender", "F");
		obj.put("emp_birthday", "2000-07-11");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "Cloud Architect");
		return obj.toString();
	}

}
