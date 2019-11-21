package demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Class to identify Notifications Parameters.
 * 
 * @author EDGAR OCHOA CARMONA.
 *
 */
@Getter
@Setter
public class Notifications {
	
	/**
	 * Category of this notification as a Http status, example: BAD_GATEWAY
	 */
	private String category;
	
	/**
	 * Notification code. First character indicates severity (E,W,I).
	 * example: E422TDSKTMBILLPPAYRCPTG001
	 */
	private String code;
	
	/**
	 * Description of the error or information notification. 
	 * Where the response is 2xx, it's a notification with informational details about this response.
	 * example: Something is invalid
	 */
	private String message;
	
	/**
	 * Message which explains the notification.
	 */
	private String description;
	
	/**
	 * A suggested action following this notification.g
	 */
	private String action;
	
	/**
	 * Metadata Array Attribute
	 * Example: {
     *   "additionalProp1": {},
     *   "additionalProp2": {},
     *   "additionalProp3": {}
     *   }
	 */
	private String[] metadata = new String[3];
	
	/**
	 * Unique identifier for this notification. 
	 * Example: aadde-ddddee-eeeedd-eeeedd
	 */
	private String uuid;
	
	/**
	 * string($date-time)
	 * example: OrderedMap
	 * Time stamp of the notification.
	 */
	private String[] timestamp;
	
	/**
	 * Severity of the notification (ERROR, WARNING, INFO, UNSPECIFIED)
	 */
	private String severity;


}
