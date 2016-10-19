package DTOobjects;

/**
 * Created by krist on 19-10-2016.
 */
public class Config {
    private String dbType;
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String dbUser;
    private String dbPass;
    private String srvPort;

    public Config() {

    }

    public String getDbType() {
        return dbType;
    }
    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getDbHost() {
        return dbHost;
    }
    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbPort() {return dbPort;}
    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public String getDbName() {
        return dbName;
    }
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbUser() {
        return dbUser;
    }
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }
    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getSrvPort() {
        return srvPort;
    }
    public void setSrvPort(String srvPort) {
        this.srvPort = srvPort;
    }
}