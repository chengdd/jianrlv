package dd.api.resource;

import dd.api.response.Response;
import dd.api.response.Responses;
import dd.domain.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by dd on 2017/5/25.
 */
@Path("/user")
public class UserResource {

  private UserService userService;

  public UserResource(UserService userService) {
    this.userService = userService;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{user_id}")
  public Response user(@PathParam("user_id") int userId) {
    return Responses.successResponse(userService.getUser(userId));
  }
}
