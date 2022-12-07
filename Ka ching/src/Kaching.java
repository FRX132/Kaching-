public class Kaching {
       public void countingNumber()
    {
       int a = 3;
       int b = 5;
       int c = 15;

       for (int i = 1;i<19;i++ )
       {
           // Formel für Die rechnung selbst//
           if (i%a==0 && i%c!=0)
           //Die Zahl an der stelle i wird dividiert durch die zahl in der Variable c und dann wird durch das != wird überprüft ob es nicht 0 ist
           {
           System.out.println("Ka");
           } else if (i%b==0 && i%c!=0)
           {
           System.out.println("ching");
           } else if (i%c==0)
           //die zahl an der Stelle I muss eine ganze Zahl sein
           {
           System.out.println("Ka-ching");
           }
           else
           {
           System.out.println(i);
           //restliche Zahlen

           }

       }
    }

}
