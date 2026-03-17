import java.util.ArrayList;

public class main {
    public static void main( String[] args) {
        cabecalho.mostrar(args);
        ArrayList<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "Qual série da Netflix conta a história de jogadores em um jogo mortal com provas infantis?";
        q1.opcaoA = "A) Round 6";
        q1.opcaoB = "B) Stranger Things";
        q1.opcaoC = "C) Dark";
        q1.opcaoD = "D) La Casa de Papel";
        q1.opcaoE = "E) The Witcher";
        q1.correta = "A";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "Quem interpreta Geralt de Rívia em “The Witcher” (Netflix)?";
        q2.opcaoA = "A) Jason Momoa";
        q2.opcaoB = "B) Tom Hardy";
        q2.opcaoC = "C) Kit Harington";
        q2.opcaoD = "D) Chris Hemsworth";
        q2.opcaoE = "E) Henry Cavill";
        q2.correta = "E";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "Qual série da HBO mostra a disputa pelo trono de Westeros?";
        q3.opcaoA = "A) House of Cards";
        q3.opcaoB = "B) Succession";
        q3.opcaoC = "C) Vikings";
        q3.opcaoD = "D) Game of Thrones ";
        q3.opcaoE = "E) The Last Kingdom";
        q3.correta = "D";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "Qual filme da Marvel encerra a Saga do Infinito?";
        q4.opcaoA = "A) Pantera Negra";
        q4.opcaoB = "B) Doutor Estranho";
        q4.opcaoC = "C) Vingadores: Ultimato";
        q4.opcaoD = "D) Thor: Ragnarok";
        q4.opcaoE = "E) Capitão América: Guerra Civil";
        q4.correta = "C";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "Em Stranger Things, qual é o nome da personagem com poderes psíquicos?";
        q5.opcaoA = "A) Max";
        q5.opcaoB = "B) Eleven";
        q5.opcaoC = "C) Nancy";
        q5.opcaoD = "D) Joyce";
        q5.opcaoE = "E) Robin";
        q5.correta = "B";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "Qual série da HBO mostra a família Roy disputando poder em um conglomerado de mídia?";
        q6.opcaoA = "A) Mad Men";
        q6.opcaoB = "B) House of Cards";
        q6.opcaoC = "C) Succession";
        q6.opcaoD = "D) Billions";
        q6.opcaoE = "E) Breaking Bad";
        q6.correta = "C";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "Qual filme da Disney/Pixar mostra a jornada de um músico no mundo dos mortos?";
        q7.opcaoA = "A) Viva A Vida é uma Festa (Coco)";
        q7.opcaoB = "B) Soul";
        q7.opcaoC = "C) Encanto";
        q7.opcaoD = "D) Moana";
        q7.opcaoE = "E) Luca";
        q7.correta = "A";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "Qual série da Prime Video é baseada nos livros de J.R.R. Tolkien?";
        q8.opcaoA = "A) The Wheel of Time";
        q8.opcaoB = "B) Shadow and Bone";
        q8.opcaoC = "C) The Witcher";
        q8.opcaoD = "D) Os Anéis de Poder ";
        q8.opcaoE = "E) His Dark Materials";
        q8.correta = "D";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "Quem interpreta o Batman em The Batmanc (2022)?";
        q9.opcaoA = "A) Kevin Spacey";
        q9.opcaoB = "B) Christian Bale";
        q9.opcaoC = "C) Robert Pattinson ";
        q9.opcaoD = "D) Adam West";
        q9.opcaoE = "E) Heath Ledger";
        q9.correta = "C";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "Qual série espanhola da Netflix acompanha um grupo de assaltantes usando máscaras de Salvador Dalí?";
        q10.opcaoA = "A) Elite";
        q10.opcaoB = "B) La Casa de Papel";
        q10.opcaoC = "C) Vis a Vis";
        q10.opcaoD = "D) O Sucessor";
        q10.opcaoE = "E) Sky Rojo";
        q10.correta = "B";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "Qual filme da Pixar lançado em 2020 mostra a história de Joe Gardner, um professor de música?";
        q11.opcaoA = "A) Divertida Mente";
        q11.opcaoB = "B) Viva A Vida é uma Festa";
        q11.opcaoC = "C) Encanto";
        q11.opcaoD = "D) Luca";
        q11.opcaoE = "E) Soul";
        q11.correta = "E";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "Qual série da Netflix mostra adolescentes enfrentando mistérios em uma cidade costeira chamada Outer Banks?";
        q12.opcaoA = "A) Riverdale";
        q12.opcaoB = "B) Elite";
        q12.opcaoC = "C) Outer Banks";
        q12.opcaoD = "D) Locke & Key";
        q12.opcaoE = "E) Stranger Things";
        q12.correta = "C";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Qual série da HBO é um spin-off de Game of Thrones e mostra a Casa Targaryen?";
        q13.opcaoA = "A) House of the Dragon";
        q13.opcaoB = "B) The Witcher";
        q13.opcaoC = "C) Vikings: Valhalla";
        q13.opcaoD = "D) Spartacus";
        q13.opcaoE = "E) The Last Kingdom";
        q13.correta = "A";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Qual filme da Marvel apresentou pela primeira vez o multiverso de forma ampla?";
        q14.opcaoA = "A) Homem-Aranha: Sem Volta Para Casa";
        q14.opcaoB = "B) Loki";
        q14.opcaoC = "C) Vingadores: Ultimato";
        q14.opcaoD = "D) Doutor Estranho no Multiverso da Loucura ";
        q14.opcaoE = "E) WandaVisionr";
        q14.correta = "D";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "Qual série da Netflix mostra a vida de jovens ricos em uma escola de elite espanhola?";
        q15.opcaoA = "A) La Casa de Papel";
        q15.opcaoB = "B) Control Z";
        q15.opcaoC = "C) Elite";
        q15.opcaoD = "D) Riverdale";
        q15.opcaoE = "E) Gossip Girl";
        q15.correta = "C";

        int acertos = 0;
        for (Questao q : questoes) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) acertos++;
        }
    }
}