package dd.domain.model;

import java.sql.Timestamp;

/**
 * Created by dd on 2017/5/25.
 */
public class Address {
  private Integer userId;
  private Integer addressId;
  private String addressCode;
  private String addressDetail;
  private String receiver;
  private String phone;
  private String postCode;
  private String sender;
  private Type type;
  private Timestamp createTime;

  public enum Type {
    CUSTOMER, SELLER
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public String getAddressCode() {
    return addressCode;
  }

  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }

  public String getAddressDetail() {
    return addressDetail;
  }

  public void setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }
}
