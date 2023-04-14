import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.JAVAMvnHomework2.services.WorkScheduleService;

public class WorkScheduleServiceTest {
    @Test
    public void scheduleTest1() {
        WorkScheduleService service = new WorkScheduleService();

        int actual = service.calcSchedule(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scheduleTest2() {
        WorkScheduleService service = new WorkScheduleService();

        int actual = service.calcSchedule(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}
