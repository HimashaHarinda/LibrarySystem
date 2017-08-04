package library;

import java.io.Serializable;

public class Book implements Serializable
{
  String Title;
  String Author;
  String ISBN;
  String ANumber;
  String Borrower;
  
  
   private static int bookCount=0;

  

    Book(String Title, String Author, String ISBN, String ANumber, String Borrower) {
            this.Title = Title;
             this.Author = Author;
    this.ISBN = ISBN;
    this.ANumber = ANumber;
    this.Borrower = Borrower;

    }
    
  //setters getters

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getANumber() {
        return ANumber;
    }

    public void setANumber(String ANumber) {
        this.ANumber = ANumber;
    }

    public String getBorrower() {
        return Borrower;
    }

    public void setBorrower(String Borrower) {
        this.Borrower = Borrower;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }
  
/*
  public void setBorrower(Member theBorrower) 
  {
    borrower=theBorrower;
  }

  public Member getBorrower() 
  {
    return borrower;
  }
*/
}
