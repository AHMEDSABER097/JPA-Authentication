package io.fristauthentication.springsecjpa.authen;

import io.fristauthentication.springsecjpa.models.MyUserDetails;
import io.fristauthentication.springsecjpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository ;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       Optional<User> user =  userRepository.findByUsername(userName);
       user.orElseThrow(()->new UsernameNotFoundException(" this User : " +userName+ " Not Found "));
        return user.map(MyUserDetails::new).get();
    }
}
