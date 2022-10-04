import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FlightApp {

    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs) {


        for(FlightCrewJob i : flightCrewJobs){
            System.out.println(i);
       }

    }

    public static void printAmountForEachThingThatIsPayable(iPayable[] payables){
        for(int i = 0; i < payables.length; i++){
            return;

        }

    }

    public static void sortAndPrintCrewMembersByJob(ArrayList<FlightCrewJob> flightCrewJobs){
        for(int i = 0; i < flightCrewJobs.size(); i++){
            Collections.sort(flightCrewJobs);

        }

    }
    public static void printAllJobsExceptThisCrewMembersJob(ArrayList<FlightCrewJob> list, CrewMember member){

        //print everything except what we putinto the paramter
        for(FlightCrewJob i : list){
            if(list.contains(member)){
                list.remove(member);


            }
            System.out.println();
        }


    }






}

