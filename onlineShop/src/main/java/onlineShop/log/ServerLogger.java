package onlineShop.log;

import org.springframework.stereotype.Component;

@Component(value = "serverLogger") //告诉Spring serverLogger是它要管理的一个bean
public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}

