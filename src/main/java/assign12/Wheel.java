package assign12;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Wheel {
    private int radius;
    private int width;

    public Wheel(int radius, int width) {
        this.radius = radius;
        this.width = width;
    }

}
