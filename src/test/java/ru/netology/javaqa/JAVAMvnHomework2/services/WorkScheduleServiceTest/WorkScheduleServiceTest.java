package ru.netology.javaqa.JAVAMvnHomework2.services.WorkScheduleServiceTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.JAVAMvnHomework2.services.WorkScheduleService;

public class WorkScheduleServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })

    public void scheduleTest1(int expected, int income, int expenses, int threshold) {
        WorkScheduleService service = new WorkScheduleService();

        int actual = service.calcSchedule(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    // @Test
    // public void scheduleTest2() {
    //     WorkScheduleService service = new WorkScheduleService();

    //     int actual = service.calcSchedule(100_000, 60_000, 150_000);
    //     int expected = 2;

    //     Assertions.assertEquals(expected, actual);
    // }

}

