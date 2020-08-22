package DriverManager;

public enum DriverManagerType {
    ANDROID("AndroidDriver", "Init AndroidDiver"),
    IOS("IOSDriver", "Init IOS Driver");

    private String driverName;
    private String desc;


    DriverManagerType(String driverName, String desc) {
        this.driverName = driverName;
        this.desc = desc;
    }

    /**
     * Gets the Driver
     *
     * @return get the Driver
     */
    public String getDriver() {
        return driverName;
    }

    public String getDriverdesc() {
        return desc;
    }

}

