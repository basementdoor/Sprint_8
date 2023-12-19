import io.qameta.allure.Description;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTests {

    @Test
    @Description("Короткое имя")
    public void testInvalidShortName() {
        Account account = new Account(NamesData.shortName);
        assertEquals("Ожидалось, что будет False", false, account.checkNameToEmboss());
    }

    @Test
    @Description("Длинное имя")
    public void testInvalidLongName() {
        Account account = new Account(NamesData.longName);
        assertEquals("Ожидалось, что будет False", false, account.checkNameToEmboss());
    }

    @Test
    @Description("Некорректные отступы")
    public void testInvalidSpacesName() {
        Account account = new Account(NamesData.nameWithIncorrectSpaces);
        assertEquals("Ожидалось, что будет False", false, account.checkNameToEmboss());
    }

    @Test
    @Description("Пробелы отсутствуют")
    public void testInvalidNameWithoutSpace() {
        Account account = new Account(NamesData.nameWithoutSpaces);
        assertEquals("Ожидалось, что будет False", false, account.checkNameToEmboss());
    }

    @Test
    @Description("Корректное имя")
    public void testCorrectName() {
        Account account = new Account(NamesData.correctName);
        assertEquals("Ожидалось, что будет True", true, account.checkNameToEmboss());
    }
}
