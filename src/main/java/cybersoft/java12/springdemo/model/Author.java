package cybersoft.java12.springdemo.model;

public class Author {
	private String name;
	private String email;
	private String facebook;
	
	public Author() {
		name = "Hieu Vo";
		email = "hieu@gmail.com";
		facebook = "fb.com/123";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getFacebook() {
		return facebook;
	}
		
}
