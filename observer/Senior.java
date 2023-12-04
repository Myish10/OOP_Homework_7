package observer;

public class Senior implements Observer{

    private String name;

    private int salary = 110000;

    private VacancyType vacancyType;

    public Senior(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacancyType()) {
            if (salary <= vacancy.getSalary()) {
                System.out.printf("Высококвалифицированный специалист %s: Мне нужна эта работа! (компания: %s; вакансия %s;" +
                                " заработная плата: %d)\n",
                        name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
                salary = vacancy.getSalary();
            } else {
                System.out.printf("Высококвалифицированный специалист %s: Я найду работу получше! (компания: %s; вакансия %s;" +
                                " заработная плата: %d)\n",
                        name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        } else {
            System.out.printf("Высококвалифицированный специалист %s: Эта работа не соответствует моей квалификации!!! (компания: %s; вакансия %s;" +
                            " заработная плата: %d)\n",
                    name, companyName, vacancy.getNameVacancy(), vacancy.getSalary());
        }
    }

}
