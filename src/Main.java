import java.time.LocalDate;

public class Main {

    public static void main (String[] args){

       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("descricao curso java");
       curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

      /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        BootCamp bootCamp = new BootCamp()();
        bootCamp.setNome("BootCamp java developer");
        bootCamp.setDescricao("Descricao BootCamp java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devGilson = new Dev();
        devGilson.setNome("Gilson");
        devGilson.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Gilson" + devGilson.getConteudoInscritos());
        devGilson.progredir();
        devGilson.progredir();
        devGilson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Gilson" + devGilson.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Gilson" + devGilson.getConteudoConcluidos());
        System.out.println("XP:" + devGilson.calcularTotalXP());


        System.out.println("---------");

        Dev devGargarine = new Dev();
        devGargarine.setNome("Gargarine");
        devGargarine.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Gargarine" + devGargarine.getConteudoInscritos());
        devGargarine.progredir();
        devGargarine.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Gargarine" + devGargarine.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Gargarine" + devGargarine.getConteudoConcluidos());
        System.out.println("XP:" + devGargarine.calcularTotalXP());
    }
}
