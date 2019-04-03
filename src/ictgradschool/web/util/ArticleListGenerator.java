package ictgradschool.web.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArticleListGenerator {

    public static List<Article> getArticleList(){

        List<Article> articles = new ArrayList<>();

        try (InputStreamReader inputStreamReader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("JSONArray.json"))) {

            Object obj = new JSONParser().parse(inputStreamReader);
            JSONArray jsonArray = (JSONArray) obj;

            for (int i = 0; i < jsonArray.size(); i++){
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                Article article = new Article();

                String title = (String) jsonObject.get("title");
                Long id = (Long) jsonObject.get("id");
                Long authorId = (Long) jsonObject.get("author_id");
                String content = (String) jsonObject.get("content");

                article.setTitle(title);
                article.setId(id.intValue());
                article.setAuthorId(authorId.intValue());
                article.setContent(content);

                articles.add(article);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return articles;
    }

}
