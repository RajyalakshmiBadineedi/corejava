public class libraryBook {
int bookId;
String bookName;
String author;
boolean isIssued;
libraryBook(int bookId,String bookName,String author,boolean isIssued){
    this.bookId=bookId;
    this.bookName=bookName;
    this.author=author;
    this.isIssued=isIssued;
}
void issueBook(){
    if (isIssued){
       
        System.out.println(" ");
        System.out.println("Book is already issuesd :");
    }
    else {
       
        System.out.println(" ");
        System.out.println("Book issued successfully.");
    isIssued=true;
    }

}
void returnBook(){
   if (isIssued){
    System.out.println("Book returned successfully.");
    isIssued=false;
   } 
}
 void displayStatus(){
    System.out.println("Id :"+ bookId);
    System.out.println("Book Name :"+bookName);
    System.out.println("Author Name :"+author);
    if (isIssued) {
    System.out.println("Status: Issued");
} else {
    System.out.println("Status: Available");
}
    

}
public static void main(String[] args) {
    libraryBook l1=new libraryBook(101,"java programming","james",false);
     l1.displayStatus();
     l1.issueBook();
     System.out.println(" ");
    
     l1.displayStatus();
     l1.issueBook();
     System.out.println(" ");
    
     l1.returnBook();
     System.out.println(" ");
     l1.displayStatus();
    
}
}
