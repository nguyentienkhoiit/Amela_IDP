package com.khoinguyen.dispringboot;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tshirt")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TShirt implements IOutfit {
    @Override
    public void wear() {
        System.out.println("Đang mặc T shirt");
    }
}
