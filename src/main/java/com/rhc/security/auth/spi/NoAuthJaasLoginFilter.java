package com.rhc.security.auth.spi;

import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

/**
 * 
 * @author bradsdavis@gmail.com
 *
 */
public class NoAuthJaasLoginFilter implements LoginModule {

	public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
		//noop
	}

	public boolean login() throws LoginException {
		return true;
	}

	public boolean commit() throws LoginException {
		return true;
	}

	public boolean abort() throws LoginException {
		return true;
	}

	public boolean logout() throws LoginException {
		return true;
	}

}
