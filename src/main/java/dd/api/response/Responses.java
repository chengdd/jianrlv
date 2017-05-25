package dd.api.response;

/**
 * Created by dd on 2017/5/25.
 */
public class Responses {
  public static Response successResponse(Object data) {
    return new Response(0, null, data);
  }

  public static Response errorResponse(Object data, String msg) {
    return new Response(2, msg, data);
  }

  public static Response errorResponse(String msg) {
    return new Response(2, msg, null);
  }
}
