/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandregistr;

/**
 *
 * @author admin
 */
class User {
    private String BookName,AuthorName,Course,Subject,Type,RollNo,FirstName,LastName,Email,Phone,EstimatedAmount;
    private int Semester;
    public User(String BookName, String AuthorName,String Course,int Semester, String Subject,String Type,String RollNo,String FirstName,String LastName,String Email,String Phone,String EstimatedAmount)
    {
        this.BookName=BookName;
        this.AuthorName= AuthorName;
        this.Course=Course;
        this.Semester=Semester;
        this.Subject=Subject;
        this.Type=Type;
        this.RollNo=RollNo;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Email=Email;
        this.Phone=Phone;
        this.EstimatedAmount=EstimatedAmount;
        
    }   
        public int getSem()
        {
            return Semester;
        }
        public String getBookName()
        {
            return BookName;
        }
        public String getAuthorName()
        {
            return AuthorName;
        }
        public String getCourse()
        {
            return Course;
        }
        public String getSubject()
        {
            return Subject;
        }
        public String getType()
        {
            return Type;
        }
        public String getRollNo()
        {
            return RollNo;
        }
        public String getFirstName()
        {
            return FirstName;
        }
        public String getLastName()
        {
            return LastName;
        }
        public String getEmail()
        {
            return Email;
        }
        public String getPhone()
        {
            return Phone;
        }
        public String getEstimatedAmount()
        {
            return EstimatedAmount;
        }
        
        
        
        
                
    
}
