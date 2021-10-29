/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RC38802
 */
public class Books {
    
    private String Title;
    private int pages;
    private int publicationYear;
    
    public Books(String Title, int pages, int publicationYear){
        this.Title = Title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return this.Title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.Title + ", "+this.pages + " pages, "+this.publicationYear;
    }
    
    
    
}
