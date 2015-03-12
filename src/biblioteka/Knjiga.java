package biblioteka;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Knjiga {
	
	private String naslov;
	private String izdavac;
	private long isbn;
	private int izdanje;
	private LinkedList<Autor> autori = new LinkedList<Autor>();
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
	
}
