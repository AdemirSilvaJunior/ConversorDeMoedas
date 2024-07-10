# Conversor de Moedas

Este projeto é um conversor de moedas simples desenvolvido em Java que utiliza uma API para obter cotações em tempo real. O programa permite ao usuário escolher entre várias opções de conversão de moedas e calcular o valor convertido com base na taxa de câmbio atual.

## Funcionalidades

- Conversão de Dólar (USD) para Real (BRL)
- Conversão de Real (BRL) para Dólar (USD)
- Conversão de Euro (EUR) para Real (BRL)
- Conversão de Real (BRL) para Euro (EUR)
- Conversão de Libra Esterlina (GBP) para Real (BRL)
- Conversão de Real (BRL) para Libra Esterlina (GBP)

## Pré-requisitos

- Java JDK 11 ou superior
- IntelliJ IDEA ou outra IDE de sua escolha
- Conta na [API Extended Rate](https://rapidapi.com/alpha-vantage-alpha-vantage-default/api/alpha-vantage/) para obter uma chave de API

## Como configurar e executar o projeto

1. **Clone o repositório:**
    ```bash
    git clone https://github.com/SEU_USUARIO/ConversorDeMoedas.git
    cd ConversorDeMoedas
    ```

2. **Abra o projeto na sua IDE:**
    - Abra o IntelliJ IDEA e selecione `File > Open`, então navegue até o diretório do projeto clonado.

3. **Configure a biblioteca GSON:**
    - Baixe a biblioteca GSON a partir do [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6) e adicione ao projeto.

4. **Obtenha sua chave de API:**
    - Cadastre-se na [API Extended Rate](https://rapidapi.com/alpha-vantage-alpha-vantage-default/api/alpha-vantage/) e obtenha sua chave de API.

5. **Atualize a chave de API no código:**
    - Substitua `"SUA_API_KEY"` pela sua chave de API na classe `ConversorMoedas.java`.

6. **Execute o programa:**
    - Execute a classe `Main.java` para iniciar o conversor de moedas.

## Estrutura do Projeto

- `main` - Contém a classe principal que gerencia a interação com o usuário.
- `service` - Contém a lógica de conversão de moedas e integração com a API.
- `model` - Contém as classes de modelo usadas para desserializar a resposta da API.

## Exemplo de Uso

1. Ao executar o programa, você verá um menu com opções de conversão.
2. Escolha a opção desejada digitando o número correspondente.
3. Insira o valor que deseja converter.
4. O programa exibirá o valor convertido com base na taxa de câmbio atual.
