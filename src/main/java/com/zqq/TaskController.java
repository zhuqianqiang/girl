package com.zqq;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Component
public class TaskController {
    private  static  final SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 3000)
    public void print() {
        System.out.println(sdf.format(new Date()));
    }
}
