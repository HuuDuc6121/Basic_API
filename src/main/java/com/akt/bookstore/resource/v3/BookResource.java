/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akt.bookstore.resource.v3;

import com.akt.bookstore.dao.BookDAO;
import com.akt.bookstore.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 * @author Admin
 */

@Path("v3/books")
public class BookResource {
    
    private BookDAO dao = BookDAO.getInstance();//singleton
    //chỉ có 1 duy nhất new BookDAO() trong RAM
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks(){
        return dao.getAll();
        //trả về tất cả sách từ DB
    }
    
}
