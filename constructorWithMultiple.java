public class constructorWithMultiple {
    String name;
    int age;
    constructorWithMultiple(String name,int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println(name+"-"+age);
    }
    public static void main(String[] args) {
        constructorWithMultiple c1=new constructorWithMultiple("rajya",21 );
        constructorWithMultiple c2=new constructorWithMultiple("pushpa", 18);
        constructorWithMultiple c3=new constructorWithMultiple( "lakshmi", 15);   
     c1.display();
     c2.display();
     c3.display();
    }
}
