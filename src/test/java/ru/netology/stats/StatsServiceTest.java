package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;

        long actual = service.sumSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void averageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;

        long actual = service.averageSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }
    @Test
    void countMinAverageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        long actual = service.countMinAverageSumSales(sales);

        assertEquals(expected, actual);
    }
    @Test
    void countMaxAverageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        long actual = service.countMaxAverageSumSales(sales);

        assertEquals(expected, actual);
    }
}
