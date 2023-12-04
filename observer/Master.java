package observer;

public class Master implements Observer{

    private String name;

    private int salary = 80000;

    private VacancyType vacancyType;

    public Master(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacancyType()) {
            if (salary <= vacancy.getSalary()) {
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
                salary = vacancy.getSalary();
            } else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Специалист %s: Эта работа не соответствует моей квалификации!!! (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
        }
    }
}
