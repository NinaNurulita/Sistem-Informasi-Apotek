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
public class supplier {
    
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> kota;
    private ArrayList<String> telpon;
    
    public supplier(){
    nama = new ArrayList<String>();
    alamat = new ArrayList<String>();
    kota = new ArrayList<String>();
    telpon = new ArrayList<String>();
    }
    
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
    
    public void insertKota(String isi){
        this.kota.add(isi);
    }
    
    public ArrayList<String> getRecordKota(){
    return this.kota;
    }
    
    public void insertTelpon(String isi){
        this.telpon.add(isi);
    }
    
    public ArrayList<String> getRecordTelpon(){
    return this.telpon;
    }  
}
