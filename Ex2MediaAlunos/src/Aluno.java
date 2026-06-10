
public class Aluno {
    public int id;
    public static int proximoID = 1;
    
    private String nome;
    private double[] notas = new double[2];
    
    public Aluno(String n, double[] _notas) {
        this.id    = this.proximoID++;
        this.nome  = n;
        this.notas = _notas;
    }
    
    public double[] getNotas() { 
        return this.notas;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double mediaAluno() {
        if (this.notas == null || this.notas.length == 0) 
            return 0.0;
        
        double soma = 0;
        for (double n : this.notas) 
            soma += n;
  
        return soma / this.notas.length;
    }
}
