package com.SJPLIB.apis.booksws.user;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    //private User user = null;

    public UserService() {

        /*user = new User("myusername", "$2y$12$4bavRcFDK8vjIUweLwetZuxnsBGcQqETtoX866/Ztli9Xjsc8PHbm",
                true);*/
    }

    public User getUserByUsername(String username) {

        Optional<User> optionalUser = UserRepository.findByUsername(username);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }
}
