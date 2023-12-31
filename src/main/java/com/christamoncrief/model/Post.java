package com.christamoncrief.model;

public class Post {

	private int id;
	private String title;
	private String body;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Post(int id, String title, String body, String author) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.author = author;
	}
	public Post(String title, String body, String author) {
		this.title = title;
		this.body = body;
		this.author = author;
	}
	public Post() {
		this.title = "";
		this.body = "";
	}
	
}
