package tryhibernate.Service;

import tryhibernate.Entity.User;

public interface UserService {

    User findById(Long id);

    User findByName(String username);

}
