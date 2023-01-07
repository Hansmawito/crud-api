package id.kawahedukasi.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.TEXT_PLAIN)
public class UserController {
    @POST
    public String create(){
        return "SUCCES CREATE";
    }
    @GET
    public String get(){
        return "SUKSES GET";
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
