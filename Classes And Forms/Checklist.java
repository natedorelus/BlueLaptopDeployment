/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopdeployment;

/**
 *
 * @author ndorelus
 */
public class Checklist {
    
    private boolean blueLogin;        private boolean nameComputer;       private boolean bitLocker;
    private boolean proofpoint;       private boolean systemUpdate;       private boolean moveOU;
    private boolean windowsUpdate;    private boolean userLogin;          private boolean outlook;
    private boolean wifi;             private boolean printers;           private boolean unpin;
    private boolean pin;              private boolean vpn;                private boolean defaultApps;
    private boolean chromeBookmarks;  private boolean signatures;         private boolean defaultPower;
    private boolean fileExplorer;     private boolean desktopIcons;       private boolean timeZone;
    private boolean touchpad;         private boolean trackIT;            private boolean welcomeSheet;
    private boolean meeting;          private boolean passwordChange;     private boolean dockingStation;
    
    public Checklist() {
        this.blueLogin = false;       this.nameComputer = false;          this.bitLocker = false;
        this.proofpoint = false;      this.systemUpdate = false;          this.moveOU = false;
        this.windowsUpdate = false;   this.userLogin = false;             this.outlook = false;
        this.wifi = false;            this.printers = false;              this.unpin  = false;
        this.pin = false;             this.vpn = false;                   this.defaultApps = false;
        this.chromeBookmarks = false; this.signatures = false;            this.defaultPower = false;
        this.fileExplorer = false;    this.desktopIcons = false;          this.timeZone = false;
        this.touchpad = false;        this.trackIT = false;               this.welcomeSheet = false;
        this.meeting = false;         this.passwordChange = false;        this.dockingStation = false;
    }
    
    ///////////////////////////////////
    //////////////SETTERS//////////////
    ///////////////////////////////////
    
    public void setBlueLogin(boolean bool) {
        this.blueLogin = bool;
    }
    
    public void setNameComputer(boolean bool) {
        this.nameComputer = bool;
    }
    
    public void setBitLocker(boolean bool) {
        this.bitLocker = bool;
    }
    
    public void setProofpoint(boolean bool) {
        this.proofpoint = bool;
    }
    
    public void setSystemUpdate(boolean bool) {
        this.systemUpdate = bool;
    }
    
    public void setMoveOU(boolean bool) {
        this.moveOU = bool;
    }
    
    public void setWindowsUpdate(boolean bool) {
        this.windowsUpdate = bool;
    }
    
    public void setUserLogin(boolean bool) {
        this.userLogin = bool;
    }
    
    public void setOutlook(boolean bool) {
        this.outlook = bool;
    }
    
    public void setWifi(boolean bool) {
        this.wifi = bool;
    }
    
    public void setPrinters(boolean bool) {
        this.printers = bool;
    }
    
    public void setUnpin(boolean bool) {
        this.unpin = bool;
    }
    
    public void setPin(boolean bool) {
        this.pin = bool;
    }
    
    public void setVPN(boolean bool) {
        this.vpn = bool;
    }
    
    public void setDefaultApps(boolean bool) {
        this.defaultApps = bool;
    }
    
    public void setChromeBookmarks(boolean bool) {
        this.chromeBookmarks = bool;
    }
    
    public void setSignatures(boolean bool) {
        this.signatures = bool;
    }
    
    public void setDefaultPower(boolean bool) {
        this.defaultPower = bool;
    }
    
    public void setFileExplorer(boolean bool) {
        this.fileExplorer = bool;
    }
    
    public void setDesktopIcons(boolean bool) {
        this.desktopIcons = bool;
    }
    
    public void setTimeZone(boolean bool) {
        this.timeZone = bool;
    }
    
    public void setTouchpad(boolean bool) {
        this.touchpad = bool;
    }
    
    public void setTrackIT(boolean bool) {
        this.trackIT = bool;
    }
    
    public void setWelcomeSheet(boolean bool) {
        this.welcomeSheet = bool;
    }
    
    public void setMeeting(boolean bool) {
        this.meeting = bool;
    }
    
    public void setPasswordChange(boolean bool) {
        this.passwordChange = bool;
    }
    
    public void setDockingStation(boolean bool) {
        this.dockingStation = bool;
    }
    
    ///////////////////////////////////
    //////////////GETTERS//////////////
    ///////////////////////////////////
    
    public boolean getBlueLogin() {
        return this.blueLogin;
    }
    
    public boolean getNameComputer() {
        return this.nameComputer;
    }
    
    public boolean getBitLocker() {
        return this.bitLocker;
    }
    
    public boolean getProofpoint() {
        return this.proofpoint;
    }
    
    public boolean getSystemUpdate() {
        return this.systemUpdate;
    }
    
    public boolean getMoveOU() {
        return this.moveOU;
    }
    
    public boolean getWindowsUpdate() {
        return this.windowsUpdate;
    }
    
    public boolean getUserLogin() {
        return this.userLogin;
    }
    
    public boolean getOutlook() {
        return this.outlook;
    }
    
    public boolean getWifi() {
        return this.wifi;
    }
    
    public boolean getPrinters() {
        return this.printers;
    }
    
    public boolean getUnpin() {
        return this.unpin;
    }
    
    public boolean getPin() {
        return this.pin;
    }
    
    public boolean getVPN() {
        return this.vpn;
    }
    
    public boolean getDefaultApps() {
        return this.defaultApps;
    }
    
    public boolean getChromeBookmarks() {
        return this.chromeBookmarks;
    }
    
    public boolean getSignatures() {
        return this.signatures;
    }
    
    public boolean getDefaultPower() {
        return this.defaultPower;
    }
    
    public boolean getFileExplorer() {
        return this.fileExplorer;
    }
    
    public boolean getDesktopIcons() {
        return this.desktopIcons;
    }
    
    public boolean getTimeZone() {
        return this.timeZone;
    }
    
    public boolean getTouchpad() {
        return this.touchpad;
    }
    
    public boolean getTrackIT() {
        return this.trackIT;
    }
    
    public boolean getWelcomeSheet() {
        return this.welcomeSheet;
    }
    
    public boolean getMeeting() {
        return this.meeting;
    }
    
    public boolean getPasswordChange() {
        return this.passwordChange;
    }
    
    public boolean getDockingStation() {
        return this.dockingStation;
    }
    
}
