package Test;

import org.apache.http.util.Asserts;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMilageCalculatorPage;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class MilageCalculatorTes {
    GasMilageCalculatorPage gasPageOBG;
    private WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    FileInputStream inputStream;
    FileOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        driver = Driver.getDriver();
        driver.get("https://www.calculator.net/gas-mileage-calculator.html?ctype=standard&uscodreading=12360&uspodreading=12000&usgasputin=15&usgasprice=3&x=76&y=20&mucodreading=18900&mupodreading=18300&mugasputin=50&mugasprice=1");
        inputStream = new FileInputStream("src/test/resources/teData/Gas.xlsx");
        // inputStream = new FileInputStream("gasPath");
        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Sheet1");
    }

    @Test
    public void dataDrivenMileageCalcTest() throws Exception {
        for (int z = 1; z < worksheet.getPhysicalNumberOfRows(); z++) {
            XSSFRow curenrRow = worksheet.getRow(z);
            double currentOd = curenrRow.getCell(1).getNumericCellValue();
            double previoustOd = curenrRow.getCell(2).getNumericCellValue();
            double gasGal = curenrRow.getCell(3).getNumericCellValue();
            double expResult = (currentOd - previoustOd) / gasGal;

            prep(currentOd, previoustOd, gasGal);

            if(curenrRow.getCell(4)==null){
                curenrRow.createCell(4);
            }

        }
        outputStream =new FileOutputStream("src/test/resources/teData/Gas.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        inputStream.close();
    }

    public void prep(double currentOd, double previoustOd, double gasGal) {


        gasPageOBG = new GasMilageCalculatorPage();

//        double currentOd = 123000;
//        double previoustOd = 122000;
//        double gasGal = 70;


        gasPageOBG.currentOdometerInput.clear();
        gasPageOBG.currentOdometerInput.sendKeys(String.valueOf(currentOd));

        gasPageOBG.previoustOdometerInput.clear();
        gasPageOBG.previoustOdometerInput.sendKeys(String.valueOf(previoustOd));

        gasPageOBG.gasInput.clear();
        gasPageOBG.gasInput.sendKeys(String.valueOf(gasGal));

        gasPageOBG.calculateBtn.click();

        double expResult = (currentOd - previoustOd) / gasGal;

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String[] res = gasPageOBG.resultInGalon.getText().split(" ");
        String actualresultGalon = String.valueOf(res[0]);


        System.out.println(actualresultGalon);
        if (String.valueOf(decimalFormat.format(expResult)).equals(res[0])) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println(actualresultGalon + "<---actualresultGalon");
            System.out.println(expResult + "<----expResult");
        }
        //return actualresultGalon;

        // double exResult = worksheet.getRow(1).getCell(1)

//        String r = gasPageOBG.resultInGalon.getText();
//        Assert.assertTrue();


//from intj

//from git


    }
}
