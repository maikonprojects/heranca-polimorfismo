package org.example.animais;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
      Cavalo cavalo = new Cavalo("Pé de pano", 12, "Iruuuu", "Correr");
        System.out.println("O cavalo vai: " + cavalo.getMovimento());
        System.out.println("O cavalo faz: " + cavalo.getSom());

        System.out.println("-----------------------------------");
        Cachorro cachorro = new Cachorro("Bidu", 9, "Au Au", "Correr");
        System.out.println("O cachorro vai: " + cachorro.getMovimento());
        System.out.println("O cachorro faz: " + cachorro.getSom());

        System.out.println("-----------------------------------");
        Preguica preguica = new Preguica("Josefina", 15, "ZZZZZ", "Sobe em árvores");
        System.out.println("A preguiça " +  preguica.getMovimento());
        System.out.println("A preguiça faz: " + preguica.getSom());

        System.out.println("-----------------------------------");
        System.out.println("Veterinario: ");

        Veterinario veterinario = new Veterinario();

        System.out.println("Examinando o cavalo: "+veterinario.examinar(cavalo));
        System.out.println("Examinando a preguica: "+veterinario.examinar(preguica));
        System.out.println("Examinando o cachorro: "+veterinario.examinar(cachorro));

        System.out.println("-----------------------------------");
        Zoologico zoologico = new Zoologico();

        Animal gato = new Animal("Mel", 9, "Miau", "Correr");
        Animal peixe = new Animal("Nemo", 2, "glow", "");
        Animal galinha = new Animal("pintadinha", 4, "Piu Piu", "correr");
        Animal sapo = new Animal("Fred", 5, "Reb", "");
        Animal porco = new Animal("porquinho", 7, "Ronk", "Correr");
        Animal girrafa = new Animal("dona girrafa", 16, "gronk", "Correr");
        Animal leao = new Animal("Simba", 4, "Rooww", "Correr");

        zoologico.jaula[0] = preguica;
        zoologico.jaula[1] = cachorro;
        zoologico.jaula[2] = cavalo;
        zoologico.jaula[3] = gato;
        zoologico.jaula[4] = peixe;
        zoologico.jaula[5] = galinha;
        zoologico.jaula[6] = sapo;
        zoologico.jaula[7] = porco;
        zoologico.jaula[8] = girrafa;
        zoologico.jaula[9] = leao;


        for (int i = 0; i < zoologico.getJaula().length ; i++) {
            if (zoologico.jaula[i].movimentar().equalsIgnoreCase("Correr")){
                System.out.println("O animal: " + (i + 1) + " está correndo");
                System.out.println(zoologico.jaula[i].movimentar());
            }
        }


    }
}