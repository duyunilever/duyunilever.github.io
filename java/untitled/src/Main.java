import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continues;
        String name;
        String address;
        int age;
        do {
            System.out.println("Mời nhập tên: ");
            name = sc.nextLine();
            System.out.println("Mời nhập địa chỉ: ");
            address = sc.nextLine();
            System.out.println("Mời nhập tuổi: ");
            age = Integer.parseInt(sc.nextLine());

            System.out.println("Thông tin sinh viên");
            System.out.println("Tên: " + name);
            System.out.println("Địa chỉ: " + address);
            if (age>0) {
                System.out.println("Tuổi: " + age);
            } else {
                System.out.println("Tuổi: Bạn nhập sai, mời nhập lại");
            }

            System.out.println("Bạn có muốn nhập tiếp thông tin không?(Y/N)");
            continues = sc.nextLine();
        } while (continues.equalsIgnoreCase("y"));
    }
}