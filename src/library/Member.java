package library;

import java.io.Serializable;

public class Member implements Serializable
{
  String memberNumber;
  String name;
  String address;
  String PhoneNo;

  public Member(String mNumber, String mName, String mAddress, String mPhone)
  {
      
     this.memberNumber=mNumber;
     this.name=mName;
     this.address=mAddress;
     this.PhoneNo = mPhone;
     
     
     
   //   memberNumber=++memberCount;
   //   currentLoans=new SetOfBooks();
   // private static int memberCount=0;
 
  }
  //setters getters
  
    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
  
  
  
    
  
/*
  public void borrowBook(Book aBook)
  {
    currentLoans.addBook(aBook);
    aBook.setBorrower(this);
  }

  public String toString()
  {
    return Integer.toString(memberNumber)+" "+name;
  }
*/
}

