package ictgradschool.web.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ArticleListGenerator {

    public static List<Article> getArticleList() throws IOException {

        try (InputStreamReader inputStreamReader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("JSONArray.json"))) {

            ObjectMapper objectMapper = new ObjectMapper();
            JavaType listType = objectMapper.getTypeFactory().constructCollectionType(List.class, Article.class);
            return (List<Article>) objectMapper.readValue(inputStreamReader, listType);

        }
    }

}
