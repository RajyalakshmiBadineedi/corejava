public class constructureOverld {
    String name;
    int age;
    constructureOverld(){
        name="unknown";
        age=0;
    }
    constructureOverld(String name){
        this.name=name;
        age=0;
    }
    constructureOverld(String name,int age){
        this.name=name;
        this.age=age;
}
void display(){
 System.out.println(name +"-" + age);
}
     public static void main(String[] args){

    constructureOverld c1=new constructureOverld();
    constructureOverld c2=new constructureOverld("Jaya Sri");
    constructureOverld c3=new constructureOverld ( "priya",23);
    c1.display(); 
    c2.display();
    c3.display();
}

}
