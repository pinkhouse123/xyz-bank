package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Umi" , "Patel" , "34562"},


        };
        return data;
    }

}