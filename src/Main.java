import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Main {

    // Função para verificar todas as tags no XML
    public static String checkAllTags(String xmlFilePath) {
        try {
            // Criação do DocumentBuilderFactory e DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Carregar o XML a partir de um arquivo
            File xmlFile = new File(xmlFilePath);
            Document doc = builder.parse(xmlFile);

            // Obter todos os elementos no XML (todas as tags)
            NodeList nodeList = doc.getElementsByTagName("*");

            // Se houver tags encontradas, iterar sobre elas
            if (nodeList.getLength() > 0) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) { // Garantir que estamos lidando com um elemento (tag)
                        Element element = (Element) node;
                        String tagName = element.getTagName();
                        String value = element.getTextContent().trim();

                        if (value.isEmpty()) {
                            result.append("A tag <" + tagName + "> está vazia.\n");
                        } else {
                            result.append("Tag <" + tagName + "> tem valor: " + value + "\n");
                        }
                    }
                }
                return result.toString();
            } else {
                return "Nenhuma tag encontrada no XML.";
            }
        } catch (Exception e) {
            return "Erro ao processar o XML: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        // Caminho do arquivo XML no seu sistema
        String xmlFilePath = "C:\\Users\\bruno.lima\\Documents\\4520.xml"; // Substitua o caminho e nome do arquivo XML


        // Chamada da função para verificar todas as tags no XML
        String result = checkAllTags(xmlFilePath);
        System.out.println(result);
    }
}
