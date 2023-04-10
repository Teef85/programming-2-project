/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taibahcs;

import java.util.ArrayList;

/**
 *
 * @author MUHAMMEDHAIL
 */
public class Lecturers extends FacultyMember {
    private int maximumNumberOfCourses;
    private int quotaOfCreditHours;
    private String assignedCourses; 
    ArrayList<Lecturers> lecturers= new ArrayList<>();
        
      
    public Lecturers(){
        super();
    
    }
    public Lecturers(Integer FacultyID,String firstName, String lastName,String academicRank, String academicSpecialization,int maximumNumberOfCourses
    ,int quotaOfCreditHours,String assignedCourses){
        super(FacultyID, firstName,lastName,academicRank,academicSpecialization);
         this.maximumNumberOfCourses = maximumNumberOfCourses ;
     this.quotaOfCreditHours = quotaOfCreditHours;
     this.assignedCourses = assignedCourses ; 
    }
    public void setmaximumNumberOfCourses(int maximumNumberOfCourses ){
  
this.maximumNumberOfCourses = maximumNumberOfCourses;
}
    public void setquotaOfCreditHours(int quotaOfCreditHours ){
this.quotaOfCreditHours=quotaOfCreditHours;
    }
      public void setassignedCourses(String assignedCourses ){
this.assignedCourses=assignedCourses;
      }
        public int getmaximumNumberOfCourses( ){
return maximumNumberOfCourses;
   }
        public int getquotaOfCreditHours( ){
return quotaOfCreditHours;
        
}
  public String  getassignedCourses( ){
return  assignedCourses;
  }
 
  
  public String toString(){
 return super.getFacultyId()+"      "+super.getFirstName()+"       "+ super.getLastName()+"     "+super.getAacademicRank()+"     "+super.getAcademicSpecialization()+" "
+"    "+getmaximumNumberOfCourses()+"     "+getquotaOfCreditHours()+"       "+getassignedCourses()+"\n";
  }    

  public void tostring(int index){
    for(int i=index;i<=index;i++){
    System.out.println(lecturers.get(index-1));
         }
  }

}
