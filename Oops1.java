class Oops{
    String name;
    int age;
    void study(){
        System.out.println("student is studying");
    }
    public static void main(String[] args) {
        
        Oops s=new Oops();
        s.name="rajya";
        s.age=21;
        System.out.println(s.name);
        System.out.println(s.age);
        s.study();
    }
}