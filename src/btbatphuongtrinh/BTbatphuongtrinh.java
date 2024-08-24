package btbatphuongtrinh;

import java.util.Scanner;

public class BTbatphuongtrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        Double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        Double b = sc.nextDouble();
        if(a==0&&b==0)
        {
            System.out.println("Phuong trinh vo so nghiem");
        }
        else if(a==0&&b!=0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else System.out.println("Phuong trinh co mot nghiem x="+(double)(-b/a));
    }
    
}
