package observer;

public class Junior implements Observer{

    private String name;

    private int salary = 40000;

    private VacancyType vacancyType;

    public Junior(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacancyType()) {
            if (salary <= vacancy.getSalary()) {
                System.out.printf("Младший сотрудник %s: Мне нужна эта работа! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
                salary = vacancy.getSalary();
            } else {
                System.out.printf("Младший сотрудник %s: Я найду работу получше! (компания: %s; вакансия %s; заработная плата: %d)\n",
                        name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Младший сотрудник %s: Эта работа не соответствует моей квалификации!!! (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
        }
    }

}
