/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taibahcs;

/**
 *
 * @author MUHAMMEDHAIL
 */
public class FacultyMember {
    private  Integer FacultyID;
    private  String firstName;
    private  String lastName;
    private  String academicRank;
    private  String academicSpecialization; 
    
    
    public FacultyMember(){
FacultyID=0;
firstName="";
lastName="";
academicRank="";
academicSpecialization="";
    }
            
public FacultyMember(int FacultyID,String firstName, String lastName,String academicRank, String academicSpecialization){
this.FacultyID=FacultyID;
this.firstName=firstName;
this.lastName=lastName;
this.academicRank=academicRank;
this.academicSpecialization=academicSpecialization;

}
   public void setFacultyId(int FacultyID ){
this.FacultyID=FacultyID;

   }
   public void setFirstName (String firstName ){
this.firstName =firstName;

   }
   
   public void setLastName (String lastName ){
this.lastName =lastName;
   }
   public void setAacademicRank (String academicRank ){
this.academicRank =academicRank;
   }
   public void setAcademicSpecialization (String academicSpecialization ){
this.academicSpecialization =academicSpecialization;
   }
    public int getFacultyId( ){
return FacultyID;}
    
      public String getFirstName ( ){
return firstName;}
      
      public String getLastName ( ){
return lastName;
   }
      
      public String getAacademicRank ( ){
return academicRank;
   }
    public String getAcademicSpecialization (){
return academicSpecialization;
   }   
   
    public String toString(){
        return "   "+getFacultyId()+"  "+getFirstName()+ "   "+getLastName()+ "   "
                +getAacademicRank()+"   "+ getAcademicSpecialization();
    }
}
