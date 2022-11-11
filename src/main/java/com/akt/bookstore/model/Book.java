/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akt.bookstore.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */

//Trong java có vài loại inteface khác nhau
//interface mà ko cần class implement phải viết bất cứ hàm nào - interface ko có hàm abstract,
//ví dụ interface Serializable
//Interface này dùng để báo hiệu với JVM rằng, lát hồi vào trong ram nơi Book object nó nằm, chẻ nhỏ từng field/property
//của object này thành luồng byte để đảy luồng byte này xuống tập tin
// ko đẩy code của objcet xuống tập tin, chỉ đẩy data
// đẩy từng luồng/dãy byte từ từ chạy xuống tập tin ->SERIAL
//INTERFACE NÀY ĐC GỌI LÀ MARKER INTERFACE - INTERFACE DÙNG ĐỂ ĐÁNH DẤU,
// RA HIỆU 1 ĐIỀU GÌ ĐÓ, KO CẦN CODE!!!
//CÁC DTO - DATA TRANSFER OBJECT LÀ NHỮNG CLASS ÁNH XẠ VÀO TABLE
// DO ĐÓ CẦN PHẢI CHỈ RA FIELD NÀO XUỐNG DB, HÀM THÌ Ở LẠI -> PAHRI IMPLEMENT SERIALIZABLE

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable{
    
    private String isbn; // mã cuốn sách
    private String title;//tên cuốn sách
    private String author;//tác giả
    private int edition;//lần xuất bản
    private int publishedTear;//năm xuất bản

    
    
}
