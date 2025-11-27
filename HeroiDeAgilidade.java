public class HeroiDeAgilidade extends Personagem
{
    public HeroiDeAgilidade(String nome, int nivel)
    {
        super(nome, nivel, "Herói de Agilidade");
    }
    @Override
    public void atacar()
    {
        System.out.println(nome + ": Ataca com movimentos rápidos e precisos!");
    }
    @Override
    public void defender()
    {
        System.out.println(nome + ": Se esquiva com reflexos incríveis!");
    }
    @Override
    public void executarUltimata()
    {
        System.out.println(nome + ": Libera um Tornado de Velocidade que confunde o adversário!");
    }
}
