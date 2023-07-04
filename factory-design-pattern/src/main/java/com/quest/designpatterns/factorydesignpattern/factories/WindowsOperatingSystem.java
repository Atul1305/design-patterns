package com.quest.designpatterns.factorydesignpattern;

public class WindowsOperatingSystem implements OperatingSystem {
	
    private String architecture; 
    private String version;

    WindowsOperatingSystem (String architecture, String version) {
        this.architecture = architecture;
        this.version = version;
    }

    public void changeDirectory(String dir) {

    }
    
    public void removeDirectory(String dir) {
        
    }

}