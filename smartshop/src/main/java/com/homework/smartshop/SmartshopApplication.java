package com.homework.smartshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SmartshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartshopApplication.class, args);
    }

    @RequestMapping("/")
    String home(){
        return "IRASHAIMASE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }

    //GET ALL MENU
    @RequestMapping("/menu")
    public String getAllMenu() {
        return JapaneseCuisineKitchen.getAllMenu();
    }

    //GET SPECIFIC MENU'S DESCRIPTION BY ID EX. /menu/id=a0001
    @RequestMapping(value = "/menu/id={id}/description", method= RequestMethod.GET)
    public String shippingPackages(@PathVariable String id) {
        return JapaneseCuisineKitchen.Description(id);
    }

    //GET TOTAL PRICE EX. /menu/id=a0001,b0001
    @RequestMapping("/menu/id={id}")
    public String calculate(@PathVariable String id) {
        return JapaneseCuisineKitchen.calculate(id);
    }

}
