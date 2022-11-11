/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akt.bookstore.resource.v2;

import com.akt.bookstore.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
@Path("v2/books")
//để chạm đc vào class này thì ta cần gõ:
//bookstore/api/v2/books
public class BookResource {
    
    private List<Book> list = new ArrayList();
    
    public BookResource(){
        //làm contructor khởi động dánh sách cuốn sách
        //lẽ ra phần này laasy từ DB lên, lần sau!!!
        list.add(new Book("1", "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 1, 2022));
        list.add(new Book("2", "Em của ngày hôm qua", "Sơn Tùng", 1, 2022));
        list.add(new Book("3", "Đời ngắn đừng ngủ dài", "Japan", 1, 2022));
    }
    
    //trả về 1 chuỗi để kiểm thử api version2
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(){
        return "Duc DH - From API ver.2";
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks(){
        //xem thử mảng trong JSON thế nào??
        return list;
    }
    
    @GET
    @Path("{maso}") //bạn muốn xem chi tiết cuốn nào thì gõ
                    //api/v2/books/1 -- mã cuốn sách muốn tìm
                    //độ URL theo từng mã số muốn tìm - PATH PARAM
                    //ko giống JW: ?maso=1&... -> QUEY PARAM
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook(@PathParam("maso") String isbn){
        //đưa vào mã cuốn sách, trả về sách cần tìm nếu thấy
        //ko thấy trả về null. Tìm trong ArrayList, hoặc where isbn = trong DB
        for (Book x : list) {
            if(x.getIsbn().equals(isbn)){
                return x;
            }
        }
        return null;
    }
    
}
