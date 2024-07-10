/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1zi;
import gui.FrameVendor;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import koneksidb.*;
import pengadaan.auctiondetail;

import pengadaan.lisensi;
import pengadaan.pengalaman;
import pengadaan.vendor;

/**
 *
 * @author ASUS
 */

public class pbozi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        koneksi obj = new koneksi();
        new FrameVendor().setVisible(true);
        /*
        // Creating a vendor
        vendor vendor = new vendor();
        System.out.print("Enter vendor Code: ");
        vendor.setKodeVendor(scanner.nextLine());
        System.out.print("Enter vendor Name: ");
        vendor.setNamaVendor(scanner.nextLine());
        System.out.print("Enter vendor Address: ");
        vendor.setAlamatVendor(scanner.nextLine());
        System.out.print("Enter City Code (char): ");
        vendor.setKota(scanner.nextLine().charAt(0));
        System.out.print("Enter Phone Number: ");
        vendor.setNoTelp(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Enter Email: ");
        vendor.setEmail(scanner.nextLine());


        // Creating an AuctionDetail
        auctiondetail auctiondetail = new auctiondetail();
        System.out.print("Enter Auction Detail Code: ");
        auctiondetail.setKodeAuctionDetail(scanner.nextLine());
        System.out.print("Enter Price: ");
        auctiondetail.setHarga(scanner.nextInt());
        scanner.nextLine(); // consume newline
        System.out.print("Enter Vendor Code: ");
        auctiondetail.setKodeVendor(scanner.nextLine());
        System.out.print("Enter Auction Code: ");
        auctiondetail.setKodeAuction(scanner.nextLine());

        
        // Creating a Pengalaman
        pengalaman pengalaman = new pengalaman();
        System.out.print("Enter Pengalaman Detail Code: ");
        pengalaman.setKodedetailPeng(scanner.nextLine());
        System.out.print("Enter Pengalaman Name: ");
        pengalaman.setNamaPeng(scanner.nextLine());
        System.out.print("Enter Vendor Code: ");
        pengalaman.setKodeVendor(scanner.nextLine());

        // Creating a Lisensi
        lisensi lisensi = new lisensi();
        System.out.print("Enter Lisensi Detail Code: ");
        lisensi.setKodeDetaillisensi(scanner.nextLine());
        System.out.print("Enter Lisensi Number: ");
        lisensi.setNomorlisensi(scanner.nextInt());
        scanner.nextLine(); // consume newline
        System.out.print("Enter Lisensi Name: ");
        lisensi.setNamalisensi(scanner.nextLine());
        System.out.print("Enter Vendor Code: ");
        lisensi.setKodeVendor(scanner.nextLine());

        
        // Display Vendor details
        System.out.println("\nVendor Details:");
        System.out.println("Vendor Code: " + vendor.getKodeVendor());
        System.out.println("Vendor Name: " + vendor.getNamaVendor());
        System.out.println("Vendor Address: " + vendor.getAlamatVendor());
        System.out.println("City Code: " + vendor.getKota());
        System.out.println("Phone Number: " + vendor.getNoTelp());
        System.out.println("Email: " + vendor.getEmail());

       

        // Display AuctionDetail details
        System.out.println("\nAuction Detail:");
        System.out.println("Auction Detail Code: " + auctiondetail.getKodeAuctionDetail());
        System.out.println("Price: " + auctiondetail.getHarga());
        System.out.println("Vendor Code: " + auctiondetail.getKodeVendor());
        System.out.println("Auction Code: " + auctiondetail.getKodeAuction());

        
        // Display Pengalaman details
        System.out.println("\nPengalaman:");
        System.out.println("Pengalaman Detail Code: " + pengalaman.getKodeDetailPeng());
        System.out.println("Pengalaman Name: " + pengalaman.getNamaPeng());
        System.out.println("Vendor Code: " + pengalaman.getKodeVendor());

        // Display Lisensi details
        System.out.println("\nLisensi:");
        System.out.println("Lisensi Detail Code: " + lisensi.getKodeDetailLisensi());
        System.out.println("Lisensi Number: " + lisensi.getNomorLisensi());
        System.out.println("Lisensi Name: " + lisensi.getNamaLisensi());
        System.out.println("Vendor Code: " + lisensi.getKodeVendor());
    }*/
    }
   
}

