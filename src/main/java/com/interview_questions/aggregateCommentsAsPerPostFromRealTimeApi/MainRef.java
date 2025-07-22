package com.interview_questions.aggregateCommentsAsPerPostFromRealTimeApi;


public class MainRef {

//    public static List<Post> fetchPosts() {
//        // todo
//        String url = "https://coderbyte.com/api/challenges/json/all-posts";
//        HttpURLConnection con = (HttpURLConnection) new URL(url) .openConnection();
//        con.setRequestMethod("GET");
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//
//        StringBuilder res = new StringBuilder();
//
//        String line ;
//
//        while((line==in.readLine())!=null){
//            res.append(line);
//        }
//        in.close();
//
//        Gson gson = new Gson();
//        Map<String,List<Post>> m = gson.fromJson(res.toString(),new TypeToken<Map<String,List<Post>>>(){}.getTypeMap<String,List<Post>>());
//
//        return m.get("posts");
//    }
//
//    public static List<Comment> fetchComments() {
//        String url = "https://coderbyte.com/api/challenges/json/all-comments";
//        HttpURLConnection con = (HttpURLConnection) new URL(url) .openConnection();
//        con.setRequestMethod("GET");
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//
//        StringBuilder res = new StringBuilder();
//
//        String line ;
//
//        while((line==in.readLine())!=null){
//            res.append(line);
//        }
//        in.close();
//
//        Gson gson = new Gson();
//        Map<String,List<Comment>> m = gson.fromJson(res.toString(),new TypeToken<Map<String,List<Comment>>>(){}.getTypeMap<String,List<Post>>());
//
//        return m.get("comments");
//    }
//
//    public static List<Map<String, Integer>> aggregateComments(List<Post> posts, List<Comment> comments) {
//    }
//
//    public static void main (String[] args) {
//        // Fetch posts and comments from APIs
//        List<Post> posts = fetchPosts();
//        List<Comment> comments = fetchComments();
//
//        // Aggregate the comments and print the result
//        List<Map<String, Integer>> aggregatedComments = aggregateComments(posts, comments);
//        System.out.println(aggregatedComments);
//    }

}
