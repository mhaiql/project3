/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    authors:
    haiqal
    khaffi
*/

package platnomor;

import java.util.Scanner;
/**
 *
 * @author haiqa
 */
public class plat {
    public static void main(String[] args) {
    int a;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nomor");
    a = scan.nextInt();
    if (a % 2 == 0) {
      System.out.print("Bilangan " + a + " adalah genap.\n");
    } else {
      System.out.print("Bilangan " + a + " adalah ganjil.\n");
    }
  }
}
