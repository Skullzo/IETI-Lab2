package edu.escuelaing.ieti.service;
import edu.escuelaing.ieti.document.User;
import edu.escuelaing.ieti.dto.UserDto;
public interface UserService
{
    
    User create( User user );

    User updateById( UserDto userDto, String id );

    boolean deleteById( String id );

    User findById( String id );

}