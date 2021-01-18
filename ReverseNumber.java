import java.util.Scanner ; 
class ReverseNumber {
    public static void main (String args[]) {

        Scanner sc  = new Scanner (System.in) ; 
        int num1  = sc.nextInt() ; //1234
        int num2  = num1 ;  

        int reverseNumber   = 0 ; 
        int remainder ; 
        while (num1 >0){
            num1  = num1/10 ; //123
            remainder = num2%10 ; //4
            num2 = num1 ; 
            reverseNumber = reverseNumber*10 + remainder ; 
        }
        System.out.println(reverseNumber) ; 
    }
}