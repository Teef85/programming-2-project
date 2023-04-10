package taibahcs;

import java.util.ArrayList;
import java.util.Scanner;


public class TaibahCS {
    public static Scanner scan;
    public  static  Course c;
    public static Lecturers lecturer;
    public static  Convener con;
    
 public static void main(String[] args) {
      int login ,indx=0,id,z;
       scan = new Scanner(System.in);
       c = new Course();
       lecturer = new Lecturers();
       con = new Convener();

      
      c.course.add(new Course("CS111","Programming1", 4));
      c.course.add(new Course("CS112"," Programming2", 4 ));
      c.course.add(new Course("CS103","DiscreteStructures",3));
      c.course.add(new Course("CS211","AlgorithmsandDataStructures", 4));
      c.course.add(new Course("CE211","DigitalLogicDesign", 4));
      c.course.add(new Course("CS281","IntroductiontoSoftwareEngineering", 3));
      c.course.add(new Course("CE224","ComputerOrganizationandArchitecture1", 4));
      c.course.add(new Course("CE332","SoftwareModellingandAnalysis ", 4));
      c.course.add(new Course("CS284"," TheoryofComputation ", 4 ));
      c.course.add(new Course("CS301","OperatingSystems",4));
      c.course.add(new Course("CS323","IntelligentSystems", 3));
      c.course.add(new Course("CS372","DatabaseSystems", 4));
      c.course.add(new Course("CS451","ComputerGraphics", 4));
      c.course.add(new Course("CS362","IntelligentSystems", 4));
      c.course.add(new Course("CS433","ComputerNetworks", 4));
      c.course.add(new Course("CS424","SoftwareModellingandAnalysis", 4));
      
 lecturer.lecturers.add(new Lecturers(1, "Nora", "Ahmad"," Lecturer", "Algorithms", 3 ,12, "CS111,CS103"));
 lecturer.lecturers.add(new Lecturers(2 ,"Nora", "Abdullah", "Lecturer", "NaturalLanguageProcessing", 3, 12 ,"NA"));
 lecturer.lecturers.add(new Lecturers(3," Maryam", "Mohammad", "Lecturer", "ComputerSecurity", 3 ,12," NA"));
 lecturer.lecturers.add(new Lecturers(4 ,"Samar"," Jamal", "Lecturer"," SoftwareEngineering", 3 ,12," NA"));
 lecturer.lecturers.add(new Lecturers(5, "Fatimah"," Ali"," Lecturer"," ComputerScience", 3, 12," NA"));
 lecturer.lecturers.add(new Lecturers(6, "Hanan"," Hassan"," Lecturer"," MachineLearning", 3 ,12," NA" ));
 lecturer.lecturers.add(new Lecturers(7, "Abrar"," Talal"," TA"," ComputerSecurity", 4, 14," NA"));
 lecturer.lecturers.add(new Lecturers(8,"Rawan","Omar","TA","ComputerScience",4,14,"NA"));
 lecturer.lecturers.add(new Lecturers(9,"Jameelah"," Adel","TA","ComputerScience",4,14,"NA"));
 lecturer.lecturers.add(new Lecturers(10," Huda"," Abdulmajeed"," TA"," SoftwareEngineering" ,4, 14, "NA"));
 lecturer.lecturers.add(new Lecturers(11, "Mohammed"," Majed"," TA"," SoftwareEngineering ",4, 14," NA"));
 lecturer.lecturers.add(new Lecturers(12,"Lama","Osama", "TA","ComputerScience", 4, 14," NA"));
 lecturer.lecturers.add(new Lecturers(13, "Noor"," Ayman","TA"," MachineLearning", 4 ,14," NA"));
 

 con.Conv.add(new Convener(14, "Najwa"," Ahmad", "AssistantProfessor"," ComputerScience","CS111,CS112","1,5,10,11"));
 con.Conv.add(new Convener(15," Ali"," Khaled"," AssistantProfessor"," ComputerScience","NA","NA"));
 con.Conv.add(new Convener(16," Sara"," Ibrahim"," AssistantProfessor"," ComputerSecurity","NA","NA"));
 con.Conv.add(new Convener(17,"Layla"," Mohammad"," AssociateProfessor"," IntelligentSystems","NA","NA"));  
 con.Conv.add(new Convener(18," Mohammad"," Mostafa"," Professor"," MachineLearning","NA","NA")); 
 
do{
System.out.println("Enter 1 To Login As Convener OR 2 To Login As Lecturer :");
login = scan.nextInt();
if(login ==1){
   System.out.println("plase Enter Your  ID !!"); 
   id = scan.nextInt();
   for(Convener list:con.Conv){
    if(list.getFacultyId() == id){
       indx = list.getFacultyId();
       break;
      }}
   if(indx != 0){      
   System.out.println("PLEASE ENTER : \n 1-Allocate course  \n 2-Drop course  \n 3-Print a report");
    int cov =scan.nextInt();
    switch(cov){
        case 1 :{
        allocateCourse(id); 
            break;
        }
       case 2 :{
        DropCourse(id);
            break;
        }
       case 3 :{
           Print();
            break;
        }
       default:{
       System.out.println("PLEASE ENTER : 1  OR  2  OR 3 ");
            break;
        }
    }
    indx=0;
    } 
}
else if(login == 2){
   System.out.println("plase Enter Your  ID !!"); 
   id = scan.nextInt();
   for(Lecturers list:lecturer.lecturers){
    if(list.getFacultyId() == id){
       indx = list.getFacultyId();
       break;
      }}
   if(indx != 0){      
   lecturer.tostring(indx);
   indx=0;
    }
   else
   System.out.println("THE ID IS NOT FOUND !!  ENTER OTHER ID :");    
     }
   else{
   System.out.println("Error : Enter 1 OR 2  !!");
     }
 System.out.println("ENTER ANY NUMBER TO CONTINUE OR ZERO TO EXIT :");
  z =scan.nextInt();
 }while(z != 0);
} 
 
 
public static void allocateCourse(int id){
     String courseid = null,index1 = null,sign,con_cource,con_lectuer;
     int  lecturerid=0,index=0;
    
     System.out.println("PLEASE ENTER THE COURSE ID ");
     courseid =scan.next();
     System.out.println("PLEASE ENTER THE LECTURER ID ");
     lecturerid = scan.nextInt();
   
   for(Course list:c.course){
   if(list.getCourseCode().trim().equals(courseid.trim().toUpperCase())){
       index1 = list.getCourseCode();
       break;
      }}
 
   if(index1 != null){      
    for(Lecturers list:lecturer.lecturers){
    if(list.getFacultyId() == lecturerid){
       index = list.getFacultyId();
       sign =list.getassignedCourses();
       list.setassignedCourses(sign.concat(","+courseid));

       break;
      }}
   if(courseid != null && lecturerid !=0)
    for(Convener list:con.Conv){
       if(list.getFacultyId() == id){
       con_cource =list.getCourse();
       list.setCourse(con_cource.concat(","+courseid));
       con_lectuer =list.getLecturers();
       list.setLecturers(con_lectuer.concat(","+lecturerid));
       System.out.println(con.Conv);
       break;
      }}
   if(index != 0){ 
    for(int i=index;i<=index;i++){
    System.out.println(lecturer.lecturers.get(index-1));
    }}
   else
   System.out.println("THE ID OF LECTURER IS NOT FOUND !!:");
    }
   else
   System.out.println("THE ID OF COURCE IS NOT FOUND !!:");
    }

private static void DropCourse(int id) {
     String courseid,index1 =null,sign,con_lectuer,con_cource;
     int  lecturerid,index=0;
     
     System.out.println("PLEASE ENTER THE COURSE ID ");
     courseid =scan.next();
     System.out.println("PLEASE ENTER THE LECTURER ID ");
     lecturerid = scan.nextInt();
   
   for(Course list:c.course){
   if(list.getCourseCode().trim().equals(courseid.trim().toUpperCase())){
       index1 = list.getCourseCode();
       break;
      }}
 
   if(index1 != null){      
    for(Lecturers list:lecturer.lecturers){
    if(list.getFacultyId() == lecturerid){
       index = list.getFacultyId();
       sign = list.getassignedCourses().substring(courseid.length());
       list.setassignedCourses(sign);
       break;
      }}
     for(Convener list:con.Conv){
    if(list.getFacultyId() == id){
       con_cource = list.getCourse().substring(courseid.length());
       list.setCourse(con_cource);
       con_lectuer = list.getLecturers().substring(lecturerid);
       list.setLecturers(con_lectuer);
       System.out.println(list);
       break;
      }}
   if(index != 0){ 
    for(int i=index;i<=index;i++){
    System.out.println(lecturer.lecturers.get(index-1));
    }}
   else
   System.out.println("THE ID OF LECTURER IS NOT FOUND !!:");
    }
   else
   System.out.println("THE ID OF COURCE IS NOT FOUND !!:");
    }

    private static void Print() {
    System.out.println(con.Conv);
    
}
    
}