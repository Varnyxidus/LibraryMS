package main;

public class Main {
	public static void main(String []args)
    {
        System.out.println("A Simple Library Management System:\n" + "Lab Assignment No. 1");

        // Create book(object) of a specific edition.
        // Book 1
        Edition ed1 = new Edition(2015, Month.October);
        Book b1 = new Book("The Brain" , Type.Neuroscience, ed1);

        // Book 2
        Edition ed2 = new Edition(1960, Month.April);
        Book b2 = new Book("Fundamentals of Physics" , Type.Physics, ed2);

        // Book 3
        Edition ed3 = new Edition(2005, Month.July);
        Book b3 = new Book("Surveying Vol. 1" , Type.Engineering, ed3);

        // Book 4
        Edition ed4 = new Edition(2005, Month.June);
        Book b4 = new Book("Physics For Engineers" , Type.Engineering, ed4);

        // Book 5
        Edition ed5 = new Edition(2009, Month.February);
        Book b5 = new Book("Sum: Forty Tales from the Afterlives" , Type.Philosophy, ed5);

        // Create Authors(objects)
        Author a1 =  new Author("David Eagleman", "American");
        Author a2 = new Author("David Halliday", "American");
        Author a3 = new Author("Robert Resnick", "American");
        Author a4 = new Author("B.C. Punmia", "Indian");
        Author a5 = new Author("Ashok Kumar Jain", "Indian");
        Author a6 = new Author("Gias Uddin Ahmed", "Bangladeshi");

        // Add to lists.
        // book 1
        b1.authorAdd(a1);

        // book 2
        b2.authorAdd(a2);
        b2.authorAdd(a3);

        // book 3
        b3.authorAdd(a4);
        b3.authorAdd(a5);

        // book 4
        b4.authorAdd(a6);

        // book 5
        b5.authorAdd(a1);

        // Print Authors Information.
        a1.printDetails();
        a2.printDetails();
        a3.printDetails();
        a4.printDetails();
        a5.printDetails();
        a6.printDetails();

        // Print Books Information.
        b1.printDetails();
        b1.printAuthorlist();

        b2.printDetails();
        b2.printAuthorlist();

        b3.printDetails();
        b3.printAuthorlist();

        b4.printDetails();
        b4.printAuthorlist();

        b5.printDetails();
        b5.printAuthorlist();

        // Authors Having Several Books.
        a1.printBooklist();

        // Borrowing a book from the library.
        b5.borrowBook();

        // Checking a book is currently available or not.
        b5.IsAvailable();
        b3.IsAvailable();

        // Returning a book to the library which was borrowed before.
        b5.returnBook();
        b5.IsAvailable();
   }
}
