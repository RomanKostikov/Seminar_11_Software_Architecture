package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * User
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-08-30T08:22:40.173998773Z[GMT]")



public class User   {
  private Long id = null;

  private String email = null;

  private Long passHash = null;

  private Long robotSNHash = null;

  public User id(Long id) {
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

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User passHash(Long passHash) {
    this.passHash = passHash;
    return this;
  }

  /**
   * Get passHash
   * @return passHash
   **/
    public Long getPassHash() {
    return passHash;
  }

  public void setPassHash(Long passHash) {
    this.passHash = passHash;
  }

  public User robotSNHash(Long robotSNHash) {
    this.robotSNHash = robotSNHash;
    return this;
  }

  /**
   * Get robotSNHash
   * @return robotSNHash
   **/
    public Long getRobotSNHash() {
    return robotSNHash;
  }

  public void setRobotSNHash(Long robotSNHash) {
    this.robotSNHash = robotSNHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.passHash, user.passHash) &&
        Objects.equals(this.robotSNHash, user.robotSNHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, passHash, robotSNHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passHash: ").append(toIndentedString(passHash)).append("\n");
    sb.append("    robotSNHash: ").append(toIndentedString(robotSNHash)).append("\n");
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
