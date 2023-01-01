package pages;

import org.aeonbits.owner.ConfigFactory;

public class Runner {
    public static void main(String[] args) {
        FrameWorkConfig config= ConfigFactory.create(FrameWorkConfig.class);
        System.out.println(config.url());
        System.out.println(config.fname());


    }
}
