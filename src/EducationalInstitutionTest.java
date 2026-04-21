import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Comparator;

public class EducationalInstitutionTest {

    @Test
    public void testEquals() {
        EducationalInstitution obj1 = new EducationalInstitution("KPI", "Kyiv", 20000, 4.5, 1898);
        EducationalInstitution obj2 = new EducationalInstitution("KPI", "Kyiv", 20000, 4.5, 1898);

        assertEquals(obj1, obj2, "Об'єкти з однаковими даними мають бути рівними");
    }

    @Test
    public void testSortingLogic() {
        EducationalInstitution[] list = {
                new EducationalInstitution("B", "City", 100, 4.0, 2000),
                new EducationalInstitution("A", "City", 100, 5.0, 2000)
        };

        Arrays.sort(list, Comparator
                .comparingInt(EducationalInstitution::getNumberOfStudents)
                .thenComparing(EducationalInstitution::getAverageRating, Comparator.reverseOrder()));

        assertEquals(5.0, list[0].getAverageRating(), "Об'єкт з вищим рейтингом має бути першим");
        assertEquals("A", list[0].getName());
    }
}