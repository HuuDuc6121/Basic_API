/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akt.bookstore.resource.v1;

import com.akt.bookstore.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Admin
 */

@Path("v1/books") // bất kì ai gõ: localhost:6969/bookstore/api/v1/books thì đến đc class này!!!
public class BookResource {
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello(){
//        return "Hey all. A small message, a giant knowlegde we have!!!";
//    }
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    //gọi /api/books sẽ chạy hàm này từ URL. Hàm này sẽ trả về JSON
//    public Book getABook(){
//        //gọi DAO để lấy từ DB lên 1 cuốn sách thả vào trong Book(...)
//        //tạm thời new sẵn, DB làm sau...
//        //return DAO.get();
//        return new Book("8935244878349", "Lớp Học Rùng Rợn", "Emi Ishikawa", 1, 2022);
//    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //gọi /api/books sẽ chạy hàm này từ URL. Hàm này sẽ trả về JSON
    public Response getABook(){
        
        Book book = new Book("8935244878349", "Lớp Học Rùng Rợn", "Emi Ishikawa", 1, 2022);
        //Response res = Response.status(Response.Status.NOT_IMPLEMENTED).entity(book).build();
        Response res = Response.ok().entity(book).build();
        return res;
    }
    
    
    
}
