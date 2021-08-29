package edu.escuelaing.ieti.controller;
import edu.escuelaing.ieti.document.User;
import edu.escuelaing.ieti.dto.UserDto;
import edu.escuelaing.ieti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
public class UserController {
    private final UserService userService;
    public UserController( @Autowired UserService userService ) {
        this.userService = userService;
    }
    @PostMapping
    public User createUser( @RequestBody UserDto userDto ) {
        return userService.create( new User( userDto ) );
    }
    @GetMapping( "/{id}" )
    public User findUserById( @PathVariable String id ) {
        return userService.findById( id );
    }
    @DeleteMapping( "/{id}" )
    public boolean deleteUserById( @PathVariable String id ) {
        return userService.deleteById( id );
    }
    @PutMapping( "/{id}" )
    public User updateUserById( @RequestBody UserDto userDto, @PathVariable String id ) {
        return userService.updateById( userDto, id );
    }
}