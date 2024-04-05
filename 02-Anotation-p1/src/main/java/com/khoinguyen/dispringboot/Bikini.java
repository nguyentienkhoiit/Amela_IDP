package com.khoinguyen.dispringboot;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bikini")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Bikini implements IOutfit {
    @Override
    public void wear() {
        System.out.println("Đang mặc Bikini");
    }
}

