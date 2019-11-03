package hcy.responsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
    private String requestType;
    private String requestContent;
    private int number;
}
