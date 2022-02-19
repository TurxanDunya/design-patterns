package gangoffour.creational.simplefactory;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class NewsPost extends Post {

    private String headLine;
    private LocalDate newsTime;

}
