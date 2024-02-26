package bibilioteka.interfejs;

import java.util.List;

import bibilioteka.Autor;
import bibilioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public List<Knjiga> vratiSveKnjige();
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
}
