package fr.gtm.blog.business;

import java.util.List;

import fr.gtm.blog.dao.AuteurRepository;
import fr.gtm.blog.domain.Article;
import fr.gtm.blog.domain.Auteur;

public class AuteurService extends CrudService<Auteur> {
	
	protected AuteurRepository getRepo() {
		return (AuteurRepository) this.repo ;
	}

	public Auteur searchAuteur(final String name) {
		return null ; 
	}

}
