# UserApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UserApi.md#addUser) | **POST** /User | Добавить пользователя
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /User/deleteById/{userId} | Удаление пользователя
[**getUserById**](UserApi.md#getUserById) | **GET** /User/findById/{userId} | Поиск пользователя по ID
[**updateUser**](UserApi.md#updateUser) | **PUT** /User/UpdateById/{userId} | Обновить пользвателя

<a name="addUser"></a>
# **addUser**
> User addUser(body)

Добавить пользователя

Добавить пользователя в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | Создание нового пользователя в базе
try {
    User result = apiInstance.addUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Создание нового пользователя в базе |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addUser"></a>
# **addUser**
> User addUser(id, email, passHash, robotSNHash)

Добавить пользователя

Добавить пользователя в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long id = 789L; // Long | 
String email = "email_example"; // String | 
Long passHash = 789L; // Long | 
Long robotSNHash = 789L; // Long | 
try {
    User result = apiInstance.addUser(id, email, passHash, robotSNHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **email** | **String**|  |
 **passHash** | **Long**|  |
 **robotSNHash** | **Long**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId, userId)

Удаление пользователя

Удаление пользователя и базы данных

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | ID пользователя
String userId = "userId_example"; // String | 
try {
    apiInstance.deleteUser(userId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| ID пользователя |
 **userId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId)

Поиск пользователя по ID

Поиск пользователя в базе

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | Идентификатор пользователя
try {
    User result = apiInstance.getUserById(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Идентификатор пользователя |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateUser"></a>
# **updateUser**
> User updateUser(userId)

Обновить пользвателя

Обновить пользователя в базе

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | Идентификатор пользователя
try {
    User result = apiInstance.updateUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Идентификатор пользователя |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

