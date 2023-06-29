package OOP.seventh.observer;

public class vacancy extends Company   {
    String vacancyName;
    String Body;
    public vacancy(String companyName, double maxSalary, Publisher jobAgency, String vacancyName, String body) {
        super(companyName, maxSalary, jobAgency);
        this.vacancyName = vacancyName;
        this.Body = body;
    }
    public String getVacancyName() {
        return vacancyName;
    }
    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }
    public String getBody() {
        return Body;
    }
    public void setBody(String body) {
        Body = body;
    }

    
}
