package com.offcn.controller;

import com.offcn.pojo.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: lhq
 * @Date: 2020/9/3 10:12
 * @Description:
 */
@RestController   //业务代码所在目录一定与主工程入口类在同一个目录下
public class TestController {

    @Value("${offcn.ip}")
    private String  ip;
    @Value("${offcn.port}")
    private String port;


    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }


    @RequestMapping("/findOne")
    public Car findOne(){
        Car car = new Car(1L,"Benz",400000,new Date());
        return car;
    }

    @RequestMapping("/findAll")
    public List<Car> findAll(){
        Car car1 = new Car(1L,"Benz",400000,new Date());
        Car car2 = new Car(2L,"BMW",500000,new Date());
        Car car3 = new Car(3L,"toyo",600000,new Date());
        Car car4 = new Car(5L,"HongQi",700000,new Date());
        List<Car> list= new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        return list;
    }


    @RequestMapping("/getIp")
    public String getIp(){
        return ip+":"+port;
    }
}
