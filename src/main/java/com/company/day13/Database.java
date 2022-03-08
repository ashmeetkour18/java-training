package com.company.day13;

public class Database {
    private static Database database = null;
    private String mysqlUrl;
    private String userName;
    private String password;

    private Database() {
    }

    public static Database getInstance() {
        if (database == null)
            database = new Database();
        return database;
    }

    @Override
    public String toString() {
        return "Database{" +
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
/*
*   1)https://www.twitter.com/follow
        method  - put
        request body :{
        "user":"userid ":
        "id "  :"Id:to follow",
       "follow" :true
         }
*  2)https://www.twitter.com/tweet/new
        method ->Post
        * request body  -{
                                "tweet":"tweet of the user",
                         }
   3) https://www.twitter.com/tweets
    method ->Get
    * reponse{
    [tweet:{"tweet":"tweet", "userid":"userid"}, tweet:{"tweet":"tweet", "userid":"userid"}]

     }


* */