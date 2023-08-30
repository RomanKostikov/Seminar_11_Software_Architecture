package io.swagger.server.api.service;

import io.swagger.server.api.model.Robot;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface RobotApi  {

    String WEBSERVICE_ADDRESS_ROBOTAPI = "";
    String OPERATION_ID_ADDROBOT = "addRobot";
    String OPERATION_ID_DELETEROBOT = "deleteRobot";
    String OPERATION_ID_GETROBOTBYID = "getRobotById";
    String OPERATION_ID_UPDATEROBOT = "updateRobot";

    void addRobot(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void addRobot(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void deleteRobot(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getRobotById(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateRobot(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateRobot(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
