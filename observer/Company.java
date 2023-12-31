package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    //private int maxSalary;

    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
        //this.maxSalary = maxSalary;
    }

//    public void needEmployee() {
//        int salary = random.nextInt(maxSalary);
//        jobAgency.sendOffer(name, salary);
//    }

    public void needEmployee(){
        Vacancy vacancy = VacancyFabric.generateVacance();
        jobAgency.sendOffer(name, vacancy);
    }
}
