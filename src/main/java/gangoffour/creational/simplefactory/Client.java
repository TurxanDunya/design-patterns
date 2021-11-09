package gangoffour.creational.simplefactory;

public class Client {
    public static void main(String[] args) {
        Post blog = PostFactory.createPost("blog");
        System.out.println(blog); // BlogPost(author=null, tags=null)
    }
}
