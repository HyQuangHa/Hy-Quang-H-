import java.util.*;
public class Bai4_Map {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Nhap mang so thuc: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        Map<Double, Integer> countMap = new HashMap<>();
        for (double num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Cac phan tu xuat hien trong mang dung mot lan: ");
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}