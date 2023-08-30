package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Schedule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-08-30T08:22:40.173998773Z[GMT]")



public class Schedule   {
  private Long id = null;

  private String dateTime = null;

  private Long mode = null;

  private Long robotId = null;

  public Schedule id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Schedule dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   **/
    public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public Schedule mode(Long mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   **/
    public Long getMode() {
    return mode;
  }

  public void setMode(Long mode) {
    this.mode = mode;
  }

  public Schedule robotId(Long robotId) {
    this.robotId = robotId;
    return this;
  }

  /**
   * Get robotId
   * @return robotId
   **/
    public Long getRobotId() {
    return robotId;
  }

  public void setRobotId(Long robotId) {
    this.robotId = robotId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.id, schedule.id) &&
        Objects.equals(this.dateTime, schedule.dateTime) &&
        Objects.equals(this.mode, schedule.mode) &&
        Objects.equals(this.robotId, schedule.robotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateTime, mode, robotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
