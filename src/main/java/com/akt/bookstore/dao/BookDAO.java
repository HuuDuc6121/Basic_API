/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akt.bookstore.dao;

import com.akt.bookstore.model.Book;
import com.akt.bookstore.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BookDAO {

    private static BookDAO instance;
    private Connection conn = DBUtil.makeConnection();

    // Cấm new trực tiếp BookDAO, chỉ đi qua con đường lấy trực tiếp BookDAO từ hàm static
    private BookDAO() {
    }

    public static BookDAO getInstance() {

        if (instance == null) {
            instance = new BookDAO();
        }
        return instance;
    }

    // Lấy ra tất cả sách trong kho
    public List<Book> getAll() {

        PreparedStatement stm;
        ResultSet rs;

        List<Book> bookList = new ArrayList();
        try {

            String sql = "select * from Book;";
            stm = conn.prepareStatement(sql);

            rs = stm.executeQuery();
            while (rs.next()) {
                bookList.add(new Book(rs.getString("Isbn"),
                        rs.getString("Title"),
                        rs.getString("Author"),
                        rs.getInt("Edition"),
                        rs.getInt("PublishedYear")));
            }
        } catch (Exception ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }

    public static void main(String[] args) {

        System.out.println("All of books: \n" + getInstance().getAll()); //gọi thầm tên em
        
    }

}
