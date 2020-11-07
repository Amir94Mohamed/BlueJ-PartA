
/**
 * Here we have the course class and in here we have the 4 modules.
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    // Here we have the codeNo class
    private String codeNo;
    // Here we have the title class
    private String title;
    // here is the class for module1
    private Module module1;
    // here is the class for module2
    private Module module2;
    // here is the class for module3
    private Module module3;
    // here is the class for module4
    private Module module4;
    // here is the averageMark which will appear    
    private int averageMark;
    // here the grade class which will appear
    private Grades grade;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        this.codeNo = codeNo;
        this.title = title;
        
        // created the modules
        createModules();
    }
        
        public void createModules()
    {
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer Architecture", "CO450");
        module3 = new Module("Application Programming", "CO453");
        module4 = new Module("Web Development", "CO456");
    }
    
    public void addModule(Module module, int moduleNo)
    {
        if ( moduleNo == 1)
        {
            module1 = module;
        }
        else if (moduleNo == 2)
        {
            module2 = module;
        }
        else if (moduleNo == 3)
        {
            module3 = module;
        }
        else if (moduleNo == 4)
        {
            module4 = module;
        }
        else
            System.out.print("Invalid module!!!");
        }
    
            
     /**
     * Here we have the addMark method and added all the modules.
     */
    public void awardMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }
    
    public void calculateFinalMark()
    {
        averageMark = module1.getMark() + module2.getMark() + module3.getMark() +
        module4.getMark();
        averageMark = averageMark / 4;
    }
    
    public void calculateGrade()
    {
        if(averageMark >= 0 & averageMark < 40)
        {
            grade = Grades.F;
        }
        
        if(averageMark >= 40 & averageMark < 49)
        {
            grade = Grades.D;
        }
        
        if(averageMark >= 50 & averageMark < 59)
        {
            grade = Grades.C;
        }
        
        if(averageMark >= 60 & averageMark < 69)
        {
            grade = Grades.B;
        }
        
        if(averageMark >= 70 & averageMark < 100)
        {
            grade = Grades.A;
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        System.out.println("Course: " + codeNo + " - " + title);
        System.out.println("Grade: " + grade);
        System.out.println("Average mark: " + averageMark);
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
}
    