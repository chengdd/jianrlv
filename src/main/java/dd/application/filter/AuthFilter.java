package dd.application.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by dd on 2017/5/24.
 */
@Provider
@PreMatching
public class AuthFilter implements ContainerRequestFilter {

  private static final Logger LOGGER = LoggerFactory.getLogger(AuthFilter.class);

  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    LOGGER.info("REQUEST: {}" ,mapper.writeValueAsString(requestContext.getHeaders()));
  }
}
