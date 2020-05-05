/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.users;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Melissa
 */
@ApplicationScoped
public class UserStore {
    
    private Map<Long,User> users = new HashMap<>();
    
    @PostConstruct
    public void Start (){
        Stream.of(new User (1l,"melissa","melpsw"),new User(2l,"chloe","chloepsw"), new User (3l,"massimo","machopsw")).
                forEach(v->users.put(v.getId(), v));
    }
    
    public Collection<User> all(){
        return users.values();
    } 
    
    public User create (User u){
        System.out.println("Create User"+ u);
        users.putIfAbsent(u.getId(), u);
        return users.get(u.getId());
      
    }
    
    public User UpDate(User u){
        System.out.println("UpDate User"+ u);
        return users.put(u.getId(),u);
    }
      
    public void delete (Long id){
        System.out.println("delete user"+id);
        users.remove(id);
    }
    
    
        
    
    
}
