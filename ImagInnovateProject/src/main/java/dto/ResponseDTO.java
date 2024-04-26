package dto;

public class ResponseDTO<T> {
	
	boolean status;
	String message;
	T data;
	
	/**
	 * @param status
	 * @param message
	 * @param data
	 */
	public ResponseDTO(boolean status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	/**
	 * @param status
	 * @param message
	 */
	public ResponseDTO(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	
}
