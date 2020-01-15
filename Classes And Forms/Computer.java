/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopdeployment;

/**
 * Object that represents a user's computer
 * @author ndorelus
 */
public class Computer {
    
    private String model;
    private String assetTag;
    private String serial;
    private String name;
    private boolean imaged;
    private Checklist checklist;
    
    /**
     * Computer constructor
     * @param mod computer model
     * @param asset asset tag
     * @param ser serial number
     * @param na machine name
     * @param img has the machine been imaged?
     */
    public Computer (String mod, String asset, String ser, String na, boolean img) {
        this.model = mod;
        this.assetTag = asset;
        this.serial = ser;
        this.name = na;
        this.imaged = img;
    }
    
    /**
     * sets the Computer's model equal to the provided string
     * @param str computer model
     */
    public void setModel(String str) {
        this.model = str;
    }
    
    /**
     * sets the Computer's asset tag equal to the provided string
     * @param str asset tag
     */
    public void setAssetTag(String str) {
        this.assetTag = str;
    }
    
    /**
     * sets the Computer's serial number equal to the provided string
     * @param str serial number
     */
    public void setSerial(String str) {
        this.serial = str;
    }
    
    /**
     * sets the Computer's name equal to the provided string
     * @param str machine name
     */
    public void setName(String str) {
        this.name = str;
    }
    
    /**
     * sets the boolean that describes whether or not the computer has been imaged<br>
     * important because you can't create a checklist until the computer has been imaged
     * @param bool imaged/not imaged boolean
     */
    public void setImaged(boolean bool) {
        this.imaged = bool;
    }
    
    /**
     * assigns the provided checklist to the computer
     * @param check the checklist to be assigned
     */
    public void assignChecklist(Checklist check) {
        this.checklist = check;
    }
    
    
    /**
     *
     * @return Computer model
     */
    public String getModel() {
        return this.model;
    }
    
    /**
     *
     * @return Computer's asset tag
     */
    public String getAssetTag() {
        return this.assetTag;
    }
    
    /**
     *
     * @return Computer's serial number
     */
    public String getSerial() {
        return this.serial;
    }
    
    /**
     *
     * @return Computer's name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     *
     * @return Computer's imaged status
     */
    public boolean getImaged() {
        return this.imaged;
    }
    
    /**
     *
     * @return Checklist assigned to this computer
     */
    public Checklist getChecklist() {
        return checklist;
    }
    
    /**
     *
     * @return true if computer has checklist assigned, false otherwise
     */
    public boolean hasChecklist() {
        return checklist != null;
    }
    
    
    
    @Override
    public String toString() {
        return "Model: " + this.model +
               "\nAsset Tag: " + this.assetTag +
               "\nSerial: " + this.serial +
               "\nMachine Name: " + this.name;
    }
    
}
