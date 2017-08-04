package library;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SetOfBooks extends Vector<Book> 
{
  public SetOfBooks()
  {
    super();
  }

  public void addBook(Book aBook)
  {
    super.add(aBook);
  }
  public void removeBook(Book aBook){
      super.remove(aBook);
  }//loading the books table
  public void loadBooktable(JTable loadTable, SetOfBooks setofbooks){ 
      for(Book book: setofbooks){
          Vector v = new Vector();
          DefaultTableModel def = (DefaultTableModel)loadTable.getModel();
          v.add(book.getTitle());
          v.add(book.getAuthor());
          v.add(book.getISBN());
          v.add(book.getANumber());
          v.add(book.getBorrower());
          def.addRow(v);
          loadTable.setModel(def);
          
      }
  }
  
  public void issueBookLoan(String Bname, String Mname, SetOfBooks setofbooks){
      for(Book book:setofbooks){
          if(book.getTitle().equalsIgnoreCase(Bname)){ //issue book loan
              book.setBorrower(Mname);
          }
      }
  }
  
  public void Loadborrow(JTable loadtable, SetOfBooks setofbooks){
      for(Book book:setofbooks){
          if(book.getBorrower().equalsIgnoreCase("not yet")){
              Vector v = new Vector();
              DefaultTableModel def = (DefaultTableModel) loadtable.getModel();
              v.add(book.getTitle());
              v.add(book.getAuthor());
              v.add(book.getISBN());
              v.add(book.getANumber());
              v.add(book.getBorrower());
              def.addRow(v);
              loadtable.setModel(def);
          }
      }
  }
  
  //maximum book
  public int borrowMaxBook(String mBorrower, SetOfBooks setofbooks){
      int book = 0;
      for(Book bookM:setofbooks){
          if(bookM.getBorrower().equalsIgnoreCase(mBorrower)){
              book++;
          }
      }
      return book;
  }
  //delete book
  public Book dltrow(SetOfBooks setofbook, String dltBook){
      Book book = null;
      for(Book bookdlt:setofbook){
          if(bookdlt.getANumber().equalsIgnoreCase(dltBook)){
              book=bookdlt;
          }
      }
      return book;
  }
  //title search books
  public void search(SetOfBooks set,JTable Table, String title)
   {
       for(Book aBook:set)
       {
           if(aBook.getTitle().equalsIgnoreCase(title))
           {
               Vector r=new Vector();
               DefaultTableModel tm=(DefaultTableModel)Table.getModel();
               r.add(aBook.getTitle());
              r.add(aBook.getAuthor());
              r.add(aBook.getISBN());
              r.add(aBook.getANumber());
              r.add(aBook.getBorrower());
  
              
               
               tm.addRow(r);
               Table.setModel(tm);
           }
       }
   }

    void edit(JTable jTableBook1, SetOfBooks setofbooks) {
    for(Book b:setofbooks){
        Vector v = new Vector();
        DefaultTableModel def = (DefaultTableModel) jTableBook1.getModel();
              v.add(b.getTitle());
              v.add(b.getAuthor());
              v.add(b.getISBN());
              v.add(b.getANumber());
              v.add(b.getBorrower());
              def.addRow(v);
              jTableBook1.setModel(def);
    
    } 
    
    }
    
    //book available for issue

    void Return(String returnT, SetOfBooks setofbooks) {
        for(Book bk:setofbooks){
            if(bk.getANumber()==returnT){
                bk.setBorrower("not yet");
                
                
            }
        }
    }
  
  
  
  
}
