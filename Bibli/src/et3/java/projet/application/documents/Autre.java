package et3.java.projet.application.documents;

import java.util.Date;

public class Autre extends Document{

	public String ISBN;
	public Autre(String eAN, String titre, String editeur, String date, String nomAuteur, String prenomAuteur) {
		super(eAN, titre, editeur, date, nomAuteur, prenomAuteur);
		// TODO Auto-generated constructor stub
	}
	public Autre(String eAN, String titre, String editeur, String date, String nomAuteur, String prenomAuteur, String ISBN) {
		super(eAN, titre, editeur, date, nomAuteur, prenomAuteur);
		this.ISBN = ISBN;
		// TODO Auto-generated constructor stub
	}
}
