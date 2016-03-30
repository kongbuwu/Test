package until;

/**
 * CarCare基础异常类
 * 
 * @author Tony Wang 2013-4-27
 */
public class BaseCarCareException extends Exception {
	public ExceptionCode exceptionCode;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseCarCareException(ExceptionCode exceptionCode) {

		super(exceptionCode.errorMsg);

		this.exceptionCode = exceptionCode;
	}

	public BaseCarCareException(String errorMsg) {
		super(errorMsg);
	}

	/**
	 * 异常类型
	 * 
	 * @author Tony Wang 2013-4-27
	 */
	public enum ExceptionCode {
		REQUEST_ERROR("request_error"), REQUEST_NULL_VALUE_ERROR(
				"request_null_request_error"), SERVER_NOT_REQUEST_ERROR(
				"server_not_request_error"), PARSE_JSON_ERROR(
				"parse_json_error"), NET_STATE_ERROE("net_state_error"), SQLITE_VALUE_NULL(
				"sqlite_value_null");

		String errorMsg; // 错误信息

		private ExceptionCode(String msg) {
			this.errorMsg = msg;
		}
	}
}
