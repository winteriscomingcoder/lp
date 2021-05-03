package com.gitub.eddboyer.launchpadrecruits.exceptions;

/**
 * This exception should be thrown by the service classes when they need to report an underlying
 * error, such as a database exception.
 * 
 * @author David Carboni
 * 
 */
public class ServiceException extends Exception {

	/**
	 * Generated by Eclipse.
	 */
	private static final long serialVersionUID = 1410073536360323015L;

	/**
	 * @see Exception#Exception()
	 */
	public ServiceException() {
		super();
	}

	/**
	 * @see Exception#Exception(String, Throwable)
	 * @param message
	 *            The exception message.
	 * @param cause
	 *            The cause of this exception.
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @see Exception#Exception(String)
	 * @param message
	 *            The exception message.
	 */
	public ServiceException(String message) {
		super(message);
	}

	/**
	 * @see Exception#Exception(String, Throwable)
	 * @param cause
	 *            The cause of this exception.
	 */
	public ServiceException(Throwable cause) {
		super(cause);
	}

}
