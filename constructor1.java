public class constructor1 {
    String name;
    int age;
    constructor1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        constructor1 c=new constructor1("rajya",21);  
        System.out.println("Name: " + c.name);
        System.out.println("Age: " + c.age);
      }
    
}
