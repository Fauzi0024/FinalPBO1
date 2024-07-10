/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksidb;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement; //coding crud
import java.sql.ResultSet;
/**
 *
 * @author User
 */
public class koneksi {
    private String databaseName = "2210020041";
    private String username = "root";
    private String password = "";

    private static Connection koneksi;
    
    public koneksi(){
        try {
            String url = "jdbc:mysql://localhost/"+this.databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url,this.username,this.password);
            System.out.println("database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanVendor(String kode_vendor, String nama_vendor, String alamat, String kota, Integer no_telp, String email){
        try {
            String sql = "INSERT INTO vendor (kode_vendor,nama_vendor,alamat,kota,no_telp,email) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_vendor );
            perintah.setString(2, nama_vendor);
            perintah.setString(3, alamat);
            perintah.setString(4, kota);
            perintah.setInt(5, no_telp);
            perintah.setString(6, email );
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahVendor(String kode_vendor, String nama_vendor, String alamat, String kota, Integer no_telp, String email){
        try {
        String sql = "UPDATE vendor (kode_vendor,nama_vendor,alamat,kota,no_telp,email) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_vendor );
            perintah.setString(2, nama_vendor);
            perintah.setString(3, alamat);
            perintah.setString(4, kota);
            perintah.setInt(5, no_telp);
            perintah.setString(6, email );
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapusVendor(Integer kodeVendor) {
    try {
        String sql = "DELETE FROM vendor WHERE kodeVendor = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, kodeVendor);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void cariVendor(Integer kodeVendor) {
       try {
           String sql ="SELECT * FROM vendor WHERE kodeVendor=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, kodeVendor);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("kode_vendor"));
            System.out.println(data.getString("nama_vendor"));
            System.out.println(data.getString("alamat"));
            System.out.println(data.getString("kota"));
            System.out.println(data.getString("no_telp"));
            System.out.println(data.getString("email"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
  }
        public void simpanLisensi(String kode_detail_lisensi, int nomor_lisensi, String nama_lisensi, String kode_vendor){
        try {
            String sql = "INSERT INTO lisensi (kode_detail_lisensi, nomor_lisensi, nama_lisensi, kode_vendor) value (?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_detail_lisensi );
            perintah.setInt(2, nomor_lisensi);
            perintah.setString(3, nama_lisensi);
            perintah.setString(4, kode_vendor);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahLisensi(String kode_detail_lisensi, int nomor_lisensi, String nama_lisensi, String kode_vendor){
        try {
        String sql = "UPDATE lisensi(kode_detail_lisensi, nomor_lisensi, nama_lisensi, kode_vendor) value (?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_detail_lisensi );
            perintah.setInt(2, nomor_lisensi);
            perintah.setString(3, nama_lisensi);
            perintah.setString(4, kode_vendor);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapusLisensi(Integer kodeDetailLisensi) {
    try {
        String sql = "DELETE FROM lisensi WHERE kodeDetailLisensi = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, kodeDetailLisensi);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void cariLisensi(Integer kodeDetailLisensi) {
       try {
           String sql ="SELECT * FROM lisensi WHERE kodeDetailLisensi=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, kodeDetailLisensi);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("kode_detail_lisensi"));
            System.out.println(data.getString("nomor_lisensi"));
            System.out.println(data.getString("nama_lisensi"));
            System.out.println(data.getString("kode_vendor"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
}
  
  public void simpanPengalaman(String kode_detail,  String nama_peng, String kode_vendor){
        try {
            String sql = "INSERT INTO pengalaman (kode_detail,  String nama_peng, String kode_vendor) value (?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_detail );
            perintah.setString(2, nama_peng);
            perintah.setString(3, kode_vendor);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahPengalaman(String kode_detail,  String nama_peng, String kode_vendor){
        try {
        String sql = "UPDATE pengalaman (kode_detail,  String nama_peng, String kode_vendor) value (?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_detail );
            perintah.setString(2, nama_peng);
            perintah.setString(3, kode_vendor);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapusPengalaman(Integer kodeDetailPeng) {
    try {
        String sql = "DELETE FROM pengalaman WHERE kodeDetailPeng = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, kodeDetailPeng);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void cariPengalaman(Integer kodeDetailPeng) {
       try {
           String sql ="SELECT * FROM pengalaman WHERE kodeDetailPeng=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, kodeDetailPeng);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("kode_detail"));
            System.out.println(data.getString("nama_peng"));
            System.out.println(data.getString("kode_vendor"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
}
  
  public void simpanAuctionDetail(String kode_auction_detail, int harga, String kode_vendor, String kode_auction){
        try {
            String sql = "INSERT INTO auction_detail (kode_auction_detail, harga, kode_vendor, kode_auction) value (?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kode_auction_detail );
            perintah.setInt(2, harga);
            perintah.setString(3, kode_vendor);
            perintah.setString(4, kode_auction);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahAuctionDetail(String kode_auction_detail, int harga, String kode_vendor, String kode_auction){
        try {
        String sql = "UPDATE auction_detail (kode_auction_detail, harga, kode_vendor, kode_auction) value (?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
             perintah.setString(1, kode_auction_detail );
            perintah.setInt(2, harga);
            perintah.setString(3, kode_vendor);
            perintah.setString(4, kode_auction);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapusAuctionDetail(Integer kodeAuctionDetail) {
    try {
        String sql = "DELETE FROM auction_detail WHERE kodeAuctionDetail = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, kodeAuctionDetail);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void cariAuctionDetail(Integer kodeAuctionDetal) {
       try {
           String sql ="SELECT * FROM auction_detail WHERE kodeAuctionDetail=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, kodeAuctionDetal);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("kode_auction_detail"));
            System.out.println(data.getString("harga"));
            System.out.println(data.getString("kode_vendor"));
            System.out.println(data.getString("kode_auction"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
}
}
