//Pham Thanh Tung _ 22021128
//kiem tra 3 kich thuoc nhap vao co phai la 3 canh cua tam giac khong
import java.util.Scanner;

public class Main {

  public boolen checkTriangle(float a, float b, float c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("3 canh tam giac phai lon hon 0");
      return 0;
    }else{
      if (a + b > c && a + c > b && b + c > a) {
        return 1;
      } else {
        System.out.println(a+"; "+b+"; "+c+"; Khong hong phai la 3 canh cua tam giac");
        return 0;
      }
    }
  }

  public static void main(String[] args) {
    float a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap 3 canh cua tam giac: ");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    if(checkTriangle(a, b, c)){
      System.out.println(a+"; "+b+"; "+c+"; La 3 canh cua tam giac");
    }

  }


}