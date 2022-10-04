public class Main {

    public static void main(String[] args) {

        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.CO_PILOT;

        CrewMember crewMember1 = new CrewMember("George",FlightCrewJob.PILOT,45000f);
        CrewMember crewMember2 = new CrewMember("Saad",FlightCrewJob.CO_PILOT,35000f);
        CrewMember crewMember3 = new CrewMember("James",FlightCrewJob.FLIGHT_ATTENDANT,25000f);

        Ticket planeTicket = new PlaneTicket(4125,"NYC","CA","34B",225);
        Ticket busTicket = new BusTicket(6162,"MD","NYC","12B",10);

        iPayable[] payables = {};



        Passenger passenger57 = new Passenger("John", planeTicket,25000.0, new String[] {"Red Bag", "Yellow Bag","Black Bag"});

        Passenger passenger07 = new Passenger("Sean", planeTicket,15000.0, new String[] {"Green Bag", "White Bag"});



        //amount of luggage
        System.out.println("Amount of luggage");
        System.out.println(passenger57.getAmtOfLuggage());
        System.out.println("======================");
        System.out.println(passenger07.printTicket());
        System.out.println("======================");
        System.out.println(crewMember3.serve(passenger07));
        System.out.println("======================");

        FlightApp.printAmountForEachThingThatIsPayable();
    }



}
