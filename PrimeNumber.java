import java.util.Scanner ; 

class PrimeNumner {
    public static void main (String args[]) {
// 1,3,5,7,11,13,17,19,23,29,31,......
        int num1  ; 
        int checkPoint = 0 ; 
        Scanner sc = new Scanner (System.in) ; 
        num1 = sc.nextInt() ; 
        for (int i = 2 ; i<= num1/2 ; i++) {
            if(num1%i == 0) {
                System.out.println("Not a prime number !!") ; 
                checkPoint = 1 ;
                break ;  
            }
            
        }
        if (checkPoint == 0 ){
            System.out.println("Prime number !!") ; 
        }
    }
}