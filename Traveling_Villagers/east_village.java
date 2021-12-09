class east_village extends Thread
{
  Villager villager;

  east_village()
  {
    villager = new Villager();
  }

  public void run()
  {
    synchronized(villager)
    {
      villager.travelRoad("EastVillage");
    }
  }
}
