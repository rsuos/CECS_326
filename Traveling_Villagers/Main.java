class Main {
  public static void main(String[] args) {
    east_village ev = new east_village();
    west_village wv = new west_village();
    Road road = new Road(ev, wv);
    Thread r = new Thread(road);
    r.start();
  }
}
