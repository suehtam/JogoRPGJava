public class Main 
{
    public static void main(String[] args) 
  {
        System.out.println("==== APRESENTAÇÃO DA LIGA ====");
        Heroi[] herois = new Heroi[4];
        herois[0] = new HeroiDeAgilidade("Flashblade", 9);
        herois[1] = new HeroiDeForca("Titan", 12);
        herois[2] = new HeroiDeInteligencia("Mindstorm", 10);
        herois[3] = new HeroiEquilibrado("Balance", 10);
        for (int i = 0; i < herois.length; i++)
        {
            herois[i].apresentar();
        }
        System.out.println("\n==== INÍCIO DOS COMBATES ====");
        for (int i = 0; i < herois.length; i++)
        {
            for (int j = 0; j < herois.length; j++)
            {
                if (i != j)
                {
                    herois[i].lutar(herois[j]);
                }
            }
        }
    }
}
