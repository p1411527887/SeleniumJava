package BaiTapJavaSDET;

import org.testng.annotations.Test;

public class DataType {
    @Test
    public void TC_01(){
        int a = 6;
        int b = 2;
        int P1 = a + b;
        int P2 = a - b;
        int P3 = a * b;
        int P4 = a / b;
        System.out.println("tong la " + P1);
        System.out.println("hieu la " + P2);
        System.out.println("tich la " + P3);
        System.out.println("thuong la " + P4);


    }
    @Test
    public void TC_02_DienTichHinhChuNhat(){
        float chieuDai = 7.5f;
        float chieuRong = 3.8f;
        float dienTich = chieuRong * chieuDai;
        System.out.println("dien tich hinh chu nhat la " + dienTich);


    }

    @Test
    public void TC_03(){
        String name;
        name = "automation testing";
        System.out.println("Hello" + " " + name);


    }

    @Test
    public void TC_04(){


    }
}
