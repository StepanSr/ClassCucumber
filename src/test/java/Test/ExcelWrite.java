package Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception {
        XSSFSheet worksheet;
        XSSFWorkbook workbook;
        XSSFRow row;
        XSSFCell cell;


        String path = "src/SampleData.xlsx";
        File file = new File(path);
        FileInputStream inputStream= new FileInputStream(file);


    workbook = new XSSFWorkbook(inputStream);
    worksheet = workbook.getSheet("Employees");


    row = worksheet.getRow(4);
    cell = row.getCell(0);


        System.out.println(cell.toString());
        System.out.println(cell.toString()+"<--------");

        XSSFCell adamCell = worksheet.getRow(5).getCell(0);
        System.out.println(adamCell+"  <------ 1");
        adamCell.setCellValue("Madam");
        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        System.out.println(adamCell+"<_-------- after change");

        adamCell.setCellValue("pp");

        workbook.write(outputStream);
        System.out.println(adamCell+"<_-------- after change");



        int r = worksheet.getLastRowNum();
        for(int z = 0; z<r; z++){
            if (worksheet.getRow(z).getCell(1).toString().equals("Kochar")){
                worksheet.getRow(z).getCell(3).setCellValue("president");
                workbook.write(outputStream);
                break;
            }
        }





        outputStream.close();
        inputStream.close();
        workbook.close();



    }
}
