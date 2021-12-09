class west_village extends Thread
{
  Villager villager;

  west_village()
  {
    villager = new Villager();
  }

  public void run()
  {
    synchronized(villager)
    {
      villager.travelRoad("WestVillage");
    }
  }
}
