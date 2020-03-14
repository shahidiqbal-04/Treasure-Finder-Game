package javaapplication7;

import java.security.SecureRandom;
import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 
        SecureRandom randnoGenerator = new SecureRandom() ;
        int op, rand1 = 0 , rand2 = 0 , index = 0 , indexx = 0;
        String turn = "0" ;
        rand1 = randnoGenerator.nextInt(20) - 10 ;
        rand2 = randnoGenerator.nextInt(20) - 10 ;
        System.out.println("Please enter the difficulty level. ") ;
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Difficult");
        op = input.nextInt () ;
        if (op == 1){
            easy(turn, rand1, rand2, index, indexx) ;
        }
        if (op == 2){
            medium(turn, rand1, rand2, index, indexx) ;
        }
        if (op == 3){
            difficut(turn, rand1, rand2, index, indexx) ;
        }   
    }
    public static void easy(String turn, int rand1, int rand2, int index, int indexx){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Your treasure ha been placed and now you are going to find that!!!!");
        System.out.println("Best of Luck!!!!");
        System.out.println("Your numbers are : " + rand1 + "  " + rand2 );
        int a = 0, b = 0;
        if( rand1 < 0 ){
            a = -1 * rand1  ;
        } else{
            a = rand1;
        }
        if( rand2 < 0 ){
            b = -1 * rand2 ;
        } else{
            b = rand2 ;
        }
        for (int i = 1 ; i <= (a + b + 4) ; i++)
        {
            System.out.println("Turn " + i + ". Remaining turns are " + ((a + b + 4) - i) );
            turn = input.next() ;
            if("w".equals(turn) || "W".equals(turn)){
                index++ ;
            }
            if("s".equals(turn) || "S".equals(turn)){
                index-- ;
            }
            if("d".equals(turn) || "D".equals(turn)){
                indexx++ ;
            }
            if("a".equals(turn) || "A".equals(turn)){
                indexx-- ;
            }
            int result = win(index, indexx, rand1, rand2);
            if( result == 0 ) {
                System.out.println("Congrajulations!!! You have found the treasure...") ;
                break ;
            }
        }            
    }
    public static void medium(String turn, int rand1, int rand2, int index, int indexx) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Your treasure ha been placed and now you are going to find that!!!!");
        System.out.println("Best of Luck!!!!");
        System.out.println("Your numbers are : " + rand1 + "  " + rand2 );
        int a = 0, b = 0;
        if( rand1 < 0 ){
            a = -1 * rand1 ;
        } else{
            a = rand1 ;
        }
        if( rand2 < 0 ){
            b = -1 * rand2 ;
        } else{
            b = rand2 ;
        }
        for (int i = 1 ; i <= (a + b + 2) ; i++)
        {
            System.out.println("Turn " + i + ". Remaining turns are " + ((a + b + 2) - i) );
            turn = input.next() ;
            if("w".equals(turn) || "W".equals(turn)){
                index++ ;
            }
            if("s".equals(turn) || "S".equals(turn)){
                index-- ;
            }
            if("d".equals(turn) || "D".equals(turn)){
                indexx++ ;
            }
            if("a".equals(turn) || "A".equals(turn)){
                indexx-- ;
            }
            int result = win(index, indexx, rand1, rand2);
            if( result == 0 ) {
                System.out.println("Congrajulations!!! You have found the treasure...") ;
                break ;
            }
        }
    }
    public static void difficut(String turn, int rand1, int rand2, int index, int indexx) {
        Scanner input = new Scanner(System.in) ;
        int a = 0 , b = 0;
        System.out.println("Your treasure ha been placed and now you are going to find that!!!!");
        System.out.println("Best of Luck!!!!");
        System.out.println("Your numbers are : " + rand1 + "  " + rand2 );
        if( rand1 < 0 ){
            a = -1 * rand1 ;
        } else{
            a = rand1 ;
        }
        if( rand2 < 0 ){
            b = -1 * rand2 ;
        } else{
            b = rand2 ;
        }
        for (int i = 1 ; i <= (a + b) ; i++)
        {
            System.out.println("Turn " + i + ". Remaining turns are " + ((a + b) - i) );
            turn = input.next() ;
            if("w".equals(turn) || "W".equals(turn)){
                index++ ;
            }
            if("s".equals(turn) || "S".equals(turn)){
                index-- ;
            }
            if("d".equals(turn) || "D".equals(turn)){
                indexx++ ;
            }
            if("a".equals(turn) || "A".equals(turn)){
                indexx-- ;
            }
            int result = win(index, indexx, rand1, rand2);
            if( result == 0 ) {
                System.out.println("Congrajulations!!! You have found the treasure...") ;
                break ;
            }
        }
    }
    public static int win(int index, int indexx, int rand1, int rand2) {
        System.out.println("Values are : " + indexx + " : " + index + " & " + rand1 + " : " + rand2);
        if( indexx == rand1 && index == rand2 )
            return 0 ;
        else
            return 1 ; 
    }
    }
