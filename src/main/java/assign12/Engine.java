package assign12;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Engine {
    private String type;
    private int horsePower;
    private int volume;


    public Engine(String type, int horsePower, int volume) {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
    }

}
