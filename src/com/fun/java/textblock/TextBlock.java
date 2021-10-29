package com.fun.java.textblock;

public class TextBlock {
    public static void main(String[] args) {
        System.out.println(getSampleEmployeeData(false));
        System.out.println(getSampleEmployeeData(true));
    }

    private static String getSampleEmployeeData(boolean useTextBlockFeature) {

        //This is what we are all familiar with, before Java 15 and "Text Blocks"
        var employeeTwentyThreeData = "{\n" +
                "    \"status\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"id\": 23,\n" +
                "        \"employee_name\": \"Caesar Vance\",\n" +
                "        \"employee_salary\": 106450,\n" +
                "        \"employee_age\": 21,\n" +
                "        \"profile_image\": \"\"\n" +
                "    },\n" +
                "    \"message\": \"Successfully! Record has been fetched.\"\n" +
                "}";


        var employeeOneData ="""
                                {
                                    "status": "success",
                                    "data": {
                                        "id": 1,
                                        "employee_name": "Tiger Nixon",
                                        "employee_salary": 320800,
                                        "employee_age": 61,
                                        "profile_image": ""
                                    },
                                    "message": "Successfully! Record has been fetched."
                                }
                                """;

        return useTextBlockFeature ? employeeOneData : employeeTwentyThreeData;
    }
}
