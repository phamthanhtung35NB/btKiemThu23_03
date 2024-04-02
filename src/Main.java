import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int vt = scanner.nextInt();
    int d = scanner.nextInt();

    if (vt <= 0 || d <= 0 || vt > 120) {
      System.out.println("input khong hop le");
      return;
    }

    // Xác định khoảng cách an toàn tối thiểu theo vận tốc
    int khoangCachAnToan = 0;
    if (vt <= 60) {
      khoangCachAnToan = 35;
    } else if (vt <= 80) {
      khoangCachAnToan = 55;
    } else if (vt <= 100) {
      khoangCachAnToan = 70;
    } else if (vt <= 120) {
      khoangCachAnToan = 100;
    }
    if (d < khoangCachAnToan) {
      System.out.println("Cảnh báo");
      return;
    }
    System.out.println("An toàn");
    return;
  }
}


