package JavaSDET;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class topic_04_operator (){

    @Test
    public void TC_01() {
        int randomNumber = 10;


        if (randomNumber > 0 && randomNumber % 2 ==0){
            System.out.println("so ngau nhien la so chan ");
        } else {
            System.out.println("so ngau nhien laf so le ");
        }
    }

    @Test
    public void TC_02(){
        int soNgauNhien1 = 24;
        int soNgauNhien2 = 40;
        if (soNgauNhien1 >= soNgauNhien2){
            System.out.println("so 1 lon hon so 2 ");
        } else {
            System.out.println("so 2 lon hon so 1");
        }
    }
}
