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
 * WorkGenerateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-07T20:00:02.801+01:00[Europe/Oslo]")
public class WorkGenerateResponse {
  public static final String SERIALIZED_NAME_WORK = "work";
  @SerializedName(SERIALIZED_NAME_WORK)
  private String work;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_MULTIPLIER = "multiplier";
  @SerializedName(SERIALIZED_NAME_MULTIPLIER)
  private String multiplier;


  public WorkGenerateResponse work(String work) {
    
    this.work = work;
    return this;
  }

   /**
   * Get work
   * @return work
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2bf29ef00786a6bc", value = "")

  public String getWork() {
    return work;
  }


  public void setWork(String work) {
    this.work = work;
  }


  public WorkGenerateResponse difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * @return difficulty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ffffffd21c3933f3", value = "")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public WorkGenerateResponse multiplier(String multiplier) {
    
    this.multiplier = multiplier;
    return this;
  }

   /**
   * Get multiplier
   * @return multiplier
  **/
  @javax.annotation.Nullable
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
    WorkGenerateResponse workGenerateResponse = (WorkGenerateResponse) o;
    return Objects.equals(this.work, workGenerateResponse.work) &&
        Objects.equals(this.difficulty, workGenerateResponse.difficulty) &&
        Objects.equals(this.multiplier, workGenerateResponse.multiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(work, difficulty, multiplier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkGenerateResponse {\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
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

