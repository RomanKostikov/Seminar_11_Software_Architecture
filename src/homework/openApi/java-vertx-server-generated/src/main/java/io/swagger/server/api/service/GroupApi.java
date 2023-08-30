package io.swagger.server.api.service;

import io.swagger.server.api.model.Group;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface GroupApi  {

    String WEBSERVICE_ADDRESS_GROUPAPI = "";
    String OPERATION_ID_ADDGROUP = "addGroup";
    String OPERATION_ID_DELETEGROUP = "deleteGroup";
    String OPERATION_ID_GETGROUPBYID = "getGroupById";
    String OPERATION_ID_UPDATEGROUP = "updateGroup";

    void addGroup(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void addGroup(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void deleteGroup(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getGroupById(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateGroup(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateGroup(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
