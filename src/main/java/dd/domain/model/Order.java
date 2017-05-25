package dd.domain.model;

import java.sql.Timestamp;

/**
 * Created by dd on 2017/5/25.
 */
public class Order {
  private int orderId;
  private String orderNo;
  private int userId;
  private Timestamp orderTime;
  private Timestamp payTime;
  private Status status;
  private int productId;
  private int amount;
  private int price;
  private int orderMoney;
  private int payMoney;
  private Address address;

  private Timestamp createTime;
  private Timestamp updateTime;
  private int payId;

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(Timestamp orderTime) {
    this.orderTime = orderTime;
  }

  public Timestamp getPayTime() {
    return payTime;
  }

  public void setPayTime(Timestamp payTime) {
    this.payTime = payTime;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(int orderMoney) {
    this.orderMoney = orderMoney;
  }

  public int getPayMoney() {
    return payMoney;
  }

  public void setPayMoney(int payMoney) {
    this.payMoney = payMoney;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public int getPayId() {
    return payId;
  }

  public void setPayId(int payId) {
    this.payId = payId;
  }

  public enum Status {
    UN_PAIED, PAIED, CANCELED, REFUND
  }
}
