public class main {
  public static void main(String[] args) {
    cat cats = new cat();
    cats.setColor("Hitam");
    cats.setAge(4);
    cats.displayCat();
    //System.out.println(cats.getName() + " " + cats.getColor() + " " +
    cats.getAge();

    cat cats1 = new cat();
    cats1.setColor("Putih");
    cats1.setAge(3);
    cats1.displayCat();

    cat cats2 = new cat();
    cats2.setColor("Hitam dan Putih");
    cats2.setAge(4);
    cats2.displayCat();

    cat cats3 = new cat();
    cats3.setColor("Poleng Poleng");
    cats3.setAge(3);
    cats3.displayCat();

    cat cats4 = new cat();
    cats4.setColor("Bintik Bintik");
    cats4.setAge(4);
    cats4.displayCat();

    // IKAN
    fish fish1 = new fish();
    fish1.setName("Paus");
    fish1.setMakan("plankton");
    fish1.displayFish();

    fish fish2 = new fish();
    fish2.setName("cupang");
    fish2.setMakan("cacing");
    fish2.displayFish();

    fish fish3 = new fish();
    fish3.setName("arwana");
    fish3.setMakan("jangrik");
    fish3.displayFish();

    fish fish4 = new fish();
    fish4.setName("sapu-sapu");
    fish4.setMakan("pelet");
    fish4.displayFish();

    // bunga
    flower flower1 = new flower();
    flower1.setName("bangkai");
    flower1.setColor("merah");
    flower1.setPetal(12);
    flower1.displayCat();

    flower flower2 = new flower();
    flower2.setName("anggrek");
    flower2.setColor("putih");
    flower2.setPetal(8);
    flower2.displayCat();

    flower flower3 = new flower();
    flower3.setName("mawar");
    flower3.setColor("merah");
    flower3.setPetal(3);
    flower3.displayCat();

    flower flower4 = new flower();
    flower4.setName("melati");
    flower4.setColor("kuning");
    flower4.setPetal(5);
    flower4.displayCat();

    //Mobil
    car car1 = new car();
    car1.setType("sedan");
    car1.setColor("hitam");
    car1.setRoda(4);
    car1.displayCat();

    car car2 = new car();
    car2.setType("suv");
    car2.setColor("putih");
    car2.setRoda(4);
    car2.displayCat();

    car car3 = new car();
    car3.setType("truck");
    car3.setColor("hitam");
    car3.setRoda(4);
    car3.displayCat();

    car car4 = new car();
    car4.setType("bus");
    car4.setColor("putih");
    car4.setRoda(4);
    car4.displayCat();

  }

  // System.out.println(cats1.getName() + " " + cats1.getColor() + " " +
  // cats1.getAge());
  // cat cats = new cat();
  // cats.hour = 12;
  // cats.minute = 20;
  // cats.second = 50;
  // cats.displayTime();

  // cats.hour = 12;
  // cats.minute = 20;
  // cats.second = 50;
  // cats.displayTime();
}
