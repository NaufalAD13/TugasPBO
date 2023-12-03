public abstract class Member {
    protected Integer poin = 0;
    String namaPelanggan;
    String nomorFaktur;
    String namaBarang;
    String kodeBarang;
    Long hargaBarang;
    Long jumlahBarang;
    Long totalBayar;
    Long jumlahBeli;
    String noHp;
    String alamat;
    String namaKasir="Naufal Adli Dhiaurrahman";    



    
    public Integer getPoin(){
        return poin;
    }

    public Integer redeemPoin(Integer hargaSouvenir){
        return this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }
}

