package com.khoinguyen.dispringboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    private String name;
    @Getter
    @Autowired
    @Qualifier("bikini")
    private IOutfit outfit;

//    public Girl(@Qualifier("bikini") IOutfit outfit) {
//        this.outfit = outfit;
//    }

//    public Girl(@Qualifier("bikini") IOutfit outfit) {
//        this.outfit = outfit;
//    }

//    @Autowired
//    public void setOutfit(IOutfit outfit) {
//        this.outfit = outfit;
//    }

    public void showOutfit() {
        System.out.println("Cô gái: " + name);
        outfit.wear();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Hàm này được gọi sau khi Bean Girl được tạo");
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("Hàm này được gọi trước khi Bean Girl bị hủy");
    }

    public void setName(String name) {
        this.name = name;
    }
}

