/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testprog;

/**
 *
 * @author Student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //single dimensional arrays 
        // TODO code application logic here
        string[] cities = ("CAPE TOWN","PORT ELIZABETH","PRETORIA");
        string[] consoles = ("PS5","XBOX","SWITCH");
        
        //two dimesional array rows = cities , columns = consoles
        int[][] sales = {
            {1000,2000,3000,}, // Cape town
            {2000,3000,4000,}, // Port elizabeth
            {1500,1100,1200,} // Pretoria
        };
        // single dimensional array for city totals
        int[] totals = new int[cities.length];
        string line = "------";
        
        //----report header----
        system.out.printIn(line);
        system.out.printIn("GAMING CONSOLE REPORT");
        system.out.printIn(line);
        
        //console names
        system.out.printf("name of the consoles","");
        for (int c = 0; c < consoles.length; c++) {
            system.out.printf("consoles",consoles[c]);
        }
        systen.out.printIn();
        
        //sales data rows + calculated totals
        for (int r = 0; r < cities.length; r++){
            system.out.printf("amount", cities[r]);
            for (int c = 0, c < consoles.length, c++){
                system.out.printf("amount", sales[r][c]);
                total[r] += sales[r][c];
            }
            system.out.printIn();
        }
        
        //----totals for each city-----
        system.out.printIn(line);
        system.out.printIn("CONSOLE SALES TOTALS FOR EACH CITY");
        systm.out.printIn(line);
        
        int maxIndex = 0;
        for (int r = 0; r < cities.length; r++){
            system.out.printf(amount,cities[r], totals[r]);
            if (totals[r]) > total[maxIndex]) {
               maxindex = r
            }
        }
        // ----city with the most sales----
        system.out.printIn();
        system.out.printIn("CITY WITH HE MOST SALES :" + cities[maxIndex]);
        system.out.printIn(line);
    }
}
