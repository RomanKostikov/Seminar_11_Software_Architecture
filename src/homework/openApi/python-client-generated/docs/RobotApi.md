# swagger_client.RobotApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_robot**](RobotApi.md#add_robot) | **POST** /Robot | Добавление робота-пылесоса
[**delete_robot**](RobotApi.md#delete_robot) | **DELETE** /Robot/deleteById/{robotId} | Удаление робота-пылесоса по ID
[**get_robot_by_id**](RobotApi.md#get_robot_by_id) | **GET** /Robot/robotById/{robotId} | Поиск робота-пылесоса по ID
[**update_robot**](RobotApi.md#update_robot) | **PUT** /Robot | Обновление робота-пылесоса

# **add_robot**
> Robot add_robot(body)

Добавление робота-пылесоса

Добавить робот-пылесос в базу данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
body = swagger_client.Robot() # Robot | Добавить робот-пылесос в базу данных

try:
    # Добавление робота-пылесоса
    api_response = api_instance.add_robot(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RobotApi->add_robot: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_robot**
> delete_robot(robot_id, robot_id=robot_id)

Удаление робота-пылесоса по ID

Удаление робота-пылесоса из базы данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
robot_id = 789 # int | ID - идентификатор робота-пылесоса
robot_id = 'robot_id_example' # str |  (optional)

try:
    # Удаление робота-пылесоса по ID
    api_instance.delete_robot(robot_id, robot_id=robot_id)
except ApiException as e:
    print("Exception when calling RobotApi->delete_robot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robot_id** | **int**| ID - идентификатор робота-пылесоса | 
 **robot_id** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_robot_by_id**
> Robot get_robot_by_id(robot_id)

Поиск робота-пылесоса по ID

Поиск робота-пылесоса в базе данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
robot_id = 789 # int | roborID - идентификатор робота-пылесоса

try:
    # Поиск робота-пылесоса по ID
    api_response = api_instance.get_robot_by_id(robot_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RobotApi->get_robot_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robot_id** | **int**| roborID - идентификатор робота-пылесоса | 

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_robot**
> Robot update_robot(body)

Обновление робота-пылесоса

Обновление данных о роботе пылесосе в базе данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
body = swagger_client.Robot() # Robot | Обновление данных о роботе пылесосе в базе данных

try:
    # Обновление робота-пылесоса
    api_response = api_instance.update_robot(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RobotApi->update_robot: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

