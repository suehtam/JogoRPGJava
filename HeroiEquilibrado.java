public class HeroiEquilibrado extends Personagem
{
    public HeroiEquilibrado(String nome, int nivel)
    {
        super(nome, nivel, "Herói Equilibrado");
    }
    @Override
    public void atacar()
    {
        System.out.println(nome + ": Ataca com uma combinação de força e agilidade!");
    }
    @Override
    public void defender()
    {
        System.out.println(nome + ": Defende com disciplina e estratégia!");
    }
    @Override
    public void executarUltimata()
    {
        System.out.println(nome + ": Canaliza o Poder Harmonioso, equilibrando ataque e defesa!");
    }
}
