package qlsv;

import java.awt.*;
import java.util.Scanner;

public class main {

    public static void Menu() {
        System.out.println("=======CHỌN=======");
        System.out.println( "1. Thêm sinh viên" );
        System.out.println( "2. Thêm sinh lớp" );
        System.out.println( "3. Sửa sinh viên" );
        System.out.println( "4. Sửa sinh lớp" );
        System.out.println( "5. Xoá " );
        System.out.println( "6. Tìm kiếm " );
        System.out.println( "7. Hiển thị danh sách sinh viên");
        System.out.println( "8. Hiển thị danh sách lớp");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        Sinhvien[] sv = null;
        lop[] lp = null;
        boolean f = true;
        do{
            Menu();
            System.out.println("Mời lựa chọn: ");
            int c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Số lượng sinh viên cần nhập: ");
                    int n = sc.nextInt();
                    sv = new Sinhvien[n];

                    for(int i = 0; i < sv.length; i++){
                        System.out.println("Nhập sinh viên thứ: " + (i + 1));
                        sv[i] = new Sinhvien();
                        sv[i].Input();
                    }
                    break;
                case 2:
                    System.out.println("Số lớp cần nhập: ");
                    int m = sc.nextInt();
                    lp = new lop[m];

                    for (int s = 0; s < lp.length; s++){
                        System.out.println("Nhập lớp thứ " + (s + 1 ));
                        lp[s] = new lop();
                        lp[s].Input();
                    }

                case 7:
                    System.out.println("Danh sách sinh viên: ");
                    for(int i = 0; i < sv.length; i++){
                        System.out.println("Sinh viên thứ " + (i + 1));
                        sv[i].Output();
                        System.out.println("------------------------------- \n");
                    }
                    break;
                case 8:
                    System.out.println("Hiển thị danh sách lớp");
                    for(int s = 0; s < lp.length; s++){
                        System.out.println("Lớp thứ" + (s + 1));
                        lp[s].Output();
                        System.out.println("------------------------------- \n");
                    }
                    break;
            }
        }while (f);
    }
}
