import java.util.*;
import org.jfree.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.*;

public class Main {

    static int middleSquareMethod(int number){

        int newNumber = number * number;
        newNumber += 99713;
        newNumber = newNumber / 100;

        int nextNumber = newNumber % 10000;

        return nextNumber;
    }

    static void middleSquareSolve(){
        int start = 1000;
        int end = 10000;

        //Random rand = new Random();
        //int number = rand.nextInt(end-start) + start;
        int number = 2500;
        System.out.println("Seed " + number + " ");
        for(int i=0;i<10000;i++) {
            number = middleSquareMethod(number);
            System.out.println(number + " ");
        }
    }

    static int lehmerMethod(int number, int a, int c, int m){

        if (c != 0)
            return (a*number + c)%m;
        else
            return number/m;
    }

    static void lehmerSolve(){

        int start = 1000;
        int end = 10000;

        Random rand = new Random();
        int number = rand.nextInt(end-start) + start;
        //int number = 5;
        System.out.println("Seed " + number);
        for(int i=0;i<10;i++){
            number = lehmerMethod(number,5,1,16);
            System.out.println(number);
        }
    }

    static void randomMethod3(){

        int start = 1000;
        int end = 10000;

        Random rand = new Random();
        for(int i=0;i<10000;++i)
            System.out.println(rand.nextInt(end-start) + start);
    }

    static int score(int num1, int num2){
        int nr = 0;
        if (num1 * num1 + num2 * num2 <= 10000 * 10000)
            nr++;
        return nr;
    }

    static double scoreMiddleSquareMethod(int num1, int num2){
        int nr = 0;
        for(int i=0;i<10000;i++){
            num1 = middleSquareMethod(num1);
            num2 = middleSquareMethod(num2);
            if (num1*num1 + num2*num2 <= 10000*10000)
                nr++;
        }
        return nr/2500.0;
    }

    static double scoreLehmarMethod(int num1, int num2){
        int nr = 0;
        for(int i=0;i<10000;i++){
            num1 = lehmerMethod(num1,5,1,16);
            num2 = lehmerMethod(num2,5,1,16);
            if (num1*num1 + num2*num2 <= 10000*10000)
                nr++;
        }
        return nr/2500.0;
    }

    static double scoreRandomMethod(){
        int num1, num2;
        int nr = 0;
        Random rand = new Random();

        for(int i=0;i<10000;i++){
            num1 = rand.nextInt(10000-1000)+1000;
            num2 = rand.nextInt(10000-1000)+1000;
            if (num1*num1 + num2*num2 <= 10000*10000)
                nr++;
        }
        return nr/2500.0;
    }

    static void printAllScores(){
        int num1 = 6789;
        int num2 = 2345;

        int nr = 0;
        for(int i=0;i<10000;i++){
            num1 = middleSquareMethod(num1);
            num2 = middleSquareMethod(num2);
            if (num1*num1 + num2*num2 <= 10000*10000)
                nr++;
        }
        System.out.println("Middle Square Method: " + nr/2500.0);

        nr = 0;
        for(int i=0;i<10000;i++){
            num1 = lehmerMethod(num1,5,1,16);
            num2 = lehmerMethod(num2,5,1,16);
            nr = nr + score(num1,num2);
        }
        System.out.println("Lehmar Method: " + nr/2500.0);

        nr = 0;
        Random rand = new Random();
        for(int i=0;i<10000;i++){
            num1 = rand.nextInt(10000-1000)+1000;
            num2 = rand.nextInt(10000-1000)+1000;
            nr = nr + score(num1,num2);
        }
        System.out.println("Random Method: " + nr/2500.0);

    }



    public static void main(String []args) throws Exception{
        //middleSquareSolve();
        //lehmerSolve();
        //randomMethod3();
        //System.out.println(numereGenerate() + " dif = " + (3.1415 - numereGenerate()));

        /*
        int num1 = 2500;
        int num2 = 3636;
        int numbers = score(num1,num2);
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        if (choose == 0){
            for(int i=0;i<10000;i++){
                num1 = middleSquareMethod(num1);
                num2 = middleSquareMethod(num2);
                numbers += score(num1,num2);
            }
            System.out.println(numbers/2500.0);
        }
        else if(choose == 1){
            for(int i=0;i<10000;i++){
                num1 = lehmerMethod(num1,5,1,16);
                num2 = lehmerMethod(num2,5,1,16);
                numbers += score(num1,num2);
            }
            System.out.println(numbers/2500.0);
        }
        else {
            int start = 1000;
            int end = 10000;
            Random rand = new Random();
            for(int i=0;i<10000;i++){
                num1 = rand.nextInt(end-start) + start;
                num2 = rand.nextInt(end-start) + start;
                numbers += score(num1,num2);
            }
            System.out.println(numbers/2500.0);
        }

        */

        //printAllScores();


        ArrayList<Integer> myArrayOfNumbers = new ArrayList<Integer>();
        ArrayList<Integer> myArrayOfFrequency = new ArrayList<Integer>();

        int number = 2500;
        System.out.println("Seed " + number);
        Random rand = new Random();

        for(int i=0;i<10000;i++){
            myArrayOfNumbers.add(number);
            //number = middleSquareMethod(number);
            number = rand.nextInt(10000-1000)+1000;
        }

        for(int i=0;i<10000;i++){
            int freq = Collections.frequency(myArrayOfNumbers, myArrayOfNumbers.get(i));
            myArrayOfFrequency.add(freq);
        }

        for(int i=0;i<10000;i++){
            System.out.println(myArrayOfNumbers.get(i) + " -> " + myArrayOfFrequency.get(i));
        }

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        for(int i=0;i<10000;i++){
            dataset.addValue(myArrayOfFrequency.get(i),"metod",myArrayOfNumbers.get(i));
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                " Array STATIStICS",
                "Category", "Score",
                dataset, PlotOrientation.VERTICAL,
                true, true, false);

        int width = 1920;    /* Width of the image */
        int height = 1080;   /* Height of the image */
        File BarChart = new File( "BarChart.jpeg" );
        ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
    }
}
