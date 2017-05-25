package dd.application.filter;

import dd.api.response.Responses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by dd on 2017/5/25.
 */
public class RuntimeExceptionMapper implements ExceptionMapper<RuntimeException> {
  private static final Logger LOGGER = LoggerFactory.getLogger(RuntimeExceptionMapper.class);


  @Override
  public Response toResponse(RuntimeException exception) {

    if (exception instanceof NotFoundException) {
      LOGGER.error("", ((NotFoundException) exception).getResponse());
    } else {
      LOGGER.error("", exception);
    }

    return Response.status(200).type(MediaType.APPLICATION_JSON_TYPE)
        .entity(Responses.errorResponse(1, exception.getMessage())).build();

  }
}
