/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopdeployment;

import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
/**
 * Object that represents a user
 * @author ndorelus
 */
public class User {
    
    private String firstname;
    private String lastname;
    private String location;
    private boolean isNewHire;
    private Date startdate;
    private ArrayList<Computer> computers;
    
    /**
     * constructor method that initializes the following variables:<br><br>
     * firstname<br>
     * lastname<br>
     * location<br>
     * isNewHire<br>
     * computers
     * @param first the user's first name
     * @param last the user's last name
     * @param loc the user's location
     * @param newhire is this person a new hire at the time of entry?
     */
    public User(String first, String last, String loc, boolean newhire) {
        this.firstname = first;
        this.lastname = last;
        this.location = loc;
        this.isNewHire = newhire;
        this.computers = new ArrayList();
    }
    
    /**
     * sets the User object's firstname variable equal to the provided string
     * @param str the string that will be set as the user's first name
     */
    public void setFirst(String str) {
        if (!firstname.equals(str)) firstname = str;
    }
    
    /**
     * sets the User object's lastname variable equal to the provided string
     * @param str the string that will be set as the user's last name
     */
    public void setLast(String str) {
        if (!lastname.equals(str)) lastname = str;
    }
    
    /**
     * sets the User object's location variable equal to the provided string
     * @param str the string that will be set as the user's location
     */
    public void setLocation(String str) {
        if (!location.equals(str)) location = str;
    }
    
    /**
     * sets the User object's isNewHire variable equal to the provided boolean
     * @param bool the boolean used to determine if the User is a new hire at the time of creation
     */
    public void setNewHire(boolean bool) {
        isNewHire = bool;
    }
    
    /**
     * sets the User object's start date using the provided strings<br>
     * checks to see if the inputs are valid<br>
     * if not, it throws one of a number of exceptions
     * @param year
     * @param month
     * @param day
     * @throws Exception InvalidYearFormat, InvalidMonthFormat, InvalidDayFormat, DayOutOfRange, MonthOutOfRange
     */
    public void setStartDate(String year, String month, String day) throws Exception {
        int yearNum;
        int monthNum;
        int dayNum;
        try {
            yearNum = Integer.valueOf(year);
        } catch (NumberFormatException e) {
            throw new Exception("An invalid format was used for the Start Date year.");
        }
        try {
            monthNum = Integer.valueOf(month);
        } catch (NumberFormatException e) {
            throw new Exception("An invalid format was used for the Start Date month.");
        }
        try {
            dayNum = Integer.valueOf(day);
        } catch (NumberFormatException e) {
            throw new Exception("An invalid format was used for the Start Date day.");
        }
        if (dayNum < 1 || dayNum > 31) throw new Exception("The day is out of range. Enter a number from 1 to 31.");
        else if (monthNum < 1 || monthNum > 12) throw new Exception("The month is out of range. Enter a number from 1 to 12.");
        else {
            monthNum--;
            yearNum-=1900;
            startdate = new Date(yearNum, monthNum, dayNum);
        }
    }
    
    /**
     * assigns the provided Computer object as the User's new computer<br>
     * this is done by inserting the new computer at index 0 of the computers ArrayList<br>
     * this ensures that the list goes from newest to oldest when going first to last<br>
     * checks to see if current computer has the same asset tag and/or serial<br>
     * if so, the computer won't be added
     * @param comp the new Computer
     */
    public void assignComputer(Computer comp) {
        computers.add(0, comp);
        if (computers.size() > 1) isNewHire = false;
    }
    
    public void assignAllComputers(ArrayList<Computer> comp) {
        computers = comp;
    }
    
    /**
     * removes a computer at a specified index from the computers ArrayList<br>
     * throws an exception if the list is empty or if the specified index is out of range
     * @param place the index at which to remove the computer
     * @throws Exception no computer at selected index
     */
    public void removeComputer(int place) throws Exception {
        try {
            computers.remove(place);
        } catch (Exception e) {
            throw new Exception("Failed to remove computer because there is no computer at the specified index");
        }
    }
    
    /**
     *
     * @return User's first name
     */
    public String getFirst() {
        return firstname;
    }
    
    /**
     *
     * @return User's last name
     */
    public String getLast() {
        return lastname;
    }
    
    /**
     *
     * @return User's full name
     */
    public String getFull() {
        return firstname + " " + lastname;
    }
    
    /**
     *
     * @return User's location
     */
    public String getLocation() {
        return location;
    }
    
    /**
     *
     * @return User's employment status (new hire vs not new hire)
     */
    public boolean getIsNewHire() {
        return isNewHire;
    }
    
    /**
     *
     * @return User's start date
     */
    public Date getStartDate() {
        return startdate;
    }
    
    /**
     * 
     * @return User's most recent checklist
     * @throws Exception "The current computer doesn't have a checklist assigned to it"
     */
    public Checklist getCurrentChecklist() {
        return getCurrentComputer().getChecklist();
    }
    
    /**
     *
     * @return true if User has no computers, false otherwise
     */
    public boolean missingComputer() {
        return computers.isEmpty();
    }
    
    /**
     *
     * @return true if User has multiple computers, false otherwise
     */
    public boolean hasMultipleComputers() {
        return computers.size() > 1;
    }
    
    /**
     *
     * @return true if User has a computer, false otherwise
     */
    public boolean hasComputer() {
        return computers.size() > 0;
    }
    
    /**
     *
     * @return true if current Computer has checklist, false otherwise
     */
    public boolean hasCurrentChecklist() {
        return getCurrentComputer().hasChecklist();
    }
    
    /**
     *
     * @return User's current computer
     */
    public Computer getCurrentComputer() {
        return computers.get(0);
    }
    
    public Computer getComputer(int place) {
        return computers.get(place);
    }
    
    public ArrayList<Computer> getAllComputers() {
        return computers;
    }
    
    public void updateCurrentComputer(Computer comp) {
        computers.remove(0);
        computers.add(0, comp);
    }
    
    public String[] getComputerNames() {
        String[] names = new String[computers.size()];
        for (Computer a: computers) {
            if (computers.indexOf(a) == 0) {
                names[computers.indexOf(a)] = a.getName() + " (current)";
            }
            else names[computers.indexOf(a)] = a.getName();
        }
        return names;
    }
    
    private boolean containsSerial(String ser){
        if (computers.isEmpty()) return false;
        return computers.get(0).getSerial().equals(ser);
    }
    
    private boolean containsAssetTag(String asset) {
        if (computers.isEmpty()) return false;
        return computers.get(0).getAssetTag().equals(asset);
    }
    
    
}
