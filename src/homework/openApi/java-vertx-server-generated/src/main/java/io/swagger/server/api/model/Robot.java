package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Robot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-08-30T08:22:40.173998773Z[GMT]")



public class Robot   {
  private Long id = null;

  private String model = null;

  private String version = null;

  private Long charge = null;

  private Long garbageContainer = null;

  private Long robotPollution = null;

  private Long nextService = null;

  private String serialNumber = null;

  private Long ipAddress = null;

  private Long groupId = null;

  public Robot id(Long id) {
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

  public Robot model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Robot version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Robot charge(Long charge) {
    this.charge = charge;
    return this;
  }

  /**
   * Get charge
   * @return charge
   **/
    public Long getCharge() {
    return charge;
  }

  public void setCharge(Long charge) {
    this.charge = charge;
  }

  public Robot garbageContainer(Long garbageContainer) {
    this.garbageContainer = garbageContainer;
    return this;
  }

  /**
   * Get garbageContainer
   * @return garbageContainer
   **/
    public Long getGarbageContainer() {
    return garbageContainer;
  }

  public void setGarbageContainer(Long garbageContainer) {
    this.garbageContainer = garbageContainer;
  }

  public Robot robotPollution(Long robotPollution) {
    this.robotPollution = robotPollution;
    return this;
  }

  /**
   * Get robotPollution
   * @return robotPollution
   **/
    public Long getRobotPollution() {
    return robotPollution;
  }

  public void setRobotPollution(Long robotPollution) {
    this.robotPollution = robotPollution;
  }

  public Robot nextService(Long nextService) {
    this.nextService = nextService;
    return this;
  }

  /**
   * Get nextService
   * @return nextService
   **/
    public Long getNextService() {
    return nextService;
  }

  public void setNextService(Long nextService) {
    this.nextService = nextService;
  }

  public Robot serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   **/
    public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Robot ipAddress(Long ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
   **/
    public Long getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(Long ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Robot groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   **/
    public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Robot robot = (Robot) o;
    return Objects.equals(this.id, robot.id) &&
        Objects.equals(this.model, robot.model) &&
        Objects.equals(this.version, robot.version) &&
        Objects.equals(this.charge, robot.charge) &&
        Objects.equals(this.garbageContainer, robot.garbageContainer) &&
        Objects.equals(this.robotPollution, robot.robotPollution) &&
        Objects.equals(this.nextService, robot.nextService) &&
        Objects.equals(this.serialNumber, robot.serialNumber) &&
        Objects.equals(this.ipAddress, robot.ipAddress) &&
        Objects.equals(this.groupId, robot.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Robot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    garbageContainer: ").append(toIndentedString(garbageContainer)).append("\n");
    sb.append("    robotPollution: ").append(toIndentedString(robotPollution)).append("\n");
    sb.append("    nextService: ").append(toIndentedString(nextService)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
