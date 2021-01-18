class Fibonacci {
    public static void main (String args[]) {
        int seriesNum = 7 ; 
        int num1 = 0 ; 
        int num2 = 1 ; 
        int sum ; 
        System.out.print(num1 + " ") ;
        System.out.print(num2) ; 

        // 0 1 1 2 3 5
        for (int i = 2 ; i <= seriesNum ; i++){
            sum = num1 + num2 ;
            num1 = num2 ;  
            num2 = sum ;  
            System.out.print(" " + sum) ; 
        }
    }
}