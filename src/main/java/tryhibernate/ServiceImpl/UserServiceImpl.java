package tryhibernate.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tryhibernate.Entity.User;
import tryhibernate.Repository.UserRepository;
import tryhibernate.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return new User();
    }

    public User findByName(String username){
        return new User();
    }

}
