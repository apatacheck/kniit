package org.kniit.lab1.task2;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String path;
    private String webpageName;
    private String webPageExtention;
    private String intParam;
    private String doubleParam;
    private String textParameter;


    public SimpleUrl() {
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtention() {
        return webPageExtention;
    }

    public void setWebPageExtention(String webPageExtention) {
        this.webPageExtention = webPageExtention;
    }

    // Геттеры и сеттеры для параметров
    public String getIntParam() {
        return intParam;
    }

    public void setIntParam(String intParam) {
        this.intParam = intParam;
    }

    public String getDoubleParam() {
        return doubleParam;
    }

    public void setDoubleParam(String doubleParam) {
        this.doubleParam = doubleParam;
    }

    public String getTextParameter() {
        return textParameter;
    }

    public void setTextParameter(String textParameter) {
        this.textParameter = textParameter;
    }

    @Override
    public String toString() {
        return "protocol = " + protocol + "\n" +
                "address = " + address + "\n" +
                "domainZone = " + domainZone + "\n" +
                "siteName = " + siteName + "\n" +
                "path = " + path + "\n" +
                "webpageName = " + webpageName + "\n" +
                "webPageExtention = " + webPageExtention + "\n" +
                "intParam = " + intParam + "\n" +
                "doubleParam = " + doubleParam + "\n" +
                "textParameter = " + textParameter;
    }
}