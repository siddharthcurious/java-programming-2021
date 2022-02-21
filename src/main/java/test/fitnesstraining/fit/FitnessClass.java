package test.fitnesstraining.fit;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import test.fitnesstraining.users.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FitnessClass {

    //@ Auto generated
    private long id;
    private FitnessClassType fitnessClassType;
    private Date startTime;
    private Date endTime;
    private User instructor;
    private List<User> totalUsers;
    private int capacity;
    private List<User> waitingList;

    public FitnessClass(FitnessClassType fitnessClassType, Date startTime, Date endTime, User instructor, List<User> totalUsers, int capacity) {
        this.fitnessClassType = fitnessClassType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.instructor = instructor;
        this.capacity = capacity;
        this.totalUsers = new ArrayList<>(capacity);
        this.waitingList = new ArrayList<>(10);
    }

    public boolean createClass(){
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FitnessClassType getFitnessClassType() {
        return fitnessClassType;
    }

    public void setFitnessClassType(FitnessClassType fitnessClassType) {
        this.fitnessClassType = fitnessClassType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public User getInstructor() {
        return instructor;
    }

    public void setInstructor(User instructor) {
        this.instructor = instructor;
    }

    public List<User> getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(List<User> totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<User> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(List<User> waitingList) {
        this.waitingList = waitingList;
    }
}
