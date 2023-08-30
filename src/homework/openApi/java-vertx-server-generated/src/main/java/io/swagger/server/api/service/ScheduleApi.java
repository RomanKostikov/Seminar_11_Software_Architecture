package io.swagger.server.api.service;

import io.swagger.server.api.model.Schedule;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface ScheduleApi  {

    String WEBSERVICE_ADDRESS_SCHEDULEAPI = "";
    String OPERATION_ID_ADDSCHEDULE = "addSchedule";
    String OPERATION_ID_DELETESCHEDULE = "deleteSchedule";
    String OPERATION_ID_GETSCHEDULEBYID = "getScheduleById";
    String OPERATION_ID_UPDATESCHEDULE = "updateSchedule";

    void addSchedule(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void addSchedule(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void deleteSchedule(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getScheduleById(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateSchedule(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateSchedule(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
