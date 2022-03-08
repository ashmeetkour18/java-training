package com.company.day13;

public class DataBase_Bean {
    private String mysqlUrl;
    private String userName;
    private String password;

    public DataBase_Bean() {
    }

    public DataBase_Bean(String mysqlUrl, String userName, String password) {
        this.mysqlUrl = mysqlUrl;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataBase_Bean{" +
                "mysqlUrl='" + mysqlUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getMysqlUrl() {
        return mysqlUrl;
    }

    public void setMysqlUrl(String mysqlUrl) {
        this.mysqlUrl = mysqlUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
