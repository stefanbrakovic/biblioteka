package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = 
			new LinkedList<Knjiga>();
	
	
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);		
	}

	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long ISBN,
			String izdavac, Autor autor) {
		
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		if (ISBN > 0) {
			for (int i = 0; i < knjige.size(); i++) {
				if (knjige.get(i).getIsbn()==ISBN) {
					rezultat.add(knjige.get(i));
				}
			}
			
		}
		return rezultat;
	}

}
