import java.util.Scanner ; 

class RectangleName { 

    public static void main (String args[]) {
      Scanner sc = new Scanner(System.in) ; 

        int row  = sc.nextInt() ; // 5  ; 
        int column = sc.nextInt() ;  // 3 ;
        int midRow1 = (row/2)+(row%2) ;  
        int midColumn = (column/2)+(column%2) ;
         String name = "NIKH" ;
         System.out.println(midColumn) ; 

//5 row 
//3 column

        for (int i  = 1; i <= row ; i ++){
            for (int j = 1 ; j <= column ; j++){

                      if( i == 1 && j== midColumn ){
                          System.out.print(name.charAt(0)) ; 
                      }
                      else if (i == midRow1 && j == 1)
                      {
                        System.out.print(name.charAt(1)) ;
                      }

                      else if (i == midRow1 && j == column) {
                        System.out.print(name.charAt(2)) ;
                    }

                    else if (i == row  && j == midColumn) {
                        System.out.print(name.charAt(3)) ;
                    }

                     else {
                          System.out.print("*") ; 
            } 
        }
          
        System.out.println(" ") ; 
        }

    }
}