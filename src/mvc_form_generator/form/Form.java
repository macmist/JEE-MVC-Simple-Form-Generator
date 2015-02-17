package mvc_form_generator.form;

import java.util.List;

/**
 * 
 * @author Macmist
 *
 */
public class Form {
	private String formName;
	private String servletName;
	private String beanName;
	private String address;
	private List<Field> fieldList;
	
	
	public List<Field> getFieldList() {
		return fieldList;
	}
	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getServletName() {
		return servletName;
	}
	public void setServletName(String servletName) {
		this.servletName = servletName;
	}
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/***
	 * Full Constructor
	 * @param name 		The form name
	 * @param servName 	The servlet name
	 * @param beanName 	The bean name
	 * @param address 	The address for web.xml mapping
	 * @param list 		The list of fields
	 */
	public Form(String name, String servName, String beanName, String address, List<Field> list)
	{
		setFormName(name);
		setServletName(servName);
		setBeanName(beanName);
		setAddress(address);
		setFieldList(list);
	}
	
	/***
	 * Empty constructor for other needs
	 */
	public Form()
	{}
}
