package id.kawahedukasi.controller;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/users")
@Produces(MediaType.TEXT_PLAIN)
public class UserController {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Map<String, Object> create(JsonObject request){
//        String name = (String) request.get("name");
//        String gender = (String) request.get("gende");
        return Map.of(
                "data", request

        );
    }

    @GET
    public Map<String, Object> getByNameGebderPob(@QueryParam("name") String name,
                                                  @QueryParam("gender") String gender,
                                                  @QueryParam("pob") String pob){
        return Map.of(
                "id", -99,
                "nama", name,
                "gender", gender,
                "pob",pob
        );

    }
    @GET
    @Path("/name/{name}")
    public Map<String, Object> get(@PathParam("name") String name){
        return Map.of(
                    "id", -99,
                    "nama", name,
                    "gender", ""
            );

    }
    @PUT
    public String update(){
        return "SUKSES UPDATE";

    }
    @DELETE
    public String delete(){
        return "SUKSES DELETE";
    }
}
