import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelWriteTest {

    String PATH = "D:\\SiweiSurvey\\springboot-test\\EasyExcelTest";

    @Test
    public void testWrite03() throws Exception {

        //创建工作簿
        Workbook workbook = new XSSFWorkbook();
        //创建工作表
        Sheet sheet = workbook.createSheet("观众统计表");
        //创建行
        Row row1 = sheet.createRow(0);
        //创建单元格

        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("今日新增观众");

        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(666);

        Row row2 = sheet.createRow(1);
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("统计时间");

        Cell cell22 = row2.createCell(1);
        String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss");
        cell22.setCellValue(time);

        FileOutputStream fileOutputStream = new FileOutputStream(PATH + "统计表07.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        System.out.println("统计表07创建完毕");
    }

    @Test
    public void testWrite03BigData() throws Exception {
        long begin = System.currentTimeMillis();

        Workbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet();

        for(int rowNum = 0; rowNum < 65536;rowNum++){
            Row row = sheet.createRow(rowNum);
            for(int cellNum = 0;cellNum < 10;cellNum++){
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("Over.");

        FileOutputStream outputStream = new FileOutputStream(PATH + "testWrite03BigData.xls");
        workbook.write(outputStream);
        outputStream.close();

        long end = System.currentTimeMillis();

        System.out.println((double) (end-begin)/1000);
    }

    @Test
    public void testWrite07BigData() throws Exception {
        long begin = System.currentTimeMillis();

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet();

        for(int rowNum = 0; rowNum < 65537;rowNum++){
            Row row = sheet.createRow(rowNum);
            for(int cellNum = 0;cellNum < 10;cellNum++){
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("Over.");

        FileOutputStream outputStream = new FileOutputStream(PATH + "testWrite07BigData.xlsx");
        workbook.write(outputStream);
        outputStream.close();

        long end = System.currentTimeMillis();

        System.out.println((double) (end-begin)/1000);
    }

    @Test
    public void testWrite07BigDataS() throws Exception {
        long begin = System.currentTimeMillis();

        Workbook workbook = new SXSSFWorkbook();

        Sheet sheet = workbook.createSheet();

        for(int rowNum = 0; rowNum < 105537;rowNum++){
            Row row = sheet.createRow(rowNum);
            for(int cellNum = 0;cellNum < 10;cellNum++){
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("Over.");

        FileOutputStream outputStream = new FileOutputStream(PATH + "testWrite07BigDataS.xlsx");
        workbook.write(outputStream);
        outputStream.close();

        long end = System.currentTimeMillis();

        System.out.println((double) (end-begin)/1000);
    }


}
