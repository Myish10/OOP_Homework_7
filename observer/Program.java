package observer;

public class Program {

    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher);
        Company yandex = new Company("Yandex", publisher);
        Company geekBrains = new Company("GeekBrains", publisher);

        Student student1 = new Student("Студент1", VacancyType.Cleaner);
        Master master1 = new Master("Мастер1", VacancyType.Engineer);
        Master master2 = new Master("Мастер2", VacancyType.Programmer);
        Senior senior1 = new Senior("Высококвалифицированный специалист1", VacancyType.Programmer);
        Junior junior1= new Junior("Младший сотрудник1", VacancyType.Teacher);


        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(senior1);
        publisher.registerObserver(junior1);

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            System.out.println();
        }

    }

}
