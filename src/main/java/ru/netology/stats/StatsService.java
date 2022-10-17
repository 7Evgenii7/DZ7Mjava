package ru.netology.stats;

public class StatsService {
    public int getSumSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public double getAverageSale(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }

        return sum / (double) sales.length;
    }

    public int getMaxSaleMonth(int[] sales) {
        int maxMonthIdx = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthIdx]) {
                maxMonthIdx = i;
            }
        }

        return maxMonthIdx + 1;
    }

    public int getMinSaleMonth(int[] sales) {
        int minMonthIdx = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthIdx]) {
                minMonthIdx = i;
            }
        }

        return minMonthIdx + 1;
    }

    public int getMinAverageSaleMonths(int[] sales) {
        int count = 0;

        double middleSalePerMonth = getAverageSale(sales);

        for (int sale : sales) {
            if (sale < middleSalePerMonth) {
                count++;
            }
        }

        return count;
    }

    public int getMaxAverageSaleMonths(int[] sales) {
        int count = 0;

        double middleSales = getAverageSale(sales);

        for (int sale : sales) {
            if (sale > middleSales) {
                count++;
            }
        }

        return count;
    }
}
