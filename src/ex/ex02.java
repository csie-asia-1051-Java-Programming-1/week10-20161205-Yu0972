package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021045 郭毓呈
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print ( "輸入使用度數=" ) ;
		int n = scn.nextInt ( ) ;
		if ( n <= 120 ) {
			System.out.println ( n * 2.10 ) ;
			System.out.println ( n * 2.10 ) ;
	}else{
		if ( n > 120 && n <= 330 ) {
			System.out.println ( ( n - 120 ) * 3.02 + 252 ) ;
			System.out.println ( ( n - 120 ) * 2.68 + 252 ) ;
	}else{
		if ( n > 330 && n <= 500 ) {
			System.out.println ( ( n - 330 ) * 4.39 + 886.2 ) ;
			System.out.println ( ( n - 330 ) * 3.61 + 814.8 ) ;
	}else{
		if ( n > 500 && n <= 700 ) {
			System.out.println ( ( n - 500 ) * 4.97 + 1632.5 ) ;
			System.out.println ( ( n - 500 ) * 4.01 + 1428.5 ) ;
	}else{
		if ( n > 700 ) {
			System.out.println ( ( n - 700 ) * 5.63 + 2626.5 ) ;
			System.out.println ( ( n - 700 ) * 4.50 + 2230.5 ) ;
						}
					}
				}
			}
		}
	}
}
