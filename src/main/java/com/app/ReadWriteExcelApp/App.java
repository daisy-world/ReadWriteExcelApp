package com.app.ReadWriteExcelApp;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ExcelService servie = new ExcelService();
       List<User> userList = servie.ReadDataFromExcel("D:/writeToExcelSheet/user.xlsx");
       System.out.println("userList........ "  +  userList);
         
    }
    
    

}
