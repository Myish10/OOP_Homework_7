package observer;

import java.util.Random;

public class VacancyFabric {

    private static Random random = new Random();

    public static Vacancy generateVacancyCleaner() {
        String nameVacancy = "Уборщик";
        int salary = random.nextInt(15000, 40000);
        VacancyType vacancyType = VacancyType.Cleaner;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }

    public static Vacancy generateVacancyProgrammer() {
        String nameVacancy = "Программист";
        int salary = random.nextInt(40000, 120000);
        VacancyType vacancyType = VacancyType.Programmer;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }

    public static Vacancy generateVacancyEngineer() {
        String nameVacancy = "Инженер";
        int salary = random.nextInt(60000, 100000);
        VacancyType vacancyType = VacancyType.Engineer;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }

    public static Vacancy generateVacancyTeacher() {
        String nameVacancy = "Преподаватель";
        int salary = random.nextInt(50000, 85000);
        VacancyType vacancyType = VacancyType.Teacher;
        return new Vacancy(nameVacancy, salary, vacancyType);
    }

    public static Vacancy generateVacance(){
        int typeIndex = random.nextInt(4);
        if (typeIndex == 0){
            Vacancy vacancy = generateVacancyCleaner();
            return vacancy;
        }
        else if (typeIndex == 1) {
            Vacancy vacancy = generateVacancyProgrammer();
            return vacancy;
        }
        else if (typeIndex == 2) {
            Vacancy vacancy = generateVacancyEngineer();
            return vacancy;
        }
        else {
            Vacancy vacancy = generateVacancyTeacher();
            return vacancy;
        }
    }

}
