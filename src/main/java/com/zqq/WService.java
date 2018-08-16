package com.zqq;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService
public class WService {

    public String transWords(String words) {
        String res = "";
        for(char ch : words.toCharArray()){
            res += ch+",";
        }
        return res;
    }
    public static void main(String[] args) {
        // 使用Endpoint(终端)类发布webservice
        Endpoint.publish("http://localhost:8088/service/function", new WService());
        System.out.println("Publish Success");
    }
}
