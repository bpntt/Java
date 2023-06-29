package OOP.seventh.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);


        JobAgency jobAgency1 = new JobAgency();
/*         vacancy new1 = new vacancy("T", 5000, jobAgency1, "Middle", "full time, ofice");
        vacancy new2 = new vacancy("t2", 10000, jobAgency1, "Master", "full time, removed"); */
        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }

}
