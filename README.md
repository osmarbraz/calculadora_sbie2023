[![Github Actions Status for osmarbraz/calculadora_sbie2023](https://github.com/osmarbraz/calculadora_sbie2023/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadora_sbie2023/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora_sbie2023&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_calculadora_sbie2023)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora_sbie2023&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_calculadora_sbie2023&metric=coverage)

# Uma Unidade Instrucional para Apoio ao Ensino de Integração Contínua em Cursos de Graduação em Tecnologia da Informação.

## **Resumo**
A Integração Contínua (CI) é uma prática de desenvolvimento de software que envolve a integração frequente e automatizada do código-fonte em um repositório central, tem sido amplamente adotada pelas organizações de desenvolvimento de software. No entanto, o ensino da CI não costuma ser abordado de maneira abrangente nos currículos dos cursos superiores na área de Tecnologia da Informação (TI), e há uma lacuna de pesquisa significativa nesse contexto. Assim, este trabalho apresenta o desenvolvimento de uma Unidade Instrucional (UI) destinada a auxiliar o ensino da CI em disciplinas de cursos superiores de TI. A UI é sistematicamente desenvolvida e aplicada por meio de estudos de caso, sendo dividida em quatro partes sequenciais. Os resultados preliminares obtidos na aplicação da UI sugerem que os alunos adquiriram conhecimentos relacionados à CI por meio dessa abordagem, proporcionando uma experiência de aprendizagem positiva.

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

Se achar este repositório útil, sinta-se à vontade para citar nossa [publicação](https://sol.sbc.org.br/index.php/sbie/article/view/26678):

```bibtex 
@inproceedings{brazhenriquehauck-2023-unidadeci,
    title = "Uma Unidade Instrucional para Apoio ao Ensino de Integração Contínua em Cursos de Graduação em Tecnologia da Informação.",
    author = "Braz Junior, Osmar de Oliveira; Souza, Richard Henrique de and Hauck, Jean CR",    
    booktitle = {Anais do XXXIV Simpósio Brasileiro de Informática na Educação},
    location = {Online},
    year = {2023},
    pages = {378-388},
    publisher = {SBC},
    address = {Porto Alegre, RS, Brasil}        
}
```
