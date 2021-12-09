class Villager
{
  public void travelRoad(String village)
  {
    System.out.println(village + " Villager is traveling the road");
    try
    {
      Thread.sleep(1000);
      System.out.println(village + " Villager is waiting");
    }
    catch (Exception e)
    {
      System.out.println("Interrupted");
    }
  }
}
