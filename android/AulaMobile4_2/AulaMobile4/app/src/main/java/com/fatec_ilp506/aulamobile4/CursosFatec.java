package com.fatec_ilp506.aulamobile4;

import java.util.ArrayList;
import java.util.List;

public class CursosFatec {
    List<String> getFatecs(String curso){
        List<String> fatecs = new ArrayList<>();
        if (curso.equals("Análise e Desenvolvimento de Sistemas")){
            fatecs.add("São Paulo");
            fatecs.add("Americana");
            fatecs.add("Ourinhos");
            fatecs.add("Guarulhos");
            fatecs.add("Ribeirão Preto");
            fatecs.add("Itaquera");
        }
        else if (curso.equals("Jogos Digitais")){
            fatecs.add("São Paulo");
            fatecs.add("Santo André");
            fatecs.add("Ourinhos");
            fatecs.add("São Vicente");
            fatecs.add("Santos");
        }
        else if (curso.equals("Segurança da Informação")){
            fatecs.add("São Pedro");
            fatecs.add("Itaquera");
            fatecs.add("São Caetano");
            fatecs.add("Campinas");
            fatecs.add("Atibaia");
            fatecs.add("Araçatuba");
        }
        else if (curso.equals("Gestão Comercial")){
            fatecs.add("São Paulo");
            fatecs.add("Itaquera");
            fatecs.add("Osasco");
            fatecs.add("Itu");
            fatecs.add("Embu");
            fatecs.add("Araraquara");
            fatecs.add("São José");
            fatecs.add("São Vicente");
            fatecs.add("Santos");
        }
        else if (curso.equals("Comércio Exterior")){
            fatecs.add("São Paulo");
            fatecs.add("Itaquera");
        }
        else if (curso.equals("Turismo")){
            fatecs.add("São Paulo");
            fatecs.add("Campinas");
            fatecs.add("Guarujá");
            fatecs.add("Bertioga");
        }
        else if (curso.equals("Secretariado")){
            fatecs.add("São Paulo");
            fatecs.add("Campinas");
            fatecs.add("Maresias");
            fatecs.add("Itu");
            fatecs.add("Ubatuba");
            fatecs.add("Itaquera");
        }
        else {
            fatecs.add("Não possui unidadde para esse curso");
        }

        return fatecs;
    }
}
