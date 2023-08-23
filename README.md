[![Github Actions Status for osmarbraz/calculadora_sbie2023](https://github.com/osmarbraz/calculadora_sbie2023/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadora_sbie2023/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora_sbie2023&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_calculadora_sbie2023)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora_sbie2023&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_calculadora_sbie2023&metric=coverage)

# Uma Unidade Instrucional para Apoio ao Ensino de Integração Contínua em Cursos de Graduação em Tecnologia da Informação.

## **Resumo**
Incoerências podem causar dificuldades na interpretação de discursos e impactar o desempenho de agentes conversacionais e tutores inteligentes, entre outros. Modelos contextualizados de linguagem como o BERT não foram ainda explorados na análise de incoerência, a despeito de sua eficácia comprovada em diversas tarefas afins. Este trabalho usa variações do BERT em língua portuguesa para classificar e medir coerência textual. Experimentos com textos de notícias e de um fórum educacional de dúvidas de estudantes mostram que o BERT suporta discriminação da ordem de sentenças com até 99,20% de acurácia e algumas medidas de (in)coerência consistentes com tal classificação, sendo a maioria dos melhores resultados para os textos do fórum. 

## **Requisitos**

* Java 1.8
* JUnit 4.13.2
* Java Code Coverage 0.8.8
* Apache Maven

O projeto foi desenvolvido utilizando a IDE NetBeans 13.

## **Download - Clone**

```
!git clone https://github.com/osmarbraz/calculadora_sbie2023.git
```

## Pastas
* materais - Materiais instrucionais (i.e., slides e pdf),
* src - Código fonte.

## Calculadora

Aplicação desktop que realiza as quatro operações matemáticas. 
Utiliza integração contínua da análise até cobertura do código.
A integração continua será realizada em 3 ambientes distintos com tarefas distintas.
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

O pipeline de CI realiza as seguintes tarefas em cada ambiente:
- dev - Compilação e testes.
- hmg - Análise e cobertura do código.
- prd - Empacotamento.

## Citando & Autores

Se achar este repositório útil, sinta-se à vontade para citar nossa publicação:

```bibtex 
@inproceedings{brazhenriquehauck-2023-unidadeci,
    title = "Uma Unidade Instrucional para Apoio ao Ensino de Integração Contínua em Cursos de Graduação em Tecnologia da Informação.",
    author = "Braz Junior, Osmar de Oliveira; Souza, Richard Henrique de and Hauck, Jean C.R.",    
    booktitle = {Anais do XXXIV Simpósio Brasileiro de Informática na Educação},
    location = {Online},
    year = {2023},
    pages = {XXX--XXX},
    publisher = {SBC},
    address = {Porto Alegre, RS, Brasil}        
}
```