# swagger_client.ScheduleApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_schedule**](ScheduleApi.md#add_schedule) | **POST** /Schedule | Добавление расписания
[**delete_schedule**](ScheduleApi.md#delete_schedule) | **DELETE** /Schedule/deleteById/{Id} | Удаление расписания по ID
[**get_schedule_by_id**](ScheduleApi.md#get_schedule_by_id) | **GET** /Schedule/findById/{Id} | Поиск расписания по ID
[**update_schedule**](ScheduleApi.md#update_schedule) | **PUT** /Schedule | Обновление расписания уборки

# **add_schedule**
> Schedule add_schedule(body)

Добавление расписания

Добавление расписания в базу данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
body = swagger_client.Schedule() # Schedule | Добавление расписания в базу данных

try:
    # Добавление расписания
    api_response = api_instance.add_schedule(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->add_schedule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Добавление расписания в базу данных | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_schedule**
> delete_schedule(id, id=id)

Удаление расписания по ID

Удаление расписания из базы данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
id = 789 # int | ID - идентификатор расписания
id = 'id_example' # str |  (optional)

try:
    # Удаление расписания по ID
    api_instance.delete_schedule(id, id=id)
except ApiException as e:
    print("Exception when calling ScheduleApi->delete_schedule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID - идентификатор расписания | 
 **id** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedule_by_id**
> Schedule get_schedule_by_id(id)

Поиск расписания по ID

Поиск расписания в базе данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
id = 789 # int | ID - идентификатор пользователя

try:
    # Поиск расписания по ID
    api_response = api_instance.get_schedule_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->get_schedule_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID - идентификатор пользователя | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_schedule**
> Schedule update_schedule(body)

Обновление расписания уборки

Обновление расписания в базе данных

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
body = swagger_client.Schedule() # Schedule | Обновление расписания в базе данных

try:
    # Обновление расписания уборки
    api_response = api_instance.update_schedule(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->update_schedule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Обновление расписания в базе данных | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

