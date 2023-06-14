/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class pelanggan {
    
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> jeniskelamin;
    private ArrayList<String> pekerjaan;
    
    public pelanggan(){
    nama = new ArrayList<String>();
    alamat = new ArrayList<String>();
    jeniskelamin = new ArrayList<String>();
    pekerjaan = new ArrayList<String>();
    } //Contructor Overload
    
    //method set
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
    return this.nama;
    }
    
   public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){
    return this.alamat;
    }
    
    public void insertJeniskelamin(String isi){
        this.jeniskelamin.add(isi);
    }
    
    public ArrayList<String> getRecordJeniskelamin(){
    return this.jeniskelamin;
    }
    
    public void insertPekerjaan(String isi){
        this.pekerjaan.add(isi);
    }
    
    public ArrayList<String> getRecordPekerjaan(){
    return this.pekerjaan;
    }
}
