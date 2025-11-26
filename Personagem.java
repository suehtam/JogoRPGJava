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
}
