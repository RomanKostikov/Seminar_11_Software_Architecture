# RobotApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRobot**](RobotApi.md#addRobot) | **POST** /Robot | Добавление робота-пылесоса
[**deleteRobot**](RobotApi.md#deleteRobot) | **DELETE** /Robot/deleteById/{robotId} | Удаление робота-пылесоса по ID
[**getRobotById**](RobotApi.md#getRobotById) | **GET** /Robot/robotById/{robotId} | Поиск робота-пылесоса по ID
[**updateRobot**](RobotApi.md#updateRobot) | **PUT** /Robot | Обновление робота-пылесоса

<a name="addRobot"></a>
# **addRobot**
> Robot addRobot(body)

Добавление робота-пылесоса

Добавить робот-пылесос в базу данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Robot body = new Robot(); // Robot | Добавить робот-пылесос в базу данных
try {
    Robot result = apiInstance.addRobot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#addRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Добавить робот-пылесос в базу данных |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addRobot"></a>
# **addRobot**
> Robot addRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId)

Добавление робота-пылесоса

Добавить робот-пылесос в базу данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long id = 789L; // Long | 
String model = "model_example"; // String | 
String version = "version_example"; // String | 
Long charge = 789L; // Long | 
Long garbageContainer = 789L; // Long | 
Long robotPollution = 789L; // Long | 
Long nextService = 789L; // Long | 
String serialNumber = "serialNumber_example"; // String | 
Long ipAddress = 789L; // Long | 
Long groupId = 789L; // Long | 
try {
    Robot result = apiInstance.addRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#addRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **model** | **String**|  |
 **version** | **String**|  |
 **charge** | **Long**|  |
 **garbageContainer** | **Long**|  |
 **robotPollution** | **Long**|  |
 **nextService** | **Long**|  |
 **serialNumber** | **String**|  |
 **ipAddress** | **Long**|  |
 **groupId** | **Long**|  |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteRobot"></a>
# **deleteRobot**
> deleteRobot(robotId, robotId)

Удаление робота-пылесоса по ID

Удаление робота-пылесоса из базы данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | ID - идентификатор робота-пылесоса
String robotId = "robotId_example"; // String | 
try {
    apiInstance.deleteRobot(robotId, robotId);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#deleteRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| ID - идентификатор робота-пылесоса |
 **robotId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRobotById"></a>
# **getRobotById**
> Robot getRobotById(robotId)

Поиск робота-пылесоса по ID

Поиск робота-пылесоса в базе данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | roborID - идентификатор робота-пылесоса
try {
    Robot result = apiInstance.getRobotById(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#getRobotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| roborID - идентификатор робота-пылесоса |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateRobot"></a>
# **updateRobot**
> Robot updateRobot(body)

Обновление робота-пылесоса

Обновление данных о роботе пылесосе в базе данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Robot body = new Robot(); // Robot | Обновление данных о роботе пылесосе в базе данных
try {
    Robot result = apiInstance.updateRobot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#updateRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Обновление данных о роботе пылесосе в базе данных |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateRobot"></a>
# **updateRobot**
> Robot updateRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId)

Обновление робота-пылесоса

Обновление данных о роботе пылесосе в базе данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long id = 789L; // Long | 
String model = "model_example"; // String | 
String version = "version_example"; // String | 
Long charge = 789L; // Long | 
Long garbageContainer = 789L; // Long | 
Long robotPollution = 789L; // Long | 
Long nextService = 789L; // Long | 
String serialNumber = "serialNumber_example"; // String | 
Long ipAddress = 789L; // Long | 
Long groupId = 789L; // Long | 
try {
    Robot result = apiInstance.updateRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#updateRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **model** | **String**|  |
 **version** | **String**|  |
 **charge** | **Long**|  |
 **garbageContainer** | **Long**|  |
 **robotPollution** | **Long**|  |
 **nextService** | **Long**|  |
 **serialNumber** | **String**|  |
 **ipAddress** | **Long**|  |
 **groupId** | **Long**|  |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

