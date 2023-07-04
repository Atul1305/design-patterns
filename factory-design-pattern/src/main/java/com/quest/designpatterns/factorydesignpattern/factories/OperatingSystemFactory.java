package com.quest.designpatterns.factorydesignpattern;

public class OperatingSystemFactory {
	
    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch(type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(architecture, version);
            case "LINUX":
                return new LinuxOperatingSystem(architecture, version);
            default:
                throw new IllegalArgumentException("OS not supported!");
        }
    }
}