package tweete_assessment.dao;

import tweete_assessment.entity.Follower;

import java.util.List;

public interface FollowerDao {
    void saveFollower(Follower follower);

    List<Follower> findAll(Integer userId);
}
