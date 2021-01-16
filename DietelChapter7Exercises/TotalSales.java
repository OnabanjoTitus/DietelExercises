public class TotalSales {
    int [][] sales= new int[5][4];
    int [] salesPersonTotal= new int[4];
    int [] productPrice= new int[5];

    public Object[] getTotalSalesPersons() {
        return sales;
    }


    public void setEachSalesPersonSales(int salesProduct, int salesPerson, int amountSold) {
        if(salesPerson>=1&&salesPerson<5 && salesProduct>=1 && salesProduct<6 && amountSold>=0){
            sales[salesProduct-1][salesPerson-1]+=amountSold;

        }
    }

    public int getTotalSalesPerPerson(int person) {
        salesPersonTotal[person-1]+=sales[person-1][person-1];
        return salesPersonTotal[person-1];

    }

    public int getEachSalesProductSales(int value,int product) {
        for(int counter=0;counter<4;counter++){
            productPrice[value-1]+=sales[product-1][counter];
        }

        return productPrice[value-1];
    }


    public String getSalesInATable() {


        return String.format("salesPersons:%10s%10s%10s%10s%10s%n" +
                                            "%s%10d%15d%10d%15d%15d%n" +
                                            "%s%10d%15d%10d%15d%15d%n" +
                                            "%s%10d%15d%10d%15d%15d%n" +
                                            "%s%10d%15d%10d%15d%15d%n" +
                                            "%s%10d%15d%10d%15d%15d%n" +
                                            "%s%10d%15d%10d%15d%n",
                                                                        "salesPerson1 ","salesPerson2 ","salesPerson3 ","salesPerson4 ","productTotal",
                                                                         "product1",sales[0][0],sales[0][1],sales[0][2],sales[0][3],productPrice[0],
                                                                         "product2",sales[1][0],sales[1][1],sales[1][2],sales[1][3],productPrice[1],
                                                                         "product3",sales[2][0],sales[2][1],sales[2][2],sales[2][3],productPrice[2],
                                                                         "product4",sales[3][0],sales[3][1],sales[3][2],sales[3][3],productPrice[3],
                                                                         "product5",sales[4][0],sales[4][1],sales[4][2],sales[4][3],productPrice[4],
                                                                        "PersonTotal:",salesPersonTotal[0],salesPersonTotal[1],salesPersonTotal[2],salesPersonTotal[3]
        );
    }
}
