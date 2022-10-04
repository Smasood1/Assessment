public class CrewMember extends Person implements IServAble, iPayable{

    private FlightCrewJob job;
    private float salary;


    public CrewMember(String name, FlightCrewJob job, float salary) {
        super(name);
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                ", salary=" + salary +
                '}';
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String serve(Person person1) {
       return job + " Now serving " + person1.getName();
    }

    @Override
    public void printPaymentAmount() {

    }
}
