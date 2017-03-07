public class Twitter {

    private static Integer timeStamp=0;

    private Map<Integer,User> userMap;

    private class User{
        public Integer userId;
        public Set<Integer> followed;
        public LinkedList<Integer> tweetList;
        public User(Integer id){
            this.userId = id;
            this.followed = new HashSet<Integer>();

        }

        public void follow(Integer userId){
            this.followed.add(userId);
        }
        public void unfollow(Integer userId){
            this.followed.remove(userId);
        }
        public void post(Integer id){
            tweetList.add(id);
        }
    }
    
    
    private class Tweet{
        public Integer id;
        public Integer time;
        public Tweet(Integer id){
            this.id = id;
            this.time = timestamp++;

        }

    }

    /** Initialize your data structure here. */
    public Twitter() {
        this.userMap = new HashMap<Integer,User>();
        
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(tweetId);
        userMap.get(userId).post(tweetId);

        
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)){
            User u = new User(followerId);
            userMap.put(followerId, u);
        }
        if(!userMap.containsKey(followeeId)){
            User u = new User(followeeId);
            userMap.put(followeeId, u);
        }
        userMap.get(followerId).follow(followeeId);

        
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId) || followerId==followeeId)
            return;
        userMap.get(followerId).unfollow(followeeId);
        
    }
}