package fa.training.dsa.unit02;

import java.util.Scanner;
import java.util.LinkedList;

import static fa.training.dsa.unit02.Linked_List.merge;

public class DSASA0206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("Nhap số phần tử của mảng 1: ");
        int n = scanner.nextInt();
        System.out.println("Nhap mang 1");
        for(int i = 0; i<n;i++){
            System.out.println("Nhap phan tu thu ["+ (i+1)+"]");
            list1.add(scanner.nextInt());
        }
        System.out.println("Nhap số phần tử của mảng 2: ");
        int m = scanner.nextInt();
        System.out.println("Nhap mang 2");
        for(int i = 0; i<m;i++){
            System.out.println("Nhap phan tu thu ["+ (i+1)+"]");
            list2.add(scanner.nextInt());
        }
        System.out.println("Ket qua: " + merge(list1,list2));
    }
}
