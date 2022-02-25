package com.company.day9.tweet;
import jakarta.persistence.*;


@Entity
@Table(name =  "tweet_records")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userId;
    private String tweet;

    public Tweet() {
    }

    public Tweet(String userId, String tweet) {
        this.userId = userId;
        this.tweet = tweet;
    }

    public Tweet(Integer id, String userId, String tweet) {
        this.id = id;
        this.userId = userId;
        this.tweet = tweet;
    }

    @Override
    public String toString() {
        return "Tweet{" + "id=" + id + ", userId='" + userId + '\'' + ", tweet='" + tweet + '\'' + '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
