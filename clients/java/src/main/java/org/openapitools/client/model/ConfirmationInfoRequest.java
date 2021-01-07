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
import org.openapitools.client.model.ModelBoolean;

/**
 * ConfirmationInfoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-07T20:00:02.801+01:00[Europe/Oslo]")
public class ConfirmationInfoRequest {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    CONFIRMATION_INFO("confirmation_info");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_JSON_BLOCK = "json_block";
  @SerializedName(SERIALIZED_NAME_JSON_BLOCK)
  private ModelBoolean jsonBlock = null;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private ModelBoolean contents = null;

  public static final String SERIALIZED_NAME_REPRESENTATIVES = "representatives";
  @SerializedName(SERIALIZED_NAME_REPRESENTATIVES)
  private ModelBoolean representatives = null;


  public ConfirmationInfoRequest action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public ConfirmationInfoRequest jsonBlock(ModelBoolean jsonBlock) {
    
    this.jsonBlock = jsonBlock;
    return this;
  }

   /**
   * Defaults to &#x60;\&quot;false\&quot;&#x60;. If &#x60;\&quot;true\&quot;&#x60;, &#x60;\&quot;contents\&quot;&#x60; contains a JSON subtree instead of a JSON string.
   * @return jsonBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to `\"false\"`. If `\"true\"`, `\"contents\"` contains a JSON subtree instead of a JSON string.")

  public ModelBoolean getJsonBlock() {
    return jsonBlock;
  }


  public void setJsonBlock(ModelBoolean jsonBlock) {
    this.jsonBlock = jsonBlock;
  }


  public ConfirmationInfoRequest contents(ModelBoolean contents) {
    
    this.contents = contents;
    return this;
  }

   /**
   * Defaults to &#x60;\&quot;true\&quot;&#x60;. If &#x60;\&quot;false\&quot;&#x60;, disables contents for each block.
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to `\"true\"`. If `\"false\"`, disables contents for each block.")

  public ModelBoolean getContents() {
    return contents;
  }


  public void setContents(ModelBoolean contents) {
    this.contents = contents;
  }


  public ConfirmationInfoRequest representatives(ModelBoolean representatives) {
    
    this.representatives = representatives;
    return this;
  }

   /**
   * Defaults to &#x60;\&quot;false\&quot;&#x60;. If &#x60;\&quot;true\&quot;&#x60;, returns a list of votes representatives &amp; its weights for each block.
   * @return representatives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to `\"false\"`. If `\"true\"`, returns a list of votes representatives & its weights for each block.")

  public ModelBoolean getRepresentatives() {
    return representatives;
  }


  public void setRepresentatives(ModelBoolean representatives) {
    this.representatives = representatives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmationInfoRequest confirmationInfoRequest = (ConfirmationInfoRequest) o;
    return Objects.equals(this.action, confirmationInfoRequest.action) &&
        Objects.equals(this.jsonBlock, confirmationInfoRequest.jsonBlock) &&
        Objects.equals(this.contents, confirmationInfoRequest.contents) &&
        Objects.equals(this.representatives, confirmationInfoRequest.representatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, jsonBlock, contents, representatives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmationInfoRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    jsonBlock: ").append(toIndentedString(jsonBlock)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    representatives: ").append(toIndentedString(representatives)).append("\n");
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

