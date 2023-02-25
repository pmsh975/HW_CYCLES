package ru.netology.mavenbuild.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class McountServiceTest {
    @ParameterizedTest
//     @CsvSource({
//            "3, 10_000, 3_000, 20_000",
//            "2, 100_000, 60_000, 150_000"
//    })
    @CsvFileSource(files="src/test/resources/count.csv")
    public void calculate(int expected, int income, int expenses, int threshold) {
        McountService service = new McountService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }
}
