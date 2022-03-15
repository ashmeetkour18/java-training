package tweete_assessment.dao;

import tweete_assessment.entity.Tweet;

import java.util.List;


public interface TweeterDao {
    List<Tweet> findAllTweets(Integer id);

    void saveTweet(Tweet tweet);
}
