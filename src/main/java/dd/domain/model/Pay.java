package dd.domain.model;

import java.sql.Timestamp;

/**
 * Created by dd on 2017/5/25.
 */
public class Pay {
  private int payId;
  private String payNo;
  private Type payType;
  private String thirdPayNo;
  private int payMoney;
  private Timestamp payTime;
  private Timestamp createTime;

  public int getPayId() {
    return payId;
  }

  public void setPayId(int payId) {
    this.payId = payId;
  }

  public String getPayNo() {
    return payNo;
  }

  public void setPayNo(String payNo) {
    this.payNo = payNo;
  }

  public Type getPayType() {
    return payType;
  }

  public void setPayType(Type payType) {
    this.payType = payType;
  }

  public String getThirdPayNo() {
    return thirdPayNo;
  }

  public void setThirdPayNo(String thirdPayNo) {
    this.thirdPayNo = thirdPayNo;
  }

  public int getPayMoney() {
    return payMoney;
  }

  public void setPayMoney(int payMoney) {
    this.payMoney = payMoney;
  }

  public Timestamp getPayTime() {
    return payTime;
  }

  public void setPayTime(Timestamp payTime) {
    this.payTime = payTime;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public enum Type {
    WECHAT, ALIPAY
  }
}
