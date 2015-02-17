package mvc_form_generator.form;

/***
 * The Field class represent a field from a form.
 * It has some useful informations such as its name, display name,
 * type, validation expression and the associated message, and
 * if it is a field that requires a completion.
 * 
 * @author MUSY Quentin
 *
 */
public class Field {
	
	private String name;
	private String type;
	private String displayName;
	private String validationExpression;
	private String messageOnNonValidation;
	
	private Boolean isMandatory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getValidationExpression() {
		return validationExpression;
	}

	public void setValidationExpression(String validationExpression) {
		this.validationExpression = validationExpression;
	}

	public String getMessageOnNonValidation() {
		return messageOnNonValidation;
	}

	public void setMessageOnNonValidation(String messageOnNonValidation) {
		this.messageOnNonValidation = messageOnNonValidation;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	
	public Field(String name, String displayName, String type, String expression,
				 String message, Boolean mandatory)
	{
		setName(name);
		setDisplayName(displayName);
		setIsMandatory(mandatory);
		setType(type);
		setMessageOnNonValidation(message);
		setValidationExpression(expression);
	}
}
