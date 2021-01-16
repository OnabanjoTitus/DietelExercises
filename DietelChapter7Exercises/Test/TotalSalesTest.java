import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalSalesTest {
    TotalSales totalSales;
    @BeforeEach
    void setUp() {
        totalSales= new TotalSales();
    }

    @AfterEach
    void tearDown() {
        totalSales= null;
    }
    @Test
    void testThatTotalSalesAndSalesPersonsAreEmpty(){
        totalSales.getTotalSalesPersons();
        int [][] sales= new int[6][5];
        assertArrayEquals(sales,totalSales.getTotalSalesPersons());
    }
    @Test
    void testThatEachSalesPersonSalesCanBeset(){
        int salesPerson=1;
        int salesProduct=1;
        int amountSold=200;
        int [][]test=new int [5][4];
        test[0][0]=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        assertArrayEquals(test,totalSales.getTotalSalesPersons());
    }
    @Test
    void testThatTotalForEachSalesPersonCanBeCalculated(){
        int salesPerson=1;
        int salesProduct=1;
        int amountSold=200;
        int [][]test=new int [5][4];
        test[0][0]=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        assertEquals(200,totalSales.getTotalSalesPerPerson(1));
    }
    @Test
    void testThatTotalForEachProductCanBeCalculated(){
        int salesPerson=1;
        int salesProduct=1;
        int amountSold=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        totalSales.getTotalSalesPerPerson(1);
         salesPerson=1;
         salesProduct=1;
         amountSold=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        totalSales.getTotalSalesPerPerson(1);
        salesPerson=2;
        salesProduct=1;
        amountSold=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        totalSales.getTotalSalesPerPerson(2);
        assertEquals(600,   totalSales.getEachSalesProductSales(1,salesProduct));



        salesPerson=3;
        salesProduct=2;
        amountSold=600;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        totalSales.getTotalSalesPerPerson(3);

        salesPerson=2;
        salesProduct=2;
        amountSold=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        totalSales.getTotalSalesPerPerson(2);
        salesPerson=2;
        salesProduct=2;
        amountSold=200;
        totalSales.setEachSalesPersonSales(salesProduct,salesPerson,amountSold);
        totalSales.getTotalSalesPerPerson(2);
        assertEquals(1000,   totalSales.getEachSalesProductSales(2,salesProduct));
        

    }
    }

