package com.keb.gt.gtplanner.date;

import java.util.Calendar;

/**
 * Class Computus takes in a year, and initializes it. Using that year value, it then calculates the date of easter that year using an algorithm
 * @author anuccio
 *
 */
public class Computus {

    /**
     * used in the algorithm
     */
    private int a,b,c,d,e,f,g,h,i,k,L,m;
    /**
     * private global values of day month and year
     */
    private int day, month, year;
    String Month;

    /**
     * Constructor initiates Class with a value for year
     * @param x int value of year
     */
    public Computus(int x){
        year = x;
    }

    /**
     * Using a known algorithm, this method calculates the day and month for the given year
     */
    public Calendar calcEasterDate(){
        a = year% 19;
        b = (int) Math.floor(year/100);
        c = year % 100;
        d = (int) Math.floor(b/4);
        e = b % 4;
        f = (int) Math.floor((b + 8) / 25);
        g = (int) Math.floor((b - f + 1) / 3);
        h = (19*a + b - d - g + 15) % 30;
        i = (int) Math.floor(c/4);
        k = c%4;
        L = (32 + 2*e + 2*i - h - k) % 7;
        m = (int) Math.floor((a + 11*h + 22*L) / 451);
        month = (int) Math.floor((h + L - 7*m + 114) / 31);
        day = (((h + L - (7*m) + 114) % 31) + 1);
        Calendar instance = Calendar.getInstance();
        instance.set(year, month, day);
        return instance;
    }

    /**
     * This class loops through an entire cycle, and outputs the amount of times easter occured on each day
     */
    public void Eastercounter(){

        int i,j;
        String m = "";

        int frequency[][] = new int [2][31];

        for (i=0; i<2; i++){						//initialize frequency array
            for(j=0;j<31;j++){
                frequency[i][j] = 0;
            }//end inner for
        }//end outer for


        for(i=1; i <= 5700000; i++){
            year = i;
            calcEasterDate();

            for(i=0;i<2;i++){
                for(j=0;j<31;j++){
                    if((i == 0 && j<21) || (i==1 && j>24)){
                        continue;
                    }
                    if ((i+3) == month && (j+1) == day ){
                        ++frequency[i][j];

                    }//end if
                }//end inner for
            }//end outer for
        }//end loop through years

        for(i=0;i<2;i++){
            for(j=0;j<31;j++){

                if (i == 0){
                    m = "March";
                }
                if (i == 1){
                    m = "April";
                }

                if (frequency[i][j] != 0)
                    System.out.printf("%s %d - %d\n",m,(j+1), frequency[i][j]);
            }
        }
    }

    /**
     * This method displays the date of easter
     */
    public String displayEaster(){

        if (month == 3){
            Month = "März";
        }
        if (month == 4){
            Month = "April";
        }

        System.out.printf("\nEaster:%s %d, %d ",Month,day,year);
        return String.format("Easter: %d. %s %d",day, Month, year);
    }

}
