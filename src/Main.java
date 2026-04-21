import java.util.Arrays;
import java.util.Comparator;

void main() {
    EducationalInstitution[] institutions = {
            new EducationalInstitution("KPI", "Kyiv", 20000, 4.5, 1898),
            new EducationalInstitution("KNU", "Kyiv", 15000, 4.8, 1834),
            new EducationalInstitution("LNU", "Lviv", 15000, 4.2, 1661),
            new EducationalInstitution("NULP", "Lviv", 25000, 4.6, 1844)
    };

    Arrays.sort(institutions, Comparator
            .comparingInt(EducationalInstitution::getNumberOfStudents)
            .thenComparing(EducationalInstitution::getAverageRating, Comparator.reverseOrder()));

    System.out.println("Відсортований масив:");
    for (EducationalInstitution institution : institutions) {
        System.out.println(institution);
    }

    EducationalInstitution target = new EducationalInstitution("KNU", "Kyiv", 15000, 4.8, 1834);
    boolean found = false;

    for (EducationalInstitution item : institutions) {
        if (item.equals(target)) {
            System.out.println("\nОб'єкт знайдено: " + item);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("\nОб'єкт не знайдено.");
    }
}
