package de.noctun.myWebProject;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginController {
	
	private String userName;
	private String password;
	private List<String> countries;
	private String selectedCountrie;
	
	public LoginController()
	{
		countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Canada");
		countries.add("France");
		countries.add("Germany");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public String getSelectedCountrie() {
		return selectedCountrie;
	}

	public void setSelectedCountrie(String selectedCountrie) {
		this.selectedCountrie = selectedCountrie;
	}
	
	
}
