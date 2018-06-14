package fr.gtm.blog.domain;

import java.io.Serializable;

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String title;

	private String description;

	public Article() {

	}

	public Article(Integer id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
