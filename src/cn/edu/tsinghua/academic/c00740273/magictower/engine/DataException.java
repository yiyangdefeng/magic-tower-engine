package cn.edu.tsinghua.academic.c00740273.magictower.engine;

@SuppressWarnings("serial")
public class DataException extends Exception {

	public DataException() {
	}

	public DataException(String message) {
		super(message);
	}

	public DataException(Throwable cause) {
		super(cause);
	}

	public DataException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
