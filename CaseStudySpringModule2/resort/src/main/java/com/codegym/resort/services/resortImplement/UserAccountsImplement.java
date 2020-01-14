//package com.codegym.resort.services.resortImplement;
//
//import com.codegym.resort.entity.Roles;
//import com.codegym.resort.entity.UserAccounts;
//import com.codegym.resort.repository.UserAccountsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class UserAccountsImplement implements UserDetailsService {
//
//    @Autowired
//    UserAccountsRepository userAccountsRepository;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        UserAccounts userAccounts = userAccountsRepository.findByUserEmail(s);
//        if (userAccounts == null) {
//            throw new UsernameNotFoundException("User not found!");
//        }
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        Set<Roles> roles = userAccounts.getRoles();
//        for (Roles role : roles) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
//        }
//        return new User(userAccounts.getUserEmail(),userAccounts.getUserPassword(),grantedAuthorities);
//    }
//}
