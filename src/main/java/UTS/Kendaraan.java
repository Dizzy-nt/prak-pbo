/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
/**
 *
 * @author User
 */
abstract public class Kendaraan {
    private String model;
    protected int tahunProduksi;
    private String merk;

    public Kendaraan(String Pmerk, String Pmodel, int PtahunProduksi) {
        this.merk=Pmerk;
        this.tahunProduksi=PtahunProduksi;
    }
    abstract void bergerak();
    void berhenti(){
        System.out.println("Kendaraan berhenti");
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public String getMerk() {
        return merk;
    }
}

interface bahanBakar{
    public void isiBahanBakar();
}

class mobil extends Kendaraan implements bahanBakar{
    private String jenisBahanBakar;
    public mobil(String Pmerk, String Pmodel, int PtahunProduksi, String PjenisBahanBakar){
        super(Pmerk, Pmodel, PtahunProduksi);
        setJenisBahanBakar(PjenisBahanBakar);
        setModel(Pmodel);
    }
    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }
    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }  
    
    @Override
    void bergerak() {
        System.out.println("Mobil bergerak maju");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mobil diisi bahan bakar "+ getJenisBahanBakar());
    }  
}
class bajay extends Kendaraan implements bahanBakar{
    private String jenisBahanBakar;
    public bajay(String Pmerk, String Pmodel, int PtahunProduksi, String PjenisBahanBakar){
        super(Pmerk, Pmodel, PtahunProduksi);
        setJenisBahanBakar(PjenisBahanBakar);
        setModel(Pmodel);
    }
    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }
    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }  
    
    @Override
    void bergerak() {
        System.out.println("Bajay bergerak maju");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Bajay diisi bahan bakar "+ getJenisBahanBakar());
    }  
}
class motor extends Kendaraan implements bahanBakar{
    private String jenisBahanBakar;
    public motor(String Pmerk, String Pmodel, int PtahunProduksi, String PjenisBahanBakar){
        super(Pmerk, Pmodel, PtahunProduksi);
        setJenisBahanBakar(PjenisBahanBakar);
        setModel(Pmodel);
    }
    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }
    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }  
    
    @Override
    void bergerak() {
        System.out.println("Motor bergerak maju");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Motor diisi bahan bakar "+ getJenisBahanBakar());
    }  
}

