package gangoffour.creational.simplefactory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BlogPost extends Post {

    private String author;
    private String[] tags;

}
