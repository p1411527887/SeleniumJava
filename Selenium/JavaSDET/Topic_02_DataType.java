package JavaSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Topic_02_DataType {
//Global variable
    static int phoneNumber;
    String address = " hcm";

    public static void main(String[] args) {
    //Local variable

        // du lieu nguyen thuy
        byte bNumber = 6;
        short sNumber = 15000;
        int iNumber = 65000;
        long lNumber = 65000;
        double dNumber = 15.98d;
        float fNumber = 15.98f;
        char cChar = 'p';
        boolean bStatus = false;

        // du lieu tham chieu
        // Array
        String[] studentAddress = {"ha noi", "da nang", "HCM"};
        Integer[] studentNumber = {16,20,100};
        // String
        String address = " ho chi minh";
        // Class
        Topic_02_DataType topic ;
        // Interface
        WebDriver driver;
        // Object
        Object aObject;
        // Collection (List , Set , Queue , Map)
        //List<WebElement> elements = driver.findElements(By.xpath(""));
        //Set<String> allWindow = driver.getWindowHandles();



    }
}
