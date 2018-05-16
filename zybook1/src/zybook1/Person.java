package zybook1;

public class Person {
   
   private String Name;

   private String studentID;

   public String getName() {
       return Name;
   }

   public void setName(String replacementName) {
	   Name = replacementName;
   }

   public String getID() {
       return studentID;
   }

   public void setID(String id) {
       this.studentID = id;
   }
   /**
    * Return the login name of this student. The login name is a combination of the
    * first four characters of the student's name and the first three characters of
    * the student's ID number.
    */
   public String getLoginName() {
       return Name.substring(0, 4) + studentID.substring(0, 3);
   }

   public void print(){
       System.out.print(Name);
   }

}
