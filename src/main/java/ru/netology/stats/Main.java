package ru.netology.stats;

public class Main {
    //private static int[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private static int[] sellings = {15, 8, 13, 130};

    public static void main(String[] args) {

        StatsService statsService = new StatsService();

        System.out.println("Сумму всех продаж: " + statsService.getSumSales(sellings));
        System.out.println("Среднюю сумму продаж в месяц: " + statsService.getAverageSale(sellings));
        System.out.println("Номер месяца, в котором был пик продаж: " + statsService.getMaxSaleMonth(sellings));
        System.out.println("Номер месяца, в котором был минимум продаж: " + statsService.getMinSaleMonth(sellings));

        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + statsService.getMaxAverageSaleMonths(sellings));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + statsService.getMinAverageSaleMonths(sellings));
    }
}
