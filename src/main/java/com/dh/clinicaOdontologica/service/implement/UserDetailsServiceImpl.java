package com.dh.clinicaOdontologica.service.implement;

import com.dh.clinicaOdontologica.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IUserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        User appUser = userRepository.getUserByName(username);
//
//        List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
//
//        for (Rol rol: appUser.getRoles()){
//            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(rol.toString());
//            grantedAuthorityList.add(grantedAuthority);
//        }
//
//        UserDetails user = null;
//        user = (UserDetails) new User(username, "{noop}" + appUser.getPassword(), grantedAuthorityList);

        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Nombre de usuario no encontrado"));
    }
}
