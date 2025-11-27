public class HeroiDeForca extends Personagem
{
    public HeroiDeForca(String nome, int nivel)
    {
        super(nome, nivel, "Herói de Força");
    }
    @Override
    public void atacar()
    {
        System.out.println(nome + ": Golpeia com um soco esmagador!");
    }
    @Override
    public void defender()
    {
        System.out.println(nome + ": Resiste com sua pele endurecida!");
    }
    @Override
    public void executarUltimata()
    {
        System.out.println(nome + ": Libera um Impacto Sísmico que abala toda a arena!");
    }
}
