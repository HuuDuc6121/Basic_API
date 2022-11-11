/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akt.bookstore;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Admin
 */
//Logic xử lí của web app mình đang làm
//1. nếu user gõ từ trình duyệt http://localhost:6969/bookstore
//nghĩa là sẽ đi vào web app truyền thống như môn java web

//2. Nếu gõ từ trình duyệt http://localhost:6969/bookstore/api
//đó là lúc jersey sẽ xuất hiện đảm nhận việc xử lí request/response
//.../api là URL dành riêng cho web api của mình
// mình ko thích / api thì thay = cái gì mình thích cũng đc
//.../ahihi

//Khi /API THÌ HẬU TRƯỜNG DIỄN RA ĐIỀU GÌ: TOMCAT -> JERSEY
//JERSEY SẼ ĐI TÌM CÁC CLASS NẰM TRONG PACKAGE ĐC MÔ TẢ Ở CÂU LỆNH
// PACKAGES() Ở DƯỚI - CƠ CHẾ MAPPING URL THÀNH CLASS XỬ LÍ

@ApplicationPath("api") // thay bằng "ahihi" cũng đc
public class BookApplication extends ResourceConfig{

    public BookApplication() {
        
        packages("com.akt.bookstore.resource");
    }
    
    
    
}
