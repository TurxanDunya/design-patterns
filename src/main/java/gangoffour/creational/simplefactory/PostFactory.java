package gangoffour.creational.simplefactory;

public class PostFactory {

    /**
     * This is our factory method. Notice that it is static
     */

    public static Post createPost(String typeOfObject) {
        switch (typeOfObject) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }

}
