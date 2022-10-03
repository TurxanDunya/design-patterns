package gangoffour.creational.simplefactory;

import lombok.Data;

import java.time.LocalDate;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class NewsPost extends Post {

    private String headLine;
    private LocalDate newsTime;

}
