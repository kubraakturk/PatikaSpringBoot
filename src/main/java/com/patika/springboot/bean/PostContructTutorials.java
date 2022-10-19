package com.patika.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostContructTutorials {

    //@Autowired
    //Logger LOG;


    // parametresiz kurucu Eğer ki because "this.LOG" is null hatası alınırsa bunu aşmak için @PostConstruct kullanmalıyız.
    /*public PostContructTutorials(){
        LOG.info("Log info çağrısı yapıldı.");
    }*/

    //bean hemen başlamadığından null döndürüyor fakat @PosConstruct yazdığımızda hemen bean oluşturuyor.
  //  @PostConstruct
   // public void init(){
    //    LOG.info("Log info çağrıldı");
    //}



    /*public static void main(String[] args) {
        PostContructTutorials postContructTutorialsController = new PostContructTutorials();
        System.out.println(postContructTutorialsController);
    }*/
}
