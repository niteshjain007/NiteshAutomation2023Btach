package practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcelDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream file = new FileInputStream(new File("testology_demo.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file); // constructor call for XSSFWorkbook class

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //List<String> = new ArrayList<String>();
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next(); // get the next row in the row
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                        case NUMERIC: // 0
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case STRING: // 1
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }// end of while loop for cell iterator
                System.out.println("");
            }// end of while loop for row iterator
            file.close();
        }// end of try block
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}