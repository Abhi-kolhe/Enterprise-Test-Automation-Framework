package com.framework.ui;

import com.framework.core.BaseTest;
import org.testng.annotations.Test;
import com.framework.utils.Log;
import com.framework.utils.ExcelUtils;

public class SampleUITest extends BaseTest {
    @Test
    public void testSampleUI(){
        driver.get("https://www.google.com/");
        System.out.println("Title is: " + driver.getTitle());
        Log.info("Hello Logging!");
        String data = ExcelUtils.getCellValue("src/test/resources/TestData.xlsx", "Sheet1", 0, 1);
        System.out.println("Cell Value: " + data);
    }
}
