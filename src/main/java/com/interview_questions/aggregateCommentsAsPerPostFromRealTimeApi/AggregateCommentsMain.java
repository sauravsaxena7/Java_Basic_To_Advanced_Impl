package com.interview_questions.aggregateCommentsAsPerPostFromRealTimeApi;


/**
 For this challenge you will be writing three Java functions. The first two functions will fetch data from public APIs, and the third function will aggregate the data to provide a summary of comments per post.

 Function 1: fetchPosts()

 Write a GET request to the URL https://coderbyte.com/api/challenges/json/all-posts to retrieve a list of posts. The function should return the data as a list of post objects. Each post object contains fields like userId and id.

 Function 2: fetchComments()

 Write a GET request to the URL https://coderbyte.com/api/challenges/json/all-comments to retrieve a list of comments. The function should return the data as a list of comment objects. Each comment object contains fields like postId and id.

 Function 3: aggregateComments()

 A

 This function should aggregate the number of comments for each post. It should return
 a list of objects in the format below. The resulting list should be
 sorted by numberofComments in descending order. If multiple posts have the same
 numberofComments, they should be sorted by postId in descending order.
 Finally, print this aggregated list.



 */



public class AggregateCommentsMain {
}
