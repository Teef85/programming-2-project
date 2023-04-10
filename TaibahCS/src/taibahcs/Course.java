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
public class Course {
  ArrayList<Course> course= new ArrayList<>();   
     private  String courseCode;
     private  String courseName; 
    private int creditHours; 
     
   public Course(){
        this.courseCode= " ";
      this.courseName= "";
      this.creditHours= 0;
   }

  public Course ( String courseCode, String courseName, int creditHours){
      this.courseCode= courseCode;
      this.courseName= courseName;
      this.creditHours= creditHours;
  }
  public void setCourseCode(String courseCode){
         this.courseCode= courseCode;
     }   
   public void setCourseName(String courseName){
         this.courseName= courseName;
     }  
    public void setCourseHours(int creditHours ){
        this.creditHours= creditHours;
          }
     public String getCourseCode(){
         return this.courseCode;
     }
      public String  getCourseName(){
          return this.courseName;
      }
       public int getCreditHours(){
        return this.creditHours;
        
          }
    
  
       
       @Override
       public String toString(){
       return     courseCode+"    "+courseName+"    "+creditHours+"\n";
       }
}