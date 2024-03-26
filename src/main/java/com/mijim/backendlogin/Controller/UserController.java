package com.mijim.backendlogin.Controller;


import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/login")
@CrossOrigin
@RestController

public class UserController {

    @PostMapping(path = "/save")
    public String SaveUsuarios(@RequestBody UserDto userDto){
        Stringid = userService.addUser(userDto);
        return id;
    }
}
