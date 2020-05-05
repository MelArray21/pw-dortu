/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.users;

import java.util.Collection;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Melissa
 */
@Path("users")


public class UsersResources {
    @Inject
    UserStore store;
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public Collection <User> all (){
    return store.all();
}
    
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces (MediaType.APPLICATION_JSON)
   public User create (User u){
        User saved= store.create(u);
        return saved;
   }


@PUT
@Path("{id}")
@Consumes (MediaType.APPLICATION_JSON)
public User UpDate (@PathParam ("id") Long id,User u){
    if(u.getId()== null|| !u.getId().equals(id)){
        throw new IllegalArgumentException("risorsa con id non valido");
    }
   return store.UpDate(u);
}


}

