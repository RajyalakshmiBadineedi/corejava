public class Employee {
    int id ;
    String name;
    Double salary;
    Employee(int id,String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name:"+ name);
         System.out.println("Ld :"+id);
          System.out.println("salary :"+ salary);
          System.out.println(" ");
    
    }
    public static void main(String[] args) {
        Employee e1=new Employee(12345," Lakshmi", 50000.00);
        Employee e2=new Employee(12346," Saidu", 50000.00);
        Employee e3=new Employee(12347," pavan", 50000.00);
      e1.display();
      e2.display();
      e3.display();
        

    }
}
