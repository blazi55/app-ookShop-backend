package com.ookshop.application.security.config;

import com.ookshop.application.tables.CompanyRole;
import com.ookshop.application.tables.User;
import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.Collections;

//@AllArgsConstructor
//public class CustomUserDetails implements UserDetails {
//
//    private User user;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singleton(new SimpleGrantedAuthority(user.getCompanyRole().getRole()));
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getFullName();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
