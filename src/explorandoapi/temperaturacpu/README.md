### Desafio de Código [DIO](https://web.dio.me/) Explorando APIs e Monitoramento de Desempenho
#### Monitoramento de Temperatura da CPU
***

#### Descrição
Você está desenvolvendo um programa que simula uma API para monitorar a temperatura de uma CPU.O programa deve 
receber uma lista de leituras de temperatura e retornar a maior temperatura registrada. Cada leitura de temperatura 
é um número inteiro representando graus Celsius. Compare cada temperatura convertida com a maior temperatura 
encontrada até o momento e atualize a maior temperatura se a atual for maior. Após processar todas as leituras, 
retorne uma string formatada que exiba a maior temperatura encontrada no formato __"Maior temperatura: X°C"__, onde 
__X__ é o valor da maior temperatura. Certifique-se de que a string de saída esteja corretamente formatada e inclua o valor correto.

#### Entrada
Leituras de temperatura: Uma string contendo leituras de temperatura separadas por vírgulas. A string pode conter espaços extras ao redor das leituras.

#### Saída
Retorna uma string no formato __"Maior temperatura: X°C"__, onde X é a maior temperatura registrada.

#### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se 
de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada | Saída
--------|-------
45, 50, 47, 52, 48 | Maior temperatura: 52C
35, 42, 40, 39	| Maior temperatura: 42C
38, 40, 36, 37, 39, 41 | Maior temperatura: 41°C