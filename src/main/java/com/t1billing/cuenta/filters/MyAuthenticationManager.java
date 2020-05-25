package com.t1billing.cuenta.filters;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class MyAuthenticationManager implements AuthenticationManager {
    private static MyAuthenticationManager ourInstance = new MyAuthenticationManager();

    public static MyAuthenticationManager getInstance() {
        return ourInstance;
    }

    private MyAuthenticationManager() {
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }
}
