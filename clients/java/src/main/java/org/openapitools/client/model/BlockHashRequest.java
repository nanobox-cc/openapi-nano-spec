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
import org.openapitools.client.model.BlockDataJson;
import org.openapitools.client.model.ModelBoolean;

/**
 * BlockHashRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-07T20:00:02.801+01:00[Europe/Oslo]")
public class BlockHashRequest {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    BLOCK_INFO("block_info");

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

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private BlockDataJson block;


  public BlockHashRequest action(ActionEnum action) {
    
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


  public BlockHashRequest jsonBlock(ModelBoolean jsonBlock) {
    
    this.jsonBlock = jsonBlock;
    return this;
  }

   /**
   * Defaults to &#x60;\&quot;false\&quot;&#x60;. If &#x60;\&quot;true\&quot;&#x60;, &#x60;\&quot;block\&quot;&#x60; contains a JSON subtree instead of a JSON string.
   * @return jsonBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to `\"false\"`. If `\"true\"`, `\"block\"` contains a JSON subtree instead of a JSON string.")

  public ModelBoolean getJsonBlock() {
    return jsonBlock;
  }


  public void setJsonBlock(ModelBoolean jsonBlock) {
    this.jsonBlock = jsonBlock;
  }


  public BlockHashRequest block(BlockDataJson block) {
    
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(required = true, value = "")

  public BlockDataJson getBlock() {
    return block;
  }


  public void setBlock(BlockDataJson block) {
    this.block = block;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockHashRequest blockHashRequest = (BlockHashRequest) o;
    return Objects.equals(this.action, blockHashRequest.action) &&
        Objects.equals(this.jsonBlock, blockHashRequest.jsonBlock) &&
        Objects.equals(this.block, blockHashRequest.block);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, jsonBlock, block);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockHashRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    jsonBlock: ").append(toIndentedString(jsonBlock)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
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

