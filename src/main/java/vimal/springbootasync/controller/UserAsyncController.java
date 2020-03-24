package vimal.springbootasync.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import vimal.springbootasync.model.UserDto;
import vimal.springbootasync.service.UserService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("userAsync")
public class UserAsyncController {

    private final static Logger LOG = LoggerFactory.getLogger(UserAsyncController.class);

    @Autowired
    UserService userService;

    @GetMapping("/name/{firstName}")
    @ResponseBody
    public CompletableFuture<List<UserDto>> getUserByName(@PathVariable String firstName) {
        return userService.getUserByNameAsync(firstName);
    }
}
