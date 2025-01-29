O código percorre todos os elementos encontrados e verifica seu conteúdo.
Para cada tag, ele imprime o nome da tag (getTagName()) e seu conteúdo (getTextContent()).
Verificação de conteúdo:

Se o conteúdo da tag estiver vazio (ou seja, uma tag sem valor), ele irá informar que a tag está vazia.
Caso contrário, ele imprime o valor da tag.

## Como usar

1. Faça o download ou clone este repositório.
2. Coloque o arquivo XML que deseja verificar no diretório de trabalho.
3. No código Java, ajuste o caminho do arquivo XML.
4. Execute a classe `Main.java` para verificar todas as tags no XML.

## Dependências

- Java 8 ou superior
- Bibliotecas para parsing de XML (javax.xml, org.w3c.dom)
