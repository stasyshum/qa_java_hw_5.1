import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //данные
        long amount = 20_000_60;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //данные
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //данные
        long amount = 56_000_60;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //
        Assertions.assertEquals(expected, actual);
    }
}