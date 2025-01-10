package main;

import java.util.*;

public class Author {
	public String name;
    public static int id;
    public int authorId;
    public String nationality;
    public ArrayList<Book> bookList;


    public Author(String name, String nationality)
    {
        this.authorId = ++ main.Author.id;
        this.name = name;
        this.nationality = nationality;
        bookList = new ArrayList<Book>();

    }

    public void printDetails()
    {
        System.out.println("Author Name: " + name + "\n" + "Author Id: " + authorId + "\n" +
                            "Nationality: " + nationality + "\n" + "Number of books registered in library: "
                + this.bookList.size() + "\n");
    }

    public void printBooklist()
    {
        System.out.println("Book List of Author " + name + ":");
        for (int i = 0; i < this.bookList.size(); i++)
        {
            System.out.println(this.bookList.get(i).name);
        }
        System.out.println();
    }
}
