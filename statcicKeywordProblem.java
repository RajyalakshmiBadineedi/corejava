public class statcicKeywordProblem {
  String name;
  int id;
  static String companyName="TCS";  
  statcicKeywordProblem(String name,int id){
    this.name=name;
    this.id=id;
  }
void display(){
System.out.println("Name :"+name);
System.out.println("ID :"+id);
System.out.println("Company Name :"+statcicKeywordProblem.companyName);
 System.out.println(" ");
     }
public static void main(String[] args) {
    statcicKeywordProblem s1=new statcicKeywordProblem("Sandhya", 101);
    statcicKeywordProblem s2=new statcicKeywordProblem("Vyshu", 102);
    s1.display();
    s2.display();
    System.out.println("After Changing Company Name ");
    System.out.println(" ");
    statcicKeywordProblem.companyName="Infosys";
    s1.display();
    s2.display();
}
  }


