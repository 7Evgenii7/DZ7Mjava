package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTesting {

    @Test
    public void testSum() {
        int excepted = 63;
        int[] sales = {3, 10, 12, 18, 20};

        StatsService service = new StatsService();
        int n = service.getSumSales(sales);
        Assertions.assertEquals(excepted, n);
    }

    @Test
    public void testAverageSum() {
        int[] sales = {3, 10, 12, 18, 20};
        double excepted = 12.6;

        StatsService service = new StatsService();
        double actual = service.getAverageSale(sales);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void testMinSaleMonth() {
        int[] sales = {3, 10, 12, 18, 20};
        int excepted = 1;

        StatsService service = new StatsService();
        int actual = service.getMinSaleMonth(sales);
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void testMaxSaleMonth() {
        int[] sales = {3, 10, 12, 18, 20};
        int excepted = 5;

        StatsService service = new StatsService();
        int actual = service.getMaxSaleMonth(sales);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void testGetMinAverageSaleMonths() {
        int[] sales = {3, 10, 12, 18, 20};
        int excepted = 3;

        StatsService service = new StatsService();
        double actual = service.getMinAverageSaleMonths(sales);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void testGetMaxAverageSaleMonths() {
        StatsService service = new StatsService();
        int[] sales = {3, 10, 12, 18, 20};
        int excepted = 2;

        double actual = service.getMaxAverageSaleMonths(sales);
        Assertions.assertEquals(excepted, actual);
    }
}
