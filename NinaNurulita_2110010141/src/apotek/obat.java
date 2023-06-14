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
public class obat {
    private ArrayList<String> nama;
    private ArrayList<String> jenis;
    private ArrayList<Integer> harga;       
    private ArrayList<Integer> stock;
    
    public obat(){
    nama = new ArrayList<String>();
    jenis = new ArrayList<String>();
    harga = new ArrayList<Integer>();
    stock = new ArrayList<Integer>();
    } //konstuktor
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
    return this.nama;
    }
    
    public void insertJenis(String isi){
        this.jenis.add(isi);
    }
    
    public ArrayList<String> getRecordJenis(){
    return this.jenis;
    }
    
    public void insertHarga(Integer isi){
        this.harga.add(isi);
    }
    
    public ArrayList<Integer> getRecordHarga(){
    return this.harga;
    }
    
    public void insertstock(int isi){
        this.stock.add(isi);
    }
    
    public ArrayList<Integer> getRecordstock(){
    return this.stock;
    }   
}
