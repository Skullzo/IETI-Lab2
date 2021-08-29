package edu.escuelaing.ieti.service;
import java.util.List;
public class UserServiceMongoDB implements UserService {
    private final UserRepository userRepository; 
    public UserServiceMongoDB(@Autowired UserRepository userRepository ) {
        this.userRepository = userRepository;
    }   
    @Override
    public User create( User user ) {
        return null;
    }
    @Override
    public User findById( String id ) {
        return null;
    }
    @Override
    public List<User> all() {
        return null;
    } 
    @Override
    public boolean deleteById( String id ) {
        return false;
    } 
    @Override
    public User update( UserDto userDto, String id ) {
        return null;
    }
}