Sopro de Luz 🕊️

Um pequeno projeto em Java criado para abraçar através de palavras.

A tecnologia muitas vezes pode parecer fria, mas ela também pode ser usada para trazer conforto. O Sopro de Luz é uma aplicação simples de terminal que interage com o usuário, pergunta como ele está se sentindo e, com base em sua emoção, devolve uma passagem bíblica de conforto, esperança ou encorajamento.

💡 Como funciona

O usuário é convidado a digitar um sentimento que está vivenciando no momento. O sistema lê essa palavra e, de forma empática, entrega uma mensagem selecionada especialmente para aquela emoção.

Exemplo de uso:

Como você está se sentindo hoje?
- Felicidade
- Tristeza
- Raiva
- Medo
- Nojo
- Surpresa
- Amor
- Culpa
- Vergonha
- Ansiedade
Escreva o que está sentindo: medo

Separei esta mensagem especialmente para o seu coração: 
Por isso não tema, pois estou com você; não tenha medo, pois sou o seu Deus. - Isaías 41:10


Se o usuário digitar algo que o sistema não reconhece, ele não recebe um "erro" comum, mas sim uma mensagem humanizada:
"Não consegui encontrar essa opção, mas está tudo bem. Respire fundo e tente digitar um dos sentimentos da lista."

🛠️ Tecnologias e Conceitos Aplicados

Este projeto foi construído em Java e serviu para aplicar conceitos importantes da programação Orientada a Objetos e lógica de controle:

Separação de Responsabilidades (Classes): O código é dividido em duas classes principais. A Principal cuida da interação com o usuário (ler e imprimir na tela), enquanto a Sentimentos foca apenas na regra de negócio (associar a palavra à passagem).

Estrutura Switch/Case com Strings: Uso do switch para otimizar a escolha das mensagens, substituindo longas cadeias de if/else.

Tratamento de Strings: Uso do método .toLowerCase() para garantir que o programa entenda o usuário independente de como ele digite (ex: "medo", "Medo" ou "MEDO").

Entrada de dados: Uso da classe Scanner para capturar as palavras digitadas no console.
