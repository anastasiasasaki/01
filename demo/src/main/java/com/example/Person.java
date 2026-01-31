package com.example;

public class Person 
{
    private String book_id;
    private String category;
    private String title;
    private String author;
    private int copies;
    
    public void Persons(String book_id, String category, String title, String author, int copies)
    {
        this.book_id = book_id;
        this.category = category;
        this.title = title;
        this.author = author;
        this.copies = copies;
    }
    
    public String getBookId()
    {
        return book_id;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getCopies()
    {
        return copies;
    }
}
