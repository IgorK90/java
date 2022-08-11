package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    public void getBook()
    {
        System.out.println("taking book from UniLibrary ");
        System.out.println("----------------------------------------------------");
    }

    public void returnBook()
    {
        System.out.println("returning book to UniLibrary");
        System.out.println("----------------------------------------------------");
    }
    public void getMagazine()
    {
        System.out.println("we're getting Magazine from Unilibrary");
        System.out.println("----------------------------------------------------");
    }
    public void returnMagazine()
    {
        System.out.println("we're returning Magazine to Unilibrary");
        System.out.println("----------------------------------------------------");
    }

    public void addBook(String person_name, Book book)
    {
        System.out.println("we're adding book to Unilibrary");
        System.out.println("----------------------------------------------------");
    }
    public void addMagazine()
    {
        System.out.println("we're adding Magazine to Unilibrary");
        System.out.println("----------------------------------------------------");
    }

}
