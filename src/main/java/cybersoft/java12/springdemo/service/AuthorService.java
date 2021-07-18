package cybersoft.java12.springdemo.service;

import cybersoft.java12.springdemo.container.IoCContainer;
import cybersoft.java12.springdemo.repository.AuthorRepository;

public class AuthorService {
	private AuthorRepository repository;
	
	public AuthorService() {
		repository = (AuthorRepository) IoCContainer.getBean("authorRepository");
	}
}
