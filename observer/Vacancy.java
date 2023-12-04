package observer;

public class Vacancy {

    private String nameVacancy;

    private int salary;

    private VacancyType vacancyType;

    public String getNameVacancy() {
        return nameVacancy;
    }

    public int getSalary() {
        return salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public Vacancy(String nameVacancy, int salary, VacancyType vacancyType) {
        this.nameVacancy = nameVacancy;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }

    @Override
    public String toString() {
        return String.format("Вакансия %s, заработная плата %d руб.", nameVacancy, salary);
    }
}
