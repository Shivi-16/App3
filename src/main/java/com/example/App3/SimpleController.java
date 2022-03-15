package com.example.App3;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//Because of RestController this class will be responsible for handling requests
public class SimpleController {

    DBUser db = new DBUser();
    //http://localhost:8080/hi
    @GetMapping("/hi")
    public String sayHi(){
        return "Hello from Server";
    }

    //http://localhost:8080/Search?s=sachin
    @GetMapping("/Search")
    public String searchAword(@RequestParam String s)
    {
        return "A great Batsman";
    }


    //http://localhost:8080/users
   // @GetMapping("/users")
  //  public List<User> getALLUsers()
    //{
      //  return db.getAllUsers();
    //}
    //http://localhost:8080/users/2
    @GetMapping("/users/{id}")
    public User getAUser(@PathVariable int id)
    {
        return db.getAUser(id);
    }

    @GetMapping("/users/name")
    public User getbyname( @RequestParam String q)
    {
        return db.getByname(q);
    }

    //http://localhost:8080/users ----in Post Section of Postman
    @PostMapping("/users")
    public User createUser( @RequestBody User user)
    {
        return db.addUser(user);
    }

    //https://localhost:8080/users/1  ---Deleting User with User Id: 1
    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable int id)
    {
        return db.deleteAuser(id);
    }

}
