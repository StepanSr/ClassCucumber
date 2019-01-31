package Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;
import utilities.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EcxelRead {
    public static void main(String[] args) throws Exception {

        File file = new File("src/SampleData.xlsx");//<---
       System.out.println(file.exists());

//reading file
        FileInputStream inputstream = new FileInputStream(file);



  //Loading into the class
        XSSFWorkbook workbookk = new XSSFWorkbook(inputstream);

        //passing worksheet and name
        XSSFSheet worksheet = workbookk.getSheet("Employees");//<------


   int  rowsUsed = worksheet.getPhysicalNumberOfRows();
   int lstRowUsed = worksheet.getLastRowNum();

        jobId(worksheet,"Nancy");
        String lastName= Config.getProperty("lastName");
        print_info(worksheet,lastName);


   workbookk.close();
   inputstream.close();
//TODO: print nancy job id
    }
    public static void jobId(XSSFSheet worksheet, String name){
        int lstRowUsed = worksheet.getLastRowNum();
        for(int z = 0;z<=lstRowUsed;z++){
            if(worksheet.getRow(z).getCell(0).toString().equals("Nancy")){
                System.out.println(worksheet.getRow(z).getCell(2));
            }
        }

    }
    public static void print_info(XSSFSheet worksheet, String lastName){
        int lstRowUsed = worksheet.getLastRowNum();
        for(int z = 0;z<=lstRowUsed;z++){
            if(worksheet.getRow(z).getCell(1).toString().equals(lastName)){
                System.out.println(worksheet.getRow(z).getCell(2));
                //TODO print all row
            }
        }

    }
}
