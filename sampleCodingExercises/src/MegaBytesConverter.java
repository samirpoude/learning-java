public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(29875437);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid value");
        }else {
            int megabyte = kiloBytes / 1024;
            int gigaByte= kiloBytes / 2048;
            double teraByte = gigaByte / 1024;
            int rem = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB =  " +  megabyte + " MB and " + rem + " KB and its GB is = " + gigaByte + " and tera byte becomes = " +teraByte );
        }
    }


}

