# Conversor de Moedas

Este é um programa em Java que permite ao usuário converter valores entre diferentes moedas utilizando a API Extended Rate. O programa oferece diversas opções de conversão e exibe o resultado formatado de acordo com as especificações.

## Funcionalidades

- Conversão entre seis diferentes pares de moedas:
  - Dólar (USD) para Real (BRL)
  - Real (BRL) para Dólar (USD)
  - Euro (EUR) para Real (BRL)
  - Real (BRL) para Euro (EUR)
  - Libra Esterlina (GBP) para Real (BRL)
  - Real (BRL) para Libra Esterlina (GBP)
  
- Utilização da API Extended Rate para obter taxas de conversão em tempo real.

## Configuração do Ambiente de Desenvolvimento

### Pré-requisitos

- JDK (Java Development Kit) instalado em sua máquina.
- IDE de sua preferência (recomendado: IntelliJ IDEA).

### Instalação

1. **Clonar o Repositório**

git clone https://github.com/seu_usuario/conversor-de-moedas.git


2. **Importar o Projeto**

- Abra o IntelliJ IDEA e selecione "Open" ou "Import" dependendo da opção disponível.
- Navegue até o diretório onde o repositório foi clonado e selecione o arquivo `pom.xml` (projeto Maven) ou o diretório raiz do projeto.

### Configuração

1. **Obter Chave da API**

- Registre-se em [Extended Rate](https://v6.exchangerate-api.com) para obter sua chave de API.

2. **Configurar Chave da API**

- Abra o arquivo `ConversorMoedas.java`.
- Substitua a constante `API_KEY` pela sua chave de API obtida anteriormente.

### Execução

- Execute a classe `Main.java` para iniciar o programa.
- Siga as instruções no console para escolher a opção de conversão e inserir o valor a ser convertido.

### Exemplo de Uso

1. Escolha uma opção de conversão, por exemplo, "1" para Dólar (USD) para Real (BRL).
2. Insira o valor que deseja converter, por exemplo, "100".
3. O programa exibirá o resultado formatado, por exemplo, "100 USD corresponde a 486 BRL com 65 centavos".

## Outras Informações

- Este projeto utiliza a biblioteca Gson para desserializar as respostas da API Extended Rate.
- As taxas de conversão são obtidas em tempo real e podem variar conforme o mercado.
- Para suporte ou sugestões, entre em contato pelo chat ou abra uma issue no GitHub.
