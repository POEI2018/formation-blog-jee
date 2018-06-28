package fr.gtm.blog.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Auteur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private String name ; 
	private LocalDate subDate ;
	private Adresse adresse ; 
	
	private List<Article> articles ;   
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getSubDate() {
		return subDate;
	}
	public void setSubDate(LocalDate subDate) {
		this.subDate = subDate;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	} 
	
	

}
