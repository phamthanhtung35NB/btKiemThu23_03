//Pham Thanh Tung _ 22021128
//kiem tra 3 kich thuoc nhap vao co phai la 3 canh cua tam giac khong
import java.util.Scanner;
public class Main {

  float a, b, c;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap 3 canh cua tam giac: ");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("3 canh tam giac phai lon hon 0");
      return;
    }else{
      if (a + b > c && a + c > b && b + c > a) {
        System.out.println(a+"; "+b+"; "+c+"; La 3 canh cua tam giac");
      } else {
        System.out.println(a+"; "+b+"; "+c+"; Khong hong phai la 3 canh cua tam giac");
      }
    }

  }


}