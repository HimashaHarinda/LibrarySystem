package library;

import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SetOfMembers extends Vector<Member> 
{
  public SetOfMembers()
  {
    super();
  }
  
  public void addMember(Member aMember) 
  {
    super.add(aMember);
  }
  public void removeMember(Member aMember){
      super.remove(aMember);
  }
  
  public void loadMemberTable (JTable memberJT, SetOfMembers setofmembers){
      for(Member member:setofmembers){
          Vector v= new Vector();
          DefaultTableModel defm = (DefaultTableModel) memberJT.getModel();
          v.add(member.getMemberNumber());
          v.add(member.getName());
          v.add(member.getAddress());
          v.add(member.getPhoneNo());
          
          defm.addRow(v);
          memberJT.setModel(defm);
      }  
      
  }
  public Vector getName(SetOfMembers setofmember){
      Vector nameList = new Vector();
      for(Member member:setofmember){
          nameList.add(member.getName());
            
      }
      return nameList;
      
  }
  
  public void txtmember(SetOfMembers soom, String nmember, JList list){
        DefaultListModel defm = (DefaultListModel) list.getModel();
        for(Member member:soom){
            if(member.getName().equalsIgnoreCase(nmember)){
            defm.removeAllElements();
            defm.addElement(nmember);
            }
        }
  }
                
   public Member dltrowMember(SetOfMembers setofmember, String dltMember){
      Member member = null;
      for(Member memberdlt:setofmember){
          if(memberdlt.getMemberNumber().equalsIgnoreCase(dltMember)){
              
              member= memberdlt;
          }
      }
      return member;
  }
   
   public void msearch(SetOfMembers set,JTable Table, String name)
   {
       for(Member mem:set)
       {
           if(mem.getName().equalsIgnoreCase(name))
           {
               Vector v=new Vector();
               DefaultTableModel tm=(DefaultTableModel)Table.getModel();
               v.add(mem.getMemberNumber());
               v.add(mem.getName());
               v.add(mem.getAddress());
               v.add(mem.getPhoneNo());
          
               // r.add(aBook.get);
               
               tm.addRow(v);
               Table.setModel(tm);
           }
       }
   }
  
   
}


