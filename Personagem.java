public abstract class Personagem implements Heroi
{
    protected String nome;
    protected String classe;
    int nivel;
    public Personagem(String nome, int nivel)
    {
        this.nome = nome;
        this.nivel = nivel;
    }
    @Override
    public String getNome()
    {
        return nome;
    }
    @Override
    public int getNivel()
    {
        return nivel;
    }
    @Override
    public void apresentar()
    {
        System.out.println("Sou " + nome + ", um " + classe + " de nível " + nivel + ".");
    }
    @Override
    public abstract void atacar();
    @Override
    public abstract void defender();
    @Override
    public abstract void executarUltimata();
    @Override
    public void lutar(Heroi adversario)
    {
        System.out.println(nome + " desafia " + adversario.getNome() + " para um duelo!");
        this.apresentar();
        adversario.apresentar();
        System.out.print(nome + ": ");
        this.executarUltimata();
        System.out.print(adversario.getNome() + ": ");
        adversario.defender();
        if (this.nivel > adversario.getNivel())
        {
            System.out.println("VENCEDOR: " + nome + " (Nível " + this.nivel + " vs " + adversario.getNivel() + ")");
        } else if (this.nivel < adversario.getNivel())
        {
            System.out.println("VENCEDOR: " + adversario.getNome() + " (Nível " + adversario.getNivel() + " vs " + this.nivel + ")");
        }
        else
        {
            System.out.println("EMPATE técnico! Ambos os heróis lutaram bravamente (Nível " + this.nivel + ")");
        }
        System.out.println("Batalha encerrada.");
        System.out.println();
    }
}
