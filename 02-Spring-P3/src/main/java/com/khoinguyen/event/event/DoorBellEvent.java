package com.khoinguyen.event.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class DoorBellEvent extends ApplicationEvent {
    private String guestName;
    /*
        Mọi Class kế thừa ApplicationEvent sẽ
        phải gọi Constructor tới lớp cha.
     */
    public DoorBellEvent(Object source, String guestName) {
        // Object source là object tham chiếu tới
        // nơi đã phát ra event này!
        super(source);
        this.guestName = guestName;
    }
}
