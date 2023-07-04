package com.quest.designpatterns.factorydesignpattern;

public class LinuxOperatingSystem implements OperatingSystem {

    private String architecture; 
    private String version;

    LinuxOperatingSystem (String architecture, String version) {
        this.architecture = architecture;
        this.version = version;
    }

    public void changeDirectory(String dir) {

    }
    
    public void removeDirectory(String dir) {

    }
	
}