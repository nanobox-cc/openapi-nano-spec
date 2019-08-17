/*
 * nano-rpc-api
 * API specification for the [Nano Node RPC API](https://docs.nano.org/commands/rpc-protocol) 
 *
 * The version of the OpenAPI document: 19.0.0-alpha
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ActiveDifficultyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-17T13:51:05.488+02:00[Europe/Oslo]")
public class ActiveDifficultyResponse {
  public static final String SERIALIZED_NAME_NETWORK_MINIMUM = "network_minimum";
  @SerializedName(SERIALIZED_NAME_NETWORK_MINIMUM)
  private String networkMinimum;

  public static final String SERIALIZED_NAME_NETWORK_CURRENT = "network_current";
  @SerializedName(SERIALIZED_NAME_NETWORK_CURRENT)
  private String networkCurrent;

  public static final String SERIALIZED_NAME_MULTIPLIER = "multiplier";
  @SerializedName(SERIALIZED_NAME_MULTIPLIER)
  private String multiplier;

  public ActiveDifficultyResponse networkMinimum(String networkMinimum) {
    this.networkMinimum = networkMinimum;
    return this;
  }

   /**
   * Get networkMinimum
   * @return networkMinimum
  **/
  @ApiModelProperty(example = "2bf29ef00786a6bc", value = "")
  public String getNetworkMinimum() {
    return networkMinimum;
  }

  public void setNetworkMinimum(String networkMinimum) {
    this.networkMinimum = networkMinimum;
  }

  public ActiveDifficultyResponse networkCurrent(String networkCurrent) {
    this.networkCurrent = networkCurrent;
    return this;
  }

   /**
   * Get networkCurrent
   * @return networkCurrent
  **/
  @ApiModelProperty(example = "2bf29ef00786a6bc", value = "")
  public String getNetworkCurrent() {
    return networkCurrent;
  }

  public void setNetworkCurrent(String networkCurrent) {
    this.networkCurrent = networkCurrent;
  }

  public ActiveDifficultyResponse multiplier(String multiplier) {
    this.multiplier = multiplier;
    return this;
  }

   /**
   * Get multiplier
   * @return multiplier
  **/
  @ApiModelProperty(example = "1.273557846739298", value = "")
  public String getMultiplier() {
    return multiplier;
  }

  public void setMultiplier(String multiplier) {
    this.multiplier = multiplier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDifficultyResponse activeDifficultyResponse = (ActiveDifficultyResponse) o;
    return Objects.equals(this.networkMinimum, activeDifficultyResponse.networkMinimum) &&
        Objects.equals(this.networkCurrent, activeDifficultyResponse.networkCurrent) &&
        Objects.equals(this.multiplier, activeDifficultyResponse.multiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkMinimum, networkCurrent, multiplier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDifficultyResponse {\n");
    sb.append("    networkMinimum: ").append(toIndentedString(networkMinimum)).append("\n");
    sb.append("    networkCurrent: ").append(toIndentedString(networkCurrent)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
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

