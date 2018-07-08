package dt.b190043.project.model;

import java.util.List;
import java.util.Set;

public class Book extends Product{
	
	private Set<String> author;
	private Set<String> genre;
	
	public Set<String> getAuthor() {
		return author;
	}
	public void setAuthor(Set<String> author) {
		this.author = author;
	}
	public Set<String> getGenre() {
		return genre;
	}
	public void setGenre(Set<String> genre) {
		this.genre = genre;
	}
	
	
	
	

}
