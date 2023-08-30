# swagger_client.GroupApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_group**](GroupApi.md#add_group) | **POST** /Group | Добавление группы
[**delete_group**](GroupApi.md#delete_group) | **DELETE** /Group/deleteById/{groupId} | Удаление группы по ID
[**get_group_by_id**](GroupApi.md#get_group_by_id) | **GET** /Group/findById/{groupId} | Поиск группы по ID
[**update_group**](GroupApi.md#update_group) | **PUT** /Group | Обновление группы пользователей

# **add_group**
> Group add_group(body)

Добавление группы

Добавление группы в базу данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
body = swagger_client.Group() # Group | Добавление группы в базу данных

try:
    # Добавление группы
    api_response = api_instance.add_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupApi->add_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Добавление группы в базу данных | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_group**
> delete_group(group_id, group_id=group_id)

Удаление группы по ID

Удаление группы в базе данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
group_id = 789 # int | ID - идентификатор группы
group_id = 'group_id_example' # str |  (optional)

try:
    # Удаление группы по ID
    api_instance.delete_group(group_id, group_id=group_id)
except ApiException as e:
    print("Exception when calling GroupApi->delete_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **int**| ID - идентификатор группы | 
 **group_id** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_group_by_id**
> Group get_group_by_id(group_id)

Поиск группы по ID

Поиск группы в базе данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
group_id = 789 # int | Поиск группы

try:
    # Поиск группы по ID
    api_response = api_instance.get_group_by_id(group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupApi->get_group_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **int**| Поиск группы | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_group**
> Group update_group(body)

Обновление группы пользователей

Обновить группу пользователей

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
body = swagger_client.Group() # Group | Обновление группы

try:
    # Обновление группы пользователей
    api_response = api_instance.update_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupApi->update_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Обновление группы | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

