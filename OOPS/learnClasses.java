package OOPS;

public class learnClasses {


    static class Student {
        int roll;
        String name;
        int marks ;
        
        public Student(int roll, String name, int marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks ;
        }
    }


    public static void main(String[] args) {
        
        Student st = new Student(1, "swaraj", 99);
        System.out.println(st.name);
    }


    
}
