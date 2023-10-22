package dio.apipub.service;

import dio.apipub.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
