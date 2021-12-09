class Road extends Thread
{
  private east_village ev;
  private west_village wv;

  public Road(east_village ev, west_village wv)
  {
    this.ev = ev;
    this.wv = wv;
  }

  public void run()
  {
    try
    {
      while (true)
      {
        synchronized (ev)
        {
          ev.run();
          synchronized (wv)
          {
            wv.run();
          }
        }

      }
    } catch (Exception e)
    {
      System.out.println("Interrupted");
    }
  }
}
