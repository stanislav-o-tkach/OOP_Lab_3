import java.util.Objects;

public class EducationalInstitution {

    private final String name;
    private final String city;
    private int numberOfStudents;
    private double averageRating;
    private int foundationYear;

    public EducationalInstitution(String name, String city, int numberOfStudents, double averageRating, int foundationYear) {
        this.name = name;
        this.city = city;
        this.numberOfStudents = numberOfStudents;
        this.averageRating = averageRating;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public String toString() {
        return String.format("Заклад: %-15s | Місто: %-10s | Студенти: %-5d | Рейтинг: %-5.1f | Рік: %d",
                name, city, numberOfStudents, averageRating, foundationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationalInstitution that = (EducationalInstitution) o;
        return numberOfStudents == that.numberOfStudents &&
                Double.compare(that.averageRating, averageRating) == 0 &&
                foundationYear == that.foundationYear &&
                Objects.equals(name, that.name) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, numberOfStudents, averageRating, foundationYear);
    }
}
