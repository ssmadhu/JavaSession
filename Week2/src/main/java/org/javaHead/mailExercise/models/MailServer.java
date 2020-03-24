package org.javaHead.mailExercise.models;

import java.util.Properties;

public class MailServer {
    String hostServer;
    String port;
    String storePrototcol;
    String transportProtocol;
    String sslFactory;
    Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public MailServer(String hostServer, String port, String storePrototcol, String transportProtocol, String sslFactory) {
        this.hostServer = hostServer;
        this.port = port;
        this.storePrototcol = storePrototcol;
        this.transportProtocol = transportProtocol;
        this.sslFactory = sslFactory;
        initMailServer();
    }

    public void initMailServer(){
        properties = System.getProperties();
        properties.setProperty("mail.smtp.host", this.getHostServer());
        properties.setProperty("mail.smtp.socketFactory.class", this.getSslFactory());
        properties.setProperty("mail.smtp.port", this.getPort());
        properties.setProperty("mail.smtp.socketFactory.port", this.getPort());
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.store.protocol", this.getStorePrototcol());
        properties.put("mail.transport.protocol", this.getTransportProtocol());
    }

    public String getHostServer() {
        return hostServer;
    }

    public void setHostServer(String hostServer) {
        this.hostServer = hostServer;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getStorePrototcol() {
        return storePrototcol;
    }

    public void setStorePrototcol(String storePrototcol) {
        this.storePrototcol = storePrototcol;
    }

    public String getTransportProtocol() {
        return transportProtocol;
    }

    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    public String getSslFactory() {
        return sslFactory;
    }

    public void setSslFactory(String sslFactory) {
        this.sslFactory = sslFactory;
    }





}
