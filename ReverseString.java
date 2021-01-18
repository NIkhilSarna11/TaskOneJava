import java.util.Scanner ; 

class ReverseString {
 public static void main (String args[]) { 

    Scanner sc = new Scanner (System.in) ; 

     
    String name ; 
    String  reverse  = ""; 
   

    name = sc.nextLine () ; 
 
for (int i = name.length() -1 ; i>= 0 ; i--) {

    reverse = reverse + name.charAt(i) ; //nikhil
    //l = l+i
    //likhin
 
}
    System.out.println(reverse) ; 
    System.out.println(name) ; 
 }
    
}