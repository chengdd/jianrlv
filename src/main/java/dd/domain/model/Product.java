package dd.domain.model;

import com.google.common.collect.Lists;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dd on 2017/5/25.
 */
public class Product {

  private int productId;
  private String name;
  private String nameCn;
  private String description;
  private int price;
  private Timestamp upTime;
  private Timestamp downTime;
  private Unit unit;
  private Status status;
  private List<Integer> addresses = Lists.newArrayList();
  private Timestamp createTime;

  public enum Unit {
    GE("个"), JIAN("件");
    private String name;

    Unit(String name) {
      this.name = name;
    }
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }

  public List<Integer> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Integer> addresses) {
    this.addresses = addresses;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameCn() {
    return nameCn;
  }

  public void setNameCn(String nameCn) {
    this.nameCn = nameCn;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Timestamp getUpTime() {
    return upTime;
  }

  public void setUpTime(Timestamp upTime) {
    this.upTime = upTime;
  }

  public Timestamp getDownTime() {
    return downTime;
  }

  public void setDownTime(Timestamp downTime) {
    this.downTime = downTime;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public enum Status {
    PREPARE_SALE, SAILING, SOLD_OUT
  }

}
