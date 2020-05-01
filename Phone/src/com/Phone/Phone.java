package com.Phone;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringtone;

    public void setVersionNumber(String cVersionNumber){ this.versionNumber = cVersionNumber;}
    public void setBatterPercentage(int cBatteryPercentage){ this.batteryPercentage = cBatteryPercentage;}
    public void setCarrier(String cCarrier){ this.carrier = cCarrier;}
    public void setRingTone(String cRingtone){ this.ringtone = cRingtone;}

    public String getVersionNumber(){return(this.versionNumber);}
    public int getBatterPercentage(){return(this.batteryPercentage);}
    public String getCarrier(){return(this.carrier);}
    public String getRingtone(){return(this.ringtone);}

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringtone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringtone = ringtone;
    }
        
    public abstract void displayInfo();
    
}
