package day18.controller;

import java.util.List;


public interface TweeterDao {
    List<Tweet> findAllTweets(Integer id);

    void saveTweet(Tweet tweet);
}
