
//pattern to be printed
//A B C D E
// 1 2 3 4
//  A B C
//   1 2
//    A

public class numericpattern218 {
    public static void main(String[] args) {
        int n =5;
        for (int row = 1; row <=5 ; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print(" ");
            }
            char value = row % 2 == 0?'1':'A';
            for (int col = 1; col <= 2*(n-row)+1; col++) {
                if (col % 2 == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(value);
                    value++;
                }
            }
            System.out.println();
        }
    }
}

