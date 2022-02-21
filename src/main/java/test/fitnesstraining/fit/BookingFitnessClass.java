package test.fitnesstraining.fit;

import test.fitnesstraining.users.User;

import java.util.Date;
import java.util.List;

public class BookingFitnessClass {

    private long bookingId;
    //private FitnessClassType fitnessClassType;


    public List<FitnessClass> getFitnessClasses(){
        return null;
    }

    public FitnessClass getFitnessClass(FitnessClassType fitnessClassType, Date startTime, Date endTime){
        return null;
    }

    public void bookClass( User user, FitnessClass fitnessClass){
        if(fitnessClass.getTotalUsers().size() < fitnessClass.getCapacity()){
            fitnessClass.getTotalUsers().add(user);
        }
        else if( fitnessClass.getTotalUsers().size() == fitnessClass.getCapacity()){
            fitnessClass.getWaitingList().add(user);
        }
    }

    public void cancelSlot( User user, FitnessClass fitnessClass, Date cancelTime){
        // calcuate the time to cancle the slot before 30 min
        // if condition
        fitnessClass.getTotalUsers().remove(user);
        if(!fitnessClass.getWaitingList().isEmpty()) {
            User usertoclass = fitnessClass.getWaitingList().get(0);
            fitnessClass.getTotalUsers().add(usertoclass);
            fitnessClass.getWaitingList().remove(0);
        }
    }
}
