package Aplicacao;

import java.util.Scanner;
import Entidades.Aluno;
import java.util.HashSet;
import java.util.Set;

public class Programa {
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        
        Aluno user = new Aluno();
        
        //criando Set do tipo hashSet
        Set<Aluno> cursoA = new HashSet<>();
        
        Set<Aluno> cursoB = new HashSet<>();
        
        Set<Aluno> cursoC = new HashSet<>();
        
        System.out.print("Quantos alunos para o curso A ? ");
        int qnt = sc.nextInt();
        for(int i=0; i<qnt;i++){
            System.out.print("Id aluno #" + (i+1) + ": ");
            int id = sc.nextInt();
            cursoA.add(new Aluno(id));
        }
        System.out.print("Quantos alunos para o curso B ? ");
        qnt = sc.nextInt();
        for(int i=0; i<qnt;i++){
            System.out.print("Id aluno #" + (i+1) + ": ");
            int id = sc.nextInt();
            cursoB.add(new Aluno(id));
        }
        System.out.print("Quantos alunos para o curso C ?");
        qnt = sc.nextInt();
        for(int i=0; i<qnt;i++){
            System.out.print("Id aluno #" + (i+1) + ": ");
            int id = sc.nextInt();
            cursoA.add(new Aluno(id));
        }
        
        //fazendo junção(union) do set A, B, C
        cursoA.addAll(cursoB);
        cursoA.addAll(cursoC);
        
        System.out.println("Total de alunos: " + cursoA.size());
        
        
        
    }
    
}
