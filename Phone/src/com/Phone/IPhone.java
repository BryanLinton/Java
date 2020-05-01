package com.Phone;

public class IPhone extends Phone implements Ringable {
        public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
            super(versionNumber, batteryPercentage, carrier, ringTone);
        }
        @Override
        public String ring() {
            return this.getRingtone();
        }
        @Override
        public String unlock() {
            return("Unlocked with face recognition");
        }
        @Override
        public void displayInfo() {
            System.out.println(this.getCarrier());
        }
    }

