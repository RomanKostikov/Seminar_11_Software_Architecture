package io.swagger.server.api.service;

import io.swagger.server.api.model.User;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface UserApi  {

    String WEBSERVICE_ADDRESS_USERAPI = "";
    String OPERATION_ID_ADDUSER = "addUser";
    String OPERATION_ID_DELETEUSER = "deleteUser";
    String OPERATION_ID_GETUSERBYID = "getUserById";
    String OPERATION_ID_UPDATEUSER = "updateUser";

    void addUser(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void addUser(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void deleteUser(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getUserById(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateUser(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
