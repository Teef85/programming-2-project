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
public class Convener  extends FacultyMember{
    //  ArrayList<Course> course= new ArrayList<>();
   //   ArrayList<Lecturers> lecturers= new ArrayList<>();
        ArrayList<Convener> Conv= new ArrayList<>();
        private String  course;
        private String  lecturers;

    
    public Convener(){
        super();
         
    }
     
  //   public Convener (int FacultyID,String firstName, String lastName,String academicRank, String academicSpecialization,ArrayList<Course> course, ArrayList<Lecturers> lecturers){
      public Convener (int FacultyID,String firstName, String lastName,String academicRank, String academicSpecialization,String course,String lecturers){    
         super(FacultyID, firstName,lastName,academicRank,academicSpecialization);
        
         this.course=course;
         this. lecturers= lecturers;
     }
   // public ArrayList <Course> getCourse(){
   //     return course;
  //  }     
  //      public ArrayList<Lecturers> getLecturers(){
  //          return lecturers;
  //      }
  //     public void setCourse( ArrayList<Course> course ){  
  //               this.course=course;
               
                 
//       }
  //        public void setLecturers(ArrayList<Lecturers> lecturers){
  //    this. lecturers=lecturers;
  //      }
  public String  getCourse(){
        return course;
    }     
   public String getLecturers(){
            return lecturers;
        }
public void setCourse( String course ){  
                 this.course=course;
          }
public void setLecturers(String lecturers){
      this. lecturers=lecturers;
        }
            public String toString(){
 return super.getFacultyId()+"      "+super.getFirstName()+"       "+ super.getLastName()+"     "+super.getAacademicRank()+"     "+super.getAcademicSpecialization()+" "
+"    "+getCourse()+"     "+ getLecturers()+"\n";
  }    
}
