package com.helloIftekhar.springJwt.service;

import com.helloIftekhar.springJwt.model.User;
import com.helloIftekhar.springJwt.repository.UserRepository;

import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    private final UserRepository repository;

    public UserDetailsServiceImp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }
    
//    @Override
//	@Transactional
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = repository.findByEmployeeId(username)
//				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
//		return new org.springframework.security.core.userdetails.User(user.getEmployeeId(), user.getPassword(),getAuorities(user));
//	}
//    private  Collection<? extends GrantedAuthority> getAuorities(User user) {
//		List<GrantedAuthority> authorities = user.getRole().stream()
//				.map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());
//		return authorities;
//	}
    }
