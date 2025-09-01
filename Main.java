public class Main{
  static void myStaticMethod(){
    System.out.println("Method static bisa dipanggil di luar pembuatan objek");
  }

  public void myPublicMethod(){
    System.out.println("Method Public harus dipanggil dengan membuat objek");
  }

  public static void main (String Args[]){
    myStaticMethod(); //Untuk memanggil static method

    Main myObj = new Main(); //Membuat objek untuk Main
    myObj.myPublicMethod(); //Untuk memanggil public method
  }
}
