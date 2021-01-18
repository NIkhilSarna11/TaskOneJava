class Palindrom {

    public static void main(String args[]){

        int palindromNumber = 10 ; 
        for (int i = 2 ; i < palindromNumber/2 ; i++) {
// 1,3,5,7,11,13....
            if (palindromNumber%i == 0) {
                System.out.println("Number is not palindrom") ; 
                break ; 
                
            }
            else {
                System.out.println("Number is palindrom") ;
                break ; 
            }
        }
    }
}