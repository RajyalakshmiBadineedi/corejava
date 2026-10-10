public class studentProblem {
    String name;
    int age;
    int marks;
    studentProblem(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name:"+ name);
         System.out.println("Age :"+age);
          System.out.println("Marks :"+ marks);
          System.out.println(" ");
    }
    public static void main(String[] args) {
        studentProblem s1=new studentProblem("rajya", 21, 98);
        studentProblem s2 =new studentProblem("pushpa", 17, 89);
        studentProblem s3=new studentProblem("pavan", 21, 99);
        s1.display();
        s2.display();
        s3.display();
    }
}
