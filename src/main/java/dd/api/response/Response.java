package dd.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dd on 2017/5/25.
 */
public class Response {

  @JsonProperty("errno")
  private int errNo;
  @JsonProperty("err_msg")
  private String errMsg;
  private Object data;

  public Response(int errNo, String errMsg, Object data) {
    this.errNo = errNo;
    this.errMsg = errMsg;
    this.data = data;
  }

  public int getErrNo() {
    return errNo;
  }

  public String getErrMsg() {
    return errMsg;
  }

  public Object getData() {
    return data;
  }
}
