package com.codingdojo.trevor.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	   	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   	
	   	@NotEmpty(message="title must be valid")
	   	@Size(min=1, max=200)
	    private String title;
	   	
	 	@NotEmpty(message="Author must be valid")
	   	@Size(min=1, max=200)
	    private String Author;
	 	
	 	@NotEmpty(message="thoughts must be valid")
	   	@Size(min=1, max=200)
	    private String thoughts;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @ManyToOne(fetch= FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User user;
	    
	    public Book(){}

		public Book(Long id, String title, String author, String thoughts, Date createdAt, Date updatedAt, User user) {
			super();
			this.id = id;
			this.title = title;
			Author = author;
			this.thoughts = thoughts;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.user = user;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return Author;
		}

		public void setAuthor(String author) {
			Author = author;
		}

		public String getThoughts() {
			return thoughts;
		}

		public void setThoughts(String thoughts) {
			this.thoughts = thoughts;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		

}
