import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Member member1=new MemberReguler(10);

        Scanner scanner = new Scanner(System.in);

        String Username = "Admin";
        String Password = "123";

        System.out.print("Enter Username\t: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password\t: ");
        String password = scanner.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            String captcha = generateRandomCaptcha();

            System.out.println("Generated Captcha\t: " + captcha);

            System.out.print("Enter the captcha\t: ");
            String userCaptcha = scanner.nextLine();

            if (userCaptcha.equals(captcha)) {
                System.out.println("Login Success. Welcome, " + username + "!");
            } else {
                System.out.println("Authentication failed. Incorrect captcha.");
            }
        } else {
            System.out.println("Authentication failed. Incorrect username or password.");
        }

        
        System.out.println("Member1 memiliki poin : " + member1.getPoin());
        System.out.println("");

        Date tanggal = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        String tanggalTransaksi = dateFormat.format(tanggal);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
        String waktuTransaksi = timeFormat.format(tanggal);
        

        try {
            Member tes1 = new Member(){};
            System.out.print("Input Nama Pelanggan\t: ");
            tes1.namaPelanggan = scanner.nextLine();

            System.out.print("Input Nomor HP\t: ");
            tes1.noHp = scanner.nextLine();

            System.out.print("Input Alamat\t\t: ");
            tes1.alamat = scanner.nextLine();

            System.out.print("Input No. Faktur\t: ");
            tes1.nomorFaktur = scanner.nextLine();

            System.out.print("Input Nama Barang\t: ");
            tes1.namaBarang = scanner.nextLine();

            System.out.print("Input Harga Barang\t: ");
            tes1.hargaBarang = scanner.nextLong();

            System.out.print("Input Jumlah Barang\t: ");
            tes1.jumlahBarang = scanner.nextLong();
            
            System.out.print("Input Kode Barang\t: ");
            tes1.kodeBarang = scanner.nextLine();



            tes1.totalBayar = tes1.hargaBarang * tes1.jumlahBarang;

            System.out.println("");
            System.out.println("\tAdli's Shop");
            System.out.println("Date \t:" + tanggalTransaksi);
            System.out.println("Time \t\t:" + waktuTransaksi);

            System.out.println("------------------------");
            System.out.println("Customer Information");
            System.out.println("------------------------");
            System.out.println("Name\t:" + tes1.namaPelanggan);
            System.out.println("Phone Number\t:"+tes1.noHp);
            System.out.println("Address\t\t:"+tes1.alamat);
            System.out.println("------------------------");

            System.out.println("Purchase Information");
            System.out.println("------------------------");
            System.out.println("Product Code\t:" + tes1.kodeBarang);
            System.out.println("Product Name\t:" + tes1.namaBarang);
            System.out.println("Price\t:" + tes1.hargaBarang);
            System.out.println("Quantity\t:" + tes1.jumlahBarang);
            System.out.println("TOTAL\t:" + tes1.totalBayar);
            System.out.println("========================");

            System.out.println("Kasir\t\t:" + tes1.namaKasir);
            System.out.println("");


        } catch (java.util.InputMismatchException e) {
            System.out.println("Maaf, input tidak valid. Pastikan Anda memasukkan nilai numerik untuk harga dan jumlah barang.");
        } finally {
            scanner.close();
        }
    }

    private static String generateRandomCaptcha() {
        int length = 6;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            captcha.append(characters.charAt(index));
        }

        return captcha.toString();
    }
}