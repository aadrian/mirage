package com.miragesql.miragesql.exception;

/**
 * Exception thrown when the Mirage-SQL {@link com.miragesql.miragesql.session.Session} is not properly configured.
 */
public class ConfigurationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(Throwable cause) {
        super(cause);
    }

}
