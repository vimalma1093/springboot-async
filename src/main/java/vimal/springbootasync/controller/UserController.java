package vimal.springbootasync.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vimal.springbootasync.model.UserDto;
import vimal.springbootasync.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final static Logger LOG = LoggerFactory.getLogger(UserController.class);


    @Autowired
    UserService userService;

    @PostMapping("/create")
    public UserDto create(@RequestBody UserDto user) {
       return userService.createUser(user);
    }

    @GetMapping("/id/{id}")
    @ResponseBody
    public UserDto getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/name/{firstName}")
    @ResponseBody
    public List<UserDto> getUserByName(@PathVariable String firstName) {
        return userService.getUserByName(firstName);
    }
}
