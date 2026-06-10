import java.util.ArrayList;

public class Turma {
    public ArrayList<Aluno> alunos;
    
    public Turma() {
        alunos = new ArrayList<>();
    }
    
    public double mediaTurma(ArrayList<Aluno> al) {
        if (al == null || al.isEmpty()) 
            return 0.0;
       
        double soma = 0;
       
        for (Aluno a : al) 
            soma += a.mediaAluno();
         
        return soma / al.size();
    }
}
