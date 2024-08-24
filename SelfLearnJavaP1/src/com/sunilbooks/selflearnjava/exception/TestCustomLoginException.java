package com.sunilbooks.selflearnjava.exception;

/**
 * The {@code TestCustomLoginException} class demonstrates the usage of a custom
 * {@code LoginException}. It attempts to authenticate a user and throws a 
 * {@code LoginException} if the authentication fails.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCustomLoginException {

    public static void main(String[] args) {

        try {
            authenticate("SUNRAYS", "SUNRAYS");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Authenticates the user based on the provided login and password.
     * 
     * @param login The login ID of the user.
     * @param pwd   The password of the user.
     * @throws LoginException if the authentication fails.
     */
    public static void authenticate(String login, String pwd)
            throws LoginException {
        boolean flag = true;
        if (flag) {
            throw new LoginException();
        }
    }

}
