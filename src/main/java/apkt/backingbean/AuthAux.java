package apkt.backingbean;

public class AuthAux {
    
private String email;
    private String password;
    private String simSerialNumber;
    private String simOperator;
    private String networkCountryIso;
    private String subscriberId;
    private String gcmClientRegId;
//    private Object object;
    private byte[] emailB;
    private byte[] passwordB;
    private byte[] passwordResetCodeB;
    private String language;
    private String appName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSimSerialNumber() {
        return simSerialNumber;
    }

    public void setSimSerialNumber(String simSerialNumber) {
        this.simSerialNumber = simSerialNumber;
    }

    public String getSimOperator() {
        return simOperator;
    }

    public void setSimOperator(String simOperator) {
        this.simOperator = simOperator;
    }

    public String getNetworkCountryIso() {
        return networkCountryIso;
    }

    public void setNetworkCountryIso(String networkCountryIso) {
        this.networkCountryIso = networkCountryIso;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getGcmClientRegId() {
        return gcmClientRegId;
    }

    public void setGcmClientRegId(String gcmClientRegId) {
        this.gcmClientRegId = gcmClientRegId;
    }

//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }

    public byte[] getEmailB() {
        return emailB;
    }

    public void setEmailB(byte[] emailB) {
        this.emailB = emailB;
    }

    public byte[] getPasswordB() {
        return passwordB;
    }

    public void setPasswordB(byte[] passwordB) {
        this.passwordB = passwordB;
    }
    
    public byte[] getPasswordResetCodeB() {
        return passwordResetCodeB;
    }

    public void setPasswordResetCodeB(byte[] passwordResetCodeB) {
        this.passwordResetCodeB = passwordResetCodeB;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
