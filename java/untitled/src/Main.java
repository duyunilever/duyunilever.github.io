import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số hàng");
//        int a = sc.nextInt();
//        System.out.println("Nhập số cột");
//        int b = sc.nextInt();
//        int[][] numbers = new int[a][b];
//
////Để duyệt mảng đa chiều cần sử dụng 2 vòng lặp, 1 vòng lặp duyệt hàng và một vòng lặp duyệt cột
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = 0; j < numbers[i].length; j++){
//                System.out.println("Nhập giá trị hàng" + (i+1) + "cột" + (j+1));
//                numbers [i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int sum1=0;
//        int sum2=0;
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                if (numbers[i][j] % 2 == 0){
//                    sum1+= numbers[i][j];
//                } else if (numbers[i][j] % 2 != 0) {
//                    sum2+= numbers[i][j];
//                }
//            }
//        }
//        System.out.println(sum1 + "|" + sum2);






        System.out.println("Nhập số lượng phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int [] arr = new int[b];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Giá trị lớn nhất trong mảng là: " + arr[arr.length-1]);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[0]);
    }
}