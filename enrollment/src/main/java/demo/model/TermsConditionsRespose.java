package demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Class to retrieve data.
 * 
 * @author EDGAR OCHOA CARMONA.
 *
 */
@Getter
@Setter
public class TermsConditionsRespose {
	
	/**
	*	Terms and conditions text, could be with HTML or plain
	*/
	private String data;
	
	/**
	 * Notifications object
	 */
	private Notifications notifications;

}
