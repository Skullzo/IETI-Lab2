package edu.escuelaing.ieti.service;
import edu.escuelaing.ieti.document.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class UserServiceHashMap implements UserService{
    private final HashMap<String, User> usersHashMap = new HashMap();
    @Override
    public User create(User user) {
        return usersHashMap.put(user.getId(), user);
    }
    @Override
    public User findById(String id) {
        User user = usersHashMap.get(id);
        return user;
    }
    @Override
    public List<User> all() {
        return new ArrayList<User>(usersHashMap.values());
    }
    @Override
    public void deleteById(String id) {
        usersHashMap.remove(id);
    }
    @Override
    public User update(User user, String userId) {
        return usersHashMap.put(userId, user);
    }
}