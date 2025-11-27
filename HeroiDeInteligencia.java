public class HeroiDeInteligencia extends Personagem
{
    public HeroiDeInteligencia(String nome, int nivel)
    {
        super(nome, nivel, "Herói de Inteligência");
    }
    @Override
    public void atacar()
    {
        System.out.println(nome + ": Lança uma rajada de energia mental!");
    }
    @Override
    public void defender()
    {
        System.out.println(nome + ": Cria uma barreira psíquica!");
    }
    @Override
    public void executarUltimata()
    {
        System.out.println(nome + ": Invoca uma Tempestade Arcana que desorienta o inimigo!");
    }
}
