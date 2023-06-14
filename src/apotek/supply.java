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
public class supply {
    
    private ArrayList<String> tanggal;
    private ArrayList<Integer> jumlahObat;       
    private ArrayList<Integer> total;
    private ArrayList<Integer> pajak;       
    private ArrayList<Integer> totalBayar;
    
    public supply(){
        tanggal = new ArrayList<String>();
        jumlahObat = new ArrayList<Integer>();
        total = new ArrayList<Integer>();
        pajak = new ArrayList<Integer>();
        totalBayar = new ArrayList<Integer>();
    }
    
    //method set
     public void insertTanggal(String isi){
        this.tanggal.add(isi);
    }
    
    public ArrayList<String> getRecordTanggal(){
    return this.tanggal;
    }
    
    public void insertjumlahObat(Integer isi){
        this.jumlahObat.add(isi);
    }
    
    public ArrayList<Integer> getRecordjumlahObat(){
    return this.jumlahObat;
    }   
    
    public void inserttotal(Integer isi){
        this.total.add(isi);
    }
    
    public ArrayList<Integer> getRecordtotal(){
    return this.total;
    }   
    
    public void insertpajak(Integer isi){
        this.pajak.add(isi);
    }
    
    public ArrayList<Integer> getRecordpajak(){
    return this.pajak;
    }   
    
    public void inserttotalBayar(Integer isi){
        this.totalBayar.add(isi);
    }
    
    public ArrayList<Integer> getRecordtotalBayar(){
    return this.totalBayar;
    } 
}
