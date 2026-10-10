public class productProblem {
   int productId;
   String productName;
   int quantity;
   double price;
  
    productProblem(int productId,String productName,int quantity,double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    void calculateTotal(){
        System.out.println("productID :"+productId);
        System.out.println("productName:"+productName);
        System.out.println("Quqntity ;"+quantity);
        double total=quantity  * price ; 
        System.out.println("Total : "+total);
        System.out.println(" ");

    }
    public static void main(String[] args) {
        
 
    productProblem p1 =new productProblem(123," Dell", 2, 20000.00);
    productProblem p2=new productProblem(124, "honor", 2, 40000.00);
    
    p1.calculateTotal();
    p2.calculateTotal();
}
}
