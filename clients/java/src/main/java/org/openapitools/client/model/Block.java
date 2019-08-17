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
import java.math.BigDecimal;
import org.openapitools.client.model.BlockState;

/**
 * Block
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-17T13:51:05.488+02:00[Europe/Oslo]")
public class Block {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BlockState type;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_LOCAL_TIMESTAMP = "local_timestamp";
  @SerializedName(SERIALIZED_NAME_LOCAL_TIMESTAMP)
  private String localTimestamp;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public Block type(BlockState type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public BlockState getType() {
    return type;
  }

  public void setType(BlockState type) {
    this.type = type;
  }

  public Block account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(example = "nano_1hzoje373eapce4ses7xsx539suww5555hi9q8i8j7hpbayzxq4c4nn91hr8", value = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Block amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 1 raw is the smallest possible division and NANO/Nano (Mnano) is the current standard division used in most wallets, on exchanges, etc.
   * @return amount
  **/
  @ApiModelProperty(example = "1000000000000000000000000000000", value = "1 raw is the smallest possible division and NANO/Nano (Mnano) is the current standard division used in most wallets, on exchanges, etc.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Block localTimestamp(String localTimestamp) {
    this.localTimestamp = localTimestamp;
    return this;
  }

   /**
   * Get localTimestamp
   * @return localTimestamp
  **/
  @ApiModelProperty(example = "1551532723", value = "")
  public String getLocalTimestamp() {
    return localTimestamp;
  }

  public void setLocalTimestamp(String localTimestamp) {
    this.localTimestamp = localTimestamp;
  }

  public Block height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "60", value = "")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public Block hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "8D3AB98B301224253750D448B4BD997132400CEDD0A8432F775724F2D9821C72", value = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.type, block.type) &&
        Objects.equals(this.account, block.account) &&
        Objects.equals(this.amount, block.amount) &&
        Objects.equals(this.localTimestamp, block.localTimestamp) &&
        Objects.equals(this.height, block.height) &&
        Objects.equals(this.hash, block.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, account, amount, localTimestamp, height, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    localTimestamp: ").append(toIndentedString(localTimestamp)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

