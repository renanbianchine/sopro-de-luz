public class Sentimentos {

    public String obterPassagem(String sentimento) {

        switch (sentimento.toLowerCase()) {
            case "felicidade":
                return "Alegrem-se sempre no Senhor. Novamente direi: alegrem-se! — Filipenses 4:4";
            case "tristeza":
                return "Bem-aventurados os que choram, pois serão consolados. — Mateus 5:4";
            case "raiva":
                return "Quando vocês ficarem irados, não pequem. Apazigúem a sua ira antes que o sol se ponha. — Efésios 4:26";
            case "medo":
                return "Por isso não tema, pois estou com você; não tenha medo, pois sou o seu Deus. Eu o fortalecerei e o ajudarei; eu o segurarei com a minha mão direita vitoriosa. — Isaías 41:10";
            case "nojo":
                return "O amor deve ser sincero. Odeiem o que é mau; apeguem-se ao que é bom. — Romanos 12:9";
            case "surpresa":
                return "Ficaram sobremaneira maravilhados e diziam: 'Ele faz tudo muito bem. Faz até o surdo ouvir e o mudo falar'. — Marcos 7:37";
            case "amor":
                return "O amor é paciente, o amor é bondoso. Não inveja, não se vangloria, não se orgulha. Não maltrata, não procura seus interesses, não se ira facilmente, não guarda rancor. O amor não se alegra com a injustiça, mas se alegra com a verdade. Tudo sofre, tudo crê, tudo espera, tudo suporta. — 1 Coríntios 13:4-7";
            case "culpa":
                return "Quem esconde os seus pecados não prospera, mas quem os confessa e os abandona encontra misericórdia. — Provérbios 28:13";
            case "vergonha":
                return "Como diz a Escritura: 'Todo o que nele confia jamais será envergonhado'. — Romanos 10:11";
            case "ansiedade":
                return "Não andem ansiosos por coisa alguma, mas em tudo, pela oração e súplicas, e com ação de graças, apresentem seus pedidos a Deus. E a paz de Deus, que excede todo o entendimento, guardará o coração e a mente de vocês em Cristo Jesus. — Filipenses 4:6-7";

            default:
                return "Não consegui encontrar essa opção, mas está tudo bem. Respire fundo e escolha um dos sentimentos da lista para receber sua mensagem.";
        }
    }
}
