package gangoffour.creational.simplefactory;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NewsPost extends Post {

    private String headLine;
    private LocalDate newsTime;

}
